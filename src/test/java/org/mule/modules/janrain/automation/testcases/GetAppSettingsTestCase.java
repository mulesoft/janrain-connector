package org.mule.modules.janrain.automation.testcases;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.api.MuleEvent;
import org.mule.api.processor.MessageProcessor;

public class GetAppSettingsTestCase extends JanrainTestParent {
	
	@Before
	public void setUp() {
		
	}
	
	@Category({RegressionTests.class})
	@Test
	public void testGetAppSettings() {
		
		// Prevent deletion if it was initialized in the @Before
		if (testObjects == null) {
			testObjects =  new HashMap<String,Object>();
		}
		
		// Load context beans here!...
		
		MessageProcessor flow = lookupFlowConstruct("get-app-settings");
		
		try {			
			MuleEvent response = flow.process(getTestEvent(testObjects));
			@SuppressWarnings("unchecked")
			Map<String, String> payload = (Map<String, String>) response.getMessage().getPayload();
			
			String statKey = "stat";
			
			Assert.assertNotNull(payload);
			Assert.assertTrue(payload.size() > 0);
			Assert.assertTrue(payload.containsKey(statKey));
			Assert.assertEquals("ok", payload.get(statKey));
			
		} catch (Throwable e) {
			e.printStackTrace();
			Assert.fail();
		}
		
	}
	
	@After
	public void tearDown() {
		
	}
}
