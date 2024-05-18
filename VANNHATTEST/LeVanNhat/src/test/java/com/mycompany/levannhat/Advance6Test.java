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
public class Advance6Test {

    @Test
    public void testTinhTuoi_ValidDate() {
        Advance6 advance = new Advance6();
        int age = advance.tinhTuoi(8, 5, 2004);
        assertEquals(20, age);
    }

    @Test
    public void testTinhTuoi_NegativeYear() {
        Advance6 advance = new Advance6();
        int age = advance.tinhTuoi(30, 11, 2004);
        assertEquals(19, age);
    }
}
