/**
 * (c) 2003-2015 MuleSoft, Inc. The software in this package is published under
 * the terms of the CPAL v1.0 license, a copy of which has been included with this
 * distribution in the LICENSE.md file.
 */

package org.mule.modules.janrain.automation.testcases.partner.admin;

import java.util.Map;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.api.MuleEvent;
import org.mule.api.processor.MessageProcessor;
import org.mule.modules.janrain.automation.JanrainTestParent;
import org.mule.modules.janrain.automation.RegressionTests;

public class DeleteAdminTestCases extends JanrainTestParent {

	@SuppressWarnings("unchecked")
	@Before
	public void setUp() {
		testObjects =  (Map<String, Object>) context.getBean("adminData");
		
		// Load context beans here!...
		
		MessageProcessor flow = lookupFlowConstruct("add-admin");
		
		try {			
			MuleEvent response = flow.process(getTestEvent(testObjects));
			Boolean payload = (Boolean) response.getMessage().getPayload();
			
			Assert.assertTrue(payload);
			
		} catch (AssertionError ae) { 
			throw ae;
		} catch (Throwable e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	@Category({RegressionTests.class})
	@Test
	public void testDeleteAdmin() {
		
		MessageProcessor flow = lookupFlowConstruct("delete-admin");
		
		try {			
			MuleEvent response = flow.process(getTestEvent(testObjects));
			Boolean payload = (Boolean) response.getMessage().getPayload();
			
			Assert.assertTrue(payload);
			
		} catch (AssertionError ae) { 
			throw ae;
		} catch (Throwable e) {
			e.printStackTrace();
			Assert.fail();
		}
		
	}
	
	@After
	public void tearDown() {
		
	}
}
