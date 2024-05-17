/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package nguyenphuocyen;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author PC
 */
public class Sort1Test {
    Sort1 s;
        
    
    public Sort1Test() {
        s= new Sort1();
       
    }

    
    
@Test
public void testSortAscNumber1GreaterThanNumber2() {
    s.setNumber1(5);
    s.setNumber2(2);
    s.sortAsc();
    assertEquals(2, s.getNumber1());
    assertEquals(5, s.getNumber2());
}
@Test
public void testSortAscNumber1LessThanNumber2() {
    s.setNumber1(2);
    s.setNumber2(5);
    s.sortAsc();
    assertEquals(2, s.getNumber1());
    assertEquals(5, s.getNumber2());
}
}
