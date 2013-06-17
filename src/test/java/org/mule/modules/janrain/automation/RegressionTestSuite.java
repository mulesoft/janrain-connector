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
import org.mule.modules.janrain.automation.testcases.AddClientTestCase;
import org.mule.modules.janrain.automation.testcases.AnalyticsAccessTestCase;
import org.mule.modules.janrain.automation.testcases.GetAppSettingsTestCase;
import org.mule.modules.janrain.automation.testcases.RegressionTests;

@RunWith(Categories.class)
@IncludeCategory(RegressionTests.class)

@SuiteClasses({
	GetAppSettingsTestCase.class,
	AddClientTestCase.class,
	AnalyticsAccessTestCase.class
		})

public class RegressionTestSuite {
	
	
	
}