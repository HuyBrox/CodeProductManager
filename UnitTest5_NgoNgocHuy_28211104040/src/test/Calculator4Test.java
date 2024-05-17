package test;

import ngongochuy.Calculator4;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Calculator4Test {

    @Test
    public void kiemTraGiaTriKetQua() {
        Calculator4 calculator = new Calculator4();
        calculator.setNumber1(10);
        calculator.setNumber2(2);
        int ketQua = calculator.div();
        assertEquals(5, ketQua);
    }

    @Test
    public void kiemTraChiaChoKhong() {
        Calculator4 calculator = new Calculator4();
        calculator.setNumber1(10);
        calculator.setNumber2(0);

        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculator.div();
        });

        String expectedMessage = "/ by zero";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void kiemTraKetQuaFloat() {
        Calculator4 calculator = new Calculator4();
        calculator.setNumber1(5);
        calculator.setNumber2(2);
        float ketQua = calculator.div();
        assertEquals(2.5, ketQua, 0.0001);
    }
}
