
package org.mule.modules.janrain.callback;

import javax.annotation.Generated;
import org.mule.api.context.MuleContextAware;
import org.mule.api.lifecycle.Startable;
import org.mule.api.lifecycle.Stoppable;

@Generated(value = "Mule DevKit Version 3.4.5", date = "2015-11-12T11:54:29-03:00", comments = "Build UNNAMED.1635.c9f644c")
public interface HttpCallback extends MuleContextAware, Startable, Stoppable
{

    String getUrl();
}
