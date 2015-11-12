
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
 * SetAppSettingsMessageProcessor invokes the {@link org.mule.modules.janrain.JanrainConnector#setAppSettings(java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean)} method in {@link JanrainConnector }. For each argument there is a field in this processor to match it.  Before invoking the actual method the processor will evaluate and transform where possible to the expected argument type.
 * 
 */
@Generated(value = "Mule DevKit Version 3.4.5", date = "2015-11-12T11:54:29-03:00", comments = "Build UNNAMED.1635.c9f644c")
public class SetAppSettingsMessageProcessor
    extends AbstractMessageProcessor<Object>
    implements Disposable, Initialisable, Startable, Stoppable, MessageProcessor, OperationMetaDataEnabled
{

    protected Object privacyPolicy;
    protected String _privacyPolicyType;
    protected Object favicon;
    protected String _faviconType;
    protected Object domainRedirect;
    protected String _domainRedirectType;
    protected Object postToTokenUrl;
    protected Boolean _postToTokenUrlType;
    protected Object oneTimeUseTokens;
    protected Boolean _oneTimeUseTokensType;
    protected Object googleProfileUrl;
    protected Boolean _googleProfileUrlType;

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
     * Sets oneTimeUseTokens
     * 
     * @param value Value to set
     */
    public void setOneTimeUseTokens(Object value) {
        this.oneTimeUseTokens = value;
    }

    /**
     * Sets privacyPolicy
     * 
     * @param value Value to set
     */
    public void setPrivacyPolicy(Object value) {
        this.privacyPolicy = value;
    }

    /**
     * Sets favicon
     * 
     * @param value Value to set
     */
    public void setFavicon(Object value) {
        this.favicon = value;
    }

    /**
     * Sets googleProfileUrl
     * 
     * @param value Value to set
     */
    public void setGoogleProfileUrl(Object value) {
        this.googleProfileUrl = value;
    }

    /**
     * Sets domainRedirect
     * 
     * @param value Value to set
     */
    public void setDomainRedirect(Object value) {
        this.domainRedirect = value;
    }

    /**
     * Sets postToTokenUrl
     * 
     * @param value Value to set
     */
    public void setPostToTokenUrl(Object value) {
        this.postToTokenUrl = value;
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
            final String _transformedPrivacyPolicy = ((String) evaluateAndTransform(getMuleContext(), event, SetAppSettingsMessageProcessor.class.getDeclaredField("_privacyPolicyType").getGenericType(), null, privacyPolicy));
            final String _transformedFavicon = ((String) evaluateAndTransform(getMuleContext(), event, SetAppSettingsMessageProcessor.class.getDeclaredField("_faviconType").getGenericType(), null, favicon));
            final String _transformedDomainRedirect = ((String) evaluateAndTransform(getMuleContext(), event, SetAppSettingsMessageProcessor.class.getDeclaredField("_domainRedirectType").getGenericType(), null, domainRedirect));
            final Boolean _transformedPostToTokenUrl = ((Boolean) evaluateAndTransform(getMuleContext(), event, SetAppSettingsMessageProcessor.class.getDeclaredField("_postToTokenUrlType").getGenericType(), null, postToTokenUrl));
            final Boolean _transformedOneTimeUseTokens = ((Boolean) evaluateAndTransform(getMuleContext(), event, SetAppSettingsMessageProcessor.class.getDeclaredField("_oneTimeUseTokensType").getGenericType(), null, oneTimeUseTokens));
            final Boolean _transformedGoogleProfileUrl = ((Boolean) evaluateAndTransform(getMuleContext(), event, SetAppSettingsMessageProcessor.class.getDeclaredField("_googleProfileUrlType").getGenericType(), null, googleProfileUrl));
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
                    return ((JanrainConnector) object).setAppSettings(_transformedPrivacyPolicy, _transformedFavicon, _transformedDomainRedirect, _transformedPostToTokenUrl, _transformedOneTimeUseTokens, _transformedGoogleProfileUrl);
                }

            }
            , this, event);
            overwritePayload(event, resultPayload);
            return event;
        } catch (MessagingException messagingException) {
            messagingException.setProcessedEvent(event);
            throw messagingException;
        } catch (Exception e) {
            throw new MessagingException(CoreMessages.failedToInvoke("setAppSettings"), event, e);
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
