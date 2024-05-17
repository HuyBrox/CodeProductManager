package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ngongochuy.Advance1;

public class Advance1Test {

    @Test
    public void testUSCLN() {
        Advance1 advance1 = new Advance1();

        // Test case 1: a > b
        assertEquals(3, advance1.USCLN(15, 12));

        // Test case 2: a < b
        assertEquals(5, advance1.USCLN(25, 35));

        // Test case 3: a = b
        assertEquals(7, advance1.USCLN(7, 7));
    }

    @Test
    public void testBSCNN() {
        Advance1 advance1 = new Advance1();

        // Test case 1: a > b
        assertEquals(60, advance1.BSCNN(12, 15));

        // Test case 2: a < b
        assertEquals(70, advance1.BSCNN(14, 35));

        // Test case 3: a = b
        assertEquals(7, advance1.BSCNN(7, 7));
    }
}
