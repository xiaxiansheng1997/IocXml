package com.ioc.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author xiayj@jiedaibao.com
 * @date 2020/11/23 20:33
 */
@Controller("user")
public class UserController {

    @Autowired
    private UserService userService;

    public void findUser() {
        userService.findUser();
    }
}
