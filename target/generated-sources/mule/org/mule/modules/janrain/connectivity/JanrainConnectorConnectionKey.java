
package org.mule.modules.janrain.connectivity;

import javax.annotation.Generated;


/**
 * A tuple of connection parameters
 * 
 */
@Generated(value = "Mule DevKit Version 3.4.5", date = "2015-11-12T11:54:29-03:00", comments = "Build UNNAMED.1635.c9f644c")
public class JanrainConnectorConnectionKey {

    /**
     * 
     */
    private String apiKey;
    /**
     * 
     */
    private String appName;
    /**
     * 
     */
    private String appId;
    /**
     * 
     */
    private String captureHost;

    public JanrainConnectorConnectionKey(String apiKey, String appName, String appId, String captureHost) {
        this.apiKey = apiKey;
        this.appName = appName;
        this.appId = appId;
        this.captureHost = captureHost;
    }

    /**
     * Sets appName
     * 
     * @param value Value to set
     */
    public void setAppName(String value) {
        this.appName = value;
    }

    /**
     * Retrieves appName
     * 
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * Sets appId
     * 
     * @param value Value to set
     */
    public void setAppId(String value) {
        this.appId = value;
    }

    /**
     * Retrieves appId
     * 
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * Sets captureHost
     * 
     * @param value Value to set
     */
    public void setCaptureHost(String value) {
        this.captureHost = value;
    }

    /**
     * Retrieves captureHost
     * 
     */
    public String getCaptureHost() {
        return this.captureHost;
    }

    /**
     * Sets apiKey
     * 
     * @param value Value to set
     */
    public void setApiKey(String value) {
        this.apiKey = value;
    }

    /**
     * Retrieves apiKey
     * 
     */
    public String getApiKey() {
        return this.apiKey;
    }

    public int hashCode() {
        int hash = 1;
        hash = (hash* 31);
        if (this.apiKey!= null) {
            hash += this.apiKey.hashCode();
        }
        return hash;
    }

    public boolean equals(Object obj) {
        return (((obj instanceof JanrainConnectorConnectionKey)&&(this.apiKey!= null))&&this.apiKey.equals(((JanrainConnectorConnectionKey) obj).apiKey));
    }

}
