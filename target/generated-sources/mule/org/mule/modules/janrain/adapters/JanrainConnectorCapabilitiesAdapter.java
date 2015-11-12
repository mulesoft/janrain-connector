
package org.mule.modules.janrain.adapters;

import javax.annotation.Generated;
import org.mule.modules.janrain.JanrainConnector;
import org.mule.modules.janrain.basic.Capabilities;
import org.mule.modules.janrain.basic.Capability;


/**
 * A <code>JanrainConnectorCapabilitiesAdapter</code> is a wrapper around {@link JanrainConnector } that implements {@link org.mule.api.Capabilities} interface.
 * 
 */
@Generated(value = "Mule DevKit Version 3.4.5", date = "2015-11-12T11:54:29-03:00", comments = "Build UNNAMED.1635.c9f644c")
public class JanrainConnectorCapabilitiesAdapter
    extends JanrainConnector
    implements Capabilities
{


    /**
     * Returns true if this module implements such capability
     * 
     */
    public boolean isCapableOf(Capability capability) {
        if (capability == Capability.LIFECYCLE_CAPABLE) {
            return true;
        }
        if (capability == Capability.CONNECTION_MANAGEMENT_CAPABLE) {
            return true;
        }
        return false;
    }

}
