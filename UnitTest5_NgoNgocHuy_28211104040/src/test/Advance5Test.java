package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ngongochuy.Advance5;

public class Advance5Test {

    @Test
    public void testKiemTraDoiXungForPalindromeNumber() {
        Advance5 advance5 = new Advance5();
        assertTrue(advance5.kiemTraDoiXung(12321));
    }

    @Test
    public void testKiemTraDoiXungForNonPalindromeNumber() {
        Advance5 advance5 = new Advance5();
        assertFalse(advance5.kiemTraDoiXung(12345));
    }

    @Test
    public void testKiemTraDoiXungForSingleDigitNumber() {
        Advance5 advance5 = new Advance5();
        assertTrue(advance5.kiemTraDoiXung(1));
    }

    @Test
    public void testKiemTraDoiXungForNegativeNumber() {
        Advance5 advance5 = new Advance5();
        assertFalse(advance5.kiemTraDoiXung(-121));
    }
}
