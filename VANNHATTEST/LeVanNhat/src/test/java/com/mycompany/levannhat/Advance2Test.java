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
public class Advance2Test {
    
    public Advance2Test() {
    }

   @Test
public void testSum_PositiveInteger() {
    Advance2 advance = new Advance2();
    assertEquals(24, advance.sum(8934));
}
@Test
public void testSum_NegativeInteger() {
    Advance2 advance = new Advance2();
    assertEquals(27, advance.sum(9567));
}
}


