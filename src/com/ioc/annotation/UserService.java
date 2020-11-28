package com.ioc.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xiayj@jiedaibao.com
 * @date 2020/11/23 20:30
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public void findUser() {
        userDao.findUser();
    }
}
