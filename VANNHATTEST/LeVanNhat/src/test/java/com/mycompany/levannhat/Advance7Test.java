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
public class Advance7Test {

    @Test
    public void testTinhThu_ValidDate() {
        Advance7 advance = new Advance7();
        int dayOfWeek = advance.tinhThu(5, 4, 2020);
        assertEquals(1, dayOfWeek);
    }

    @Test
    public void testTinhThu_NegativeYear() {
        Advance7 advance = new Advance7();
        int dayOfWeek = advance.tinhThu(8, 5, 2004);
        assertEquals(6, dayOfWeek);
    }
}
