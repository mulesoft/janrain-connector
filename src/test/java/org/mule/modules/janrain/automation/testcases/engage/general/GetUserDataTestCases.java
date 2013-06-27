/**
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */

package org.mule.modules.janrain.automation.testcases.engage.general;

import java.util.HashMap;

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
import org.mule.modules.janrain.engage.UserInfo;

public class GetUserDataTestCases extends JanrainTestParent {

	@Before
	public void setUp() {
		
	}
	
	@Category({RegressionTests.class})
	@Test
	public void testProviders() {
		
		// Prevent deletion if it was initialized in the @Before
		if (testObjects == null) {
			testObjects =  new HashMap<String,Object>();
		}
		
		// Load context beans here!...
		
		MessageProcessor flow = lookupFlowConstruct("get-user-data");
		
		try {			
			MuleEvent response = flow.process(getTestEvent(testObjects));
			UserInfo payload = (UserInfo) response.getMessage().getPayload();
			
			Assert.assertNotNull(payload);
			Assert.assertEquals("ok", payload.getStat());
			Assert.assertFalse(StringUtils.isEmpty(payload.getProfile().getEmail()));
			
		} catch (Throwable e) {
			e.printStackTrace();
			Assert.fail();
		}
		
	}
	
	@After
	public void tearDown() {
		
	}
}
