package com.ioc.aop;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author xiayj@jiedaibao.com
 * @date 2020/11/23 22:20
 */
public class LogAfterAspect implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("after~~~~后置通知");
        System.out.println("method:"+method);
        System.out.println("objects:"+ Arrays.toString(objects));
        System.out.println("object:"+o);
        System.out.println("object:"+o1);
    }
}
