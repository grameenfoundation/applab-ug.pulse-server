package applab.pulse.server;

import javax.servlet.http.HttpServletRequest;

import applab.server.ApplabConfiguration;
import applab.server.ServletRequestContext;

/**
 * Set of helper functions used for displaying and processing the support tab
 * 
 */
public class SupportTab {
    private static String startElements;
    private static final String endElements = "</form></body></html>";

    private static String getHiddenHandsetControl(String imei) {
        return "<input type=\"text\" style=\"display:none\" name=\"handsetId\" value=\"" + imei + "\"></input>";
    }
    
    public static void initializeStartElements(HttpServletRequest request) {
        if (startElements == null) {
            StringBuilder startElementsBuilder = new StringBuilder();
            startElementsBuilder.append("<html><body>");
            startElementsBuilder.append("<form action=\"");
            
            String protocol = request.getProtocol().toLowerCase();
            protocol =  protocol.substring(0, protocol.indexOf("/")).toLowerCase();
            
            String submissionUrl =  protocol + "://" + request.getServerName() + ":" + request.getServerPort() + "/pulse/submitSupportTicket";
            startElementsBuilder.append(submissionUrl);
            startElementsBuilder.append("\" method=\"POST\">");
            startElements = startElementsBuilder.toString();
        }
    }

    // get the common form controls that are used in all support tabs
    private static String getFormControls(String imei) {
        return "<p><textarea rows=\"5\" style=\"width:100%\" name=\"supportText\"></textarea></p>" 
                + "<p><input type=\"submit\" value=\"Send\" style=\"width:50%\"></input></p>"
                + getHiddenHandsetControl(imei);
    }

    public static String getSupportFormHtml(String imei, HttpServletRequest request) {
        initializeStartElements(request);
        return startElements + "<p>Type your support request in the box below and we'll get back to you:</p>"
                + getFormControls(imei) + endElements;
    }

    public static String getSubmissionResponse(String imei, String supportNumber, HttpServletRequest request) {
        initializeStartElements(request);
        return startElements + "<p><h3>Your request was received. One of our support specialists will get back to you shortly."
                + "Your support number is " + supportNumber + ".</h3></p>"
                + "<p>If you need to submit another support request, type it in the box below and we'll get back to you:</p>"
                + getFormControls(imei) + endElements;
    }
}
