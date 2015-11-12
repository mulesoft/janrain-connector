
package org.mule.modules.janrain.oauth;

import javax.annotation.Generated;


/**
 * Wrapper around {@link org.mule.api.annotations.oauth.OAuth} annotated class that will infuse it with
 * access token management capabilities.
 * <p/>It can receive a {@link org.mule.config.PoolingProfile} which is a configuration object used to 
 * define the OAuth access tokens pooling parameters.
 * @param <C> Actual connector object that represents a connection
 * 
 * 
 */
@Generated(value = "Mule DevKit Version 3.4.5", date = "2015-11-12T11:54:29-03:00", comments = "Build UNNAMED.1635.c9f644c")
public interface OAuthManager<C extends OAuthAdapter >{

    /**
     * Create a new access token using the specified verifier
     * and insert it into the pool
     *
     * @param verifier OAuth verifier
     * @return A newly created connector
     * @throws Exception If the access token cannot be retrieved
     */
    C createAccessToken(String verifier) throws Exception;

    /**
     * Borrow an access token from the pool
     *
     * @param userId User identification used to borrow the access token
     * @return An existing authorized connector
     * @throws Exception If the access token cannot be retrieved
     */
    C acquireAccessToken(String userId) throws Exception;

    /**
     * Return an access token to the pool
     *
     * @param userId    User identification used to borrow the access token
     * @param connector Authorized connector to be returned to the pool
     * @throws Exception If the access token cannot be returned
     */
    void releaseAccessToken(String userId, C connector) throws Exception;

    /**
     * Destroy an access token
     *
     * @param userId    User identification used to borrow the access token
     * @param connector Authorized connector to the destroyed
     * @throws Exception If the access token could not be destroyed.
     */
    void destroyAccessToken(String userId, C connector) throws Exception;

    /**
     * Retrieve default unauthorized connector
     */
    C getDefaultUnauthorizedConnector();
}
