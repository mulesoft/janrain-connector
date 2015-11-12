
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
 * EntityFindMessageProcessor invokes the {@link org.mule.modules.janrain.JanrainConnector#entityFind(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String)} method in {@link JanrainConnector }. For each argument there is a field in this processor to match it.  Before invoking the actual method the processor will evaluate and transform where possible to the expected argument type.
 * 
 */
@Generated(value = "Mule DevKit Version 3.4.5", date = "2015-11-12T11:54:29-03:00", comments = "Build UNNAMED.1635.c9f644c")
public class EntityFindMessageProcessor
    extends AbstractMessageProcessor<Object>
    implements Disposable, Initialisable, Startable, Stoppable, MessageProcessor, OperationMetaDataEnabled
{

    protected Object client_secret;
    protected String _client_secretType;
    protected Object client_id;
    protected String _client_idType;
    protected Object type_name;
    protected String _type_nameType;
    protected Object filter;
    protected String _filterType;
    protected Object max_results;
    protected String _max_resultsType;
    protected Object first_result;
    protected String _first_resultType;
    protected Object show_total_count;
    protected Boolean _show_total_countType;
    protected Object sort_on;
    protected String _sort_onType;
    protected Object attributes;
    protected String _attributesType;

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
     * Sets show_total_count
     * 
     * @param value Value to set
     */
    public void setShow_total_count(Object value) {
        this.show_total_count = value;
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
     * Sets type_name
     * 
     * @param value Value to set
     */
    public void setType_name(Object value) {
        this.type_name = value;
    }

    /**
     * Sets max_results
     * 
     * @param value Value to set
     */
    public void setMax_results(Object value) {
        this.max_results = value;
    }

    /**
     * Sets sort_on
     * 
     * @param value Value to set
     */
    public void setSort_on(Object value) {
        this.sort_on = value;
    }

    /**
     * Sets attributes
     * 
     * @param value Value to set
     */
    public void setAttributes(Object value) {
        this.attributes = value;
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
     * Sets first_result
     * 
     * @param value Value to set
     */
    public void setFirst_result(Object value) {
        this.first_result = value;
    }

    /**
     * Sets filter
     * 
     * @param value Value to set
     */
    public void setFilter(Object value) {
        this.filter = value;
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
            final String _transformedClient_secret = ((String) evaluateAndTransform(getMuleContext(), event, EntityFindMessageProcessor.class.getDeclaredField("_client_secretType").getGenericType(), null, client_secret));
            final String _transformedClient_id = ((String) evaluateAndTransform(getMuleContext(), event, EntityFindMessageProcessor.class.getDeclaredField("_client_idType").getGenericType(), null, client_id));
            final String _transformedType_name = ((String) evaluateAndTransform(getMuleContext(), event, EntityFindMessageProcessor.class.getDeclaredField("_type_nameType").getGenericType(), null, type_name));
            final String _transformedFilter = ((String) evaluateAndTransform(getMuleContext(), event, EntityFindMessageProcessor.class.getDeclaredField("_filterType").getGenericType(), null, filter));
            final String _transformedMax_results = ((String) evaluateAndTransform(getMuleContext(), event, EntityFindMessageProcessor.class.getDeclaredField("_max_resultsType").getGenericType(), null, max_results));
            final String _transformedFirst_result = ((String) evaluateAndTransform(getMuleContext(), event, EntityFindMessageProcessor.class.getDeclaredField("_first_resultType").getGenericType(), null, first_result));
            final Boolean _transformedShow_total_count = ((Boolean) evaluateAndTransform(getMuleContext(), event, EntityFindMessageProcessor.class.getDeclaredField("_show_total_countType").getGenericType(), null, show_total_count));
            final String _transformedSort_on = ((String) evaluateAndTransform(getMuleContext(), event, EntityFindMessageProcessor.class.getDeclaredField("_sort_onType").getGenericType(), null, sort_on));
            final String _transformedAttributes = ((String) evaluateAndTransform(getMuleContext(), event, EntityFindMessageProcessor.class.getDeclaredField("_attributesType").getGenericType(), null, attributes));
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
                    return ((JanrainConnector) object).entityFind(_transformedClient_secret, _transformedClient_id, _transformedType_name, _transformedFilter, _transformedMax_results, _transformedFirst_result, _transformedShow_total_count, _transformedSort_on, _transformedAttributes);
                }

            }
            , this, event);
            overwritePayload(event, resultPayload);
            return event;
        } catch (MessagingException messagingException) {
            messagingException.setProcessedEvent(event);
            throw messagingException;
        } catch (Exception e) {
            throw new MessagingException(CoreMessages.failedToInvoke("entityFind"), event, e);
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
