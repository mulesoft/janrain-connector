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
import org.mule.modules.janrain.automation.testcases.RegressionTests;
import org.mule.modules.janrain.automation.testcases.engage.general.AnalyticsAccessTestCases;
import org.mule.modules.janrain.automation.testcases.engage.general.GetAppSettingsTestCases;
import org.mule.modules.janrain.automation.testcases.engage.general.GetAvailableProvidersTestCases;
import org.mule.modules.janrain.automation.testcases.engage.general.GetContactsTestCases;
import org.mule.modules.janrain.automation.testcases.engage.general.ProvidersTestCases;
import org.mule.modules.janrain.automation.testcases.engage.general.SetAppSettingsTestCases;
import org.mule.modules.janrain.automation.testcases.engage.general.SetAuthProvidersTestCases;
import org.mule.modules.janrain.automation.testcases.engage.mapping.AllMappingsTestCases;
import org.mule.modules.janrain.automation.testcases.engage.mapping.MappingsTestCases;
import org.mule.modules.janrain.automation.testcases.engage.sharing.GetShareProvidersTestCases;
import org.mule.modules.janrain.automation.testcases.engage.sharing.SetSharingProvidersTestCases;

@RunWith(Categories.class)
@IncludeCategory(RegressionTests.class)

@SuiteClasses({
	GetAppSettingsTestCases.class,
	AnalyticsAccessTestCases.class,
	GetContactsTestCases.class,
	GetAvailableProvidersTestCases.class,
	ProvidersTestCases.class,
	SetAppSettingsTestCases.class,
	SetAuthProvidersTestCases.class,
	AllMappingsTestCases.class,
	GetShareProvidersTestCases.class,
	SetSharingProvidersTestCases.class,
	MappingsTestCases.class
		})

public class RegressionTestSuite {
	
	
	
}