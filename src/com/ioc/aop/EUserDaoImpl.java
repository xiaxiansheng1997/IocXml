package com.ioc.aop;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.IntroductionInterceptor;

/**
 * @author xiayj@jiedaibao.com
 * @date 2020/11/23 22:40
 */
public class EUserDaoImpl implements EUserDao, IntroductionInterceptor {
    @Override
    public void runE() {
        System.out.println("+++++++++新的方法执行逻辑");
    }

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        if (implementsInterface(methodInvocation.getMethod().getDeclaringClass())) {
            return methodInvocation.getMethod().invoke(this,methodInvocation.getArguments());
        } else {
            return methodInvocation.proceed();
        }
    }

    @Override
    public boolean implementsInterface(Class<?> aClass) {
        return aClass.isAssignableFrom(EUserDao.class);
    }
}
