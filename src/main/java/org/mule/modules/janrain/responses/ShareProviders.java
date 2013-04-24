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

package org.mule.modules.janrain.responses;

import java.util.List;

public class ShareProviders extends ApiResponse {
    
    private List<String> email;
    private List<String> share;
    
    public List<String> getEmail() {
        return email;
    }
    public void setEmail(List<String> email) {
        this.email = email;
    }
    public List<String> getShare() {
        return share;
    }
    public void setShare(List<String> share) {
        this.share = share;
    }
    
}