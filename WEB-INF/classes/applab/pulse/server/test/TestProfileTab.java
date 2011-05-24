package applab.pulse.server.test;

import java.util.ArrayList;
import java.util.HashMap;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import applab.pulse.server.PulseSalesforceProxy;
import applab.server.ApplabConfiguration;
import applab.server.SalesforceProxy;

import com.sforce.soap.enterprise.SaveResult;
import com.sforce.soap.enterprise.SoapBindingStub;
import com.sforce.soap.enterprise.sobject.CKW__c;
import com.sforce.soap.enterprise.sobject.Person__c;
import com.sforce.soap.enterprise.sobject.Phone__c;
import com.sforce.soap.enterprise.sobject.SIM__c;

public class TestProfileTab extends TestCase {

    // Binding
    private SoapBindingStub binding;

    // Object Ids to delete (put any ids you create in here and they'll be deleted in the tearDown)
    private ArrayList<String> createdObjects = new ArrayList<String>();

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {

        HashMap<String, String> configMap = new HashMap<String, String>();
        configMap.put("salesforceAddress", "https://cs1.salesforce.com/services/Soap/c/18.0");
        configMap.put("salesforceUsername", "crmapi@applab.org.ckwtest");
        configMap.put("salesforcePassword", "yoteam2010");
        configMap.put("salesforceToken", "4nh9SErlTdv3LKEr0G7WxmMa0");
        ApplabConfiguration.setUpTestConfig(configMap);
        binding = SalesforceProxy.createBinding();

        try {

            // Create a SIM Card
            SIM__c sim1 = new SIM__c();
            sim1.setSIM_Serial_Number__c("0123456789");
            sim1.setName("0123456789");
            SaveResult[] simSaveResult1 = binding.create(new SIM__c[] { sim1 });
            if (!simSaveResult1[0].isSuccess()) {
                throw new Exception("Test Failed: Failed to save SIM1! " + simSaveResult1[0].getErrors()[0].getMessage());
            }
            else {
                this.createdObjects.add(simSaveResult1[0].getId());
            }

            // Create a Handset
            Phone__c phone1 = new Phone__c();
            phone1.setSerial_Number__c("MyTestSerialNumber"); // This is required too
            phone1.setIMEI__c("MyTestPhoneImei");
            phone1.setSIM__c(simSaveResult1[0].getId());
            phone1.setPurchase_Value_USD__c(10.0);
            SaveResult[] phoneSaveResult = binding.create(new Phone__c[] { phone1 });
            if (!phoneSaveResult[0].isSuccess()) {
                throw new Exception("Test Failed: Failed to save Phone1! " + phoneSaveResult[0].getErrors()[0].getMessage());
            }
            else {
                this.createdObjects.add(phoneSaveResult[0].getId());
            }

            // Create a Person
            Person__c person1 = new Person__c();
            person1.setFirst_Name__c("Test1");
            person1.setLast_Name__c("Test1");
            person1.setSubcounty__c("SubCounty1");
            person1.setVillage__c("Village1");
            person1.setParish__c("Parish1");
            person1.setHandset__c(phoneSaveResult[0].getId());
            SaveResult[] person1SaveResult = binding.create(new Person__c[] { person1 });
            
            if (!person1SaveResult[0].isSuccess()) {
                    throw new Exception("Test Failed: Failed to save Person1! " + person1SaveResult[0].getErrors()[0].getMessage());
            }
            else {
                this.createdObjects.add(person1SaveResult[0].getId());
                //this.surveyId = surveySaveResult[0].getId();
            }

            // Create a CKW for that Person
            CKW__c ckw = new CKW__c();
            ckw.setPerson__c(person1SaveResult[0].getId());
            SaveResult[] ckwSaveResult1 = binding.create(new CKW__c[] { ckw });
            if (!ckwSaveResult1[0].isSuccess()) {
                throw new Exception("Test Failed: Failed to save SIM2! " + ckwSaveResult1[0].getErrors()[0].getMessage());
            }
            else {
                this.createdObjects.add(ckwSaveResult1[0].getId());
            }

            // Create a second Person. This one will not have a CKW
            // Create a SIM Card
            SIM__c sim2 = new SIM__c();
            sim2.setSIM_Serial_Number__c("0987654321");
            sim2.setName("0987654321");
            SaveResult[] simSaveResult2 = binding.create(new SIM__c[] { sim2 });
            if (!simSaveResult2[0].isSuccess()) {
                throw new Exception("Test Failed: Failed to save SIM2! " + simSaveResult2[0].getErrors()[0].getMessage());
            }
            else {
                this.createdObjects.add(simSaveResult2[0].getId());
            }

            // Create a Handset
            Phone__c phone2 = new Phone__c();
            phone2.setSerial_Number__c("MyTestSerialNumber2"); // This is required too
            phone2.setIMEI__c("MyTestPhoneImei2");
            phone2.setPurchase_Value_USD__c(10.0);
            phone2.setSIM__c(simSaveResult2[0].getId());
            SaveResult[] phoneSaveResult1 = binding.create(new Phone__c[] { phone2 });
            if (!phoneSaveResult1[0].isSuccess()) {
                throw new Exception("Test Failed: Failed to save Phone2! " + phoneSaveResult1[0].getErrors()[0].getMessage());
            }
            else {
                this.createdObjects.add(phoneSaveResult1[0].getId());
            }

            // Create a Person
            Person__c person2 = new Person__c();
            person2.setFirst_Name__c("Test2");
            person2.setLast_Name__c("Test2");
            person2.setSubcounty__c("SubCounty2");
            person2.setVillage__c("Village2");
            person2.setParish__c("Parish2");
            person2.setHandset__c(phoneSaveResult1[0].getId());
            SaveResult[] person2SaveResult = binding.create(new Person__c[] { person2 });
            
            if (!person2SaveResult[0].isSuccess()) {
                    throw new Exception("Test Failed: Failed to save Person1! " + person2SaveResult[0].getErrors()[0].getMessage());
            }
            else {
                this.createdObjects.add(person2SaveResult[0].getId());
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            tearDown();
            Assert.fail(e.toString());
        }
    }

    @After
    public void tearDown() throws Exception {
        if (createdObjects.size() > 0) {
            binding.delete(createdObjects.toArray(new String[0]));
        }
    }

    @Test
    public void testGetProfileTab() throws Exception {

        // Get the Profile for the CKW
        PulseSalesforceProxy proxy = new PulseSalesforceProxy();
        String ckwProfile = proxy.getProfile("MyTestPhoneImei");

        // Print the XML
        System.out.println(ckwProfile);

        // Get the Profile for the Person
        String personProfile = proxy.getProfile("MyTestPhoneImei2");

        // Print the XML
        System.out.println(personProfile);
    }
}
