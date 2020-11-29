package com.ioc.aspectj;

import org.junit.Assert;

public class UserDaoImpl implements UserDao{

    @Override
    public void addUser(String id,String name) {
        System.out.println("id:"+id+"name:"+name);
        Assert.assertEquals(1L,2L);
    }
}
