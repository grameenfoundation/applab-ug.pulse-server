
import javax.servlet.http.*;

import org.apache.commons.logging.Log;

import PulseConfiguration.*;
import java.io.*;

public class download extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		String m_request=request.getParameter("request");
		String handset_id=request.getParameter("handset_id");
		
		try
		{
			sfConnect.login();
			String phoneId = sfConnect.getPhoneId(handset_id);
			if(!this.sendErrorMessage(phoneId, response))
			{
				this.sendResponse(m_request, phoneId, response);
			}
			sfConnect.logout();
		}
		catch(Exception e)
		{
			response.getWriter().write("The system has encountered an error");
			log(e.toString());
			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw));
			log(sw.toString());
		}
	}

	private void sendResponse(String request, String phoneId, HttpServletResponse response) throws Exception {
		String content = "";
		if(request.equals("messages")) {
			content = sfConnect.getCKWMessages(phoneId);
		}
		else if (request.equals("profile")) {
			content = sfConnect.getCKWProfile(phoneId);
		}
		else if (request.equals("performance")) {
			content = sfConnect.getCKWPerformance(phoneId);
		}
		else {
			content = "Invalid request.";
		}
		
		if(content.equals(null) || content.equals("")) {
			response.getWriter().write("You have no content for this tab.");
		} else {
			response.getWriter().write(content);
		}
	}

	private boolean sendErrorMessage(String phoneId,
			HttpServletResponse response) throws Exception {
		if(phoneId.equals("Duplicate IMEI"))
		{
			response.getWriter().write("Sorry, your phone is assigned to more than one person.");
			return true;
		}
		else if(phoneId.equals("Not Registered"))
		{
			response.getWriter().write("Sorry, your phone is not registered.");
			return true;
		}
		else if(phoneId.equals("System Error"))
		{
			response.getWriter().write("Sorry, an unknown system error has occured.");
			return true;
		}
		return false;
	}
}
