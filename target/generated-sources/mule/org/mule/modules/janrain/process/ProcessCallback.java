
package org.mule.modules.janrain.process;

import javax.annotation.Generated;


/**
 * Callback with logic to execute within a controlled environment provided by {@link ProcessTemplate}
 *  @param <T> type of the return value of the processing execution
 * 
 */
@Generated(value = "Mule DevKit Version 3.4.5", date = "2015-11-12T11:54:29-03:00", comments = "Build UNNAMED.1635.c9f644c")
public interface ProcessCallback<T,O >{

    T process(O object) throws Exception;

    java.util.List<Class> getManagedExceptions();

    boolean isProtected();

}
