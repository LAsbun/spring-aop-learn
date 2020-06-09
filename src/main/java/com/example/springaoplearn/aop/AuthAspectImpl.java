package com.example.springaoplearn.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AuthAspectImpl {

    @Around("@annotation(com.example.springaoplearn.aop.AuthAspect)")
    public void begin(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("auth");
        joinPoint.proceed();
        System.out.println("auth end");

    }
}
