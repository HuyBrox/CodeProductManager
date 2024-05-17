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
public class Advance1Test {
    Advance1 a;
    
    public Advance1Test() {
        a=new Advance1();
    }

   @Test
public void testUSCLNPositiveIntegers() {
    int result = a.USCLN(12, 18);
    assertEquals(6, result);
   
}
@Test
public void testUSCLNNegativeIntegers() {
    int result = a.USCLN(-12, -18);
    assertEquals(6, result);
}
@Test
public void testBSCNNPositiveIntegers() {
    int result = a.BSCNN(12, 18);
    assertEquals(36, result);
}
@Test
public void testBSCNNNegativeIntegers() {
    int result = a.BSCNN(-12, -18);
    assertEquals(36, result);
}
    
}
