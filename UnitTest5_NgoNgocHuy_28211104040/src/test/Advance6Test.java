package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ngongochuy.Advance6;

public class Advance6Test {

    @Test
    public void testTinhTuoiForValidDate() {
        Advance6 advance6 = new Advance6();
        assertEquals(25, advance6.tinhTuoi(1, 1, 1997));
    }

    @Test
    public void testTinhTuoiForFutureDate() {
        Advance6 advance6 = new Advance6();
        assertEquals(-1, advance6.tinhTuoi(1, 1, 2050));
    }

    @Test
    void testTinhTuoiForInvalidDate() {
        Advance6 advance6 = new Advance6();
        int expectedAge = -1; // Vì ngày 29/2/2023 không tồn tại
        int actualAge = advance6.tinhTuoi(29, 2, 2023);
        assertEquals(expectedAge, actualAge);
    }
}
