
package org.mule.modules.janrain.oauth;

import javax.annotation.Generated;

@Generated(value = "Mule DevKit Version 3.4.5", date = "2015-11-12T11:54:29-03:00", comments = "Build UNNAMED.1635.c9f644c")
public interface RestoreAccessTokenCallback {

     /**
     * Restore access token and secret
     */
    void restoreAccessToken();

    /**
     * Retrieve the just restored access token
     *
     * @return A string representing the access token
     */
    String getAccessToken();

    /**
     * Retrieve the access token secret
     *
     * @return A string representing the access token secret
     */
    String getAccessTokenSecret();
}
