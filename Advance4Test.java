/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package nguyenphuocyen;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author PC
 */
public class Advance4Test {
    
    public Advance4Test() {
    }

   @Test
public void testIsPrimeNumberLessThan2() {
    Advance4 advance4 = new Advance4();
    boolean result = advance4.isPrimeNumber(1);
    assertFalse(result);
}
@Test
public void testIsPrimeNumberGreaterThanOrEqual2() {
    Advance4 advance4 = new Advance4();
    boolean result = advance4.isPrimeNumber(2);
    assertTrue(result);

    result = advance4.isPrimeNumber(3);
    assertTrue(result);

    result = advance4.isPrimeNumber(5);
    assertTrue(result);

    result = advance4.isPrimeNumber(7);
    assertTrue(result);

    result = advance4.isPrimeNumber(11);
    assertTrue(result);

    result = advance4.isPrimeNumber(13);
    assertTrue(result);

    result = advance4.isPrimeNumber(17);
    assertTrue(result);

    result = advance4.isPrimeNumber(19);
    assertTrue(result);
}
    @Test
public void testIsPrimeNumberComposite() {
    Advance4 advance4 = new Advance4();
    boolean result = advance4.isPrimeNumber(4);
    assertFalse(result);

    result = advance4.isPrimeNumber(6);
    assertFalse(result);

    result = advance4.isPrimeNumber(8);
    assertFalse(result);

    result = advance4.isPrimeNumber(9);
    assertFalse(result);

    result = advance4.isPrimeNumber(10);
    assertFalse(result);

    result = advance4.isPrimeNumber(12);
    assertFalse(result);

    result = advance4.isPrimeNumber(14);
    assertFalse(result);

    result = advance4.isPrimeNumber(15);
    assertFalse(result);

    result = advance4.isPrimeNumber(16);
    assertFalse(result);

    result = advance4.isPrimeNumber(18);
    assertFalse(result);

    result = advance4.isPrimeNumber(20);
    assertFalse(result);
}
}
