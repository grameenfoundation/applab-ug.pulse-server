package applab.pulse.server;

import applab.server.ApplabConfiguration;

/**
 * Set of helper functions used for displaying and processing the support tab
 * 
 */
public class SupportTab {
    private static String startElements;
    private static final String endElements = "</form></body></html>";

    private static String getHiddenHandsetControl(String imei) {
        return "<input type=\"text\" style=\"display:none\" name=\"handsetId\" value=\"" + imei + "\" />";
    }
    
    public static void initializeStartElements() {
        if (startElements == null) {
            StringBuilder startElementsBuilder = new StringBuilder();
            startElementsBuilder.append("<html><body>");
            startElementsBuilder.append("<form action=\"");
            // TODO: get this information from Tomcat instead of config
            String submissionUrl = ApplabConfiguration.getHostUrl() + "submitSupportTicket";
            startElementsBuilder.append(submissionUrl);
            startElementsBuilder.append("\" method=\"POST\">");
            startElements = startElementsBuilder.toString();
        }
    }

    // get the common form controls that are used in all support tabs
    private static String getFormControls(String imei) {
        return "<p><textarea rows=\"5\" cols=\"36\" name=\"supportText\"/></p>" + "<p><input type=\"submit\" value=\"Send\" /></p>"
                + getHiddenHandsetControl(imei);
    }

    public static String getSupportFormHtml(String imei) {
        initializeStartElements();
        return startElements + "<p>Type your support request in the box below and we'll get back to you:</p>"
                + getFormControls(imei) + endElements;
    }

    public static String getSubmissionResponse(String imei, String supportNumber) {
        initializeStartElements();
        return startElements + "<p><h2>Your request was received. One of our support specialists will get back to you shortly."
                + "Your support number is " + supportNumber + ".</h2></p>"
                + "<p>If you need to submit another support request, type it in the box below and we'll get back to you:</p>"
                + getFormControls(imei) + endElements;
    }
}
