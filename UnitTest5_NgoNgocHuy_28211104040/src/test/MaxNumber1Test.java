package test;

import ngongochuy.MaxNumber1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MaxNumber1Test {

    @Test
    public void testFirstNumberIsMax() {
        MaxNumber1 maxNumber = new MaxNumber1();
        maxNumber.setNumber1(10);
        maxNumber.setNumber2(5);
        maxNumber.setNumber3(3);
        int result = maxNumber.max3();
        assertEquals(10, result);
    }

    @Test
    public void testSecondNumberIsMax() {
        MaxNumber1 maxNumber = new MaxNumber1();
        maxNumber.setNumber1(3);
        maxNumber.setNumber2(10);
        maxNumber.setNumber3(5);
        int result = maxNumber.max3();
        assertEquals(10, result);
    }

    @Test
    public void testThirdNumberIsMax() {
        MaxNumber1 maxNumber = new MaxNumber1();
        maxNumber.setNumber1(3);
        maxNumber.setNumber2(5);
        maxNumber.setNumber3(10);
        int result = maxNumber.max3();
        assertEquals(10, result);
    }
}
