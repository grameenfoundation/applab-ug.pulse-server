import javax.servlet.http.*;
import PulseConfiguration.*;

public class pulse extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        String handset_id = request.getParameter("handset_id");
        String message = request.getParameter("message");
        // login the request
        try {
            sfConnect.login();
            // handset id's are tied to ckws. get the ckw id
            String phone_id = sfConnect.getPhoneId(handset_id);
            if (phone_id.equals("Duplicate IMEI")) {
                response.getWriter().write("The system has encountered an internal error. A duplicate IMEI has been detected");
            }
            else if (phone_id.equals("Not Registered")) {
                response.getWriter().write("Sorry you cannot send a request because your phone is not registered");
            }
            else if (phone_id.equals("System Error")) {
                response.getWriter().write("Sorry you cannot send a request because an unexpected internal error has occured.");
            }
            else {
                // get the ckw id
                String sfckw_id = sfConnect.getSalesforceCKW_ID(phone_id);
                String ckw_id = sfConnect.getCKW_ID(phone_id);
                String caseNumber = sfConnect.saveRequest(message, sfckw_id, ckw_id);
                response.getWriter().write(
                        "Your request was received. One of our support specialists will get back to you shortly. Your support number is "
                                + caseNumber);
            }
            sfConnect.logout();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
