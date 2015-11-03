/**
 * (c) 2003-2015 MuleSoft, Inc. The software in this package is published under
 * the terms of the CPAL v1.0 license, a copy of which has been included with this
 * distribution in the LICENSE.md file.
 */

package org.mule.modules.janrain.automation.testcases.engage.general;

import java.util.HashMap;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.api.MuleEvent;
import org.mule.api.processor.MessageProcessor;
import org.mule.modules.janrain.automation.JanrainTestParent;
import org.mule.modules.janrain.automation.RegressionTests;
import org.mule.modules.janrain.engage.WidgetProviders;

public class ProvidersTestCases extends JanrainTestParent {

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
