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
public class Sort1Test {
    
    @Test
public void testSortAsc_Number1IsGreaterThanNumber2() {
    Sort1 sort = new Sort1();
    sort.number1 = 4;
    sort.number2 = 2;
    sort.sortAsc();
    assertEquals(2, sort.number1);
    assertEquals(4, sort.number2);
}
    @Test
public void testSortAsc_Number1IsLessThanNumber2() {
    Sort1 sort = new Sort1();
    sort.number1 = 2;
    sort.number2 = 20;
    sort.sortAsc();
    assertEquals(2, sort.number1);
    assertEquals(20, sort.number2);
}
}

