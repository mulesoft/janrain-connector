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

package org.mule.modules.janrain.capture;

import java.util.List;

import org.mule.modules.janrain.engage.ApiResponse;

public class ClientInfo extends ApiResponse {

    private List<Result> results;
    
    public class Result {
        
        private String client_id;
        private String client_secret;
        private String description;
        private List<String> features;
        
        public String getClient_id() {
            return client_id;
        }
        
        public void setClient_id(String client_id) {
            this.client_id = client_id;
        }
        
        public String getClient_secret() {
            return client_secret;
        }
        
        public void setClient_secret(String client_secret) {
            this.client_secret = client_secret;
        }
        
        public String getDescription() {
            return description;
        }
        
        public void setDescription(String description) {
            this.description = description;
        }
        
        public List<String> getFeatures() {
            return features;
        }
        
        public void setFeatures(List<String> features) {
            this.features = features;
        }
 
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }
    
}