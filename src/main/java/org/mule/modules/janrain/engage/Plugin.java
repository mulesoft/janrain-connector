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

package org.mule.modules.janrain.engage;

public class Plugin {

    private PluginResponse pluginresponse;
    
    public class PluginResponse {
        
        private String adminurl;
        private String apikey;
        private String appid;
        private String capabilities;
        private String realm;
        private String realmscheme;
        private String signinproviders;
        private String socialpub;
        
        public String getAdminurl() {
            return adminurl;
        }
        
        public void setAdminurl(String adminurl) {
            this.adminurl = adminurl;
        }
        
        public String getApikey() {
            return apikey;
        }
        
        public void setApikey(String apikey) {
            this.apikey = apikey;
        }
        
        public String getAppid() {
            return appid;
        }
        
        public void setAppid(String appid) {
            this.appid = appid;
        }
        
        public String getCapabilities() {
            return capabilities;
        }
        
        public void setCapabilities(String capabilities) {
            this.capabilities = capabilities;
        }
        
        public String getRealm() {
            return realm;
        }
        
        public void setRealm(String realm) {
            this.realm = realm;
        }
        
        public String getRealmscheme() {
            return realmscheme;
        }
        
        public void setRealmscheme(String realmscheme) {
            this.realmscheme = realmscheme;
        }
        
        public String getSigninproviders() {
            return signinproviders;
        }
        
        public void setSigninproviders(String signinproviders) {
            this.signinproviders = signinproviders;
        }
        
        public String getSocialpub() {
            return socialpub;
        }
        
        public void setSocialpub(String socialpub) {
            this.socialpub = socialpub;
        }
        
    }

    public PluginResponse getPluginresponse() {
        return pluginresponse;
    }

    public void setPluginresponse(PluginResponse pluginresponse) {
        this.pluginresponse = pluginresponse;
    }

}