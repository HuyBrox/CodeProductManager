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
public class SolveEquationTest {
    SolveEquation slv;
    
    public SolveEquationTest() {
        slv= new SolveEquation();
    }

    @Test
public void testMultiRoots() {
    slv.number1=0;
    slv.number2=0;
    String Result = "Multi roots";
    String actualResult = slv.linearEquation();
    assertEquals(Result, actualResult, "fail");
}
    @Test
    public void testNoRoot() {
        slv.number1 = 0;
        slv.number2 = 5;
        String Result = "No root";
        String actualResult = slv.linearEquation();
        assertEquals(Result, actualResult, "fail");
}
    @Test
    public void testOneRoot() {
        slv.number1 = 2;
        slv.number2 = 7;
        String Result = "One root";
        String actualResult = slv.linearEquation();
        assertEquals(Result, actualResult, "");
    }
}
