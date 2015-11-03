/**
 * (c) 2003-2015 MuleSoft, Inc. The software in this package is published under
 * the terms of the CPAL v1.0 license, a copy of which has been included with this
 * distribution in the LICENSE.md file.
 */

/**
 * This file was automatically generated by the Mule Development Kit
 */

package org.mule.modules.janrain.client;

import java.util.Map;

import org.mule.modules.janrain.engage.AuthInfos;
import org.mule.modules.janrain.engage.AvailableProviders;
import org.mule.modules.janrain.engage.Backplane;
import org.mule.modules.janrain.engage.Broadcast;
import org.mule.modules.janrain.engage.Contacts;
import org.mule.modules.janrain.engage.Direct;
import org.mule.modules.janrain.engage.DomainPatterns;
import org.mule.modules.janrain.engage.Identifiers;
import org.mule.modules.janrain.engage.Plugin;
import org.mule.modules.janrain.engage.ShareProviders;
import org.mule.modules.janrain.engage.UserInfo;
import org.mule.modules.janrain.engage.WidgetProviders;

public interface JanrainEngageClient {

    public UserInfo authInfo(String token, Boolean extended, String tokenURL);
    
    public boolean addOrUpdateAccessToken(String token, String identifier);
    
    public Map<String, String> analyticsAccess(String start, String end);
    
    public Map<String, String> getAppSettings();
    
    public AvailableProviders getAvailableProviders();
    
    public Contacts getContacts(String identifier, String contactType, Boolean existingUser);
    
    public UserInfo getUserData(String identifier, Boolean extended);
    
    public WidgetProviders providers();
    
    public boolean setAppSettings(String privacyPolicy, String favicon, String domainRedirect, Boolean postToTokenUrl, Boolean oneTimeUseTokens, Boolean googleProfileUrl);
    
    public boolean setAuthProviders(String providers, String deviceType);
    
    public String allMappings();
    
    public boolean map(String identifier, String primaryKey, Boolean overwrite);
    
    public Identifiers mappings(String primaryKey);
    
    public boolean unmap(String identifier, Boolean allIdentifiers, String primaryKey, Boolean unlink);
    
    public Broadcast broadcast(String identifier, String deviceToken, String title, String url, String source, String message, String description, String image, String media, String actionLink, String objectId);
    
    public Direct direct(String identifier, String deviceToken, String title, String url, String recipients, String source, String message, String description, String image, String media, String actionLink, String recipientUrls);
    
    public String getShareCount(String url, String callback);
    
    public ShareProviders getShareProviders();
    
    public boolean setShareProviders(String share, String email);
    
    public boolean addDomainPatterns(String domains);
    
    public Backplane getBackplaneProperties();
    
    public DomainPatterns getDomainPatterns();
    
    public Plugin lookupRp(String pluginName, String pluginVersion);
    
    public boolean setBackplaneProperties(String server, String bus, String version, Boolean remove, String username, String password);
    
    public boolean setDomainPatterns(String domains);
    
    public boolean activity(String activity, String identifier, String deviceToken, Boolean truncate, Boolean prependName, String urlShortening, String source);
    
    public AuthInfos authInfos(String tokens, Boolean extended);
    
    public boolean setStatus(String identifier, String status, String location, Boolean truncate, String source);
    
}