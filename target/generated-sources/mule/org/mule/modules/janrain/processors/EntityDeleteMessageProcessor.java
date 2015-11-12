
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
 * EntityDeleteMessageProcessor invokes the {@link org.mule.modules.janrain.JanrainConnector#entityDelete(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)} method in {@link JanrainConnector }. For each argument there is a field in this processor to match it.  Before invoking the actual method the processor will evaluate and transform where possible to the expected argument type.
 * 
 */
@Generated(value = "Mule DevKit Version 3.4.5", date = "2015-11-12T11:54:29-03:00", comments = "Build UNNAMED.1635.c9f644c")
public class EntityDeleteMessageProcessor
    extends AbstractMessageProcessor<Object>
    implements Disposable, Initialisable, Startable, Stoppable, MessageProcessor, OperationMetaDataEnabled
{

    protected Object client_secret;
    protected String _client_secretType;
    protected Object client_id;
    protected String _client_idType;
    protected Object access_token;
    protected String _access_tokenType;
    protected Object uuid;
    protected String _uuidType;
    protected Object id;
    protected String _idType;
    protected Object key_attribute;
    protected String _key_attributeType;
    protected Object key_value;
    protected String _key_valueType;
    protected Object type_name;
    protected String _type_nameType;
    protected Object attribute_name;
    protected String _attribute_nameType;
    protected Object created;
    protected String _createdType;
    protected Object last_updated;
    protected String _last_updatedType;

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
     * Sets client_secret
     * 
     * @param value Value to set
     */
    public void setClient_secret(Object value) {
        this.client_secret = value;
    }

    /**
     * Sets created
     * 
     * @param value Value to set
     */
    public void setCreated(Object value) {
        this.created = value;
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
     * Sets last_updated
     * 
     * @param value Value to set
     */
    public void setLast_updated(Object value) {
        this.last_updated = value;
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
     * Sets client_id
     * 
     * @param value Value to set
     */
    public void setClient_id(Object value) {
        this.client_id = value;
    }

    /**
     * Sets access_token
     * 
     * @param value Value to set
     */
    public void setAccess_token(Object value) {
        this.access_token = value;
    }

    /**
     * Sets attribute_name
     * 
     * @param value Value to set
     */
    public void setAttribute_name(Object value) {
        this.attribute_name = value;
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
            final String _transformedClient_secret = ((String) evaluateAndTransform(getMuleContext(), event, EntityDeleteMessageProcessor.class.getDeclaredField("_client_secretType").getGenericType(), null, client_secret));
            final String _transformedClient_id = ((String) evaluateAndTransform(getMuleContext(), event, EntityDeleteMessageProcessor.class.getDeclaredField("_client_idType").getGenericType(), null, client_id));
            final String _transformedAccess_token = ((String) evaluateAndTransform(getMuleContext(), event, EntityDeleteMessageProcessor.class.getDeclaredField("_access_tokenType").getGenericType(), null, access_token));
            final String _transformedUuid = ((String) evaluateAndTransform(getMuleContext(), event, EntityDeleteMessageProcessor.class.getDeclaredField("_uuidType").getGenericType(), null, uuid));
            final String _transformedId = ((String) evaluateAndTransform(getMuleContext(), event, EntityDeleteMessageProcessor.class.getDeclaredField("_idType").getGenericType(), null, id));
            final String _transformedKey_attribute = ((String) evaluateAndTransform(getMuleContext(), event, EntityDeleteMessageProcessor.class.getDeclaredField("_key_attributeType").getGenericType(), null, key_attribute));
            final String _transformedKey_value = ((String) evaluateAndTransform(getMuleContext(), event, EntityDeleteMessageProcessor.class.getDeclaredField("_key_valueType").getGenericType(), null, key_value));
            final String _transformedType_name = ((String) evaluateAndTransform(getMuleContext(), event, EntityDeleteMessageProcessor.class.getDeclaredField("_type_nameType").getGenericType(), null, type_name));
            final String _transformedAttribute_name = ((String) evaluateAndTransform(getMuleContext(), event, EntityDeleteMessageProcessor.class.getDeclaredField("_attribute_nameType").getGenericType(), null, attribute_name));
            final String _transformedCreated = ((String) evaluateAndTransform(getMuleContext(), event, EntityDeleteMessageProcessor.class.getDeclaredField("_createdType").getGenericType(), null, created));
            final String _transformedLast_updated = ((String) evaluateAndTransform(getMuleContext(), event, EntityDeleteMessageProcessor.class.getDeclaredField("_last_updatedType").getGenericType(), null, last_updated));
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
                    return ((JanrainConnector) object).entityDelete(_transformedClient_secret, _transformedClient_id, _transformedAccess_token, _transformedUuid, _transformedId, _transformedKey_attribute, _transformedKey_value, _transformedType_name, _transformedAttribute_name, _transformedCreated, _transformedLast_updated);
                }

            }
            , this, event);
            overwritePayload(event, resultPayload);
            return event;
        } catch (MessagingException messagingException) {
            messagingException.setProcessedEvent(event);
            throw messagingException;
        } catch (Exception e) {
            throw new MessagingException(CoreMessages.failedToInvoke("entityDelete"), event, e);
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
