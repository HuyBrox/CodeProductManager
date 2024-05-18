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
public class Sort2Test {
    
    @Test
public void testSortDesc_Number1IsGreaterThanNumber2() {
    Sort2 sort = new Sort2();
    sort.setNumber1(13);
    sort.setNumber2(5);
    sort.sortDesc();
    assertEquals(13, sort.getNumber1());
    assertEquals(5, sort.getNumber2());
}

   @Test
public void testSortDesc_Number1IsLessThanNumber2() {
    Sort2 sort = new Sort2();
    sort.setNumber1(6);
    sort.setNumber2(10);
    sort.sortDesc();
    assertEquals(10, sort.getNumber1());
    assertEquals(6, sort.getNumber2());
}
}

