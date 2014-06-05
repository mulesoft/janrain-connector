/**
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
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