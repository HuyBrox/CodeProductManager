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
public class MaxNumber2Test {
    @Test
public void testMax2_FirstNumberIsMax() {
    int number1 = 10;
    int number2 = 5;
    int result = MaxNumber2.max2(number1, number2);
    assertEquals(number1, result);
}
    @Test
public void testMax2_SecondNumberIsMax() {
    int number1 = 5;
    int number2 = 10;
    int result = MaxNumber2.max2(number1, number2);
    assertEquals(number2, result);
}
}
