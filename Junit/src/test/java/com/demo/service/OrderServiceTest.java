package com.demo.service;

import com.demo.domain.Order;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceTest {

    private OrderService orderService;
    private Order testOrder;

    @BeforeEach
    void init() {
        orderService = new OrderService();
        testOrder = new Order();
        testOrder.setPrice(100);
    }

    @Test
    void placeOrder_withoutCcEmail_shouldThrowRuntimeException() {
        RuntimeException exception =
                assertThrows(RuntimeException.class, () -> orderService.placeOrder(testOrder));

        assertAll(
                () -> assertEquals(120, testOrder.getPriceWithTax()),
                () -> assertEquals("An Exception Occurred", exception.getMessage()),
                () -> assertFalse(testOrder.isCustomerNotified())
        );
    }

    @Test
    void placeOrder_withValidCcEmail_shouldNotifyCustomer() {
        boolean notificationStatus =
                orderService.placeOrder(testOrder, "cc@example.com");

        assertTrue(notificationStatus);
        assertEquals(120, testOrder.getPriceWithTax());
        assertTrue(testOrder.isCustomerNotified());
    }

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {"cc", "cc@", "@abc.com"})
    void placeOrder_withInvalidCcEmail_shouldFail(String ccEmail) {
        IllegalArgumentException exception =
                assertThrows(IllegalArgumentException.class,
                        () -> orderService.placeOrder(testOrder, ccEmail));

        assertEquals("Invalid CC email", exception.getMessage());
        assertFalse(testOrder.isCustomerNotified());
    }

    @Test
    void placeOrder_withNullOrder_shouldThrowException() {
        IllegalArgumentException exception =
                assertThrows(IllegalArgumentException.class,
                        () -> orderService.placeOrder(null, "cc@example.com"));

        assertTrue(exception.getMessage().contains("Order cannot be null"));
        assertFalse(testOrder.isCustomerNotified());
    }
}
