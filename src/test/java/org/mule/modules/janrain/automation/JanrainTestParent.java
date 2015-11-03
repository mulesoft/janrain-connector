/**
 * (c) 2003-2015 MuleSoft, Inc. The software in this package is published under
 * the terms of the CPAL v1.0 license, a copy of which has been included with this
 * distribution in the LICENSE.md file.
 */

package org.mule.modules.janrain.automation;

import java.util.Map;

import org.junit.BeforeClass;
import org.mule.api.processor.MessageProcessor;
import org.mule.tck.junit4.FunctionalTestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class JanrainTestParent extends FunctionalTestCase {
	
	protected static final String[] SPRING_CONFIG_FILES = new String[] {"AutomationSpringBeans.xml"};
	protected static ApplicationContext context;
	protected Map<String,Object> setupData;
	protected Map<String,Object> testObjects;
	
	@Override
	protected String getConfigResources() {
		return "automation-test-flows.xml";
	}
	
	protected MessageProcessor lookupFlowConstruct(String name) {
        return (MessageProcessor) muleContext.getRegistry().lookupFlowConstruct(name);
    }
	
    @BeforeClass
    public static void beforeClass(){
    	
    	context = new ClassPathXmlApplicationContext(SPRING_CONFIG_FILES);
    	
    }
}
