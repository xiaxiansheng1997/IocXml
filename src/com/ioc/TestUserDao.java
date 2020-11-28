package com.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xiayj@jiedaibao.com
 * @date 2020/11/22 22:38
 */
public class TestUserDao {

    @Test
    public void testShow(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = context.getBean("userDao",UserDao.class);
        userDao.show();
    }
}
