package org.mule.modules.janrain.automation.testcases;

import java.util.HashMap;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.api.MuleEvent;
import org.mule.api.processor.MessageProcessor;
import org.mule.modules.janrain.engage.WidgetProviders;

public class ProvidersTestCase extends JanrainTestParent {
	@Before
	public void setUp() {
		
	}
	
	@Category({RegressionTests.class})
	@Test
	public void testProviders() {
		
		// Prevent deletion if it was initialized in the @Before
		if (testObjects == null) {
			testObjects =  new HashMap<String,Object>();
		}
		
		// Load context beans here!...
		
		MessageProcessor flow = lookupFlowConstruct("providers");
		
		try {			
			MuleEvent response = flow.process(getTestEvent(testObjects));
			WidgetProviders payload = (WidgetProviders) response.getMessage().getPayload();
			
			Assert.assertNotNull(payload);
			Assert.assertEquals("ok", payload.getStat());
			Assert.assertTrue(payload.getSignin().size() > 0);
			
		} catch (Throwable e) {
			e.printStackTrace();
			Assert.fail(e.toString());
		}
		
	}
	
	@After
	public void tearDown() {
		
	}
}
