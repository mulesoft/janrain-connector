package org.mule.modules.janrain.automation.testcases;

import java.util.Map;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.api.MuleEvent;
import org.mule.api.processor.MessageProcessor;

public class AnalyticsAccessTestCase extends JanrainTestParent {
	@Before
	public void setUp() {
		
	}
	
	@SuppressWarnings("unchecked")
	@Category({RegressionTests.class})
	@Test
	public void testProviders() {
		
		// Prevent deletion if it was initialized in the @Before
		if (testObjects == null) {
			testObjects =  (Map<String, Object>) context.getBean("analyticsAccess");
		}
		
		MessageProcessor flow = lookupFlowConstruct("analytics-access");
		
		try {			
			MuleEvent response = flow.process(getTestEvent(testObjects));
			Map<String, String> payload = (Map<String, String>) response.getMessage().getPayload();
			
			Assert.assertNotNull(payload);
			
			
		} catch (Throwable e) {
			e.printStackTrace();
			Assert.fail(e.toString());
		}
		
	}
	
	@After
	public void tearDown() {
		
	}
}
