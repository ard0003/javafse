package com.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    public void testMultiply() {
        Calculator calc = new Calculator();
        assertEquals(6, calc.multiply(2, 3));
    }

    @Test
    public void testAssertions() {
        String message = "JUnit is awesome!";
        assertNotNull(message);
        assertTrue(message.startsWith("JUnit"));
        assertFalse(message.endsWith("boring"));
        assertEquals("JUnit is awesome!", message);
    }
}
