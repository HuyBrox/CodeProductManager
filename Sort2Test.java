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
public class Sort2Test {
    
    public Sort2Test() {
    }

    @Test
    
public void testSortDescNumber1GreaterThanNumber2() {
    Sort2 sort2 = new Sort2(5, 2);
    sort2.sortDesc();
    assertEquals(5, sort2.number1);
    assertEquals(2, sort2.number2);
}
@Test
public void testSortDescNumber1LessThanNumber2() {
    Sort2 sort2 = new Sort2(2, 5);
    sort2.sortDesc();
    assertEquals(5, sort2.number1);
    assertEquals(2, sort2.number2);
}
    }
    
    

