package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ngongochuy.Advance2;

public class Advance2Test {

    @Test
    public void testSumSingleDigitNumber() {
        Advance2 advance2 = new Advance2();
        assertEquals(5, advance2.sum(5));
    }

    @Test
    public void testSumMultipleDigitNumber() {
        Advance2 advance2 = new Advance2();
        assertEquals(23, advance2.sum(5765));
    }

    @Test
    public void testSumNumberWithAllDigitsZero() {
        Advance2 advance2 = new Advance2();
        assertEquals(0, advance2.sum(0));
    }

    @Test
    public void testSumLargeNumber() {
        Advance2 advance2 = new Advance2();
        assertEquals(45, advance2.sum(123456789));
    }
}
