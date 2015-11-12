
package org.mule.modules.janrain.callback;

import javax.annotation.Generated;


/**
 * Callback interface used by {@link org.mule.api.annotations.Source} annotated methods to dispatch messages.
 * 
 */
@Generated(value = "Mule DevKit Version 3.4.5", date = "2015-11-12T11:54:29-03:00", comments = "Build UNNAMED.1635.c9f644c")
public interface SourceCallback {

        /**
     * Dispatch the current event to the flow
     *
     * @return The response of the flow
     */
    Object process() throws Exception;

    /**
     * Dispatch message to the flow
     *
     * @param payload The payload of the message
     * @return The response of the flow
     */
    Object process(Object payload) throws Exception;

    /**
     * Dispatch message to the flow with properties
     *
     * @param payload    The payload of the message
     * @param properties Properties to be attached with inbound scope
     * @return The response of the flow
     */
    Object process(Object payload, java.util.Map<String, Object> properties) throws Exception;

    /**
     * Dispatch the current event to the flow
     *
     * @return The response of the flow
     */
    org.mule.api.MuleEvent processEvent(org.mule.api.MuleEvent event) throws org.mule.api.MuleException;
}
