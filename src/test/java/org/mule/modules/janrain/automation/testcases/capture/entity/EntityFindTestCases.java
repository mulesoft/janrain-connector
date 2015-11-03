/**
 * (c) 2003-2015 MuleSoft, Inc. The software in this package is published under
 * the terms of the CPAL v1.0 license, a copy of which has been included with this
 * distribution in the LICENSE.md file.
 */

package org.mule.modules.janrain.automation.testcases.capture.entity;

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

public class EntityFindTestCases extends JanrainTestParent {
	
	private final String STAT 	= "stat";
	private final String ID 	= "id";
	
	@SuppressWarnings("unchecked")
	@Before
	public void setUp() {
		// Prevent deletion if it was initialized in the @Before
		if (testObjects == null) {
			testObjects = (Map<String, Object>) context.getBean("entityCreate");
		}
		
		MessageProcessor flow = lookupFlowConstruct("entity-create");
		
		try {			
			MuleEvent response = flow.process(getTestEvent(testObjects));
			Map<String, String> payload = (Map<String, String>) response.getMessage().getPayload();
			
			Assert.assertNotNull(payload);			
			Assert.assertTrue(payload.containsKey(STAT));
			Assert.assertEquals("ok", payload.get(STAT));			
			Assert.assertTrue(payload.containsKey(ID));			
			
			
			testObjects.put(ID, payload.get(ID));
			
		} catch (AssertionError ae) { 
			throw ae;
		} catch (Throwable e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
	
	
	@SuppressWarnings("unchecked")
	@Category({RegressionTests.class})
	@Test
	public void testEntityFind() {
		
		Map<String, Object> m = testObjects;
		testObjects = (Map<String, Object>) context.getBean("entityFind");
		testObjects.put(ID, m.get(ID));
		
		m = null;
		
		MessageProcessor flow = lookupFlowConstruct("entity-find");
		
		try {			
			MuleEvent response = flow.process(getTestEvent(testObjects));
			String payload = (String) response.getMessage().getPayload();
			
			Assert.assertNotNull(payload);
			Assert.assertFalse(StringUtils.isEmpty(payload));
			Assert.assertTrue(payload.contains("\"stat\":\"ok\""));
			Assert.assertTrue(payload.contains("\"result_count\""));
			
			
		} catch (AssertionError ae) { 
			throw ae;
		} catch (Throwable e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
	
	@After
	public void tearDown() {
		MessageProcessor flow = lookupFlowConstruct("entity-delete");
		
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
}
