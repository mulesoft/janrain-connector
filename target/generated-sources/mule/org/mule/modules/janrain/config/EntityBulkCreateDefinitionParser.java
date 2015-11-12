
package org.mule.modules.janrain.config;

import javax.annotation.Generated;
import org.mule.modules.janrain.processors.EntityBulkCreateMessageProcessor;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

@Generated(value = "Mule DevKit Version 3.4.5", date = "2015-11-12T11:54:29-03:00", comments = "Build UNNAMED.1635.c9f644c")
public class EntityBulkCreateDefinitionParser
    extends AbstractDefinitionParser
{


    public BeanDefinition parse(Element element, ParserContext parserContext) {
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(EntityBulkCreateMessageProcessor.class.getName());
        builder.setScope(BeanDefinition.SCOPE_PROTOTYPE);
        parseConfigRef(element, builder);
        parseProperty(builder, element, "client_id", "client_id");
        parseProperty(builder, element, "client_secret", "client_secret");
        parseProperty(builder, element, "type_name", "type_name");
        parseProperty(builder, element, "all_attributes", "all_attributes");
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
