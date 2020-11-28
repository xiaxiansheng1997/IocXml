package com.ioc.aop;

import org.junit.Assert;

/**
 * @author xiayj@jiedaibao.com
 * @date 2020/11/23 20:56
 */
public class UserDaoImpl implements UserDao {

    @Override
    public void addUser(String id,String name) {
        System.out.println("++++++方法执行+++++");
        //测试异常通知
        Assert.assertEquals(1L,5L);
    }
}
