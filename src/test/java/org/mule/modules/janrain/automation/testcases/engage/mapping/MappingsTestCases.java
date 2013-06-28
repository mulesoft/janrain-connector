package org.mule.modules.janrain.automation.testcases.engage.mapping;

import java.util.Map;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.api.MuleEvent;
import org.mule.api.processor.MessageProcessor;
import org.mule.modules.janrain.automation.testcases.JanrainTestParent;
import org.mule.modules.janrain.automation.testcases.RegressionTests;
import org.mule.modules.janrain.engage.Identifiers;

public class MappingsTestCases extends JanrainTestParent {

	@Before
	public void setUp() {
		
	}
	
	@SuppressWarnings("unchecked")
	@Category({RegressionTests.class})
	@Test
	public void testMappings() {
		
		// Prevent deletion if it was initialized in the @Before
		if (testObjects == null) {
			testObjects =  (Map<String, Object>) context.getBean("mappings");
		}
				
		// Load context beans here!...
		
		MessageProcessor flow = lookupFlowConstruct("mappings");
		
		try {			
			MuleEvent response = flow.process(getTestEvent(testObjects));
			Identifiers payload = (Identifiers) response.getMessage().getPayload();
			
			Assert.assertNotNull(payload);			
						
		} catch (Throwable e) {
			e.printStackTrace();
			Assert.fail();
		}
		
	}
	
	@After
	public void tearDown() {
		
	}
}