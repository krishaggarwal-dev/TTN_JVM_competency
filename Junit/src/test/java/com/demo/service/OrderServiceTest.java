package com.demo.service;

import com.demo.domain.Order;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;


public class OrderServiceTest {

    private static OrderService instance;
    private Order order;

    @BeforeEach
    public void setup() {
        instance = new OrderService();
        order = new Order();
        order.setPrice(100);
    }

    @Test
    public void testPlaceOrder_withoutCC_throwsException() {
        RuntimeException re = assertThrows(RuntimeException.class, () -> instance.placeOrder(order));
        assertEquals(120, order.getPriceWithTax());
        assertEquals("An Exception Occurred", re.getMessage());
        assertFalse(order.isCustomerNotified());
    }

    @Test
    public void testPlaceOrder_withCC_returnsTrueAndNotifiesCustomer() {
        boolean isNotified = instance.placeOrder(order, "cc@example.com");
        assertEquals(120, order.getPriceWithTax());
        assertTrue(isNotified, "Notification send to the customer.");
        assertTrue(order.isCustomerNotified());
    }

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {"cc","cc@","@abc.com"})
    public void testPlaceOrder_withInvalidCC_shouldThrowIllegalArgumentException(String cc) {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> instance.placeOrder(order, cc));

        assertEquals("Invalid CC email", ex.getMessage());
        assertFalse(order.isCustomerNotified());
    }

    @Test
    public void testPlaceOrder_withNullOrder_shouldThrowIllegalArgumentException() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> instance.placeOrder(null, "cc@example.com"));

        assertEquals("Order cannot be null.", ex.getMessage());
        assertFalse(order.isCustomerNotified());
    }
}