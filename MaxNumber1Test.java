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
public class MaxNumber1Test {
        MaxNumber1 max;    
    public MaxNumber1Test() {
        max=new MaxNumber1();
    }

    @Test
    public void testFirstNumberIsMax() {
        int number1 = 10;
        int number2 = 5;
        int number3 = 7;
        int Result = 10;
        int actualResult = MaxNumber1.max3(number1, number2, number3);
        assertEquals(Result, actualResult, "fail");
    }
    @Test
    public void testSecondNumberIsMax() {
        int number1 = 5;
        int number2 = 10;
        int number3 = 7;
        int Result = 10;
        int actualResult = MaxNumber1.max3(number1, number2, number3);
        assertEquals(Result, actualResult, "Incorrect result for second number is max");
    }
    @Test
    public void testThirdNumberIsMax() {
        int number1 = 5;
        int number2 = 7;
        int number3 = 10;
        int Result = 10;
        int actualResult = MaxNumber1.max3(number1, number2, number3);
        assertEquals(Result, actualResult, "fail");
}
}
