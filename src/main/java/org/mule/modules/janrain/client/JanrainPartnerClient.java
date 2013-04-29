/**
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 **/

/**
 * This file was automatically generated by the Mule Development Kit
 */

package org.mule.modules.janrain.client;

import java.util.Map;

import org.mule.modules.janrain.partner.Admins;
import org.mule.modules.janrain.partner.AppInfo;
import org.mule.modules.janrain.partner.Apps;
import org.mule.modules.janrain.partner.Invites;
import org.mule.modules.janrain.partner.Permissions;

public interface JanrainPartnerClient {

    public Map<String, String> addBpBus(String partnerKey);
    
    public Apps apps(String partnerKey);
    
    public boolean addAdmin(String partnerKey, String email, Boolean verify);
    
    public boolean deleteAdmin(String partnerKey, String email);
    
    public Admins getAdmins(String partnerKey);
    
    public boolean addDomain(String partnerKey, String engageApiKey, String domain);
    
    public AppInfo createApp(String partnerKey, String email, String displayName, String domain);
    
    public String createInvite(String engageApiKey, String partnerKey, String email);
    
    public boolean deleteApp(String engageApiKey, String partnerKey);
    
    public Invites getPendingInvites(String engageApiKey, String partnerKey);
    
    public Map<String, String> getProperties(String partnerKey, String engageApiKey, String provider);
    
    public Permissions getProviderPermissions(String partnerKey, String engageApiKey, String provider);
    
    public String resetApiKey(String rpAppId, String partnerKey);
    
    public boolean setProperties(String engageApiKey, String partnerKey, String provider, String fbAppID, String fbSecret,
            Boolean emailPerm, String uninstallURL, String consumerKey, String secret, String paypalDisplayName,
            String email, String liveidAppID, String liveidSecret, String liveidPrivacyPolicyUrl, String yahooAppID, 
            Boolean activityScopesSet, Boolean contactsScopeSet);
    
    public boolean setProviderPermissions(String engageApiKey, String partnerKey, String provider, String permissions);
    
    public boolean verifyDomain(String engageApiKey, String partnerKey, String provider, String code, String filename);
    
}