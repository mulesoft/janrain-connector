/**
 * (c) 2003-2015 MuleSoft, Inc. The software in this package is published under
 * the terms of the CPAL v1.0 license, a copy of which has been included with this
 * distribution in the LICENSE.md file.
 */

package org.mule.modules.janrain.automation.testcases.engage.general;

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

import java.util.Map;

public class AnalyticsAccessTestCases extends JanrainTestParent {
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
			
			String urlKey = "url";
			
			Assert.assertNotNull(payload);
			Assert.assertTrue(payload.containsKey(urlKey));
			Assert.assertFalse(StringUtils.isEmpty(payload.get(urlKey)));
			
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
