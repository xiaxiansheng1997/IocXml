package com.ioc.aop;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

/**
 * @author xiayj@jiedaibao.com
 * @date 2020/11/23 22:26
 */
public class LogThrowAspect implements ThrowsAdvice {

    public void afterThrowing(Method method, Object[] objects, Object o1,Throwable error){
        System.out.println("----异常通知----");
        System.out.println(error);
    }
}
