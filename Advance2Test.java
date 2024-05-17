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
public class Advance2Test {
    Advance2 a;
    
    public Advance2Test() {
        a= new Advance2();
    }
    

    @Test
public void testSumPositiveInteger() {
    int result = a.sum(5765);
    assertEquals(23, result);
}   
@Test
public void testSumZero() {
    int result = a.sum(0);
    assertEquals(0, result);
}
@Test
public void testSumLargeInteger() {
    int result = a.sum(12345678901234L);
    assertEquals(45, result);
}
}
    

