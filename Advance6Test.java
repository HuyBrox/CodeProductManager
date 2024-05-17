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
public class Advance6Test {
    
    public Advance6Test() {
    }

    @Test
public void testTinhTuoiValidInput() {
    Advance6 advance6 = new Advance6();
    int result = advance6.tinhTuoi(1, 1, 2000);
    assertEquals(21, result);

    result = advance6.tinhTuoi(12, 1, 1999);
    assertEquals(21, result);

    result = advance6.tinhTuoi(12, 5, 1999);
    assertEquals(20, result);

    result = advance6.tinhTuoi(1, 1, 2001);
    assertEquals(19, result);

    result = advance6.tinhTuoi(12, 12, 2000);
    assertEquals(20, result);
}
@Test
public void testTinhTuoiInvalidInput() {
    Advance6 advance6 = new Advance6();
    int result = advance6.tinhTuoi(32, 1, 2000);
    assertEquals(-1, result);

    result = advance6.tinhTuoi(1, 13, 2000);
    assertEquals(-1, result);

    result = advance6.tinhTuoi(1, 1, 2022);
    assertEquals(-1, result);

    result = advance6.tinhTuoi(32, 13, 2022);
    assertEquals(-1, result);

    result = advance6.tinhTuoi(32, 13, -2022);
    assertEquals(-1, result);
}
    
}
