package com.ing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void multiplyList() {
        calculator.multiply(Arrays.asList(1,4,2,7,5));
    }

    @Test
    public void multiply() {
        int expected = 20;
    }

}