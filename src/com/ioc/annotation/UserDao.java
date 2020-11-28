package com.ioc.annotation;

import org.springframework.stereotype.Repository;

/**
 * @author xiayj@jiedaibao.com
 * @date 2020/11/23 20:29
 */
@Repository
public class UserDao {
    public void findUser() {
        System.out.println("-----------找到一个用户");
    }
}
