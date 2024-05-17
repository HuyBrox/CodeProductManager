package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ngongochuy.Advance3;

public class Advance3Test {

    @Test
    public void testFibonacciForZero() {
        Advance3 advance3 = new Advance3();
        assertEquals(0, advance3.fibonacci(0));
    }

    @Test
    public void testFibonacciForOne() {
        Advance3 advance3 = new Advance3();
        assertEquals(1, advance3.fibonacci(1));
    }

    @Test
    public void testFibonacciForPositiveNumber() {
        Advance3 advance3 = new Advance3();
        assertEquals(5, advance3.fibonacci(5));
    }

    @Test
    public void testFibonacciForNegativeNumber() {
        Advance3 advance3 = new Advance3();
        assertEquals(-1, advance3.fibonacci(-5));
    }
}
