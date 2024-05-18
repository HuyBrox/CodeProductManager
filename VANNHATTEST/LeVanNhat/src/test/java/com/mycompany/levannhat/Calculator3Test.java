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
public class Calculator3Test {
    
    @Test
public void testMul_ValidInputs() {
    Calculator3 calculator = new Calculator3(2, 4);
    int result = calculator.mul();
    assertEquals(8, result);
}
@Test
public void testMul_MaxInputs() {
    Calculator3 calculator = new Calculator3(Integer.MAX_VALUE, 2);
    calculator.mul();
}
@Test
public void testMul_MinInputs() {
    Calculator3 calculator = new Calculator3(Integer.MIN_VALUE, -2);
    calculator.mul();
}
}

