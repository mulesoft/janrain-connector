
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
 * LinkAccountNativeMessageProcessor invokes the {@link org.mule.modules.janrain.JanrainConnector#linkAccountNative(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)} method in {@link JanrainConnector }. For each argument there is a field in this processor to match it.  Before invoking the actual method the processor will evaluate and transform where possible to the expected argument type.
 * 
 */
@Generated(value = "Mule DevKit Version 3.4.5", date = "2015-11-12T11:54:29-03:00", comments = "Build UNNAMED.1635.c9f644c")
public class LinkAccountNativeMessageProcessor
    extends AbstractMessageProcessor<Object>
    implements Disposable, Initialisable, Startable, Stoppable, MessageProcessor, OperationMetaDataEnabled
{

    protected Object client_id;
    protected String _client_idType;
    protected Object locale;
    protected String _localeType;
    protected Object response_type;
    protected String _response_typeType;
    protected Object redirect_uri;
    protected String _redirect_uriType;
    protected Object token;
    protected String _tokenType;
    protected Object flow_name;
    protected String _flow_nameType;
    protected Object flow_version;
    protected String _flow_versionType;

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
     * Sets response_type
     * 
     * @param value Value to set
     */
    public void setResponse_type(Object value) {
        this.response_type = value;
    }

    /**
     * Sets token
     * 
     * @param value Value to set
     */
    public void setToken(Object value) {
        this.token = value;
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
     * Sets locale
     * 
     * @param value Value to set
     */
    public void setLocale(Object value) {
        this.locale = value;
    }

    /**
     * Sets flow_version
     * 
     * @param value Value to set
     */
    public void setFlow_version(Object value) {
        this.flow_version = value;
    }

    /**
     * Sets flow_name
     * 
     * @param value Value to set
     */
    public void setFlow_name(Object value) {
        this.flow_name = value;
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
            final String _transformedClient_id = ((String) evaluateAndTransform(getMuleContext(), event, LinkAccountNativeMessageProcessor.class.getDeclaredField("_client_idType").getGenericType(), null, client_id));
            final String _transformedLocale = ((String) evaluateAndTransform(getMuleContext(), event, LinkAccountNativeMessageProcessor.class.getDeclaredField("_localeType").getGenericType(), null, locale));
            final String _transformedResponse_type = ((String) evaluateAndTransform(getMuleContext(), event, LinkAccountNativeMessageProcessor.class.getDeclaredField("_response_typeType").getGenericType(), null, response_type));
            final String _transformedRedirect_uri = ((String) evaluateAndTransform(getMuleContext(), event, LinkAccountNativeMessageProcessor.class.getDeclaredField("_redirect_uriType").getGenericType(), null, redirect_uri));
            final String _transformedToken = ((String) evaluateAndTransform(getMuleContext(), event, LinkAccountNativeMessageProcessor.class.getDeclaredField("_tokenType").getGenericType(), null, token));
            final String _transformedFlow_name = ((String) evaluateAndTransform(getMuleContext(), event, LinkAccountNativeMessageProcessor.class.getDeclaredField("_flow_nameType").getGenericType(), null, flow_name));
            final String _transformedFlow_version = ((String) evaluateAndTransform(getMuleContext(), event, LinkAccountNativeMessageProcessor.class.getDeclaredField("_flow_versionType").getGenericType(), null, flow_version));
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
                    return ((JanrainConnector) object).linkAccountNative(_transformedClient_id, _transformedLocale, _transformedResponse_type, _transformedRedirect_uri, _transformedToken, _transformedFlow_name, _transformedFlow_version);
                }

            }
            , this, event);
            overwritePayload(event, resultPayload);
            return event;
        } catch (MessagingException messagingException) {
            messagingException.setProcessedEvent(event);
            throw messagingException;
        } catch (Exception e) {
            throw new MessagingException(CoreMessages.failedToInvoke("linkAccountNative"), event, e);
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
