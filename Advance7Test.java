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
public class Advance7Test {
    
    public Advance7Test() {
    }

    @Test
public void testTinhThuValidInput() {
    Advance7 advance7 = new Advance7();
    int result = advance7.tinhThu(5, 4, 2020);
    assertEquals(1, result);

    result = advance7.tinhThu(6, 4, 2020);
    assertEquals(2, result);

    result = advance7.tinhThu(7, 4, 2020);
    assertEquals(3, result);

    result = advance7.tinhThu(8, 4, 2020);
    assertEquals(4, result);

    result = advance7.tinhThu(9, 4, 2020);
    assertEquals(5, result);

    result = advance7.tinhThu(10, 4, 2020);
    assertEquals(6, result);

    result = advance7.tinhThu(11, 4, 2020);
    assertEquals(7, result);
}
@Test
public void testTinhThuInvalidInput() {
    Advance7 advance7 = new Advance7();
    int result = advance7.tinhThu(0, 1, 2020);
    assertEquals(0, result);

    result = advance7.tinhThu(32, 1, 2020);
    assertEquals(0, result);

    result = advance7.tinhThu(32, 13, 2020);
    assertEquals(0, result);

    result = advance7.tinhThu(32, 13, -2020);
    assertEquals(0, result);

    result = advance7.tinhThu(31, 2, 2020);
    assertEquals(0, result);

    result = advance7.tinhThu(30, 2, 2019);
    assertEquals(0, result);

    result = advance7.tinhThu(29, 2, 2018);
    assertEquals(0, result);
}
    
}
