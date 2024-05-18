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
public class Advance3Test {

    @Test
    public void testFibonacci_NonNegativeInteger() {
        Advance3 advance = new Advance3();
        assertEquals(2, advance.fibonacci(3));
    }

    @Test
    public void testFibonacci_Zero() {
        Advance3 advance = new Advance3();
        assertEquals(0, advance.fibonacci(0));
    }

    @Test
    public void testFibonacci_Ze() {
        Advance3 advance = new Advance3();
        assertEquals(1, advance.fibonacci(2));
    }
}
