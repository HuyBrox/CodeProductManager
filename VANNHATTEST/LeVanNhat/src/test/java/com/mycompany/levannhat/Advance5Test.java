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
public class Advance5Test {

    @Test
    public void testKiemTraDoiXung_PalindromeNumber() {
        Advance5 advance = new Advance5();
        assertTrue(advance.kiemTraDoiXung(12321));
    }

    @Test
    public void testKiemTraDoiXung_NonPalindromeNumber() {
        Advance5 advance = new Advance5();
        assertFalse(advance.kiemTraDoiXung(12345));
    }

    @Test
    public void testKiemTraDoiXung_Zero() {
        Advance5 advance = new Advance5();
        assertTrue(advance.kiemTraDoiXung(0));
    }
}
