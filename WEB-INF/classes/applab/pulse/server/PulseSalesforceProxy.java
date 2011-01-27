package applab.pulse.server;

import java.rmi.RemoteException;
import java.util.ArrayList;

import javax.xml.rpc.ServiceException;

import applab.Message;
import applab.server.SalesforceProxy;

import com.sforce.soap.enterprise.QueryResult;
import com.sforce.soap.enterprise.SaveResult;
import com.sforce.soap.enterprise.fault.InvalidIdFault;
import com.sforce.soap.enterprise.fault.LoginFault;
import com.sforce.soap.enterprise.fault.UnexpectedErrorFault;
import com.sforce.soap.enterprise.sobject.CKW__c;
import com.sforce.soap.enterprise.sobject.Message__c;
import com.sforce.soap.enterprise.sobject._case;

public class PulseSalesforceProxy extends SalesforceProxy {

    public PulseSalesforceProxy() throws ServiceException, InvalidIdFault, UnexpectedErrorFault, LoginFault, RemoteException {
        super();
    }
     
    public ArrayList<Message> getCkwMessageList(String imei) throws Exception {
    	ArrayList<Message> messages = new ArrayList<Message>();
    	StringBuilder commandText = new StringBuilder();
    	commandText.append("select Subject__c,From__r.Name,Sent_Time__c,Body__c from Message__c ");
    	commandText.append("where Recipient__r.Handset__r.IMEI__c = '" + imei + "' order by Sent_Time__c Desc");
        QueryResult query = getBinding().query(commandText.toString());
        for(int i = 0; i < query.getSize(); i++) {
        	Message__c message = (Message__c)query.getRecords(i);
        	messages.add(new Message(message.getSubject__c(), message.getFrom__r().getName(), 
        			message.getSent_Time__c().getTime(), message.getBody__c()));
        }
        return messages;
    }
    
    public String getCkwProfile(String imei) throws Exception {
        StringBuilder commandText = new StringBuilder();
        commandText.append("select My_Profile__c from CKW__c");
        commandText.append(getCkwPhoneFilter(imei));
        QueryResult query = getBinding().query(commandText.toString());
        if (query.getSize() == 1) {
            CKW__c ckw = (CKW__c)query.getRecords(0);
            return ckw.getMy_Profile__c();
        }
        else {
            return getErrorString(query.getSize(), imei);
        }
    }

    /**
     * Get details on the CKW's performance and payment information
     */
    public String getCkwPerformance(String imei) throws Exception {
        // first, query for the performance message
        StringBuilder commandText = new StringBuilder();
        commandText.append("SELECT Person__r.First_Name__c, Current_Performance_Review__r.Performance_Message__c");
        
        boolean includePaymentInformation = false;
        
        // Commenting this out as part of PLS-58 as not wanted until split targets are added
        //Calendar now = Calendar.getInstance();
        
        //if (now.get(Calendar.DAY_OF_MONTH) <= 5) {
        //    includePaymentInformation = true;
        //    commandText.append(", Previous_Performance_Review__r.Payment_Message__c");
        //}
        commandText.append(" FROM CKW__c");
        commandText.append(getCkwPhoneFilter(imei));
        QueryResult query = getBinding().query(commandText.toString());
        if (query.getSize() == 1) {
            CKW__c ckw = (CKW__c)query.getRecords(0);
            StringBuilder performanceMessage = new StringBuilder();

            performanceMessage.append("<p>Performance summary for " + ckw.getPerson__r().getFirst_Name__c() + "</p>");
            performanceMessage.append("<p>" + ckw.getCurrent_Performance_Review__r().getPerformance_Message__c() + "</p>");
            
            if (includePaymentInformation) {
                performanceMessage.append("<hr><p>Payment for last month:</p><p>");
                performanceMessage.append(ckw.getPrevious_Performance_Review__r().getPayment_Message__c());
                performanceMessage.append("</p>");
            }
            return performanceMessage.toString();
        }
        else {
            return getErrorString(query.getSize(), imei);
        }
    }
    
    public SubmissionResponse submitSupportCase(String caseDetails, String imei) throws Exception {
        // first grab the CKW name and ID
        StringBuilder commandText = new StringBuilder();
        commandText.append("select id, Name, Person__c from CKW__c");
        commandText.append(getCkwPhoneFilter(imei));
        QueryResult query = getBinding().query(commandText.toString());
        CKW__c ckw;
        if (query.getSize() != 1) {
            return SubmissionResponse.createErrorResponse(getErrorString(query.getSize(), imei));
        }
        
        ckw = (CKW__c)query.getRecords(0);

        // now construct a case object with that information
        _case[] supportCase = new _case[1];
        supportCase[0] = new _case();
        supportCase[0].setReason("New Reason");
        supportCase[0].setType("Unknown");
        supportCase[0].setOrigin("CKW Pulse");
        supportCase[0].setStatus("New");
        supportCase[0].setDescription(caseDetails);
        supportCase[0].setPerson__c(ckw.getPerson__c());
        supportCase[0].setSubject("From " + ckw.getName());
        SaveResult saveResult[] = getBinding().create(supportCase);
        if (saveResult.length == 1) {
            // finally, try to obtain the case number
            query = getBinding().query("SELECT CaseNumber from case WHERE id='" + saveResult[0].getId() + "'");
            if (query.getSize() > 0) {
                return SubmissionResponse.createSuccessfulResponse(((_case)query.getRecords(0)).getCaseNumber());
            }
        }

        return SubmissionResponse.createErrorResponse("Case was unable to be processed. Please try again in a few minutes.");
    }
    
    private String getErrorString(int numberOfMatches, String imei) {
        if (numberOfMatches == 0) { 
            return "IMEI '" + imei + "' was not found in the CKW system. Please contact your field representative.";            
        }
        else {
            return "Multiple CKWs Found with IMEI '" + imei + "'. Please contact your field representative.";
        }
    }

    public static class SubmissionResponse {
        private String content;
        private boolean isError;
        
        private SubmissionResponse(String content, boolean isError) {
            this.content = content;
            this.isError = isError;            
        }
        
        public String getCaseNumber() {
            if (this.isError) {
                return null;
            }
            else {
                return this.content;
            }            
        }
        
        public String getError() {
            if (this.isError) {
                return this.content;
            }
            else {
                return null;
            }
        }
        
        private static SubmissionResponse createErrorResponse(String errorString) {
            return new SubmissionResponse(errorString, true);            
        }
        
        private static SubmissionResponse createSuccessfulResponse(String caseNumber) {
            return new SubmissionResponse(caseNumber, false);            
        }
    }
}
