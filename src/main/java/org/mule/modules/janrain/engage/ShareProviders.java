/**
 * (c) 2003-2015 MuleSoft, Inc. The software in this package is published under
 * the terms of the CPAL v1.0 license, a copy of which has been included with this
 * distribution in the LICENSE.md file.
 */

/**
 * This file was automatically generated by the Mule Development Kit
 */

package org.mule.modules.janrain.engage;

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