/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package nhat;

import com.mycompany.levannhat.Calculator1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author levannhat
 */
public class Calculator1Test {
    
    public Calculator1Test() {
    }
    @Test
public void testAdd_ValidInputs() {
    Calculator1 calculator = new Calculator1();
    int result = calculator.add(2, 3);
    assertEquals(5, result);
}
@Test
public void testAdd_MaxInputs() {
    Calculator1 calculator = new Calculator1();
    int minValue = Integer.MAX_VALUE;
    calculator.add(minValue, 3);
}
   @Test
public void testAdd_MinInputs() {
    Calculator1 calculator = new Calculator1();
    int minValue = Integer.MIN_VALUE;
    calculator.add(minValue, -1);
} 
}
