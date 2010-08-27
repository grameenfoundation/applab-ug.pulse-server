package applab.pulse.server;

import java.util.*;
import javax.servlet.http.*;

import org.w3c.dom.*;

import applab.server.*;

/**
 * Gets the tabs associated with a given handset/person
 * 
 */
public class GetTabs extends ApplabServlet {
    private static final long serialVersionUID = 1L;

    private final static String NAMESPACE = "http://schemas.applab.org/2010/08/pulse";
    private final static String REQUEST_ELEMENT_NAME = "GetTabsRequest";
    private final static String RESPONSE_ELEMENT_NAME = "GetTabsResponse";
    private final static String TAB_ELEMENT_NAME = "Tab";
    private final static String NAME_ATTRIBUTE = "name";
    private final static String HASH_ATTRIBUTE = "hash";
    private final static String HAS_CHANGED_ATTRIBUTE = "hasChanged";

    // given a post body like:
    // <?xml version="1.0"?>
    // <GetTabsRequest xmlns="http://schemas.applab.org/2010/08/pulse">
    // <Tab name="Messages" hash="xvq85dcvsjw" />
    // <Tab name="Performance" hash="ov9rdcvaccw" />
    // </GetTabsRequest>
    // 
    // returns a response like:
    // <?xml version="1.0"?>
    // <GetTabsResponse xmlns="http://schemas.applab.org/2010/08/pulse" hasChanged="true">
    // <Tab name="Messages" hash="updated_hash">updated tab content</Tab>
    // <Tab name="Performance" hasChanged="false" />
    // ...
    // </GetTabsResponse>
    @Override
    protected void doApplabPost(HttpServletRequest request, HttpServletResponse response, ServletRequestContext context) throws Exception {
        // first, get the client's view of their tabs
        Document requestXml = context.getRequestBodyAsXml();
        GetTabsRequest parsedRequest = GetTabsRequest.parseRequest(requestXml);

        // get the new tabs
        String handsetId = context.getHandsetId();
        if (handsetId == null) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Handset ID must be specified in the x-Imei HTTP header");
            return;
        }

        ArrayList<TabInfo> updatedTabs = generateTabs(handsetId);

        // and run a change comparison to determine the updates
        boolean haveChanges = false;
        for (TabInfo tab : updatedTabs) {
            String oldHash = parsedRequest.getHash(tab.getName());
            if (oldHash == null || !oldHash.equalsIgnoreCase(tab.getHash())) {
                tab.setHasChanged(true);
                haveChanges = true;
            }
        }

        // finally write the results, which are dependent on whether or not we have any changes
        context.writeXmlHeader();
        if (!haveChanges) {
            HashMap<String, String> elementAttributes = new HashMap<String, String>();
            elementAttributes.put("xmlns", NAMESPACE);
            elementAttributes.put(HAS_CHANGED_ATTRIBUTE, "false");
            context.writeStartElement(RESPONSE_ELEMENT_NAME, elementAttributes);
        }
        else {
            context.writeStartElement(RESPONSE_ELEMENT_NAME, NAMESPACE);

            for (TabInfo tab : updatedTabs) {
                HashMap<String, String> tabAttributes = new HashMap<String, String>();
                tabAttributes.put(NAME_ATTRIBUTE, tab.getName());
                if (tab.getHasChanged()) {
                    tabAttributes.put(HASH_ATTRIBUTE, tab.getHash());
                    context.writeStartElement(TAB_ELEMENT_NAME, tabAttributes);
                    context.writeText(tab.getContent());
                }
                else {
                    tabAttributes.put(HAS_CHANGED_ATTRIBUTE, "false");
                    context.writeStartElement(TAB_ELEMENT_NAME, tabAttributes);
                }
                context.writeEndElement();
            }
        }
        context.writeEndElement();
    }

    private ArrayList<TabInfo> generateTabs(String imei) throws Exception {
        ArrayList<TabInfo> tabs = new ArrayList<TabInfo>();

        // TODO: update this code to dynamically get the tabs from Salesforce
        PulseSalesforceProxy salesforceProxy = new PulseSalesforceProxy();
        try {
            tabs.add(getMessagesTab(salesforceProxy, imei));
            tabs.add(getPerformanceTab(salesforceProxy, imei));
            tabs.add(getSupportTab(salesforceProxy, imei));
            tabs.add(getProfileTab(salesforceProxy, imei));
        }
        finally {
            salesforceProxy.dispose();
        }

        return tabs;
    }

    private TabInfo getMessagesTab(PulseSalesforceProxy salesforceProxy, String imei) throws Exception {
        return new TabInfo("Messages", salesforceProxy.getCKWMessages(imei));
    }

    private TabInfo getPerformanceTab(PulseSalesforceProxy salesforceProxy, String imei) throws Exception {
        return new TabInfo("Performance", salesforceProxy.getCKWPerformance(imei));
    }

    private TabInfo getSupportTab(PulseSalesforceProxy salesforceProxy, String imei) throws Exception {
        return new TabInfo("Support", SupportTab.getSupportFormHtml(imei));
    }

    private TabInfo getProfileTab(PulseSalesforceProxy salesforceProxy, String imei) throws Exception {
        return new TabInfo("Profile", salesforceProxy.getCKWProfile(imei));
    }

    /**
     * Represents a Pulse Tab, including the name, content, and hash
     * 
     */
    private class TabInfo {
        private String name;
        private String content;
        private String hash;
        private boolean hasChanged;

        public TabInfo(String name, String content) {
            this.name = name;
            this.content = content;
        }

        public String getName() {
            return this.name;
        }

        public String getHash() {
            if (this.hash == null) {
                this.hash = HashHelpers.createSHA1(this.content);
            }

            return this.hash;
        }

        public String getContent() {
            return this.content;
        }

        public boolean getHasChanged() {
            return this.hasChanged;
        }

        public void setHasChanged(boolean value) {
            this.hasChanged = value;
        }
    }

    // <?xml version="1.0"?>
    // <GetTabsRequest xmlns="http://schemas.applab.org/2010/08/pulse">
    // <Tab name="Messages" hash="xvq85dcvsjw" />
    // <Tab name="Performance" hash="ov9rdcvaccw" />
    // </GetTabsRequest>
    private static class GetTabsRequest {
        // mapping from tab name to hash value
        private HashMap<String, String> tabHashes;

        private GetTabsRequest() {
            this.tabHashes = new HashMap<String, String>();
        }

        public String getHash(String tabName) {
            return this.tabHashes.get(tabName);
        }

        public static GetTabsRequest parseRequest(Document requestXml) {
            assert (requestXml != null);
            GetTabsRequest getTabsRequest = null;

            // <GetTabsRequest xmlns="http://schemas.applab.org/2010/08/pulse">
            Element rootNode = requestXml.getDocumentElement();
            if (NAMESPACE.equals(rootNode.getNamespaceURI()) && REQUEST_ELEMENT_NAME.equals(rootNode.getLocalName())) {
                getTabsRequest = new GetTabsRequest();

                // parse the collection of Tabs
                for (Node childNode = rootNode.getFirstChild(); childNode != null; childNode = childNode.getNextSibling()) {
                    if (childNode.getNodeType() == Node.ELEMENT_NODE && NAMESPACE.equals(childNode.getNamespaceURI())) {
                        if (TAB_ELEMENT_NAME.equals(childNode.getLocalName())) {
                            // <Tab name="Performance" hash="ov9rdcvaccw" />
                            Element tabElement = (Element)childNode;
                            String tabName = tabElement.getAttribute(NAME_ATTRIBUTE);
                            String tabHash = tabElement.getAttribute(HASH_ATTRIBUTE);
                            getTabsRequest.tabHashes.put(tabName, tabHash);
                        }
                    }
                }
            }
            return getTabsRequest;
        }
    }
}
