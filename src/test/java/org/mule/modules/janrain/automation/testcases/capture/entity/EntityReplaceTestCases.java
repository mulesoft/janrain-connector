/**
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */

package org.mule.modules.janrain.automation.testcases.capture.entity;

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

public class EntityReplaceTestCases extends JanrainTestParent {

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
	public void testEntityReplace() {
		
		Map<String, Object> m = testObjects;
		testObjects = (Map<String, Object>) context.getBean("entityReplace");
		testObjects.put(ID, m.get(ID));
		
		m = null;
		
		MessageProcessor flow = lookupFlowConstruct("entity-replace");
		
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
