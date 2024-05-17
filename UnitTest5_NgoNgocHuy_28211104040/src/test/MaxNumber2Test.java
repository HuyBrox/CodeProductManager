package test;

import ngongochuy.MaxNumber2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MaxNumber2Test {

    @Test
    public void testFirstNumberIsMax() {
        MaxNumber2 maxNumber = new MaxNumber2(10, 5);
        int result = maxNumber.max2();
        assertEquals(10, result);
    }

    @Test
    public void testSecondNumberIsMax() {
        MaxNumber2 maxNumber = new MaxNumber2(3, 10);
        int result = maxNumber.max2();
        assertEquals(10, result);
    }
}
