package com.ioc.aspectj;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class LogAspect {
    //前置通知
    public void myBefore(JoinPoint joinPoint) {
        System.out.println("前置通知:目标对象:"+joinPoint.getTarget()+"方法:"+joinPoint.getSignature().getName());
    }
    //后置通知
    public void myAfterReturning(JoinPoint joinPoint) {
        System.out.println("后置通知:目标对象:"+joinPoint.getTarget()+"方法:"+joinPoint.getSignature().getName());
    }
    //环绕通知
    public Object myAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("环绕通知开始:目标对象:"+proceedingJoinPoint.getTarget()+"方法:"+proceedingJoinPoint.getSignature().getName());
        Object obj = proceedingJoinPoint.proceed();
        System.out.println("环绕通知结束:目标对象:"+proceedingJoinPoint.getTarget()+"方法:"+proceedingJoinPoint.getSignature().getName());
        return obj;
    }
    //异常通知
    public void myAfterThrowing(JoinPoint joinPoint,Throwable e){
        System.out.println("异常通知:"+e.getMessage());
    }
    //最终通知
    public void myAfter(JoinPoint joinPoint){
        System.out.println("最终通知:目标对象:"+joinPoint.getTarget()+"方法:"+joinPoint.getSignature().getName());
    }
}
