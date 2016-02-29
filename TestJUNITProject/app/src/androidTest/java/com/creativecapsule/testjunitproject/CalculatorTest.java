package com.creativecapsule.testjunitproject;

import junit.framework.TestCase;



/**
 * Created by Tushar Vengurlekar
 * Created on 2/27/16.
 */
public class CalculatorTest extends TestCase {

    private Calculator mCalculator;


    public void setUp() throws Exception {
        mCalculator = new Calculator();
    }


    public void testSum() throws Exception {

        assertEquals(6d, mCalculator.sum(1d, 5d), 0);
    }

    public void testSubtract() throws Exception {
        assertEquals(1d, mCalculator.subtract(5d, 4d), 0);
    }

    public void testDivide() throws Exception {
        assertEquals(2d, mCalculator.divide(8d, 4d), 0);
    }

    public void testMultiply() throws Exception {
        assertEquals(20d, mCalculator.multiply(5d, 4d), 0);
    }
}