package com.demo.service;

import com.demo.domain.Order;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class EmailServiceTest {

    private EmailService emailService;
    private Order testOrder;

    @BeforeEach
    void init() {
        emailService = new EmailService();
        testOrder = new Order();
    }

    @Test
    void sendEmail_withoutCcEmail_shouldThrowRuntimeException() {
        RuntimeException exception =
                assertThrows(RuntimeException.class,
                        () -> emailService.sendEmail(testOrder));

        assertAll(
                () -> assertFalse(testOrder.isCustomerNotified()),
                () -> assertEquals("An Exception Occurred", exception.getMessage())
        );
    }

    @Test
    void sendEmail_withValidCcEmail_shouldNotifyCustomer() {
        boolean emailSent =
                emailService.sendEmail(testOrder, "cc@test.com");

        assertTrue(emailSent);
        assertTrue(testOrder.isCustomerNotified());
    }

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {"cc", "cc@", "@abc.com"})
    void sendEmail_withInvalidCcEmail_shouldFail(String ccEmail) {
        IllegalArgumentException exception =
                assertThrows(IllegalArgumentException.class,
                        () -> emailService.sendEmail(testOrder, ccEmail));

        assertEquals("Invalid CC email", exception.getMessage());
        assertFalse(testOrder.isCustomerNotified());
    }

    @Test
    void sendEmail_withNullOrder_shouldThrowException() {
        IllegalArgumentException exception =
                assertThrows(IllegalArgumentException.class,
                        () -> emailService.sendEmail(null, "cc@test.com"));

        assertTrue(exception.getMessage().contains("Order cannot be null"));
    }
}
