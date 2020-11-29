package com.ioc.aspectan;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

    //切入点
    @Pointcut("execution(* com.ioc.aspectan.UserDao.addUser(..))")
    public void myPointCut(){

    }
    //前置通知
    @Before("myPointCut()")
    public void myBefore(JoinPoint joinPoint) {
        System.out.println("前置通知:目标对象:"+joinPoint.getTarget()+"方法:"+joinPoint.getSignature().getName());
    }
    //后置通知
    @AfterReturning("myPointCut()")
    public void myAfterReturning(JoinPoint joinPoint) {
        System.out.println("后置通知:目标对象:"+joinPoint.getTarget()+"方法:"+joinPoint.getSignature().getName());
    }
    //环绕通知
    @Around("myPointCut()")
    public Object myAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("环绕通知开始:目标对象:"+proceedingJoinPoint.getTarget()+"方法:"+proceedingJoinPoint.getSignature().getName());
        Object obj = proceedingJoinPoint.proceed();
        System.out.println("环绕通知结束:目标对象:"+proceedingJoinPoint.getTarget()+"方法:"+proceedingJoinPoint.getSignature().getName());
        return obj;
    }
    //异常通知
    @AfterThrowing(value = "myPointCut()",throwing = "e")
    public void myAfterThrowing(JoinPoint joinPoint,Throwable e){
        System.out.println("异常通知:"+e.getMessage());
    }
    //最终通知
    @After("myPointCut()")
    public void myAfter(JoinPoint joinPoint){
        System.out.println("最终通知:目标对象:"+joinPoint.getTarget()+"方法:"+joinPoint.getSignature().getName());
    }
}
