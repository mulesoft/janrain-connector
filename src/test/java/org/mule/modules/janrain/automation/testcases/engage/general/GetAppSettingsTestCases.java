/**
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */

package org.mule.modules.janrain.automation.testcases.engage.general;

import java.util.HashMap;
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

public class GetAppSettingsTestCases extends JanrainTestParent {
	
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
