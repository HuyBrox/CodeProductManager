package test;

import ngongochuy.Sort2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Sort2Test {

    @Test
    public void testNumber1GreaterThanNumber2() {
        Sort2.number1 = 5;
        Sort2.number2 = 3;
        Sort2.sortDesc();
        assertEquals(5, Sort2.number1);
        assertEquals(3, Sort2.number2);
    }

    @Test
    public void testNumber1LessThanNumber2() {
        Sort2.number1 = 1;
        Sort2.number2 = 7;
        Sort2.sortDesc();
        assertEquals(7, Sort2.number1);
        assertEquals(1, Sort2.number2);
    }
}
