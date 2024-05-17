package test;

import ngongochuy.Calculator1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Calculator1Test extends Calculator1 {

    @Test
    public void kiemTraGiaTriKetQua() {
        Calculator1 calculator = new Calculator1();
        int ketQua = calculator.add(3, 4);
        assertEquals(7, ketQua);
    }

    @Test
    public void kiemTraSoLonHonMaxInt() {
        Calculator1 calculator = new Calculator1();
        int maxInt = Integer.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;
        assertEquals(minInt, calculator.add(maxInt, 1));
    }

    @Test
    public void kiemTraSoNhoHonMinInt() {
        Calculator1 calculator = new Calculator1();
        int maxInt = Integer.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;
        assertEquals(maxInt, calculator.add(minInt, -1));
    }
}