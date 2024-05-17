/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package nguyenphuocyen;

import nguyenphuocyen.Calculator2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author PC
 */
public class Calculator2Test {
    Calculator2 cal1;
    
    public Calculator2Test() {
        cal1=new Calculator2();
    }

    @Test
    public void testSomeMethod() {
        cal1.number1=10;
        cal1.number2=3;
        cal1.sub();
        int Result=7;
        assertEquals(Result,cal1.result,"fail");
        
        
    }
    @Test
    public void testSubtractNumberLargerThanMaxInt() {
        cal1.number1 = Integer.MAX_VALUE;
        cal1.number2 = 2;
        cal1.sub();
        int Result = Integer.MAX_VALUE - 2;
       assertEquals(Result,cal1.result,"fail");
    }
    @Test
    public void testSubtractNumberSmallerThanMinInt() {
        cal1.number1 = Integer.MIN_VALUE;
        cal1.number2 = -2;
        cal1.sub();
        int Result = Integer.MIN_VALUE + 2;
        assertEquals(Result,cal1.result,"fail");
    }

    

    
}
