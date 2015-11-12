
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
 * ActivityMessageProcessor invokes the {@link org.mule.modules.janrain.JanrainConnector#activity(java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String)} method in {@link JanrainConnector }. For each argument there is a field in this processor to match it.  Before invoking the actual method the processor will evaluate and transform where possible to the expected argument type.
 * 
 */
@Generated(value = "Mule DevKit Version 3.4.5", date = "2015-11-12T11:54:29-03:00", comments = "Build UNNAMED.1635.c9f644c")
public class ActivityMessageProcessor
    extends AbstractMessageProcessor<Object>
    implements Disposable, Initialisable, Startable, Stoppable, MessageProcessor, OperationMetaDataEnabled
{

    protected Object activity;
    protected String _activityType;
    protected Object identifier;
    protected String _identifierType;
    protected Object deviceToken;
    protected String _deviceTokenType;
    protected Object truncate;
    protected Boolean _truncateType;
    protected Object prependName;
    protected Boolean _prependNameType;
    protected Object urlShortening;
    protected String _urlShorteningType;
    protected Object source;
    protected String _sourceType;

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
     * Sets source
     * 
     * @param value Value to set
     */
    public void setSource(Object value) {
        this.source = value;
    }

    /**
     * Sets truncate
     * 
     * @param value Value to set
     */
    public void setTruncate(Object value) {
        this.truncate = value;
    }

    /**
     * Sets deviceToken
     * 
     * @param value Value to set
     */
    public void setDeviceToken(Object value) {
        this.deviceToken = value;
    }

    /**
     * Sets urlShortening
     * 
     * @param value Value to set
     */
    public void setUrlShortening(Object value) {
        this.urlShortening = value;
    }

    /**
     * Sets prependName
     * 
     * @param value Value to set
     */
    public void setPrependName(Object value) {
        this.prependName = value;
    }

    /**
     * Sets identifier
     * 
     * @param value Value to set
     */
    public void setIdentifier(Object value) {
        this.identifier = value;
    }

    /**
     * Sets activity
     * 
     * @param value Value to set
     */
    public void setActivity(Object value) {
        this.activity = value;
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
            final String _transformedActivity = ((String) evaluateAndTransform(getMuleContext(), event, ActivityMessageProcessor.class.getDeclaredField("_activityType").getGenericType(), null, activity));
            final String _transformedIdentifier = ((String) evaluateAndTransform(getMuleContext(), event, ActivityMessageProcessor.class.getDeclaredField("_identifierType").getGenericType(), null, identifier));
            final String _transformedDeviceToken = ((String) evaluateAndTransform(getMuleContext(), event, ActivityMessageProcessor.class.getDeclaredField("_deviceTokenType").getGenericType(), null, deviceToken));
            final Boolean _transformedTruncate = ((Boolean) evaluateAndTransform(getMuleContext(), event, ActivityMessageProcessor.class.getDeclaredField("_truncateType").getGenericType(), null, truncate));
            final Boolean _transformedPrependName = ((Boolean) evaluateAndTransform(getMuleContext(), event, ActivityMessageProcessor.class.getDeclaredField("_prependNameType").getGenericType(), null, prependName));
            final String _transformedUrlShortening = ((String) evaluateAndTransform(getMuleContext(), event, ActivityMessageProcessor.class.getDeclaredField("_urlShorteningType").getGenericType(), null, urlShortening));
            final String _transformedSource = ((String) evaluateAndTransform(getMuleContext(), event, ActivityMessageProcessor.class.getDeclaredField("_sourceType").getGenericType(), null, source));
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
                    return ((JanrainConnector) object).activity(_transformedActivity, _transformedIdentifier, _transformedDeviceToken, _transformedTruncate, _transformedPrependName, _transformedUrlShortening, _transformedSource);
                }

            }
            , this, event);
            overwritePayload(event, resultPayload);
            return event;
        } catch (MessagingException messagingException) {
            messagingException.setProcessedEvent(event);
            throw messagingException;
        } catch (Exception e) {
            throw new MessagingException(CoreMessages.failedToInvoke("activity"), event, e);
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
