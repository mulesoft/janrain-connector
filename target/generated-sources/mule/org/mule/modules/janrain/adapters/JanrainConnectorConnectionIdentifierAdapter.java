
package org.mule.modules.janrain.adapters;

import javax.annotation.Generated;
import org.mule.modules.janrain.JanrainConnector;
import org.mule.modules.janrain.connection.Connection;


/**
 * A <code>JanrainConnectorConnectionIdentifierAdapter</code> is a wrapper around {@link JanrainConnector } that implements {@link org.mule.devkit.dynamic.api.helper.Connection} interface.
 * 
 */
@Generated(value = "Mule DevKit Version 3.4.5", date = "2015-11-12T11:54:29-03:00", comments = "Build UNNAMED.1635.c9f644c")
public class JanrainConnectorConnectionIdentifierAdapter
    extends JanrainConnectorProcessAdapter
    implements Connection
{


    public String getConnectionIdentifier() {
        return super.connectionId();
    }

}
