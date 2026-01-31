package com.demo.service;

import com.demo.domain.Order;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class EmailServiceTest {
    EmailService emailService;
    Order order;

    @BeforeEach
    public void setup() {
        emailService = new EmailService();
        order = new Order();
    }

    @Test
    public void testSendEmailWithoutCC_throwsException() {
        RuntimeException re = assertThrows(RuntimeException.class, () -> emailService.sendEmail(order));

        assertFalse(order.isCustomerNotified(), "Customer is not notified");
        assertEquals("An Exception Occurred", re.getMessage());
    }

    @Test
    void sendEmail_withCC_returnsTrueAndNotifiesCustomer() {
        boolean result = emailService.sendEmail(order, "cc@test.com");

        assertTrue(result);
        assertTrue(order.isCustomerNotified());
    }

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {"cc","cc@","@abc.com"})
    public void testSendEmail_withInvalidCc_shouldThrowIllegalArgumentException(String cc) {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> emailService.sendEmail(order, cc));

        assertEquals("Invalid CC email", ex.getMessage());
        assertFalse(order.isCustomerNotified());
    }

    @Test
    public void testSendEmail_withNullOrder_shouldThrowIllegalArgumentException() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> emailService.sendEmail(null, "cc@test.com"));

        assertEquals("Order cannot be null", ex.getMessage());
    }
}