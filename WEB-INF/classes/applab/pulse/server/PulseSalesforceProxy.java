package applab.pulse.server;

import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

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
import com.sforce.soap.enterprise.sobject.Person__c;
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
        for (int i = 0; i < query.getSize(); i++) {
            Message__c message = (Message__c)query.getRecords(i);
            messages.add(new Message(message.getSubject__c(), message.getFrom__r().getName(),
                    message.getSent_Time__c().getTime(), message.getBody__c()));
        }
        return messages;
    }

    public String getProfile(String imei) throws Exception {

        // Load the CKW and the person.
        CKW__c ckw = super.getCkw(imei);
        Person__c person = super.getPerson(imei);

        StringBuilder profileString = new StringBuilder();
        if (person == null) {
            return getErrorString(0, imei);
        }

        profileString.append("Your ID: ");
        if (ckw != null) {
            profileString.append(ckw.getName());
        }
        else {
            profileString.append(person.getName());
        }
        profileString.append(lineBreak);

        // Get the name for this person.
        profileString.append("Your Name: ");
        profileString.append(person.getFirst_Name__c());
        profileString.append(" ");
        profileString.append(person.getLast_Name__c());
        profileString.append(lineBreak);

        // Get the location string for this Person.
        profileString.append("Your Location: ");
        profileString.append(person.getSubcounty__c());
        profileString.append(", ");
        profileString.append(person.getParish__c());
        profileString.append(", ");
        profileString.append(person.getVillage__c());
        profileString.append(".");
        profileString.append(lineBreak);
        profileString.append(lineBreak);

        // Get the phone ID.
        profileString.append("Phone ID: ");
        profileString.append(person.getHandset__r().getIMEI__c());
        profileString.append(lineBreak);

        // Get the phone number.
        if(null != person.getHandset__r().getSIM__r()) {
            profileString.append("Phone Number: ");
            profileString.append(person.getHandset__r().getSIM__r().getName());
        }
        profileString.append(lineBreak);
        profileString.append(lineBreak);
        profileString.append("VERY IMPORTANT: If your name or phone number are not listed correctly, please advise your field co-coordinator or field officer as soon as possible. Alternatively you can report this problem via the Support tab. Your activities will not be recorded in the system if the above information is incorrect.");
        return profileString.toString();
    }

    /**
     * Get details on the CKW's performance and payment information
     */
    public String getPerformance(String imei) throws Exception {

        // First, query for the performance message
        CKW__c ckw = super.getCkw(imei);

        StringBuilder performanceMessage = new StringBuilder();
        if (ckw == null) {
            // Return null so that the tab doesn't show. When the performance data is linked to the person object, this shall change
            return null;
        }
        else if (ckw.getCurrent_Performance_Review__r().getPerformance_Message__c() == null) {
            performanceMessage.append("Your performance record hasn't yet been created. It usually takes about 24 hours. Please check back tomorrow");
        }
        else {
            performanceMessage.append("<p>This month's performance summary for " + ckw.getPerson__r().getFirst_Name__c() + "</p>");
            
            // Get current date
            Calendar currentDate = Calendar.getInstance();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MMM-dd");
            String currentDateString = formatter.format(currentDate.getTime());
            
            performanceMessage.append("<p>Update date: " + currentDateString + "<br/><br/>"  + ckw.getCurrent_Performance_Review__r().getPerformance_Message__c() + "</p>");
        }

        return performanceMessage.toString();
    }

    public SubmissionResponse submitSupportCase(String caseDetails, String imei, String type) throws Exception {
        if(null == caseDetails || caseDetails.equalsIgnoreCase("")) {
            return SubmissionResponse.createErrorResponse("You haven't entered any text. Please enter some text before you submit");
        }
        // First grab the Person's name and ID
        StringBuilder commandText = new StringBuilder();
        commandText.append("select id, Name from Person__c");
        commandText.append(" WHERE Handset__r.IMEI__c = '" + imei + "'");
        QueryResult query = getBinding().query(commandText.toString());
        Person__c person;
        if (query.getSize() != 1) {
            return SubmissionResponse.createErrorResponse(getErrorString(query.getSize(), imei));
        }

        person = (Person__c)query.getRecords(0);

        // now construct a case object with that information
        _case[] supportCase = new _case[1];
        supportCase[0] = new _case();
        supportCase[0].setReason("New Reason");
        if(null != type) {
            supportCase[0].setType(type);
        } else {
            supportCase[0].setType("Unknown");
        }
        supportCase[0].setOrigin("CKW Pulse");
        supportCase[0].setStatus("New");
        supportCase[0].setDescription(caseDetails);
        supportCase[0].setPerson__c(person.getId());
        supportCase[0].setSubject("From " + person.getName());
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
