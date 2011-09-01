package applab.pulse.server;

import java.io.IOException;
import java.rmi.RemoteException;

import javax.servlet.http.HttpServletRequest;
import javax.xml.rpc.ServiceException;

import org.apache.axis.description.TypeDesc;

import com.sforce.soap.enterprise.DescribeSObject;
import com.sforce.soap.enterprise.DescribeSObjectResult;
import com.sforce.soap.enterprise.Field;
import com.sforce.soap.enterprise.PicklistEntry;
import com.sforce.soap.enterprise.SoapBindingStub;
import com.sforce.soap.enterprise.fault.InvalidIdFault;
import com.sforce.soap.enterprise.fault.LoginFault;
import com.sforce.soap.enterprise.fault.UnexpectedErrorFault;
import com.sforce.soap.enterprise.sobject._case;

import applab.server.EmbeddedBrowserHelpers;
import applab.server.SalesforceProxy;
import applab.server.ServletRequestContext;

/**
 * Set of helper functions used for displaying and processing the support tab
 * 
 */
public class SupportTab {
    private static String startElements;
    private static final String endElements = "</form>"
                + "<p><button id=\"submitButton\" type=\"button\" style=\"width:50%\" onclick=\"changeButton(false);validateSupportForm()\">Send</button></p>"
                + "</body>";
    private static final String endHtmlElement = "</html>";

    private static String getHiddenHandsetControl(String imei) {
        return "<input type=\"text\" style=\"display:none\" name=\"handsetId\" value=\"" + imei + "\"></input>";
    }

    public static void initializeStartElements(HttpServletRequest request, ServletRequestContext context) throws IOException {
        if (startElements == null) {
            StringBuilder startElementsBuilder = new StringBuilder();
            startElementsBuilder.append("<html>");
            startElementsBuilder.append("<head>");

            context.writeScriptBlock(startElementsBuilder, "supportTab.js");
            startElementsBuilder.append("</head>");
            startElementsBuilder.append("<body>");
            startElementsBuilder.append("<form name=\"supportForm\" action=\"");

            String protocol = request.getProtocol().toLowerCase();
            protocol = protocol.substring(0, protocol.indexOf("/")).toLowerCase();

            String submissionUrl = protocol + "://" + request.getServerName() + ":" + request.getServerPort()
                    + "/pulse/submitSupportTicket";
            startElementsBuilder.append(submissionUrl);
            startElementsBuilder.append("\" method=\"POST\">");
            startElements = startElementsBuilder.toString();
        }
    }

    // Get the common form controls that are used in all support tabs
    private static String getFormControls(String imei) throws InvalidIdFault, UnexpectedErrorFault, LoginFault, RemoteException, ServiceException {
        String selectBox = "";
        SoapBindingStub binding = SalesforceProxy.createBinding();
        DescribeSObjectResult describeSObjectResult = binding.describeSObject("Case");
        Field[] fields = describeSObjectResult.getFields();
        if (fields != null) {
            for (int fieldCounter = 0; fieldCounter < fields.length; fieldCounter++) {
                Field field = fields[fieldCounter];
                if (field.getName().equalsIgnoreCase("type")) {
                    PicklistEntry[] picklistValues = field.getPicklistValues();
                    if (picklistValues != null) {
                        selectBox += "<p><select name=\"supportType\" style=\"width:100%\">";
                        for (int picklistCounter = 0; picklistCounter < picklistValues.length; picklistCounter++) {
                            if (picklistValues[picklistCounter].getLabel() != null) {
                                selectBox += "<option value=\"" +
                                        picklistValues[picklistCounter].getValue() +
                                        "\">" + picklistValues[picklistCounter].getLabel() + "</option>";
                            }
                        }
                        selectBox += "</select></p>";
                    }
                }
            }
        }
        return selectBox + "<p><textarea id=\"supportInput\" rows=\"5\" style=\"width:100%\" name=\"supportText\"></textarea></p>"
                + getHiddenHandsetControl(imei);
    }

    public static String getSupportFormHtml(String imei, HttpServletRequest request, ServletRequestContext context) throws IOException, ServiceException {
        initializeStartElements(request, context);
        return startElements + "<p>Type your support request in the box below and we'll get back to you:</p>"
                + getFormControls(imei) + endElements + EmbeddedBrowserHelpers.getPageLoadCompleteString() +
                endHtmlElement;
    }

    public static String getSubmissionResponse(String imei, String responseMessage, HttpServletRequest request, ServletRequestContext context, Boolean error)
            throws IOException, ServiceException {
        initializeStartElements(request, context);
        String responseString = startElements;
        if(error) {
            responseString += "<p><h3><font color='red'>" + responseMessage + ".</font></h3></p>";
        } else {
            responseString += "<p><h3><font color='green'>Your request was received. One of our support specialists will get back to you shortly."
            + "Your support number is " + responseMessage + ".</font></h3></p>";
        }
        return responseString + "<p>If you need to submit another support request, type it in the box below and we'll get back to you:</p>"
                + getFormControls(imei) + endElements + EmbeddedBrowserHelpers.getPageLoadCompleteString() +
                endHtmlElement;
    }
}
