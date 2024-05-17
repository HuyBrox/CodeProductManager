package test;

import ngongochuy.Calculator3;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Calculator3Test {

    @Test
    public void kiemTraGiaTriKetQua() {
        Calculator3 calculator = new Calculator3(3, 4);
        int ketQua = calculator.mul();
        assertEquals(12, ketQua);
    }

    @Test
    public void kiemTraSoLonHonMaxInt() {
        // Khởi tạo giá trị lớn hơn Integer.MAX_VALUE
        int number1 = Integer.MAX_VALUE;
        int number2 = 2;
        Calculator3 calculator = new Calculator3(number1, number2);
        long expected = (long) number1 * number2;
        assertEquals(expected, calculator.mul());
    }

    @Test
    public void kiemTraSoNhoHonMinInt() {
        // Khởi tạo giá trị nhỏ hơn Integer.MIN_VALUE
        int number1 = Integer.MIN_VALUE;
        int number2 = 2;
        Calculator3 calculator = new Calculator3(number1, number2);
        long expected = (long) number1 * number2;
        assertEquals(expected, calculator.mul());
    }
}
