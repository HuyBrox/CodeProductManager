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
public class Advance5Test {
    
    public Advance5Test() {
    }

    @Test
public void testKiemTraDoiXungPalindrome() {
    Advance5 advance5 = new Advance5();
    boolean result = advance5.kiemTraDoiXung(121);
    assertTrue(result);

    result = advance5.kiemTraDoiXung(1111);
    assertTrue(result);

    result = advance5.kiemTraDoiXung(1221);
    assertTrue(result);

    result = advance5.kiemTraDoiXung(11);
    assertTrue(result);

    result = advance5.kiemTraDoiXung(1);
    assertTrue(result);
}
@Test
public void testKiemTraDoiXungNonPalindrome() {
    Advance5 advance5 = new Advance5();
    boolean result = advance5.kiemTraDoiXung(123);
    assertFalse(result);

    result = advance5.kiemTraDoiXung(1243);
    assertFalse(result);

    result = advance5.kiemTraDoiXung(1254);
    assertFalse(result);

    result = advance5.kiemTraDoiXung(12345);
    assertFalse(result);

    result = advance5.kiemTraDoiXung(123456);
    assertFalse(result);
}
    
}
