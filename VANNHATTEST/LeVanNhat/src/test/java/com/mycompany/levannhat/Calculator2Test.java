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
public class Calculator2Test {
    @Test
public void testSub_ValidInputs() {
    Calculator2 calculator = new Calculator2();
    calculator.number1 = 5;
    calculator.number2 = 1;
    calculator.sub();
    int result = calculator.result;
    assertEquals(4, result);
}
    @Test
public void testSub_MaxInputs() {
    Calculator2 calculator = new Calculator2();
    calculator.number1 = Integer.MAX_VALUE;
    calculator.number2 = 1;
    calculator.sub();
}
@Test
public void testSub_MinInputs() {
    Calculator2 calculator = new Calculator2();
    calculator.number1 = Integer.MIN_VALUE;
    calculator.number2 = -1;
    calculator.sub();
}
}
