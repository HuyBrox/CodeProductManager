/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package nguyenphuocyen;

import nguyenphuocyen.Calculator4;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author PC
 */
public class Calculator4Test {
    Calculator4 cal;
    
    
    public Calculator4Test() {
        cal= new Calculator4();
        
    }

    @Test
    public void testDivideResultValue() {
       cal.setNumber1(15);
       cal.setNumber2(5);
       int Result=3;
       int actualResult=cal.div();
       assertEquals(Result,actualResult,"fail");
    }
    @Test
    public void testDivideByZero() {
        cal.setNumber1(3);
        cal.setNumber2(0);
        ArithmeticException assertThrows = assertThrows(ArithmeticException.class, cal::div, "error");
        
        
    }

    @Test
    public void testDivideFloatingPointResult() {
        cal.setNumber1(5);
        cal.setNumber2(2);
        double Result = 2.5;
        double actualResult = cal.div();
        assertEquals(Result, actualResult, 0.0001, "fail");
    }
    }

    
    
