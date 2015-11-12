
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
 * VerifyDomainMessageProcessor invokes the {@link org.mule.modules.janrain.JanrainConnector#verifyDomain(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)} method in {@link JanrainConnector }. For each argument there is a field in this processor to match it.  Before invoking the actual method the processor will evaluate and transform where possible to the expected argument type.
 * 
 */
@Generated(value = "Mule DevKit Version 3.4.5", date = "2015-11-12T11:54:29-03:00", comments = "Build UNNAMED.1635.c9f644c")
public class VerifyDomainMessageProcessor
    extends AbstractMessageProcessor<Object>
    implements Disposable, Initialisable, Startable, Stoppable, MessageProcessor, OperationMetaDataEnabled
{

    protected Object engageApiKey;
    protected String _engageApiKeyType;
    protected Object partnerKey;
    protected String _partnerKeyType;
    protected Object provider;
    protected String _providerType;
    protected Object code;
    protected String _codeType;
    protected Object filename;
    protected String _filenameType;

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
     * Sets engageApiKey
     * 
     * @param value Value to set
     */
    public void setEngageApiKey(Object value) {
        this.engageApiKey = value;
    }

    /**
     * Sets filename
     * 
     * @param value Value to set
     */
    public void setFilename(Object value) {
        this.filename = value;
    }

    /**
     * Sets provider
     * 
     * @param value Value to set
     */
    public void setProvider(Object value) {
        this.provider = value;
    }

    /**
     * Sets code
     * 
     * @param value Value to set
     */
    public void setCode(Object value) {
        this.code = value;
    }

    /**
     * Sets partnerKey
     * 
     * @param value Value to set
     */
    public void setPartnerKey(Object value) {
        this.partnerKey = value;
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
            final String _transformedEngageApiKey = ((String) evaluateAndTransform(getMuleContext(), event, VerifyDomainMessageProcessor.class.getDeclaredField("_engageApiKeyType").getGenericType(), null, engageApiKey));
            final String _transformedPartnerKey = ((String) evaluateAndTransform(getMuleContext(), event, VerifyDomainMessageProcessor.class.getDeclaredField("_partnerKeyType").getGenericType(), null, partnerKey));
            final String _transformedProvider = ((String) evaluateAndTransform(getMuleContext(), event, VerifyDomainMessageProcessor.class.getDeclaredField("_providerType").getGenericType(), null, provider));
            final String _transformedCode = ((String) evaluateAndTransform(getMuleContext(), event, VerifyDomainMessageProcessor.class.getDeclaredField("_codeType").getGenericType(), null, code));
            final String _transformedFilename = ((String) evaluateAndTransform(getMuleContext(), event, VerifyDomainMessageProcessor.class.getDeclaredField("_filenameType").getGenericType(), null, filename));
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
                    return ((JanrainConnector) object).verifyDomain(_transformedEngageApiKey, _transformedPartnerKey, _transformedProvider, _transformedCode, _transformedFilename);
                }

            }
            , this, event);
            overwritePayload(event, resultPayload);
            return event;
        } catch (MessagingException messagingException) {
            messagingException.setProcessedEvent(event);
            throw messagingException;
        } catch (Exception e) {
            throw new MessagingException(CoreMessages.failedToInvoke("verifyDomain"), event, e);
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
