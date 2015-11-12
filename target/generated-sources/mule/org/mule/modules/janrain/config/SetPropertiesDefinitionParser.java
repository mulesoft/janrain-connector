
package org.mule.modules.janrain.config;

import javax.annotation.Generated;
import org.mule.modules.janrain.processors.SetPropertiesMessageProcessor;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

@Generated(value = "Mule DevKit Version 3.4.5", date = "2015-11-12T11:54:29-03:00", comments = "Build UNNAMED.1635.c9f644c")
public class SetPropertiesDefinitionParser
    extends AbstractDefinitionParser
{


    public BeanDefinition parse(Element element, ParserContext parserContext) {
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(SetPropertiesMessageProcessor.class.getName());
        builder.setScope(BeanDefinition.SCOPE_PROTOTYPE);
        parseConfigRef(element, builder);
        parseProperty(builder, element, "engageApiKey", "engageApiKey");
        parseProperty(builder, element, "partnerKey", "partnerKey");
        parseProperty(builder, element, "provider", "provider");
        parseProperty(builder, element, "fbAppID", "fbAppID");
        parseProperty(builder, element, "fbSecret", "fbSecret");
        parseProperty(builder, element, "emailPerm", "emailPerm");
        parseProperty(builder, element, "uninstallURL", "uninstallURL");
        parseProperty(builder, element, "consumerKey", "consumerKey");
        parseProperty(builder, element, "secret", "secret");
        parseProperty(builder, element, "paypalDisplayName", "paypalDisplayName");
        parseProperty(builder, element, "email", "email");
        parseProperty(builder, element, "liveidAppID", "liveidAppID");
        parseProperty(builder, element, "liveidSecret", "liveidSecret");
        parseProperty(builder, element, "liveidPrivacyPolicyUrl", "liveidPrivacyPolicyUrl");
        parseProperty(builder, element, "yahooAppID", "yahooAppID");
        parseProperty(builder, element, "activityScopesSet", "activityScopesSet");
        parseProperty(builder, element, "contactsScopeSet", "contactsScopeSet");
        parseProperty(builder, element, "apiKey", "apiKey");
        parseProperty(builder, element, "appName", "appName");
        parseProperty(builder, element, "appId", "appId");
        parseProperty(builder, element, "captureHost", "captureHost");
        BeanDefinition definition = builder.getBeanDefinition();
        setNoRecurseOnDefinition(definition);
        attachProcessorDefinition(parserContext, definition);
        return definition;
    }

}
