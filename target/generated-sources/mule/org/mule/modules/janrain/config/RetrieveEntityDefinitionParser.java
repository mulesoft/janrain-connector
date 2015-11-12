
package org.mule.modules.janrain.config;

import javax.annotation.Generated;
import org.mule.modules.janrain.processors.RetrieveEntityMessageProcessor;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

@Generated(value = "Mule DevKit Version 3.4.5", date = "2015-11-12T11:54:29-03:00", comments = "Build UNNAMED.1635.c9f644c")
public class RetrieveEntityDefinitionParser
    extends AbstractDefinitionParser
{


    public BeanDefinition parse(Element element, ParserContext parserContext) {
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(RetrieveEntityMessageProcessor.class.getName());
        builder.setScope(BeanDefinition.SCOPE_PROTOTYPE);
        parseConfigRef(element, builder);
        parseProperty(builder, element, "client_secret", "client_secret");
        parseProperty(builder, element, "client_id", "client_id");
        parseProperty(builder, element, "access_token", "access_token");
        parseProperty(builder, element, "uuid", "uuid");
        parseProperty(builder, element, "id", "id");
        parseProperty(builder, element, "key_attribute", "key_attribute");
        parseProperty(builder, element, "key_value", "key_value");
        parseProperty(builder, element, "password_attribute", "password_attribute");
        parseProperty(builder, element, "password_value", "password_value");
        parseProperty(builder, element, "type_name", "type_name");
        parseProperty(builder, element, "attribute_name", "attribute_name");
        parseProperty(builder, element, "attributes", "attributes");
        parseProperty(builder, element, "created", "created");
        parseProperty(builder, element, "last_updated", "last_updated");
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
