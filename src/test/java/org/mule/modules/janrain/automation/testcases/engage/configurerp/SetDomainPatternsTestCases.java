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

public class SetDomainPatternsTestCases extends JanrainTestParent {

	@Before
	public void setUp() {
		testObjects =  new HashMap<String,Object>();
		
		String domains = null;
		
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
				
				testObjects.put("domains", domains);
			}
			
		} catch (AssertionError ae) { 
			throw ae;
		} catch (Throwable e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
	
	@Category({RegressionTests.class})
	@Test
	public void testSetDomainPatterns() {
		
		// Prevent deletion if it was initialized in the @Before
		if (testObjects == null) {
			testObjects =  new HashMap<String,Object>();
		}
		
		// Load context beans here!...
		
		MessageProcessor flow = lookupFlowConstruct("set-domain-patterns");
		
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
		
	}

}
