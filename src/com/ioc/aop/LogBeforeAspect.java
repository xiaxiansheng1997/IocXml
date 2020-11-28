package com.ioc.aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author xiayj@jiedaibao.com
 * @date 2020/11/23 22:15
 */
public class LogBeforeAspect implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("method:"+method);
        System.out.println("objects:"+ Arrays.toString(objects));
        System.out.println("object:"+o);
        System.out.println("before~~~~前置通知");
    }
}
