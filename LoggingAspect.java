/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Pointcut("execution(* com.example.service.PaymentService.*(..))")
    public void paymentMethods() {}

    @Before("paymentMethods()")
    public void logBefore() {
        System.out.println("==> LOG: A payment operation is about to start.");
    }

    @AfterReturning("paymentMethods()")
    public void logSuccess() {
        System.out.println("==> LOG: Operation finished successfully.");
    }

    @AfterThrowing("paymentMethods()")
    public void logError() {
        System.out.println("==> LOG: ALERT! The operation crashed.");
    }
}