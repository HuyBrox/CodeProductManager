package test;

import ngongochuy.SolveEquation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolveEquationTest {

    @Test
    public void testMultiRoots() {
        SolveEquation solver = new SolveEquation();
        String result = solver.linearEquation(0, 0);
        assertEquals("Multi roots", result);
    }

    @Test
    public void testNoRoot() {
        SolveEquation solver = new SolveEquation();
        String result = solver.linearEquation(0, 1);
        assertEquals("No root", result);
    }

    @Test
    public void testOneRoot() {
        SolveEquation solver = new SolveEquation();
        String result = solver.linearEquation(1, 1);
        assertEquals("One root", result);
    }
}
