package org.mule.modules.janrain.automation.testcases.engage.mapping;

import java.util.HashMap;

import org.apache.commons.lang.StringUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.api.MuleEvent;
import org.mule.api.processor.MessageProcessor;
import org.mule.modules.janrain.automation.testcases.JanrainTestParent;
import org.mule.modules.janrain.automation.testcases.RegressionTests;

public class AllMappingsTestCases extends JanrainTestParent {

	@Before
	public void setUp() {
		
	}
	
	@Category({RegressionTests.class})
	@Test
	public void testAllMappings() {
		
		// Prevent deletion if it was initialized in the @Before
		if (testObjects == null) {
			testObjects =  new HashMap<String,Object>();
		}
		
		// Load context beans here!...
		
		MessageProcessor flow = lookupFlowConstruct("all-mappings");
		
		try {			
			MuleEvent response = flow.process(getTestEvent(testObjects));
			String payload = (String) response.getMessage().getPayload();
			
			Assert.assertNotNull(payload);
			Assert.assertFalse(StringUtils.isEmpty(payload));
			
		} catch (Throwable e) {
			e.printStackTrace();
			Assert.fail();
		}
		
	}
	
	@After
	public void tearDown() {
		
	}
}