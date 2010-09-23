package applab.pulse.server.test;

import java.util.ArrayList;

import junit.framework.TestCase;
import org.junit.Test;
import applab.pulse.server.PulseSalesforceProxy;
import applab.server.SalesforceProxy;

import com.sforce.soap.enterprise.SoapBindingStub;

public class TestPerformanceTab extends TestCase {
    
    // Object Ids to delete (put any ids you create in here and they'll be deleted in the tearDown)
    private ArrayList<String> createdObjects = new ArrayList<String>();

    // Binding
    private SoapBindingStub binding = null;
    
    protected void setUp() throws Exception {
        binding = SalesforceProxy.createBinding();
    }

    protected void tearDown() throws Exception {
        if (createdObjects.size() > 0) {
            binding.delete(createdObjects.toArray(new String[0]));
        }
    }
    
    @Test
    public void testGetPerformanceTab() throws Exception {
        
        // Get the performance tab XML for the emulator
        PulseSalesforceProxy proxy = new PulseSalesforceProxy();
        String output = proxy.getCkwPerformance("359444022451501");
        
        // Print the XML
        System.out.println(output);
    }

}
