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

public class BulkResponse extends ApiResponse {

    private List<String> uuid_results;
    private List<Integer> results;
    
    public List<String> getUuid_results() {
        return uuid_results;
    }
    
    public void setUuid_results(List<String> uuid_results) {
        this.uuid_results = uuid_results;
    }
    
    public List<Integer> getResults() {
        return results;
    }
    
    public void setResults(List<Integer> results) {
        this.results = results;
    }
    
}