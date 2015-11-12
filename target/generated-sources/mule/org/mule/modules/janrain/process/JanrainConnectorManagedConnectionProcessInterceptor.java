
package org.mule.modules.janrain.process;

import java.util.List;
import javax.annotation.Generated;
import org.mule.api.MuleContext;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.modules.janrain.adapters.JanrainConnectorConnectionIdentifierAdapter;
import org.mule.modules.janrain.connection.ConnectionManager;
import org.mule.modules.janrain.connection.UnableToAcquireConnectionException;
import org.mule.modules.janrain.connection.UnableToReleaseConnectionException;
import org.mule.modules.janrain.connectivity.JanrainConnectorConnectionKey;
import org.mule.modules.janrain.processors.AbstractConnectedProcessor;
import org.mule.modules.janrain.processors.AbstractExpressionEvaluator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Generated(value = "Mule DevKit Version 3.4.5", date = "2015-11-12T11:54:29-03:00", comments = "Build UNNAMED.1635.c9f644c")
public class JanrainConnectorManagedConnectionProcessInterceptor<T >
    extends AbstractExpressionEvaluator
    implements ProcessInterceptor<T, JanrainConnectorConnectionIdentifierAdapter>
{

    private static Logger logger = LoggerFactory.getLogger(JanrainConnectorManagedConnectionProcessInterceptor.class);
    private final ConnectionManager<JanrainConnectorConnectionKey, JanrainConnectorConnectionIdentifierAdapter> connectionManager;
    private final MuleContext muleContext;
    private final ProcessInterceptor<T, JanrainConnectorConnectionIdentifierAdapter> next;

    public JanrainConnectorManagedConnectionProcessInterceptor(ProcessInterceptor<T, JanrainConnectorConnectionIdentifierAdapter> next, ConnectionManager<JanrainConnectorConnectionKey, JanrainConnectorConnectionIdentifierAdapter> connectionManager, MuleContext muleContext) {
        this.next = next;
        this.connectionManager = connectionManager;
        this.muleContext = muleContext;
    }

    public T execute(ProcessCallback<T, JanrainConnectorConnectionIdentifierAdapter> processCallback, JanrainConnectorConnectionIdentifierAdapter object, MessageProcessor messageProcessor, MuleEvent event)
        throws Exception
    {
        JanrainConnectorConnectionIdentifierAdapter connection = null;
        JanrainConnectorConnectionKey key = null;
        if ((messageProcessor!= null)&&((messageProcessor instanceof AbstractConnectedProcessor)&&(((AbstractConnectedProcessor) messageProcessor).getApiKey()!= null))) {
            final String _transformedApiKey = ((String) evaluateAndTransform(muleContext, event, AbstractConnectedProcessor.class.getDeclaredField("_apiKeyType").getGenericType(), null, ((AbstractConnectedProcessor) messageProcessor).getApiKey()));
            if (_transformedApiKey == null) {
                throw new UnableToAcquireConnectionException("Parameter apiKey in method connect can't be null because is not @Optional");
            }
            final String _transformedAppName = ((String) evaluateAndTransform(muleContext, event, AbstractConnectedProcessor.class.getDeclaredField("_appNameType").getGenericType(), null, ((AbstractConnectedProcessor) messageProcessor).getAppName()));
            if (_transformedAppName == null) {
                throw new UnableToAcquireConnectionException("Parameter appName in method connect can't be null because is not @Optional");
            }
            final String _transformedAppId = ((String) evaluateAndTransform(muleContext, event, AbstractConnectedProcessor.class.getDeclaredField("_appIdType").getGenericType(), null, ((AbstractConnectedProcessor) messageProcessor).getAppId()));
            if (_transformedAppId == null) {
                throw new UnableToAcquireConnectionException("Parameter appId in method connect can't be null because is not @Optional");
            }
            final String _transformedCaptureHost = ((String) evaluateAndTransform(muleContext, event, AbstractConnectedProcessor.class.getDeclaredField("_captureHostType").getGenericType(), null, ((AbstractConnectedProcessor) messageProcessor).getCaptureHost()));
            if (_transformedCaptureHost == null) {
                throw new UnableToAcquireConnectionException("Parameter captureHost in method connect can't be null because is not @Optional");
            }
            key = new JanrainConnectorConnectionKey(_transformedApiKey, _transformedAppName, _transformedAppId, _transformedCaptureHost);
        } else {
            key = connectionManager.getDefaultConnectionKey();
        }
        try {
            if (logger.isDebugEnabled()) {
                logger.debug(("Attempting to acquire connection using "+ key.toString()));
            }
            connection = connectionManager.acquireConnection(key);
            if (connection == null) {
                throw new UnableToAcquireConnectionException();
            } else {
                if (logger.isDebugEnabled()) {
                    logger.debug((("Connection has been acquired with [id="+ connection.getConnectionIdentifier())+"]"));
                }
            }
            return next.execute(processCallback, connection, messageProcessor, event);
        } catch (Exception e) {
            if (processCallback.getManagedExceptions()!= null) {
                for (Class exceptionClass: ((List<Class> ) processCallback.getManagedExceptions())) {
                    if (exceptionClass.isInstance(e)) {
                        if (logger.isDebugEnabled()) {
                            logger.debug((((("An exception ( "+ exceptionClass.getName())+") has been thrown. Destroying the connection with [id=")+ connection.getConnectionIdentifier())+"]"));
                        }
                        try {
                            if (connection!= null) {
                                connectionManager.destroyConnection(key, connection);
                                connection = null;
                            }
                        } catch (Exception innerException) {
                            logger.error(innerException.getMessage(), innerException);
                        }
                    }
                }
            }
            throw e;
        } finally {
            try {
                if (connection!= null) {
                    if (logger.isDebugEnabled()) {
                        logger.debug((("Releasing the connection back into the pool [id="+ connection.getConnectionIdentifier())+"]"));
                    }
                    connectionManager.releaseConnection(key, connection);
                }
            } catch (Exception e) {
                throw new UnableToReleaseConnectionException(e);
            }
        }
    }

    public T execute(ProcessCallback<T, JanrainConnectorConnectionIdentifierAdapter> processCallback, JanrainConnectorConnectionIdentifierAdapter object, Filter filter, MuleMessage message)
        throws Exception
    {
        throw new UnsupportedOperationException();
    }

}
