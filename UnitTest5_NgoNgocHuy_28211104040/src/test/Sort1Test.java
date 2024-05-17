package test;

import ngongochuy.Sort1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Sort1Test {

    @Test
    public void testNumber1GreaterThanNumber2() {
        Sort1 sort = new Sort1();
        sort.number1 = 5;
        sort.number2 = 3;
        sort.sortAsc();
        assertEquals(3, sort.number1);
        assertEquals(5, sort.number2);
    }

    @Test
    public void testNumber1LessThanNumber2() {
        Sort1 sort = new Sort1();
        sort.number1 = 1;
        sort.number2 = 7;
        sort.sortAsc();
        assertEquals(1, sort.number1);
        assertEquals(7, sort.number2);
    }
}
