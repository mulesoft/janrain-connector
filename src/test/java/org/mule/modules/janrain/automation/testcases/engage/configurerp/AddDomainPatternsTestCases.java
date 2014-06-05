/**
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */

package org.mule.modules.janrain.automation.testcases.engage.configurerp;

import java.util.HashMap;
import java.util.List;
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
import org.mule.modules.janrain.engage.DomainPatterns;

public class AddDomainPatternsTestCases extends JanrainTestParent {

	private String domains;
	
	@Before
	public void setUp() {
		
		domains = null;
		
		MessageProcessor flow = lookupFlowConstruct("get-domain-patterns");
		
		try {			
			MuleEvent response = flow.process(getTestEvent(testObjects));
			List<String> d = ((DomainPatterns) response.getMessage().getPayload()).getDomains();
			
			if (d != null && d.size() > 0) {
				domains = "";
				for (String s : d) {
					if (domains.length() > 0) domains += ",";
					domains += s;
				}
			}
			
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
	public void testAddDomainPatterns() {
		
		// Prevent deletion if it was initialized in the @Before
		if (testObjects == null) {
			testObjects =  (Map<String, Object>) context.getBean("addDomainPatterns");
		}
		
		// Load context beans here!...
		
		MessageProcessor flow = lookupFlowConstruct("add-domain-patterns");
		
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
		if (domains != null) {
			testObjects =  new HashMap<String, Object>();
			testObjects.put("domains", domains);
			
			MessageProcessor flow = lookupFlowConstruct("set-domain-patterns");
			
			try {			
				flow.process(getTestEvent(testObjects));
			} catch (Throwable e) {
				e.printStackTrace();
				Assert.fail(e.getMessage());
			}
		}
	}
}
