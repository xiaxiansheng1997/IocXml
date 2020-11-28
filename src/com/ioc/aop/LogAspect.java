package com.ioc.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author xiayj@jiedaibao.com
 * @date 2020/11/23 20:57
 */
public class LogAspect implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        //执行正式逻辑之前输出的内容
        System.out.println(methodInvocation.getMethod());
        System.out.println("before ~~~~~~~~");
        //执行逻辑
        Object obj = methodInvocation.proceed();
        //执行逻辑后要输出的内容
        System.out.println("after ~~~~~~~");
        return obj;
    }
}
