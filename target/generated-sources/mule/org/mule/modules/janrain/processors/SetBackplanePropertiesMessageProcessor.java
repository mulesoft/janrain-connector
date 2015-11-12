
package org.mule.modules.janrain.processors;

import java.util.List;
import javax.annotation.Generated;
import org.mule.api.MessagingException;
import org.mule.api.MuleContext;
import org.mule.api.MuleEvent;
import org.mule.api.MuleException;
import org.mule.api.construct.FlowConstruct;
import org.mule.api.lifecycle.Disposable;
import org.mule.api.lifecycle.Initialisable;
import org.mule.api.lifecycle.InitialisationException;
import org.mule.api.lifecycle.Startable;
import org.mule.api.lifecycle.Stoppable;
import org.mule.api.processor.MessageProcessor;
import org.mule.common.DefaultResult;
import org.mule.common.Result;
import org.mule.common.metadata.DefaultMetaData;
import org.mule.common.metadata.DefaultPojoMetaDataModel;
import org.mule.common.metadata.DefaultSimpleMetaDataModel;
import org.mule.common.metadata.MetaData;
import org.mule.common.metadata.MetaDataModel;
import org.mule.common.metadata.OperationMetaDataEnabled;
import org.mule.common.metadata.datatype.DataType;
import org.mule.common.metadata.datatype.DataTypeFactory;
import org.mule.config.i18n.CoreMessages;
import org.mule.modules.janrain.JanrainConnector;
import org.mule.modules.janrain.connectivity.JanrainConnectorConnectionManager;
import org.mule.modules.janrain.process.ProcessAdapter;
import org.mule.modules.janrain.process.ProcessCallback;
import org.mule.modules.janrain.process.ProcessTemplate;


/**
 * SetBackplanePropertiesMessageProcessor invokes the {@link org.mule.modules.janrain.JanrainConnector#setBackplaneProperties(java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String)} method in {@link JanrainConnector }. For each argument there is a field in this processor to match it.  Before invoking the actual method the processor will evaluate and transform where possible to the expected argument type.
 * 
 */
@Generated(value = "Mule DevKit Version 3.4.5", date = "2015-11-12T11:54:29-03:00", comments = "Build UNNAMED.1635.c9f644c")
public class SetBackplanePropertiesMessageProcessor
    extends AbstractMessageProcessor<Object>
    implements Disposable, Initialisable, Startable, Stoppable, MessageProcessor, OperationMetaDataEnabled
{

    protected Object server;
    protected String _serverType;
    protected Object bus;
    protected String _busType;
    protected Object version;
    protected String _versionType;
    protected Object remove;
    protected Boolean _removeType;
    protected Object username;
    protected String _usernameType;
    protected Object password;
    protected String _passwordType;

    /**
     * Obtains the expression manager from the Mule context and initialises the connector. If a target object  has not been set already it will search the Mule registry for a default one.
     * 
     * @throws InitialisationException
     */
    public void initialise()
        throws InitialisationException
    {
    }

    public void start()
        throws MuleException
    {
    }

    public void stop()
        throws MuleException
    {
    }

    public void dispose() {
    }

    /**
     * Set the Mule context
     * 
     * @param context Mule context to set
     */
    public void setMuleContext(MuleContext context) {
        super.setMuleContext(context);
    }

    /**
     * Sets flow construct
     * 
     * @param flowConstruct Flow construct to set
     */
    public void setFlowConstruct(FlowConstruct flowConstruct) {
        super.setFlowConstruct(flowConstruct);
    }

    /**
     * Sets username
     * 
     * @param value Value to set
     */
    public void setUsername(Object value) {
        this.username = value;
    }

    /**
     * Sets bus
     * 
     * @param value Value to set
     */
    public void setBus(Object value) {
        this.bus = value;
    }

    /**
     * Sets remove
     * 
     * @param value Value to set
     */
    public void setRemove(Object value) {
        this.remove = value;
    }

    /**
     * Sets server
     * 
     * @param value Value to set
     */
    public void setServer(Object value) {
        this.server = value;
    }

    /**
     * Sets password
     * 
     * @param value Value to set
     */
    public void setPassword(Object value) {
        this.password = value;
    }

    /**
     * Sets version
     * 
     * @param value Value to set
     */
    public void setVersion(Object value) {
        this.version = value;
    }

    /**
     * Invokes the MessageProcessor.
     * 
     * @param event MuleEvent to be processed
     * @throws MuleException
     */
    public MuleEvent process(final MuleEvent event)
        throws MuleException
    {
        Object moduleObject = null;
        try {
            moduleObject = findOrCreate(JanrainConnectorConnectionManager.class, true, event);
            final String _transformedServer = ((String) evaluateAndTransform(getMuleContext(), event, SetBackplanePropertiesMessageProcessor.class.getDeclaredField("_serverType").getGenericType(), null, server));
            final String _transformedBus = ((String) evaluateAndTransform(getMuleContext(), event, SetBackplanePropertiesMessageProcessor.class.getDeclaredField("_busType").getGenericType(), null, bus));
            final String _transformedVersion = ((String) evaluateAndTransform(getMuleContext(), event, SetBackplanePropertiesMessageProcessor.class.getDeclaredField("_versionType").getGenericType(), null, version));
            final Boolean _transformedRemove = ((Boolean) evaluateAndTransform(getMuleContext(), event, SetBackplanePropertiesMessageProcessor.class.getDeclaredField("_removeType").getGenericType(), null, remove));
            final String _transformedUsername = ((String) evaluateAndTransform(getMuleContext(), event, SetBackplanePropertiesMessageProcessor.class.getDeclaredField("_usernameType").getGenericType(), null, username));
            final String _transformedPassword = ((String) evaluateAndTransform(getMuleContext(), event, SetBackplanePropertiesMessageProcessor.class.getDeclaredField("_passwordType").getGenericType(), null, password));
            Object resultPayload;
            ProcessTemplate<Object, Object> processTemplate = ((ProcessAdapter<Object> ) moduleObject).getProcessTemplate();
            resultPayload = processTemplate.execute(new ProcessCallback<Object,Object>() {


                public List<Class> getManagedExceptions() {
                    return null;
                }

                public boolean isProtected() {
                    return false;
                }

                public Object process(Object object)
                    throws Exception
                {
                    return ((JanrainConnector) object).setBackplaneProperties(_transformedServer, _transformedBus, _transformedVersion, _transformedRemove, _transformedUsername, _transformedPassword);
                }

            }
            , this, event);
            overwritePayload(event, resultPayload);
            return event;
        } catch (MessagingException messagingException) {
            messagingException.setProcessedEvent(event);
            throw messagingException;
        } catch (Exception e) {
            throw new MessagingException(CoreMessages.failedToInvoke("setBackplaneProperties"), event, e);
        }
    }

    @Override
    public Result<MetaData> getInputMetaData() {
        return new DefaultResult<MetaData>(null, (Result.Status.SUCCESS));
    }

    @Override
    public Result<MetaData> getOutputMetaData(MetaData inputMetadata) {
        return new DefaultResult<MetaData>(new DefaultMetaData(getPojoOrSimpleModel(boolean.class)));
    }

    private MetaDataModel getPojoOrSimpleModel(Class clazz) {
        DataType dataType = DataTypeFactory.getInstance().getDataType(clazz);
        if (DataType.POJO.equals(dataType)) {
            return new DefaultPojoMetaDataModel(clazz);
        } else {
            return new DefaultSimpleMetaDataModel(dataType);
        }
    }

}
