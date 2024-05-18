/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.levannhat;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author levannhat
 */
public class MaxNumber1Test {
    
    public void testMax1_FirstNumberIsMax() {
    MaxNumber1 maxNumber = new MaxNumber1();
    maxNumber.number1 = 6;
    maxNumber.number2 = 2;
    maxNumber.number3 = 1;
    int result = maxNumber.max3();
    assertEquals(6, result);
}
        @Test
public void testMax1_SecondNumberIsMax() {
    MaxNumber1 maxNumber = new MaxNumber1();
    maxNumber.number1 = 7;
    maxNumber.number2 = 3;
    maxNumber.number3 = 4;
    int result = maxNumber.max3();
    assertEquals(7, result);
}
@Test
public void testMax1_ThirdNumberIsMax() {
    MaxNumber1 maxNumber = new MaxNumber1();
    maxNumber.number1 = 9;
    maxNumber.number2 = 4;
    maxNumber.number3 = 5;
    int result = maxNumber.max3();
    assertEquals(9, result);
}
}
