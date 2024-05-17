/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package nguyenphuocyen;

import nguyenphuocyen.Calculator1;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author PC
 */
public class Calculator1Test {
  Calculator1 cal;
    
    public Calculator1Test() {
        cal= new Calculator1();
    }

    @Test
    public void testAdd() {
        int rs= cal.add(6, 7);
        int expected= 13;
        assertEquals(expected,rs);
        
    }
    @Test
    public void testAddOverflow() {
        int number1=Integer.MAX_VALUE;
        int number2=3;
        int rs1=cal.add(number1, number2);
        int expected1=Integer.MIN_VALUE;
        assertEquals(expected1,rs1);
        }

    @Test
    public void testAddUnderflow() {
        int num1 = Integer.MIN_VALUE;
        int num2 = -1;
        int rs2=cal.add(num1, num2);
        int expected2=Integer.MAX_VALUE;
        assertEquals(expected2,rs2);
    }
}


   
