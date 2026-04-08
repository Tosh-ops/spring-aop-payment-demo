/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public void makePayment(int amount) {
        System.out.println("Processing payment of $" + amount);
    }

    public void refundPayment() {
        System.out.println("Processing refund...");
        throw new RuntimeException("Refund failed!");
    }
}
