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
public class Advance1Test {
    
 @Test
public void testUSCLN_PositiveIntegers() {
    Advance1 advance = new Advance1();
    assertEquals(4, advance.USCLN(20, 28));
}

@Test
public void testUSCLN_NegativeIntegers() {
    Advance1 advance = new Advance1();
    assertEquals(5, advance.USCLN(-15, -25));
}

@Test
public void testUSCLN_OnePositiveOneNegative() {
    Advance1 advance = new Advance1();
    assertEquals(7, advance.USCLN(-14, 21));
}
}
