/**
 * (c) 2003-2015 MuleSoft, Inc. The software in this package is published under
 * the terms of the CPAL v1.0 license, a copy of which has been included with this
 * distribution in the LICENSE.md file.
 */

package org.mule.modules.janrain.automation.testcases.engage.sharing;

import java.util.HashMap;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.api.MuleEvent;
import org.mule.api.processor.MessageProcessor;
import org.mule.modules.janrain.automation.JanrainTestParent;
import org.mule.modules.janrain.automation.RegressionTests;
import org.mule.modules.janrain.engage.ShareProviders;

public class SetSharingProvidersTestCases extends JanrainTestParent {

	private String share;

	@Before
	public void setUp() {
		share = null;
		MessageProcessor flow = lookupFlowConstruct("get-share-providers");

		try {
			MuleEvent response = flow.process(getTestEvent(testObjects));
			ShareProviders payload = (ShareProviders) response.getMessage().getPayload();

			if (payload != null && payload.getShare() != null && payload.getShare().size() > 0) {
				share = payload.getShare().get(0);
			}

		} catch (AssertionError ae) { 
			throw ae;
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

	@Category({ RegressionTests.class })
	@Test
	public void testSetSharingProviders() {

		if (share != null) {

			// Prevent deletion if it was initialized in the @Before
			if (testObjects == null) {
				testObjects = new HashMap<String, Object>();
			}
			
			testObjects.put("share", share);

			MessageProcessor flow = lookupFlowConstruct("set-share-providers");

			try {
				MuleEvent response = flow.process(getTestEvent(testObjects));
				Boolean payload = (Boolean) response.getMessage().getPayload();

				Assert.assertNotNull(payload);
				Assert.assertTrue(payload);

			} catch (AssertionError ae) { 
				throw ae;
			} catch (Throwable e) {
				e.printStackTrace();
				Assert.fail();
			}
		}
	}

	@After
	public void tearDown() {

	}
}
