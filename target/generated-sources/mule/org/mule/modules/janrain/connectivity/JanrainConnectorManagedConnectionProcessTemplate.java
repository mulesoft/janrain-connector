
package org.mule.modules.janrain.connectivity;

import javax.annotation.Generated;
import org.mule.api.MuleContext;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.modules.janrain.adapters.JanrainConnectorConnectionIdentifierAdapter;
import org.mule.modules.janrain.connection.ConnectionManager;
import org.mule.modules.janrain.process.JanrainConnectorManagedConnectionProcessInterceptor;
import org.mule.modules.janrain.process.ProcessCallback;
import org.mule.modules.janrain.process.ProcessCallbackProcessInterceptor;
import org.mule.modules.janrain.process.ProcessInterceptor;
import org.mule.modules.janrain.process.ProcessTemplate;
import org.mule.modules.janrain.process.RetryProcessInterceptor;

@Generated(value = "Mule DevKit Version 3.4.5", date = "2015-11-12T11:54:29-03:00", comments = "Build UNNAMED.1635.c9f644c")
public class JanrainConnectorManagedConnectionProcessTemplate<P >implements ProcessTemplate<P, JanrainConnectorConnectionIdentifierAdapter>
{

    private final ProcessInterceptor<P, JanrainConnectorConnectionIdentifierAdapter> processInterceptor;

    public JanrainConnectorManagedConnectionProcessTemplate(ConnectionManager<JanrainConnectorConnectionKey, JanrainConnectorConnectionIdentifierAdapter> connectionManager, MuleContext muleContext) {
        ProcessInterceptor<P, JanrainConnectorConnectionIdentifierAdapter> processCallbackProcessInterceptor = new ProcessCallbackProcessInterceptor<P, JanrainConnectorConnectionIdentifierAdapter>();
        ProcessInterceptor<P, JanrainConnectorConnectionIdentifierAdapter> managedConnectionProcessInterceptor = new JanrainConnectorManagedConnectionProcessInterceptor<P>(processCallbackProcessInterceptor, connectionManager, muleContext);
        ProcessInterceptor<P, JanrainConnectorConnectionIdentifierAdapter> retryProcessInterceptor = new RetryProcessInterceptor<P, JanrainConnectorConnectionIdentifierAdapter>(managedConnectionProcessInterceptor, muleContext, connectionManager.getRetryPolicyTemplate());
        processInterceptor = retryProcessInterceptor;
    }

    public P execute(ProcessCallback<P, JanrainConnectorConnectionIdentifierAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
        throws Exception
    {
        return processInterceptor.execute(processCallback, null, messageProcessor, event);
    }

    public P execute(ProcessCallback<P, JanrainConnectorConnectionIdentifierAdapter> processCallback, Filter filter, MuleMessage message)
        throws Exception
    {
        return processInterceptor.execute(processCallback, null, filter, message);
    }

}
