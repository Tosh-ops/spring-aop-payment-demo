/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.springaopdemo;

import com.example.service.PaymentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@ComponentScan(basePackages = "com.example")
public class MainApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = 
            new AnnotationConfigApplicationContext(MainApp.class);

        PaymentService paymentService = context.getBean(PaymentService.class);

        System.out.println("=== Making a payment ===");
        paymentService.makePayment(100);

        System.out.println("\n=== Trying a refund ===");
        try {
            paymentService.refundPayment();
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        context.close();
    }
}