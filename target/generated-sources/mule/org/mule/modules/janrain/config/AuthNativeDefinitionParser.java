
package org.mule.modules.janrain.config;

import javax.annotation.Generated;
import org.mule.modules.janrain.processors.AuthNativeMessageProcessor;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

@Generated(value = "Mule DevKit Version 3.4.5", date = "2015-11-12T11:54:29-03:00", comments = "Build UNNAMED.1635.c9f644c")
public class AuthNativeDefinitionParser
    extends AbstractDefinitionParser
{


    public BeanDefinition parse(Element element, ParserContext parserContext) {
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(AuthNativeMessageProcessor.class.getName());
        builder.setScope(BeanDefinition.SCOPE_PROTOTYPE);
        parseConfigRef(element, builder);
        parseProperty(builder, element, "client_id", "client_id");
        parseProperty(builder, element, "locale", "locale");
        parseProperty(builder, element, "response_type", "response_type");
        parseProperty(builder, element, "redirect_uri", "redirect_uri");
        parseProperty(builder, element, "token", "token");
        parseProperty(builder, element, "thin_registration", "thin_registration");
        parseProperty(builder, element, "merge_token", "merge_token");
        parseProperty(builder, element, "flow_name", "flow_name");
        parseProperty(builder, element, "flow_version", "flow_version");
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
