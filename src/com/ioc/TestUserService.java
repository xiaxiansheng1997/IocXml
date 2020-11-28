package com.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xiayj@jiedaibao.com
 * @date 2020/11/22 21:25
 */
public class TestUserService {

    @Test
    public void testFindUser() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = context.getBean("userService",UserService.class);
        userService.findUser();
    }
}
