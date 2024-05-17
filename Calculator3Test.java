/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package nguyenphuocyen;

import nguyenphuocyen.Calculator3;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author PC
 */
public class Calculator3Test {
    Calculator3 cal2;
    
    public Calculator3Test() {
        cal2= new Calculator3();
    }
    

    @Test
    public void testMultiplyResultValue() {
        cal2= new Calculator3(6, 9);
        int expectedResult=54;
        int actualResult=cal2.mul();
        assertEquals(expectedResult,actualResult,"fail");
        
    }
    @Test
    public void testMultiplyNumberLargerThanMaxInt() {
        cal2= new Calculator3(Integer.MAX_VALUE, 2);
        long expectedLongResult = (long) Integer.MAX_VALUE * 2;
        int expectedResult = (int) expectedLongResult;
        int actualResult = cal2.mul();
        assertEquals(expectedResult, actualResult, "fail");
    }
      @Test
    public void testMultiplyNumberSmallerThanMinInt() {
        cal2 = new Calculator3(Integer.MIN_VALUE, -2);
        long expectedLongResult = (long) Integer.MIN_VALUE * -2;
        int expectedResult = (int) expectedLongResult;
        int actualResult = cal2.mul();
        assertEquals(expectedResult, actualResult, "");
    }
    
}
