package com.lz.spring.extendxsd.parser;

import com.lz.spring.extendxsd.bean.Tag;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

public class TagBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {
    @Override
    protected Class<Tag> getBeanClass(Element element) {
        return Tag.class;
    }

    @Override
    protected void doParse(Element element, BeanDefinitionBuilder builder) {
        String name = element.getAttribute("name");
        String other1 = element.getAttribute("other1");
        if(StringUtils.hasText(name)){
            builder.addPropertyValue("name",name);
        }if(StringUtils.hasText(other1)){
            builder.addPropertyValue("other1",other1);
        }
    }
}
