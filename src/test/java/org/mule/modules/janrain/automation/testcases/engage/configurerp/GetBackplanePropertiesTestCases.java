/**
 * (c) 2003-2015 MuleSoft, Inc. The software in this package is published under
 * the terms of the CPAL v1.0 license, a copy of which has been included with this
 * distribution in the LICENSE.md file.
 */

package org.mule.modules.janrain.automation.testcases.engage.configurerp;

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
import org.mule.modules.janrain.engage.Backplane;

public class GetBackplanePropertiesTestCases extends JanrainTestParent {

	@Before
	public void setUp() {
		
	}
	
	@Category({RegressionTests.class})
	@Test
	public void testGetBackplaneProperties() {
		
		// Prevent deletion if it was initialized in the @Before
		if (testObjects == null) {
			testObjects =  new HashMap<String,Object>();
		}
		
		// Load context beans here!...
		
		MessageProcessor flow = lookupFlowConstruct("get-backplane-properties");
		
		try {			
			MuleEvent response = flow.process(getTestEvent(testObjects));
			Backplane payload = (Backplane) response.getMessage().getPayload();
			
			Assert.assertNotNull(payload);
			Assert.assertEquals("ok", payload.getStat());
			
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
