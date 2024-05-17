package test;

import ngongochuy.Calculator2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Calculator2Test {

    @Test
    public void testResultValue() {
        Calculator2 calculator = new Calculator2();
        calculator.number1 = 10;
        calculator.number2 = 5;
        calculator.sub();
        assertEquals(5, calculator.result);
    }

    @Test
    public void testNumberLargerThanMaxInt() {
        Calculator2 calculator = new Calculator2();
        calculator.number1 = Integer.MAX_VALUE;
        calculator.number2 = -1;
        calculator.sub();
        assertEquals((long) Integer.MAX_VALUE - (-1), (long) calculator.result);
    }

    @Test
    public void testNumberSmallerThanMinInt() {
        Calculator2 calculator = new Calculator2();
        calculator.number1 = Integer.MIN_VALUE;
        calculator.number2 = 1;
        calculator.sub();
        assertEquals((long) Integer.MIN_VALUE - 1, (long) calculator.result);
    }
}
