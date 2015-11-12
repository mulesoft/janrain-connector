
package org.mule.modules.janrain.adapters;

import javax.annotation.Generated;
import org.mule.modules.janrain.JanrainConnector;
import org.mule.modules.janrain.basic.MetadataAware;


/**
 * A <code>JanrainConnectorMetadataAdapater</code> is a wrapper around {@link JanrainConnector } that adds support for querying metadata about the extension.
 * 
 */
@Generated(value = "Mule DevKit Version 3.4.5", date = "2015-11-12T11:54:29-03:00", comments = "Build UNNAMED.1635.c9f644c")
public class JanrainConnectorMetadataAdapater
    extends JanrainConnectorCapabilitiesAdapter
    implements MetadataAware
{

    private final static String MODULE_NAME = "Janrain";
    private final static String MODULE_VERSION = "1.1.0";
    private final static String DEVKIT_VERSION = "3.4.5";
    private final static String DEVKIT_BUILD = "UNNAMED.1635.c9f644c";

    public String getModuleName() {
        return MODULE_NAME;
    }

    public String getModuleVersion() {
        return MODULE_VERSION;
    }

    public String getDevkitVersion() {
        return DEVKIT_VERSION;
    }

    public String getDevkitBuild() {
        return DEVKIT_BUILD;
    }

}
