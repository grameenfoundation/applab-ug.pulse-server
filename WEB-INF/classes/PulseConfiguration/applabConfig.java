package PulseConfiguration;

import java.io.File;
import java.util.Hashtable;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class applabConfig {

	Hashtable<String,String> keyvalues;
	
	public applabConfig()
	{
		try
		{
			keyvalues=new Hashtable<String,String>();
			
			File temp=new File("../webapps/Mobile-Pulse/WEB-INF/classes/PulseConfiguration/application.xml");			
			DocumentBuilder builder=DocumentBuilderFactory.newInstance().newDocumentBuilder();
			Document doc=builder.parse(temp);
			doc.getDocumentElement().normalize();
			NodeList nodeList=doc.getElementsByTagName("appsettings");
			//get the first node which is the appsettings node
			Node app_node=nodeList.item(0);
			//convert the node into an element
			Element app_element=(Element)app_node;
			
			//url ip url
			NodeList zbr_url_list=app_element.getElementsByTagName("pulse-url");
			Element zbr_url_element=(Element)zbr_url_list.item(0);
			NodeList zbr_url_list_level1=zbr_url_element.getChildNodes();
			keyvalues.put("pulse-url", ((Node)zbr_url_list_level1.item(0)).getNodeValue());		
			
			//salesforce address
			NodeList sf_address_list=app_element.getElementsByTagName("salesforce-address");
			Element sf_address_element=(Element)sf_address_list.item(0);
			NodeList sf_address_list_level1=sf_address_element.getChildNodes();
			keyvalues.put("salesforce-address", ((Node)sf_address_list_level1.item(0)).getNodeValue());
			
			//salesforce username
			NodeList sf_username_list=app_element.getElementsByTagName("salesforce-username");
			Element sf_username_element=(Element)sf_username_list.item(0);
			NodeList sf_username_list_level1=sf_username_element.getChildNodes();
			keyvalues.put("salesforce-username", ((Node)sf_username_list_level1.item(0)).getNodeValue());
			
			//salesforce password
			NodeList sf_pwd_list=app_element.getElementsByTagName("salesforce-password");
			Element sf_pwd_element=(Element)sf_pwd_list.item(0);
			NodeList sf_pwd_list_level1=sf_pwd_element.getChildNodes();
			keyvalues.put("salesforce-password", ((Node)sf_pwd_list_level1.item(0)).getNodeValue());
			
			//salesforce token
			NodeList sf_token_list=app_element.getElementsByTagName("salesforce-token");
			Element sf_token_element=(Element)sf_token_list.item(0);
			NodeList sf_token_list_level1=sf_token_element.getChildNodes();
			keyvalues.put("salesforce-token", ((Node)sf_token_list_level1.item(0)).getNodeValue());
		
		}
		catch(Exception e)
		{
			e.printStackTrace();			
		}
	}
	
	public String getPulseUrl()
	{
		return keyvalues.get("pulse-url");
	}
	
	public String getSalesForceUsername()
	{
		return keyvalues.get("salesforce-username");
	}
	
	public String getSalesForcePassword()
	{
		return keyvalues.get("salesforce-password");
	}
	
	public String getSalesForceToken()
	{
		return keyvalues.get("salesforce-token");
	}

	public String getSalesForceAddress() {
		return keyvalues.get("salesforce-address");
	}
}
