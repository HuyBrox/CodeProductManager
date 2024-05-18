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
public class SolveEquationTest {
    @Test
public void testMultiRoots() {
    SolveEquation equation = new SolveEquation(0, 0);
    String result = equation.linearEquation();
    assertEquals("Multi roots", result);
}
@Test
public void testNoRoot() {
    SolveEquation equation = new SolveEquation(0, 1);
    String result = equation.linearEquation();
    assertEquals("No root", result);
}

    /**
     *
     */
    @Test
public void testOneRoot() {
    SolveEquation equation = new SolveEquation(1, 2);
    String result = equation.linearEquation();
    assertEquals("One root", result);
}
}

