
package org.mule.modules.janrain.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.modules.janrain.JanrainConnector;
import org.mule.modules.janrain.process.ProcessAdapter;
import org.mule.modules.janrain.process.ProcessCallback;
import org.mule.modules.janrain.process.ProcessTemplate;
import org.mule.modules.janrain.process.ProcessTemplate;


/**
 * A <code>JanrainConnectorProcessAdapter</code> is a wrapper around {@link JanrainConnector } that enables custom processing strategies.
 * 
 */
@Generated(value = "Mule DevKit Version 3.4.5", date = "2015-11-12T11:54:29-03:00", comments = "Build UNNAMED.1635.c9f644c")
public class JanrainConnectorProcessAdapter
    extends JanrainConnectorLifecycleAdapter
    implements ProcessAdapter<JanrainConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, JanrainConnectorCapabilitiesAdapter> getProcessTemplate() {
        final JanrainConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,JanrainConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, JanrainConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, JanrainConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
