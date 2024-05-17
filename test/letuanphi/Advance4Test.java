/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package letuanphi;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author KHOA PC
 */
public class Advance4Test {
    
    public Advance4Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
public void testIsPrimeNumber_PrimeNumber() {
    Advance4 advance = new Advance4();
    assertTrue(advance.isPrimeNumber(7));
}
    @Test
public void testIsPrimeNumber_NonPrimeNumber() {
    Advance4 advance = new Advance4();
    assertFalse(advance.isPrimeNumber(15));
}
@Test
public void testIsPrimeNumber_NegativeNumber() {
    Advance4 advance = new Advance4();
    assertFalse(advance.isPrimeNumber(-5));
}
}
