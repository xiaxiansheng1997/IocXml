package com.ioc.annotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xiayj@jiedaibao.com
 * @date 2020/11/23 20:38
 */
public class TestUserController {

    @Test
    public void testFindUser(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserController userController = context.getBean("user",UserController.class);
        userController.findUser();
    }
}
