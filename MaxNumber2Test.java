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
public class MaxNumber2Test {
    MaxNumber2 max;
    
    public MaxNumber2Test() {
        max=new MaxNumber2();
    }

    @Test
    public void testFirstNumberIsMax() {
        int number1=10;
        int number2=5;
        int Result=10;
        int actualResult=max.max2(number1, number2);
        assertEquals(Result,actualResult,"fail");
    }
    @Test
    public void testSecondNumberIsMax() {
        int number1 = 5;
        int number2 = 10;
        int Result = 10;
        int actualResult = max.max2(number1, number2);
        assertEquals(Result,actualResult,"fail");
}
}
