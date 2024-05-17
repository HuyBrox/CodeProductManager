package test;

import ngongochuy.Triangle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TriangleTest {

    @Test
    public void testFirstNumberIsMax() {
        Triangle triangle = new Triangle();
        triangle.number1 = 10;
        triangle.number2 = 5;
        triangle.number3 = 7;
        assertEquals(10, triangle.maxLength());
    }

    @Test
    public void testSecondNumberIsMax() {
        Triangle triangle = new Triangle();
        triangle.number1 = 7;
        triangle.number2 = 12;
        triangle.number3 = 9;
        assertEquals(12, triangle.maxLength());
    }

    @Test
    public void testThirdNumberIsMax() {
        Triangle triangle = new Triangle();
        triangle.number1 = 4;
        triangle.number2 = 6;
        triangle.number3 = 15;
        assertEquals(15, triangle.maxLength());
    }
}
