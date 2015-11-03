/**
 * (c) 2003-2015 MuleSoft, Inc. The software in this package is published under
 * the terms of the CPAL v1.0 license, a copy of which has been included with this
 * distribution in the LICENSE.md file.
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
import org.mule.modules.janrain.automation.JanrainTestParent;
import org.mule.modules.janrain.automation.RegressionTests;
import org.mule.modules.janrain.capture.ClientInfo;
import org.mule.modules.janrain.capture.ClientListInfo;

public class ListClientsTestCases extends JanrainTestParent {

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
	public void testListClients() {
		MessageProcessor flow = lookupFlowConstruct("list-clients");
		
		try {
			MuleEvent response = flow.process(getTestEvent(testObjects));
			ClientListInfo payload = (ClientListInfo) response.getMessage().getPayload();
			
			Assert.assertNotNull(payload);
			Assert.assertEquals("ok", payload.getStat());
			Assert.assertNotNull(payload.getResults());
			Assert.assertTrue(payload.getResults().size() > 0);
			
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
