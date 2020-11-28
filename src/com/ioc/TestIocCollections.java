package com.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xiayj@jiedaibao.com
 * @date 2020/11/22 21:56
 */
public class TestIocCollections {

    @Test
    public void testShow() {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        IocCollections iocCollections = context.getBean("iocCollections",IocCollections.class);
        iocCollections.show();
    }
}
