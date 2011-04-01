package applab.pulse.server;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import applab.server.EmbeddedBrowserHelpers;
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

            // Add in any javascript needed
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
    private static String getFormControls(String imei) {
        return "<p><textarea id=\"supportInput\" rows=\"5\" style=\"width:100%\" name=\"supportText\"></textarea></p>"
                + getHiddenHandsetControl(imei);
    }

    public static String getSupportFormHtml(String imei, HttpServletRequest request, ServletRequestContext context) throws IOException {
        initializeStartElements(request, context);
        return startElements + "<p>Type your support request in the box below and we'll get back to you:</p>"
                + getFormControls(imei) + endElements + EmbeddedBrowserHelpers.getPageLoadCompleteString() +
                endHtmlElement;
    }

    public static String getSubmissionResponse(String imei, String supportNumber, HttpServletRequest request, ServletRequestContext context)
            throws IOException {
        initializeStartElements(request, context);
        return startElements + "<p><h3>Your request was received. One of our support specialists will get back to you shortly."
                + "Your support number is " + supportNumber + ".</h3></p>"
                + "<p>If you need to submit another support request, type it in the box below and we'll get back to you:</p>"
                + getFormControls(imei) + endElements + EmbeddedBrowserHelpers.getPageLoadCompleteString() +
                endHtmlElement;
    }
}
