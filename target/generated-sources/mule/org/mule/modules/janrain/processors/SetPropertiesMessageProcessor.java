
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
 * SetPropertiesMessageProcessor invokes the {@link org.mule.modules.janrain.JanrainConnector#setProperties(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean)} method in {@link JanrainConnector }. For each argument there is a field in this processor to match it.  Before invoking the actual method the processor will evaluate and transform where possible to the expected argument type.
 * 
 */
@Generated(value = "Mule DevKit Version 3.4.5", date = "2015-11-12T11:54:29-03:00", comments = "Build UNNAMED.1635.c9f644c")
public class SetPropertiesMessageProcessor
    extends AbstractMessageProcessor<Object>
    implements Disposable, Initialisable, Startable, Stoppable, MessageProcessor, OperationMetaDataEnabled
{

    protected Object engageApiKey;
    protected String _engageApiKeyType;
    protected Object partnerKey;
    protected String _partnerKeyType;
    protected Object provider;
    protected String _providerType;
    protected Object fbAppID;
    protected String _fbAppIDType;
    protected Object fbSecret;
    protected String _fbSecretType;
    protected Object emailPerm;
    protected Boolean _emailPermType;
    protected Object uninstallURL;
    protected String _uninstallURLType;
    protected Object consumerKey;
    protected String _consumerKeyType;
    protected Object secret;
    protected String _secretType;
    protected Object paypalDisplayName;
    protected String _paypalDisplayNameType;
    protected Object email;
    protected String _emailType;
    protected Object liveidAppID;
    protected String _liveidAppIDType;
    protected Object liveidSecret;
    protected String _liveidSecretType;
    protected Object liveidPrivacyPolicyUrl;
    protected String _liveidPrivacyPolicyUrlType;
    protected Object yahooAppID;
    protected String _yahooAppIDType;
    protected Object activityScopesSet;
    protected Boolean _activityScopesSetType;
    protected Object contactsScopeSet;
    protected Boolean _contactsScopeSetType;

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
     * Sets fbSecret
     * 
     * @param value Value to set
     */
    public void setFbSecret(Object value) {
        this.fbSecret = value;
    }

    /**
     * Sets consumerKey
     * 
     * @param value Value to set
     */
    public void setConsumerKey(Object value) {
        this.consumerKey = value;
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
     * Sets emailPerm
     * 
     * @param value Value to set
     */
    public void setEmailPerm(Object value) {
        this.emailPerm = value;
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
     * Sets liveidAppID
     * 
     * @param value Value to set
     */
    public void setLiveidAppID(Object value) {
        this.liveidAppID = value;
    }

    /**
     * Sets yahooAppID
     * 
     * @param value Value to set
     */
    public void setYahooAppID(Object value) {
        this.yahooAppID = value;
    }

    /**
     * Sets uninstallURL
     * 
     * @param value Value to set
     */
    public void setUninstallURL(Object value) {
        this.uninstallURL = value;
    }

    /**
     * Sets activityScopesSet
     * 
     * @param value Value to set
     */
    public void setActivityScopesSet(Object value) {
        this.activityScopesSet = value;
    }

    /**
     * Sets fbAppID
     * 
     * @param value Value to set
     */
    public void setFbAppID(Object value) {
        this.fbAppID = value;
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
     * Sets liveidPrivacyPolicyUrl
     * 
     * @param value Value to set
     */
    public void setLiveidPrivacyPolicyUrl(Object value) {
        this.liveidPrivacyPolicyUrl = value;
    }

    /**
     * Sets email
     * 
     * @param value Value to set
     */
    public void setEmail(Object value) {
        this.email = value;
    }

    /**
     * Sets paypalDisplayName
     * 
     * @param value Value to set
     */
    public void setPaypalDisplayName(Object value) {
        this.paypalDisplayName = value;
    }

    /**
     * Sets secret
     * 
     * @param value Value to set
     */
    public void setSecret(Object value) {
        this.secret = value;
    }

    /**
     * Sets contactsScopeSet
     * 
     * @param value Value to set
     */
    public void setContactsScopeSet(Object value) {
        this.contactsScopeSet = value;
    }

    /**
     * Sets liveidSecret
     * 
     * @param value Value to set
     */
    public void setLiveidSecret(Object value) {
        this.liveidSecret = value;
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
            final String _transformedEngageApiKey = ((String) evaluateAndTransform(getMuleContext(), event, SetPropertiesMessageProcessor.class.getDeclaredField("_engageApiKeyType").getGenericType(), null, engageApiKey));
            final String _transformedPartnerKey = ((String) evaluateAndTransform(getMuleContext(), event, SetPropertiesMessageProcessor.class.getDeclaredField("_partnerKeyType").getGenericType(), null, partnerKey));
            final String _transformedProvider = ((String) evaluateAndTransform(getMuleContext(), event, SetPropertiesMessageProcessor.class.getDeclaredField("_providerType").getGenericType(), null, provider));
            final String _transformedFbAppID = ((String) evaluateAndTransform(getMuleContext(), event, SetPropertiesMessageProcessor.class.getDeclaredField("_fbAppIDType").getGenericType(), null, fbAppID));
            final String _transformedFbSecret = ((String) evaluateAndTransform(getMuleContext(), event, SetPropertiesMessageProcessor.class.getDeclaredField("_fbSecretType").getGenericType(), null, fbSecret));
            final Boolean _transformedEmailPerm = ((Boolean) evaluateAndTransform(getMuleContext(), event, SetPropertiesMessageProcessor.class.getDeclaredField("_emailPermType").getGenericType(), null, emailPerm));
            final String _transformedUninstallURL = ((String) evaluateAndTransform(getMuleContext(), event, SetPropertiesMessageProcessor.class.getDeclaredField("_uninstallURLType").getGenericType(), null, uninstallURL));
            final String _transformedConsumerKey = ((String) evaluateAndTransform(getMuleContext(), event, SetPropertiesMessageProcessor.class.getDeclaredField("_consumerKeyType").getGenericType(), null, consumerKey));
            final String _transformedSecret = ((String) evaluateAndTransform(getMuleContext(), event, SetPropertiesMessageProcessor.class.getDeclaredField("_secretType").getGenericType(), null, secret));
            final String _transformedPaypalDisplayName = ((String) evaluateAndTransform(getMuleContext(), event, SetPropertiesMessageProcessor.class.getDeclaredField("_paypalDisplayNameType").getGenericType(), null, paypalDisplayName));
            final String _transformedEmail = ((String) evaluateAndTransform(getMuleContext(), event, SetPropertiesMessageProcessor.class.getDeclaredField("_emailType").getGenericType(), null, email));
            final String _transformedLiveidAppID = ((String) evaluateAndTransform(getMuleContext(), event, SetPropertiesMessageProcessor.class.getDeclaredField("_liveidAppIDType").getGenericType(), null, liveidAppID));
            final String _transformedLiveidSecret = ((String) evaluateAndTransform(getMuleContext(), event, SetPropertiesMessageProcessor.class.getDeclaredField("_liveidSecretType").getGenericType(), null, liveidSecret));
            final String _transformedLiveidPrivacyPolicyUrl = ((String) evaluateAndTransform(getMuleContext(), event, SetPropertiesMessageProcessor.class.getDeclaredField("_liveidPrivacyPolicyUrlType").getGenericType(), null, liveidPrivacyPolicyUrl));
            final String _transformedYahooAppID = ((String) evaluateAndTransform(getMuleContext(), event, SetPropertiesMessageProcessor.class.getDeclaredField("_yahooAppIDType").getGenericType(), null, yahooAppID));
            final Boolean _transformedActivityScopesSet = ((Boolean) evaluateAndTransform(getMuleContext(), event, SetPropertiesMessageProcessor.class.getDeclaredField("_activityScopesSetType").getGenericType(), null, activityScopesSet));
            final Boolean _transformedContactsScopeSet = ((Boolean) evaluateAndTransform(getMuleContext(), event, SetPropertiesMessageProcessor.class.getDeclaredField("_contactsScopeSetType").getGenericType(), null, contactsScopeSet));
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
                    return ((JanrainConnector) object).setProperties(_transformedEngageApiKey, _transformedPartnerKey, _transformedProvider, _transformedFbAppID, _transformedFbSecret, _transformedEmailPerm, _transformedUninstallURL, _transformedConsumerKey, _transformedSecret, _transformedPaypalDisplayName, _transformedEmail, _transformedLiveidAppID, _transformedLiveidSecret, _transformedLiveidPrivacyPolicyUrl, _transformedYahooAppID, _transformedActivityScopesSet, _transformedContactsScopeSet);
                }

            }
            , this, event);
            overwritePayload(event, resultPayload);
            return event;
        } catch (MessagingException messagingException) {
            messagingException.setProcessedEvent(event);
            throw messagingException;
        } catch (Exception e) {
            throw new MessagingException(CoreMessages.failedToInvoke("setProperties"), event, e);
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
