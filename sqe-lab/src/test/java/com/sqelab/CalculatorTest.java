
package com.sqelab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    void testAdd() {
        assertEquals(10, calc.add(5, 5));
    }

    @Test
    void testAddNegative() {
        assertEquals(-5, calc.add(-2, -3));
    }

    @Test
    void testSubtract() {
        assertEquals(5, calc.subtract(10, 5));
    }

    @Test
    void testSubtractNegative() {
        assertEquals(-5, calc.subtract(5, 10));
    }

    @Test
    void testMultiply() {
        assertEquals(20, calc.multiply(4, 5));
    }

    @Test
    void testMultiplyNegative() {
        assertEquals(-12, calc.multiply(-3, 4));
    }

    @Test
    void testDivide() {
        assertEquals(5.0, calc.divide(10, 2));
    }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class,
                () -> calc.divide(10, 0));
    }
}
