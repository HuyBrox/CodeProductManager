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
public class Calculator4Test {

    public Calculator4Test() {
    }

    @Test
    public void testDiv_ValidInputs() {
        Calculator4 calculator = new Calculator4();
        calculator.setNumber1(8);
        calculator.setNumber2(2);
        int result = calculator.div();
        assertEquals(4, result);
    }

    @Test
    public void testDiv_DivisionByZero() {
        Calculator4 calculator = new Calculator4();
        calculator.setNumber1(0);
        calculator.setNumber2(5);
        calculator.div();
        assertEquals(0,  calculator.div());
    }

    @Test
    public void testDiv_ReturnFloatType() {
        Calculator4 calculator = new Calculator4();
        calculator.setNumber1(5);
        calculator.setNumber2(2);

    }
}
