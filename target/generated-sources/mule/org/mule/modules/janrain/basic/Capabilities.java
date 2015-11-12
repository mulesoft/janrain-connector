
package org.mule.modules.janrain.basic;

import javax.annotation.Generated;


/**
 * This interface is implemented for every {@link org.mule.api.annotations.Module} annotated class, to dynamically query what its capabilities are.
 * 
 */
@Generated(value = "Mule DevKit Version 3.4.5", date = "2015-11-12T11:54:29-03:00", comments = "Build UNNAMED.1635.c9f644c")
public interface Capabilities {

        /**
     * Returns true if this module implements such
     * capability
     *
     * @param capability The capability to test for
     * @return True if it does, false otherwise
     */
    boolean isCapableOf(Capability capability);
}
