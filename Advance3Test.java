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
public class Advance3Test {
    
    public Advance3Test() {
    }

   @Test
public void testFibonacciNonNegativeLessThan2() {
    Advance3 advance3 = new Advance3();
    int result = advance3.fibonacci(0);
    assertEquals(0, result);

    result = advance3.fibonacci(1);
    assertEquals(1, result);
}
@Test
public void testFibonacciPositiveGreaterThan1() {
    Advance3 advance3 = new Advance3();
    int result = advance3.fibonacci(2);
    assertEquals(1, result);

    result = advance3.fibonacci(3);
    assertEquals(2, result);

    result = advance3.fibonacci(4);
    assertEquals(3, result);

    result = advance3.fibonacci(5);
    assertEquals(5, result);

    result = advance3.fibonacci(6);
    assertEquals(8, result);

    result = advance3.fibonacci(7);
    assertEquals(13, result);

    result = advance3.fibonacci(8);
    assertEquals(21, result);

    result = advance3.fibonacci(9);
    assertEquals(34, result);
}
@Test
public void testFibonacciNegative() {
    Advance3 advance3 = new Advance3();
    int result = advance3.fibonacci(-1);
    assertEquals(-1, result);

    result = advance3.fibonacci(-5);
    assertEquals(-1, result);
}
    
}
