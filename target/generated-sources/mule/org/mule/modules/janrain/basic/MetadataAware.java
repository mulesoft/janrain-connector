
package org.mule.modules.janrain.basic;

import javax.annotation.Generated;


/**
 *  This interface is implemented for every {@link org.mule.api.annotations.Module} and {@link org.mule.api.annotations.Connector} annotated class and its purpose is to define a contract to query the annotated class about its metadata.
 * 
 */
@Generated(value = "Mule DevKit Version 3.4.5", date = "2015-11-12T11:54:29-03:00", comments = "Build UNNAMED.1635.c9f644c")
public interface MetadataAware {

     /**
     * Returns the user-friendly name of this module
     */
    String getModuleName();

    /**
     * Returns the version of this module
     */
    String getModuleVersion();

    /**
     * Returns the version of the DevKit used to create this module
     */
    String getDevkitVersion();

    /**
     * Returns the build of the DevKit used to create this module
     */
    String getDevkitBuild();
}
