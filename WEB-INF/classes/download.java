
import javax.servlet.http.*;

import PulseConfiguration.*;
import java.io.*;

public class download extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		String m_request=request.getParameter("request");
		String handset_id=request.getParameter("handset_id");
		if(m_request.equals("messages"))
		{
			try
			{
				sfConnect.login();
				//retrieve the message
				String phone_id=sfConnect.getPhoneId(handset_id);
				if(phone_id.equals("Duplicate IMEI"))
				{
					response.getWriter().write("The system has encountered an internal error. A duplicate IMEI has been detected");					
				}
				else if(phone_id.equals("Not Registered"))
				{
					response.getWriter().write("Sorry you cannot view your messages because your phone is not registered");
				}
				else if(phone_id.equals("System Error"))
				{
					response.getWriter().write("Sorry you cannot view your messages because an unexpected internal error has occured.");
				}
				else
				{
					String messages=sfConnect.getCKWMessages(phone_id);
					if(messages.equals(null) || messages.equals(""))
					{
						response.getWriter().write("You have no messages");
					}
					else
					{
						response.getWriter().write(messages);
					}
				}			
				sfConnect.logout();				
			}
			catch(NullPointerException e)
			{
				response.getWriter().write("You have no messages");
			}
			catch(Exception e)
			{
				response.getWriter().write("The system has encountered an error");
			}
		}
		else if(m_request.equals("profile"))
		{
			try
			{
				sfConnect.login();
				//retrieve the message
				String phone_id=sfConnect.getPhoneId(handset_id);
				if(phone_id.equals("Duplicate IMEI"))
				{
					response.getWriter().write("The system has encountered an internal error. A duplicate IMEI has been detected");					
				}
				else if(phone_id.equals("Not Registered"))
				{
					response.getWriter().write("Sorry you cannot view your profile because your phone is not registered");
				}
				else if(phone_id.equals("System Error"))
				{
					response.getWriter().write("Sorry you cannot view your profile because an unexpected internal error has occured.");
				}
				else
				{
					String profile=sfConnect.getCKWProfile(phone_id);
					if(profile.equals("") || profile.equals(null))
					{
						String ckw_name=sfConnect.getCKWName(phone_id);
						response.getWriter().write("Welcome "+ckw_name+"\nYour profile has not been created");
					}
					else
					{
						response.getWriter().write(profile);
					}
				}
				sfConnect.logout();				
			}
			catch(NullPointerException e)
			{
				response.getWriter().write("Your profile has not been created");
			}
			catch(Exception e)
			{
				response.getWriter().write("Sorry you cannot view your profile because an unexpected internal error has occured.");
			}
		}
		else if(m_request.equals("performance"))
		{
			try
			{
				sfConnect.login();
				//retrieve the message
				String phone_id=sfConnect.getPhoneId(handset_id);
				if(phone_id.equals("Duplicate IMEI"))
				{
					response.getWriter().write("The system has encountered an internal error. A duplicate IMEI has been detected");					
				}
				else if(phone_id.equals("Not Registered"))
				{
					response.getWriter().write("Sorry you cannot view your profile because your phone is not registered");
				}
				else if(phone_id.equals("System Error"))
				{
					response.getWriter().write("Sorry you cannot view your profile because an unexpected internal error has occured.");
				}
				else
				{
					String performance_review=sfConnect.getCKWPerformance(phone_id);
					if(performance_review.equals(null) || performance_review.equals(""))
					{
						response.getWriter().write("Your performance review has not been set");
					}
					else
					{
						response.getWriter().write(performance_review);						
					}
				}
				sfConnect.logout();				
			}
			catch(NullPointerException e)
			{
				response.getWriter().write("Your performance review has not been created");
			}
			catch(Exception e)
			{
				response.getWriter().write("Sorry you cannot view your profile because an unexpected internal error has occured.");
			}
		}
	}
}
