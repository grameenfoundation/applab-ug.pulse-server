
import javax.servlet.http.*;

import org.apache.commons.logging.Log;

import PulseConfiguration.*;
import java.io.*;

public class download extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		String requestString=request.getParameter("request");
		String handsetId=request.getParameter("handset_id");
		
		try
		{
			sfConnect.login();
			String phoneId = sfConnect.getPhoneId(handsetId);
			if(!this.sendErrorMessage(phoneId, response))
			{
				this.sendResponse(requestString, phoneId, response);
			}
			sfConnect.logout();
		}
		catch(Exception e)
		{
			response.getWriter().write("The system has encountered an error");
			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw));
			log(sw.toString());
		}
	}

	private void sendResponse(String request, String phoneId, HttpServletResponse response) throws Exception {
		String content = "";
		try
		{
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
		catch(NullPointerException e)
		{
			// This seems to mean that the object being queried doesn't exist in sales force yet
			response.getWriter().write("There was a problem accessing this tab content. Please try again later or contact an administrator.");
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
