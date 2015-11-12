
package org.mule.modules.janrain.config;

import javax.annotation.Generated;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;


/**
 * Registers bean definitions parsers for handling elements in <code>http://www.mulesoft.org/schema/mule/janrain</code>.
 * 
 */
@Generated(value = "Mule DevKit Version 3.4.5", date = "2015-11-12T11:54:29-03:00", comments = "Build UNNAMED.1635.c9f644c")
public class JanrainNamespaceHandler
    extends NamespaceHandlerSupport
{


    /**
     * Invoked by the {@link DefaultBeanDefinitionDocumentReader} after construction but before any custom elements are parsed. 
     * @see NamespaceHandlerSupport#registerBeanDefinitionParser(String, BeanDefinitionParser)
     * 
     */
    public void init() {
        registerBeanDefinitionParser("config", new JanrainConnectorConfigDefinitionParser());
        registerBeanDefinitionParser("auth-info", new AuthInfoDefinitionParser());
        registerBeanDefinitionParser("add-or-update-access-token", new AddOrUpdateAccessTokenDefinitionParser());
        registerBeanDefinitionParser("analytics-access", new AnalyticsAccessDefinitionParser());
        registerBeanDefinitionParser("get-app-settings", new GetAppSettingsDefinitionParser());
        registerBeanDefinitionParser("get-available-providers", new GetAvailableProvidersDefinitionParser());
        registerBeanDefinitionParser("get-contacts", new GetContactsDefinitionParser());
        registerBeanDefinitionParser("get-user-data", new GetUserDataDefinitionParser());
        registerBeanDefinitionParser("providers", new ProvidersDefinitionParser());
        registerBeanDefinitionParser("set-app-settings", new SetAppSettingsDefinitionParser());
        registerBeanDefinitionParser("set-auth-providers", new SetAuthProvidersDefinitionParser());
        registerBeanDefinitionParser("all-mappings", new AllMappingsDefinitionParser());
        registerBeanDefinitionParser("map", new MapDefinitionParser());
        registerBeanDefinitionParser("mappings", new MappingsDefinitionParser());
        registerBeanDefinitionParser("unmap", new UnmapDefinitionParser());
        registerBeanDefinitionParser("broadcast", new BroadcastDefinitionParser());
        registerBeanDefinitionParser("direct", new DirectDefinitionParser());
        registerBeanDefinitionParser("get-share-count", new GetShareCountDefinitionParser());
        registerBeanDefinitionParser("get-share-providers", new GetShareProvidersDefinitionParser());
        registerBeanDefinitionParser("set-share-providers", new SetShareProvidersDefinitionParser());
        registerBeanDefinitionParser("add-domain-patterns", new AddDomainPatternsDefinitionParser());
        registerBeanDefinitionParser("get-backplane-properties", new GetBackplanePropertiesDefinitionParser());
        registerBeanDefinitionParser("get-domain-patterns", new GetDomainPatternsDefinitionParser());
        registerBeanDefinitionParser("lookup-rp", new LookupRpDefinitionParser());
        registerBeanDefinitionParser("set-backplane-properties", new SetBackplanePropertiesDefinitionParser());
        registerBeanDefinitionParser("set-domain-patterns", new SetDomainPatternsDefinitionParser());
        registerBeanDefinitionParser("activity", new ActivityDefinitionParser());
        registerBeanDefinitionParser("auth-infos", new AuthInfosDefinitionParser());
        registerBeanDefinitionParser("set-status", new SetStatusDefinitionParser());
        registerBeanDefinitionParser("add-bp-bus", new AddBpBusDefinitionParser());
        registerBeanDefinitionParser("apps", new AppsDefinitionParser());
        registerBeanDefinitionParser("add-admin", new AddAdminDefinitionParser());
        registerBeanDefinitionParser("delete-admin", new DeleteAdminDefinitionParser());
        registerBeanDefinitionParser("get-admins", new GetAdminsDefinitionParser());
        registerBeanDefinitionParser("add-domain", new AddDomainDefinitionParser());
        registerBeanDefinitionParser("create-app", new CreateAppDefinitionParser());
        registerBeanDefinitionParser("create-invite", new CreateInviteDefinitionParser());
        registerBeanDefinitionParser("delete-app", new DeleteAppDefinitionParser());
        registerBeanDefinitionParser("get-pending-invites", new GetPendingInvitesDefinitionParser());
        registerBeanDefinitionParser("get-properties", new GetPropertiesDefinitionParser());
        registerBeanDefinitionParser("get-provider-permissions", new GetProviderPermissionsDefinitionParser());
        registerBeanDefinitionParser("reset-api-key", new ResetApiKeyDefinitionParser());
        registerBeanDefinitionParser("set-properties", new SetPropertiesDefinitionParser());
        registerBeanDefinitionParser("set-provider-permissions", new SetProviderPermissionsDefinitionParser());
        registerBeanDefinitionParser("verify-domain", new VerifyDomainDefinitionParser());
        registerBeanDefinitionParser("add-client", new AddClientDefinitionParser());
        registerBeanDefinitionParser("clear-whitelist", new ClearWhitelistDefinitionParser());
        registerBeanDefinitionParser("delete-client", new DeleteClientDefinitionParser());
        registerBeanDefinitionParser("list-clients", new ListClientsDefinitionParser());
        registerBeanDefinitionParser("set-description", new SetDescriptionDefinitionParser());
        registerBeanDefinitionParser("set-features", new SetFeaturesDefinitionParser());
        registerBeanDefinitionParser("set-whitelist", new SetWhitelistDefinitionParser());
        registerBeanDefinitionParser("retrieve-entity", new RetrieveEntityDefinitionParser());
        registerBeanDefinitionParser("entity-adopt", new EntityAdoptDefinitionParser());
        registerBeanDefinitionParser("entity-bulk-create", new EntityBulkCreateDefinitionParser());
        registerBeanDefinitionParser("entity-count", new EntityCountDefinitionParser());
        registerBeanDefinitionParser("entity-create", new EntityCreateDefinitionParser());
        registerBeanDefinitionParser("entity-delete", new EntityDeleteDefinitionParser());
        registerBeanDefinitionParser("entity-bulk-delete", new EntityBulkDeleteDefinitionParser());
        registerBeanDefinitionParser("entity-purge", new EntityPurgeDefinitionParser());
        registerBeanDefinitionParser("entity-replace", new EntityReplaceDefinitionParser());
        registerBeanDefinitionParser("entity-update", new EntityUpdateDefinitionParser());
        registerBeanDefinitionParser("entity-find", new EntityFindDefinitionParser());
        registerBeanDefinitionParser("delete-settings", new DeleteSettingsDefinitionParser());
        registerBeanDefinitionParser("delete-default", new DeleteDefaultDefinitionParser());
        registerBeanDefinitionParser("get-settings", new GetSettingsDefinitionParser());
        registerBeanDefinitionParser("get-multisettings", new GetMultisettingsDefinitionParser());
        registerBeanDefinitionParser("get-items", new GetItemsDefinitionParser());
        registerBeanDefinitionParser("get-keys", new GetKeysDefinitionParser());
        registerBeanDefinitionParser("set-settings", new SetSettingsDefinitionParser());
        registerBeanDefinitionParser("get-default", new GetDefaultDefinitionParser());
        registerBeanDefinitionParser("set-default", new SetDefaultDefinitionParser());
        registerBeanDefinitionParser("set-multisettings", new SetMultisettingsDefinitionParser());
        registerBeanDefinitionParser("entity-versions", new EntityVersionsDefinitionParser());
        registerBeanDefinitionParser("get-entity-type", new GetEntityTypeDefinitionParser());
        registerBeanDefinitionParser("get-access-token", new GetAccessTokenDefinitionParser());
        registerBeanDefinitionParser("get-authorization-code", new GetAuthorizationCodeDefinitionParser());
        registerBeanDefinitionParser("get-creation-token", new GetCreationTokenDefinitionParser());
        registerBeanDefinitionParser("get-verification-code", new GetVerificationCodeDefinitionParser());
        registerBeanDefinitionParser("use-verification-code", new UseVerificationCodeDefinitionParser());
        registerBeanDefinitionParser("webhooks-add", new WebhooksAddDefinitionParser());
        registerBeanDefinitionParser("webhooks-delete", new WebhooksDeleteDefinitionParser());
        registerBeanDefinitionParser("webhooks-find", new WebhooksFindDefinitionParser());
        registerBeanDefinitionParser("webhooks-list", new WebhooksListDefinitionParser());
        registerBeanDefinitionParser("webhooks-update", new WebhooksUpdateDefinitionParser());
        registerBeanDefinitionParser("auth-native", new AuthNativeDefinitionParser());
        registerBeanDefinitionParser("auth-native-traditional", new AuthNativeTraditionalDefinitionParser());
        registerBeanDefinitionParser("forgot-password-native", new ForgotPasswordNativeDefinitionParser());
        registerBeanDefinitionParser("link-account-native", new LinkAccountNativeDefinitionParser());
        registerBeanDefinitionParser("register-native", new RegisterNativeDefinitionParser());
        registerBeanDefinitionParser("verify-email-native", new VerifyEmailNativeDefinitionParser());
        registerBeanDefinitionParser("get-token", new GetTokenDefinitionParser());
        registerBeanDefinitionParser("register-native-traditional", new RegisterNativeTraditionalDefinitionParser());
    }

}
