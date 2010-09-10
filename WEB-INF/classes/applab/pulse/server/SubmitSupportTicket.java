package applab.pulse.server;

import javax.servlet.http.*;

import applab.server.*;

public class SubmitSupportTicket extends ApplabServlet {
    private static final long serialVersionUID = 1L;

    // Process the form post, and return the updated page
    @Override
    protected void doApplabPost(HttpServletRequest request, HttpServletResponse response, ServletRequestContext context) throws Exception {
        // get handset ID and message from the form parameters
        // NOTE that context.getHandsetId() does not work here since we don't own the request headers
        String imei = context.getHandsetId();
        String message = request.getParameter("supportText");
        PulseSalesforceProxy salesforceProxy = new PulseSalesforceProxy();
        try {
            PulseSalesforceProxy.SubmissionResponse submissionResponse = salesforceProxy.submitSupportCase(message, imei);
            String errorText = submissionResponse.getError();
            if (errorText != null) {
                response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, errorText);

            }
            else {
                context.writeRawText(SupportTab.getSubmissionResponse(imei, submissionResponse.getCaseNumber()));
                context.close();
            }
        }
        finally {
            salesforceProxy.dispose();
        }
    }
}
