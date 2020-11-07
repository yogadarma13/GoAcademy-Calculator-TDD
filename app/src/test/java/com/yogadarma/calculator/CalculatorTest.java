package com.yogadarma.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void givenCalculatorAppWhenPrintReturnZero() {
        Calculator calculator = new Calculator();
        String result = calculator.toString();
        assertEquals("0", result);
    }

    @Test
    public void givenCalculatorAppWhenCancelReturnZero() {
        Calculator calculator = new Calculator();
        calculator.cancel();
        String result = calculator.toString();
        assertEquals("0", result);
    }
}