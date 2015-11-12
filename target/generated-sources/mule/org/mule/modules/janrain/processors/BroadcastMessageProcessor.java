
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
import org.mule.modules.janrain.engage.Broadcast;
import org.mule.modules.janrain.process.ProcessAdapter;
import org.mule.modules.janrain.process.ProcessCallback;
import org.mule.modules.janrain.process.ProcessTemplate;


/**
 * BroadcastMessageProcessor invokes the {@link org.mule.modules.janrain.JanrainConnector#broadcast(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)} method in {@link JanrainConnector }. For each argument there is a field in this processor to match it.  Before invoking the actual method the processor will evaluate and transform where possible to the expected argument type.
 * 
 */
@Generated(value = "Mule DevKit Version 3.4.5", date = "2015-11-12T11:54:29-03:00", comments = "Build UNNAMED.1635.c9f644c")
public class BroadcastMessageProcessor
    extends AbstractMessageProcessor<Object>
    implements Disposable, Initialisable, Startable, Stoppable, MessageProcessor, OperationMetaDataEnabled
{

    protected Object identifier;
    protected String _identifierType;
    protected Object deviceToken;
    protected String _deviceTokenType;
    protected Object title;
    protected String _titleType;
    protected Object url;
    protected String _urlType;
    protected Object source;
    protected String _sourceType;
    protected Object message;
    protected String _messageType;
    protected Object description;
    protected String _descriptionType;
    protected Object image;
    protected String _imageType;
    protected Object media;
    protected String _mediaType;
    protected Object actionLink;
    protected String _actionLinkType;
    protected Object objectId;
    protected String _objectIdType;

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
     * Sets message
     * 
     * @param value Value to set
     */
    public void setMessage(Object value) {
        this.message = value;
    }

    /**
     * Sets actionLink
     * 
     * @param value Value to set
     */
    public void setActionLink(Object value) {
        this.actionLink = value;
    }

    /**
     * Sets title
     * 
     * @param value Value to set
     */
    public void setTitle(Object value) {
        this.title = value;
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
     * Sets objectId
     * 
     * @param value Value to set
     */
    public void setObjectId(Object value) {
        this.objectId = value;
    }

    /**
     * Sets description
     * 
     * @param value Value to set
     */
    public void setDescription(Object value) {
        this.description = value;
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
     * Sets image
     * 
     * @param value Value to set
     */
    public void setImage(Object value) {
        this.image = value;
    }

    /**
     * Sets media
     * 
     * @param value Value to set
     */
    public void setMedia(Object value) {
        this.media = value;
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
     * Sets url
     * 
     * @param value Value to set
     */
    public void setUrl(Object value) {
        this.url = value;
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
            final String _transformedIdentifier = ((String) evaluateAndTransform(getMuleContext(), event, BroadcastMessageProcessor.class.getDeclaredField("_identifierType").getGenericType(), null, identifier));
            final String _transformedDeviceToken = ((String) evaluateAndTransform(getMuleContext(), event, BroadcastMessageProcessor.class.getDeclaredField("_deviceTokenType").getGenericType(), null, deviceToken));
            final String _transformedTitle = ((String) evaluateAndTransform(getMuleContext(), event, BroadcastMessageProcessor.class.getDeclaredField("_titleType").getGenericType(), null, title));
            final String _transformedUrl = ((String) evaluateAndTransform(getMuleContext(), event, BroadcastMessageProcessor.class.getDeclaredField("_urlType").getGenericType(), null, url));
            final String _transformedSource = ((String) evaluateAndTransform(getMuleContext(), event, BroadcastMessageProcessor.class.getDeclaredField("_sourceType").getGenericType(), null, source));
            final String _transformedMessage = ((String) evaluateAndTransform(getMuleContext(), event, BroadcastMessageProcessor.class.getDeclaredField("_messageType").getGenericType(), null, message));
            final String _transformedDescription = ((String) evaluateAndTransform(getMuleContext(), event, BroadcastMessageProcessor.class.getDeclaredField("_descriptionType").getGenericType(), null, description));
            final String _transformedImage = ((String) evaluateAndTransform(getMuleContext(), event, BroadcastMessageProcessor.class.getDeclaredField("_imageType").getGenericType(), null, image));
            final String _transformedMedia = ((String) evaluateAndTransform(getMuleContext(), event, BroadcastMessageProcessor.class.getDeclaredField("_mediaType").getGenericType(), null, media));
            final String _transformedActionLink = ((String) evaluateAndTransform(getMuleContext(), event, BroadcastMessageProcessor.class.getDeclaredField("_actionLinkType").getGenericType(), null, actionLink));
            final String _transformedObjectId = ((String) evaluateAndTransform(getMuleContext(), event, BroadcastMessageProcessor.class.getDeclaredField("_objectIdType").getGenericType(), null, objectId));
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
                    return ((JanrainConnector) object).broadcast(_transformedIdentifier, _transformedDeviceToken, _transformedTitle, _transformedUrl, _transformedSource, _transformedMessage, _transformedDescription, _transformedImage, _transformedMedia, _transformedActionLink, _transformedObjectId);
                }

            }
            , this, event);
            overwritePayload(event, resultPayload);
            return event;
        } catch (MessagingException messagingException) {
            messagingException.setProcessedEvent(event);
            throw messagingException;
        } catch (Exception e) {
            throw new MessagingException(CoreMessages.failedToInvoke("broadcast"), event, e);
        }
    }

    @Override
    public Result<MetaData> getInputMetaData() {
        return new DefaultResult<MetaData>(null, (Result.Status.SUCCESS));
    }

    @Override
    public Result<MetaData> getOutputMetaData(MetaData inputMetadata) {
        return new DefaultResult<MetaData>(new DefaultMetaData(getPojoOrSimpleModel(Broadcast.class)));
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
