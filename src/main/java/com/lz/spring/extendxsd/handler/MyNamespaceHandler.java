package com.lz.spring.extendxsd.handler;

import com.lz.spring.extendxsd.parser.TagBeanDefinitionParser;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class MyNamespaceHandler extends NamespaceHandlerSupport {
    @Override
    public void init() {
        registerBeanDefinitionParser("tag", new TagBeanDefinitionParser());
    }
}
