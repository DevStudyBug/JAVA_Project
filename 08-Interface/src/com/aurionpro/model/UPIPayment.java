package com.aurionpro.model;

public class UPIPayment implements IPayment {
@Override
public void processPayment(double amount) {
    System.out.println("Processing UPI payment of $" + amount);
}
}
