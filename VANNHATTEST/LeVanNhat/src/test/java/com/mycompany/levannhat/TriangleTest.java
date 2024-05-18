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
public class TriangleTest {
    
    @Test
public void testMaxLength_FirstNumberIsMax() {
    Triangle triangle = new Triangle(22, 7, 3);
    assertEquals(22, triangle.maxLength());
}
 @Test
public void testMaxLength_SecondNumberIsMax() {
    Triangle triangle = new Triangle(7, 11, 3);
    assertEquals(11, triangle.maxLength());
}
    @Test
public void testMaxLength_ThirdNumberIsMax() {
    Triangle triangle = new Triangle(90, 58, 0);
    assertEquals(90, triangle.maxLength());
}
}

