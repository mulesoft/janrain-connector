/**
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */

package org.mule.modules.janrain.automation.testcases.capture.clients;

import java.util.Map;

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
import org.mule.modules.janrain.capture.ClientInfo;

public class SetDescriptionTestCases extends JanrainTestParent {

	@SuppressWarnings("unchecked")
	@Before
	public void setUp() {
		// Prevent deletion if it was initialized in the @Before
		if (testObjects == null) {
			testObjects = (Map<String,Object>) context.getBean("addClient_Client");
		}
		
		MessageProcessor flow = lookupFlowConstruct("add-client");
		
		try {
			MuleEvent response = flow.process(getTestEvent(testObjects));
			ClientInfo payload = (ClientInfo) response.getMessage().getPayload();
			
			Assert.assertNotNull(payload);
			Assert.assertFalse(StringUtils.isEmpty(payload.getClient_id()));
			
			testObjects.put("client_id_for_deletion", payload.getClient_id());
			
		} catch (AssertionError ae) { 
			throw ae;
		} catch (Throwable e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
	
	@Category({RegressionTests.class})
	@Test
	public void testSetDescription() {
		MessageProcessor flow = lookupFlowConstruct("set-description");
		
		try {
			MuleEvent response = flow.process(getTestEvent(testObjects));
			Boolean payload = (Boolean) response.getMessage().getPayload();
			
			Assert.assertTrue(payload);
		} catch (AssertionError ae) { 
			throw ae;
		} catch (Throwable e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
		
		
	}
	
	@After
	public void tearDown() {
		MessageProcessor flow = lookupFlowConstruct("delete-client");
		
		try {		
			if (testObjects.containsKey("client_id_for_deletion")) {
				MuleEvent response = flow.process(getTestEvent(testObjects));
				Boolean payload = (Boolean) response.getMessage().getPayload();
				
				Assert.assertTrue(payload);
			}
			
		} catch (AssertionError ae) { 
			throw ae;
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
		
	}

}
