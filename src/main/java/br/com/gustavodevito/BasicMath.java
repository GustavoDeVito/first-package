package br.com.gustavodevito;

/**
 * A basic math library providing common arithmetic operations.
 */
public class BasicMath {

    /**
     * Adds two numbers.
     * 
     * @param num1 The first number.
     * @param num2 The second number.
     * @return The sum of num1 and num2.
     */
    public static double addition(double num1, double num2) {
        return num1 + num2;
    }

    /**
     * Subtracts one number from another.
     * 
     * @param num1 The number to be subtracted from.
     * @param num2 The number to subtract.
     * @return The result of subtracting num2 from num1.
     */
    public static double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    /**
     * Multiplies two numbers.
     * 
     * @param num1 The first number.
     * @param num2 The second number.
     * @return The product of num1 and num2.
     */
    public static double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    /**
     * Divides one number by another.
     * 
     * @param num1 The dividend.
     * @param num2 The divisor.
     * @return The result of dividing num1 by num2.
     * @throws ArithmeticException If the divisor is zero.
     */
    public static double division(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new ArithmeticException("Division by zero!");
        }
    }

}
