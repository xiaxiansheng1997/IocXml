package com.ioc.aop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xiayj@jiedaibao.com
 * @date 2020/11/23 21:09
 */
public class TestUserDao {

    @Test
    public void testAddUser() {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserDao userDao = context.getBean("userDaoProxy",UserDao.class);
        //userDao.addUser("1111","32323232");
        ((EUserDao)userDao).runE();
    }
}
