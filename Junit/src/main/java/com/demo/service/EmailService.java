package com.demo.service;


import com.demo.domain.Order;

public class EmailService {

    private static EmailService instance;

    public EmailService() {
    }

    public static EmailService getInstance() {
        if (instance == null) {
            instance = new EmailService();
        }
        return instance;
    }

    void sendEmail(Order order) {
        order.setCustomerNotified(false);
        throw new RuntimeException("An Exception Occurred");
    }

    boolean sendEmail(Order order, String cc) {
        String emailRegex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        if (cc == null || !cc.matches(emailRegex)) {
            throw new IllegalArgumentException("Invalid CC email");
        }
        if (order == null) {
            throw new IllegalArgumentException("Order cannot be null.");
        }
        order.setCustomerNotified(true);
        return true;
    }
}
