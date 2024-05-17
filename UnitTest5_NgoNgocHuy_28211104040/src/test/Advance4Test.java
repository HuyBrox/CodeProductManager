package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ngongochuy.Advance4;

public class Advance4Test {

    @Test
    public void testIsPrimeNumberForZero() {
        Advance4 advance4 = new Advance4();
        assertFalse(advance4.isPrimeNumber(0));
    }

    @Test
    public void testIsPrimeNumberForOne() {
        Advance4 advance4 = new Advance4();
        assertFalse(advance4.isPrimeNumber(1));
    }

    @Test
    public void testIsPrimeNumberForPrime() {
        Advance4 advance4 = new Advance4();
        assertTrue(advance4.isPrimeNumber(5));
    }

    @Test
    public void testIsPrimeNumberForNonPrime() {
        Advance4 advance4 = new Advance4();
        assertFalse(advance4.isPrimeNumber(10));
    }
}
