package com.lz.spring.extendxsd;


import com.lz.spring.extendxsd.bean.Tag;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    @org.junit.Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:test.xml");
        Tag tag = (Tag) context.getBean("tbean");
        System.out.println("tag: "+tag.toString());
    }
}
