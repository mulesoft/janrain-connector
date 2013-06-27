/**
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */

package org.mule.modules.janrain.automation;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;
import org.mule.modules.janrain.automation.testcases.SmokeTests;
import org.mule.modules.janrain.automation.testcases.engage.sharing.GetShareProvidersTestCases;

@RunWith(Categories.class)
@IncludeCategory(SmokeTests.class)

@SuiteClasses({
	GetShareProvidersTestCases.class
		})

public class SmokeTestSuite {
	
}