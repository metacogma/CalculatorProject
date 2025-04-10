package com.calculator;

/**
 * A simple calculator class that performs basic arithmetic operations.
 */
public class Calculator {
    
    /**
     * Adds two numbers.
     * 
     * @param a first number
     * @param b second number
     * @return the sum of a and b
     */
    public double add(double a, double b) {
        return a + b;
    }
    
    /**
     * Subtracts second number from the first.
     * 
     * @param a first number
     * @param b second number
     * @return a minus b
     */
    public double subtract(double a, double b) {
        return a - b;
    }
    
    /**
     * Multiplies two numbers.
     * 
     * @param a first number
     * @param b second number
     * @return a multiplied by b
     */
    public double multiply(double a, double b) {
        return a * b;
    }
    
    /**
     * Divides first number by the second.
     * 
     * @param a first number
     * @param b second number
     * @return a divided by b
     * @throws IllegalArgumentException if b is zero
     */
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed");
        }
        return a / b;
    }
}
