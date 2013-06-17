/**
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */

package org.mule.modules.janrain.automation.testcases;

import java.util.Map;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.api.MuleEvent;
import org.mule.api.processor.MessageProcessor;
import org.mule.modules.janrain.capture.ClientInfo;

public class AddClientTestCase extends JanrainTestParent {
	
	@Before
	public void setUp() {
		
	}
	
	@SuppressWarnings("unchecked")
	@Category({SmokeTests.class, RegressionTests.class})
	@Test
	public void testAddClient() {
		
		// Prevent deletion if it was initialized in the @Before
		if (testObjects == null) {
			testObjects = (Map<String,Object>) context.getBean("addClient_Client");
		}
		
		MessageProcessor flow = lookupFlowConstruct("add-client");
		
		try {
			MuleEvent response = flow.process(getTestEvent(testObjects));
			ClientInfo payload = (ClientInfo) response.getMessage().getPayload();
			int i = 0;
			// Assertions here!...
			
		} catch (Throwable e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	@After
	public void tearDown() {
		
	}
}