package applab.pulse.server;

import java.util.ArrayList;

import applab.Message;

/**
 * Set of helper functions used for displaying the messages tab
 * 
 */
public class MessagesTab {
    private static String startElements;
    private static final String endElements = "</table></body></html>";
    
    public static void initializeStartElements() {
        if (startElements == null) {
            StringBuilder startElementsBuilder = new StringBuilder();
            startElementsBuilder.append("<html><head><style type=\"text/css\">");
            startElementsBuilder.append("td { border-width: 2px; border-style: solid; }");
            startElementsBuilder.append("</style></head><body><table>");
            startElements = startElementsBuilder.toString();
        }
    }  
    
    // get the HTML for one message
    private static String getMessageHtml(Message message) {
    	StringBuilder messageBuilder = new StringBuilder();
    	messageBuilder.append("<tr><td><p>");
    	messageBuilder.append("<b>Subject:</b>");
    	messageBuilder.append(message.getSubject());
    	messageBuilder.append("<br/>");
    	messageBuilder.append("<b>From:</b>"); 
    	messageBuilder.append(message.getFrom());
    	messageBuilder.append("<br/>");
    	messageBuilder.append("<b>Sent:</b>"); 
    	messageBuilder.append(message.getSentTime());
    	messageBuilder.append("<br/></p><p>");
    	messageBuilder.append(message.getBody());
    	messageBuilder.append("</p></tr></td>");
    	return messageBuilder.toString();
    }

    public static String getMessageListHtml(String imei) throws Exception {
        initializeStartElements();
        StringBuilder messageListBuilder = new StringBuilder();
        messageListBuilder.append(startElements);

        PulseSalesforceProxy salesforceProxy = new PulseSalesforceProxy();
        ArrayList<Message> messages = salesforceProxy.getCKWMessageList(imei);
        if(messages.size() == 0) {
        	messageListBuilder.append("<p>You do not have any messages.</p>");
        } else {
	        for(Message message : messages) {
	        	messageListBuilder.append(getMessageHtml(message));
	        }
        }
        
        messageListBuilder.append(endElements);
        return messageListBuilder.toString();
    }
}
