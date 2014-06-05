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
import org.mule.modules.janrain.automation.RegressionTests;
import org.mule.modules.janrain.automation.testcases.capture.clients.AddClientTestCases;
import org.mule.modules.janrain.automation.testcases.capture.clients.ClearWhitelistTestCases;
import org.mule.modules.janrain.automation.testcases.capture.clients.DeleteClientTestCases;
import org.mule.modules.janrain.automation.testcases.capture.clients.ListClientsTestCases;
import org.mule.modules.janrain.automation.testcases.capture.clients.SetDescriptionTestCases;
import org.mule.modules.janrain.automation.testcases.capture.clients.SetFeaturesTestCases;
import org.mule.modules.janrain.automation.testcases.capture.clients.SetWhitelistTestCases;
import org.mule.modules.janrain.automation.testcases.capture.entity.EntityCountTestCases;
import org.mule.modules.janrain.automation.testcases.capture.entity.EntityCreateTestCases;
import org.mule.modules.janrain.automation.testcases.capture.entity.EntityDeleteTestCases;
import org.mule.modules.janrain.automation.testcases.capture.entity.EntityFindTestCases;
import org.mule.modules.janrain.automation.testcases.capture.entity.EntityPurgeTestCases;
import org.mule.modules.janrain.automation.testcases.capture.entity.EntityReplaceTestCases;
import org.mule.modules.janrain.automation.testcases.capture.entity.EntityUpdateTestCases;
import org.mule.modules.janrain.automation.testcases.capture.entity.RetrieveEntityTestCases;
import org.mule.modules.janrain.automation.testcases.capture.settings.GetKeysTestCases;
import org.mule.modules.janrain.automation.testcases.capture.settings.GetSettingsTestCases;
import org.mule.modules.janrain.automation.testcases.engage.configurerp.AddDomainPatternsTestCases;
import org.mule.modules.janrain.automation.testcases.engage.configurerp.GetBackplanePropertiesTestCases;
import org.mule.modules.janrain.automation.testcases.engage.configurerp.GetDomainPatternsTestCases;
import org.mule.modules.janrain.automation.testcases.engage.configurerp.SetDomainPatternsTestCases;
import org.mule.modules.janrain.automation.testcases.engage.general.AnalyticsAccessTestCases;
import org.mule.modules.janrain.automation.testcases.engage.general.GetAppSettingsTestCases;
import org.mule.modules.janrain.automation.testcases.engage.general.GetAvailableProvidersTestCases;
import org.mule.modules.janrain.automation.testcases.engage.general.GetContactsTestCases;
import org.mule.modules.janrain.automation.testcases.engage.general.ProvidersTestCases;
import org.mule.modules.janrain.automation.testcases.engage.general.SetAppSettingsTestCases;
import org.mule.modules.janrain.automation.testcases.engage.general.SetAuthProvidersTestCases;
import org.mule.modules.janrain.automation.testcases.engage.mapping.AllMappingsTestCases;
import org.mule.modules.janrain.automation.testcases.engage.mapping.MappingsTestCases;
import org.mule.modules.janrain.automation.testcases.engage.sharing.GetShareCountTestCases;
import org.mule.modules.janrain.automation.testcases.engage.sharing.GetShareProvidersTestCases;
import org.mule.modules.janrain.automation.testcases.engage.sharing.SetSharingProvidersTestCases;
import org.mule.modules.janrain.automation.testcases.partner.admin.AddAdminTestCases;
import org.mule.modules.janrain.automation.testcases.partner.admin.DeleteAdminTestCases;
import org.mule.modules.janrain.automation.testcases.partner.admin.GetAdminsTestCases;

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
	MappingsTestCases.class,
	GetShareCountTestCases.class,
	AddDomainPatternsTestCases.class,
	GetBackplanePropertiesTestCases.class,
	GetDomainPatternsTestCases.class,
	SetDomainPatternsTestCases.class,
	AddAdminTestCases.class,
	DeleteAdminTestCases.class,
	GetAdminsTestCases.class,
	RetrieveEntityTestCases.class,
	AddClientTestCases.class,
	DeleteClientTestCases.class,
	SetWhitelistTestCases.class,
	ClearWhitelistTestCases.class,
	SetDescriptionTestCases.class,
	SetFeaturesTestCases.class,
	ListClientsTestCases.class,
	EntityCreateTestCases.class,
	EntityDeleteTestCases.class,
	EntityCountTestCases.class,
	EntityFindTestCases.class,
	RetrieveEntityTestCases.class,
	EntityPurgeTestCases.class,
	EntityUpdateTestCases.class,
	EntityReplaceTestCases.class,
	GetKeysTestCases.class,
	GetSettingsTestCases.class
		})

public class RegressionTestSuite {
	
	
	
}