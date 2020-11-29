package com.ioc.aspectan;

import org.junit.Assert;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao{

    @Override
    public void addUser(String id,String name) {
        System.out.println("id:"+id+"name:"+name);
        Assert.assertEquals(1L,2L);
    }
}
