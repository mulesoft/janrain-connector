/**
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */

package org.mule.modules.janrain.automation.testcases.engage.general;

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

public class SetAuthProvidersTestCases extends JanrainTestParent {

	@Before
	public void setUp() {
		
	}
	
	@SuppressWarnings("unchecked")
	@Category({RegressionTests.class})
	@Test
	public void testSetAuthProviders() {
		
		// Prevent deletion if it was initialized in the @Before
		if (testObjects == null) {
			testObjects =  (Map<String, Object>) context.getBean("setAuthProviders");
		}
		
		// Load context beans here!...
		// context.getBean("setAppSettings");
		
		MessageProcessor flow = lookupFlowConstruct("set-auth-providers");
		
		try {			
			MuleEvent response = flow.process(getTestEvent(testObjects));
			Boolean payload = (Boolean) response.getMessage().getPayload();
			
			Assert.assertTrue(payload);
			
		} catch (Throwable e) {
			e.printStackTrace();
			Assert.fail();
		}
		
	}
	
	@After
	public void tearDown() {
		
	}
}