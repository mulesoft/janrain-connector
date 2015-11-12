
package org.mule.modules.janrain.processors;

import javax.annotation.Generated;

@Generated(value = "Mule DevKit Version 3.4.5", date = "2015-11-12T11:54:29-03:00", comments = "Build UNNAMED.1635.c9f644c")
public abstract class AbstractConnectedProcessor
    extends AbstractExpressionEvaluator
{

    protected Object apiKey;
    protected String _apiKeyType;
    protected Object appName;
    protected String _appNameType;
    protected Object appId;
    protected String _appIdType;
    protected Object captureHost;
    protected String _captureHostType;

    /**
     * Sets appName
     * 
     * @param value Value to set
     */
    public void setAppName(Object value) {
        this.appName = value;
    }

    /**
     * Retrieves appName
     * 
     */
    public Object getAppName() {
        return this.appName;
    }

    /**
     * Sets appId
     * 
     * @param value Value to set
     */
    public void setAppId(Object value) {
        this.appId = value;
    }

    /**
     * Retrieves appId
     * 
     */
    public Object getAppId() {
        return this.appId;
    }

    /**
     * Sets captureHost
     * 
     * @param value Value to set
     */
    public void setCaptureHost(Object value) {
        this.captureHost = value;
    }

    /**
     * Retrieves captureHost
     * 
     */
    public Object getCaptureHost() {
        return this.captureHost;
    }

    /**
     * Sets apiKey
     * 
     * @param value Value to set
     */
    public void setApiKey(Object value) {
        this.apiKey = value;
    }

    /**
     * Retrieves apiKey
     * 
     */
    public Object getApiKey() {
        return this.apiKey;
    }

}
