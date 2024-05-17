package test;
import ngongochuy.Advance7;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

public class Advance7Test {

    @Test
    void testTinhThu() {
        Advance7 advance7 = new Advance7();

        int thuExpect = 1;
        int thuActual = advance7.tinhThu(5, 4, 2020);

        assertEquals(thuExpect, thuActual);
    }
}
