/**
 * (c) 2003-2015 MuleSoft, Inc. The software in this package is published under
 * the terms of the CPAL v1.0 license, a copy of which has been included with this
 * distribution in the LICENSE.md file.
 */

package org.mule.modules.janrain.automation.testrunners;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;
import org.mule.modules.janrain.automation.SmokeTests;
import org.mule.modules.janrain.automation.testcases.capture.clients.AddClientTestCases;
import org.mule.modules.janrain.automation.testcases.capture.clients.DeleteClientTestCases;
import org.mule.modules.janrain.automation.testcases.engage.sharing.GetShareProvidersTestCases;
import org.mule.modules.janrain.automation.testcases.partner.admin.AddAdminTestCases;
import org.mule.modules.janrain.automation.testcases.partner.admin.DeleteAdminTestCases;

@RunWith(Categories.class)
@IncludeCategory(SmokeTests.class)

@SuiteClasses({
	GetShareProvidersTestCases.class,
	AddAdminTestCases.class,
	DeleteAdminTestCases.class,
	AddClientTestCases.class,
	DeleteClientTestCases.class
		})

public class SmokeTestSuite {
	
}