/**
 * (c) 2003-2015 MuleSoft, Inc. The software in this package is published under
 * the terms of the CPAL v1.0 license, a copy of which has been included with this
 * distribution in the LICENSE.md file.
 */

package org.mule.modules.janrain.automation.testcases.capture.settings;

import java.util.HashMap;
import java.util.List;
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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GetSettingsTestCases extends JanrainTestParent {

	@Before
	public void setUp() {
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
			
			GsonBuilder gsonBuilder = new GsonBuilder();
			Gson gson = gsonBuilder.create();
			
			@SuppressWarnings("unchecked")
			Map<String, Object> obj = gson.fromJson(payload, Map.class);
			
			Assert.assertTrue(obj.containsKey("result"));
			Assert.assertNotNull(obj.get("result"));
			Assert.assertTrue(((List<?>) obj.get("result")).size() > 0);
			
			testObjects.put("payload", obj);
			
		} catch (AssertionError ae) { 
			throw ae;
		} catch (Throwable e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
	
	
	@Category({RegressionTests.class})
	@Test
	public void testGetKeys() {
		
		MessageProcessor flow = lookupFlowConstruct("get-settings");
		
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
