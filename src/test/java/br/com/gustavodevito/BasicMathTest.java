package br.com.gustavodevito;

import org.junit.Test;
import static org.junit.Assert.*;

public class BasicMathTest {
    @Test
    public void testAddition() {
        assertEquals(5.0, BasicMath.addition(2.0, 3.0), 0.0001);
        assertEquals(-1.0, BasicMath.addition(2.0, -3.0), 0.0001);
    }

    @Test
    public void testSubtraction() {
        assertEquals(2.0, BasicMath.subtraction(5.0, 3.0), 0.0001);
        assertEquals(-5.0, BasicMath.subtraction(2.0, 7.0), 0.0001);
    }

    @Test
    public void testMultiplication() {
        assertEquals(6.0, BasicMath.multiplication(2.0, 3.0), 0.0001);
        assertEquals(-6.0, BasicMath.multiplication(2.0, -3.0), 0.0001);
    }

    @Test
    public void testDivision() {
        assertEquals(2.0, BasicMath.division(6.0, 3.0), 0.0001);
        assertEquals(-2.0, BasicMath.division(-6.0, 3.0), 0.0001);
        assertThrows(ArithmeticException.class, () -> BasicMath.division(5.0, 0.0));
    }
}
