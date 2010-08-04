package PulseConfiguration;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.rmi.RemoteException;
import java.util.List;
import org.apache.commons.logging.Log;

import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;

import org.apache.axis.message.MessageElement;

import com.sforce.soap.enterprise.*;
import com.sforce.soap.enterprise.fault.InvalidIdFault;
import com.sforce.soap.enterprise.fault.LoginFault;
import com.sforce.soap.enterprise.fault.UnexpectedErrorFault;
import com.sforce.soap.enterprise.sobject.*;


public class sfConnect {

	static applabConfig applab=new applabConfig();
	private static SoapBindingStub binding;
	
	public static void login() throws ServiceException, InvalidIdFault, UnexpectedErrorFault, LoginFault, RemoteException
	{
		SforceServiceLocator sfService = new SforceServiceLocator();
		sfService.setSoapEndpointAddress(applab.getSalesForceAddress());
		binding=(SoapBindingStub)sfService.getSoap();
		
		LoginResult loginResult=binding.login(applab.getSalesForceUsername(), applab.getSalesForcePassword() + applab.getSalesForceToken());
		
		binding._setProperty(SoapBindingStub.ENDPOINT_ADDRESS_PROPERTY, loginResult.getServerUrl());
		
		SessionHeader sh = new SessionHeader();
		sh.setSessionId(loginResult.getSessionId());
		binding.setHeader(new SforceServiceLocator().getServiceName().getNamespaceURI(), "SessionHeader", sh);
	}
	
	public static String getPhoneId(String handset_id) throws Exception
	{
		QueryResult query=binding.query("Select Id,Name from Phone__c where IMEI__c='"+handset_id+"'");
		if(query.getSize()==1)
		{
			Phone__c p=(Phone__c)query.getRecords(0);
			return p.getId();
		}
		else if(query.getSize()>1)
		{			
			return "Duplicate IMEI";
		}
		else if(query.getSize()<1)
		{
			return "Not Registered";
		}
		return "System Error";
	}
	
	public static String getCKWMessages(String phone_id) throws Exception
	{
		QueryResult query=binding.query("Select My_Mesages__c from CKW__c where Phone__c='"+phone_id+"'");
		if(query.getSize()==1)
		{
			CKW__c c=(CKW__c)query.getRecords(0);
			return c.getMy_Mesages__c();
		}
		return "System Error";
	}
	
	public static String getCKWName(String phone_id) throws Exception
	{
		QueryResult query=binding.query("Select First_Name__c,Last_Name__c from CKW__c where Phone__c='"+phone_id+"'");
		if(query.getSize()==1)
		{
			CKW__c c=(CKW__c)query.getRecords(0);
			return c.getFirst_Name__c()+" "+c.getLast_Name__c();
		}
		return "System Error";
	}
	
	public static String getCKWProfile(String phone_id) throws Exception
	{
		QueryResult query=binding.query("Select My_Profile__c from CKW__c where Phone__c='"+phone_id+"'");
		if(query.getSize()==1)
		{
			CKW__c c=(CKW__c)query.getRecords(0);
			return c.getMy_Profile__c();
		}
		return "System Error";
	}
	
	public static String getCKWPerformance(String phone_id) throws Exception
	{
		QueryResult query=binding.query("Select Performance_Review__c from CKW__c where Phone__c='"+phone_id+"'");
		if(query.getSize()==1)
		{
			CKW__c c=(CKW__c)query.getRecords(0);
			return c.getPerformance_Review__c();
		}
		return "System Error";
	}
	
	public static String getCKW_ID(String phone_id) throws Exception
	{
		QueryResult query=binding.query("Select Name from CKW__c where Phone__c='"+phone_id+"'");
		if(query.getSize()==1)
		{
			CKW__c c=(CKW__c)query.getRecords(0);
			return c.getName();
		}
		return "System Error";
	}
	
	public static String getSalesforceCKW_ID(String phone_id) throws Exception
	{
		QueryResult query=binding.query("Select id from CKW__c where Phone__c='"+phone_id+"'");
		if(query.getSize()==1)
		{
			CKW__c c=(CKW__c)query.getRecords(0);
			return c.getId();
		}
		return "System Error";
	}
	
	public static String saveRequest(String request,String sfckw_id,String ckw_id) throws Exception
	{
		_case[] param=new _case[1];
		param[0]=new _case();
		param[0].setReason("New Reason");
		param[0].setType("Unknown");
		param[0].setOrigin("CKW Pulse");
		param[0].setStatus("New");
		param[0].setDescription(request);
		param[0].setCKW__c(sfckw_id);
		param[0].setSubject("From "+ckw_id);
		SaveResult sr[]=binding.create(param);
		if(sr.length==1)
		{
			QueryResult query=binding.query("Select CaseNumber from case where id='"+sr[0].getId()+"'");
			if(query.getSize()>0)
			{
				_case c=(_case)query.getRecords(0);
				return c.getCaseNumber();
			}
		}
		return "Not Saved";
	}
	
	public static String saveSystemRequest(String request,String subject) throws Exception
	{
		_case[] param=new _case[1];
		param[0]=new _case();
		param[0].setReason("New Reason");
		param[0].setType("Unknown");
		param[0].setOrigin("CKW Pulse");
		param[0].setStatus("New");
		param[0].setDescription(request);
		param[0].setSubject("From pulse :"+subject);
		SaveResult sr[]=binding.create(param);
		if(sr.length==1)
		{
			QueryResult query=binding.query("Select CaseNumber from case where id='"+sr[0].getId()+"'");
			if(query.getSize()>0)
			{
				_case c=(_case)query.getRecords(0);
				return c.getCaseNumber();
			}
		}
		return "Not Saved";
	}
	
	public static void logout() throws Exception
	{
		binding.logout();
	}
	
	public static void getMonthlyTargets() throws Exception
	{
		QueryResult query=binding.query("Select  from CKW_Performance_Review__c");
		if(query.getSize()>0)
		{
			for(int i=0;i<query.getSize();i++)
			{
				CKW_Performance_Review__c c=(CKW_Performance_Review__c)query.getRecords(i);
				
			}
		}
	}
	
}
