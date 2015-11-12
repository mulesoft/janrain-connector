
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
 * GetAuthorizationCodeMessageProcessor invokes the {@link org.mule.modules.janrain.JanrainConnector#getAuthorizationCode(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)} method in {@link JanrainConnector }. For each argument there is a field in this processor to match it.  Before invoking the actual method the processor will evaluate and transform where possible to the expected argument type.
 * 
 */
@Generated(value = "Mule DevKit Version 3.4.5", date = "2015-11-12T11:54:29-03:00", comments = "Build UNNAMED.1635.c9f644c")
public class GetAuthorizationCodeMessageProcessor
    extends AbstractMessageProcessor<Object>
    implements Disposable, Initialisable, Startable, Stoppable, MessageProcessor, OperationMetaDataEnabled
{

    protected Object uuid;
    protected String _uuidType;
    protected Object id;
    protected String _idType;
    protected Object key_attribute;
    protected String _key_attributeType;
    protected Object key_value;
    protected String _key_valueType;
    protected Object client_id;
    protected String _client_idType;
    protected Object client_secret;
    protected String _client_secretType;
    protected Object redirect_uri;
    protected String _redirect_uriType;
    protected Object type_name;
    protected String _type_nameType;
    protected Object transaction_state;
    protected String _transaction_stateType;
    protected Object lifetime;
    protected String _lifetimeType;
    protected Object for_client_id;
    protected String _for_client_idType;

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
     * Sets id
     * 
     * @param value Value to set
     */
    public void setId(Object value) {
        this.id = value;
    }

    /**
     * Sets lifetime
     * 
     * @param value Value to set
     */
    public void setLifetime(Object value) {
        this.lifetime = value;
    }

    /**
     * Sets client_secret
     * 
     * @param value Value to set
     */
    public void setClient_secret(Object value) {
        this.client_secret = value;
    }

    /**
     * Sets redirect_uri
     * 
     * @param value Value to set
     */
    public void setRedirect_uri(Object value) {
        this.redirect_uri = value;
    }

    /**
     * Sets key_attribute
     * 
     * @param value Value to set
     */
    public void setKey_attribute(Object value) {
        this.key_attribute = value;
    }

    /**
     * Sets for_client_id
     * 
     * @param value Value to set
     */
    public void setFor_client_id(Object value) {
        this.for_client_id = value;
    }

    /**
     * Sets key_value
     * 
     * @param value Value to set
     */
    public void setKey_value(Object value) {
        this.key_value = value;
    }

    /**
     * Sets type_name
     * 
     * @param value Value to set
     */
    public void setType_name(Object value) {
        this.type_name = value;
    }

    /**
     * Sets client_id
     * 
     * @param value Value to set
     */
    public void setClient_id(Object value) {
        this.client_id = value;
    }

    /**
     * Sets uuid
     * 
     * @param value Value to set
     */
    public void setUuid(Object value) {
        this.uuid = value;
    }

    /**
     * Sets transaction_state
     * 
     * @param value Value to set
     */
    public void setTransaction_state(Object value) {
        this.transaction_state = value;
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
            final String _transformedUuid = ((String) evaluateAndTransform(getMuleContext(), event, GetAuthorizationCodeMessageProcessor.class.getDeclaredField("_uuidType").getGenericType(), null, uuid));
            final String _transformedId = ((String) evaluateAndTransform(getMuleContext(), event, GetAuthorizationCodeMessageProcessor.class.getDeclaredField("_idType").getGenericType(), null, id));
            final String _transformedKey_attribute = ((String) evaluateAndTransform(getMuleContext(), event, GetAuthorizationCodeMessageProcessor.class.getDeclaredField("_key_attributeType").getGenericType(), null, key_attribute));
            final String _transformedKey_value = ((String) evaluateAndTransform(getMuleContext(), event, GetAuthorizationCodeMessageProcessor.class.getDeclaredField("_key_valueType").getGenericType(), null, key_value));
            final String _transformedClient_id = ((String) evaluateAndTransform(getMuleContext(), event, GetAuthorizationCodeMessageProcessor.class.getDeclaredField("_client_idType").getGenericType(), null, client_id));
            final String _transformedClient_secret = ((String) evaluateAndTransform(getMuleContext(), event, GetAuthorizationCodeMessageProcessor.class.getDeclaredField("_client_secretType").getGenericType(), null, client_secret));
            final String _transformedRedirect_uri = ((String) evaluateAndTransform(getMuleContext(), event, GetAuthorizationCodeMessageProcessor.class.getDeclaredField("_redirect_uriType").getGenericType(), null, redirect_uri));
            final String _transformedType_name = ((String) evaluateAndTransform(getMuleContext(), event, GetAuthorizationCodeMessageProcessor.class.getDeclaredField("_type_nameType").getGenericType(), null, type_name));
            final String _transformedTransaction_state = ((String) evaluateAndTransform(getMuleContext(), event, GetAuthorizationCodeMessageProcessor.class.getDeclaredField("_transaction_stateType").getGenericType(), null, transaction_state));
            final String _transformedLifetime = ((String) evaluateAndTransform(getMuleContext(), event, GetAuthorizationCodeMessageProcessor.class.getDeclaredField("_lifetimeType").getGenericType(), null, lifetime));
            final String _transformedFor_client_id = ((String) evaluateAndTransform(getMuleContext(), event, GetAuthorizationCodeMessageProcessor.class.getDeclaredField("_for_client_idType").getGenericType(), null, for_client_id));
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
                    return ((JanrainConnector) object).getAuthorizationCode(_transformedUuid, _transformedId, _transformedKey_attribute, _transformedKey_value, _transformedClient_id, _transformedClient_secret, _transformedRedirect_uri, _transformedType_name, _transformedTransaction_state, _transformedLifetime, _transformedFor_client_id);
                }

            }
            , this, event);
            overwritePayload(event, resultPayload);
            return event;
        } catch (MessagingException messagingException) {
            messagingException.setProcessedEvent(event);
            throw messagingException;
        } catch (Exception e) {
            throw new MessagingException(CoreMessages.failedToInvoke("getAuthorizationCode"), event, e);
        }
    }

    @Override
    public Result<MetaData> getInputMetaData() {
        return new DefaultResult<MetaData>(null, (Result.Status.SUCCESS));
    }

    @Override
    public Result<MetaData> getOutputMetaData(MetaData inputMetadata) {
        return new DefaultResult<MetaData>(new DefaultMetaData(getPojoOrSimpleModel(String.class)));
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
