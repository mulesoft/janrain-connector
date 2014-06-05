/**
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */

package org.mule.modules.janrain.automation.testcases.capture.settings;

import java.util.HashMap;

import org.apache.commons.lang.StringUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.api.MuleEvent;
import org.mule.api.processor.MessageProcessor;
import org.mule.modules.janrain.automation.JanrainTestParent;
import org.mule.modules.janrain.automation.RegressionTests;

public class GetKeysTestCases extends JanrainTestParent {
	
	@Before
	public void setUp() {
		
	}
	
	
	@Category({RegressionTests.class})
	@Test
	public void testGetKeys() {
		// Prevent deletion if it was initialized in the @Before
		if (testObjects == null) {
			testObjects = new HashMap<String, Object>();
		}
		
		MessageProcessor flow = lookupFlowConstruct("get-keys");
		
		try {			
			MuleEvent response = flow.process(getTestEvent(testObjects));
			String payload = (String) response.getMessage().getPayload();
			
			Assert.assertFalse(StringUtils.isEmpty(payload));
			Assert.assertTrue(payload.contains("\"stat\":\"ok\""));
			
		} catch (AssertionError ae) { 
			throw ae;
		} catch (Throwable e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
	
	@After
	public void tearDown() {		
	}

}
