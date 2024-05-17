/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author huytr
 */
public class TestCong {
    
    private MyFrame myFrame;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JLabel ketQua;

    @Before
    public void setUp() {
        myFrame = new MyFrame();
        jTextField1 = new JTextField();
        jTextField2 = new JTextField();
        ketQua = new JLabel();
        myFrame.jTextField1 = jTextField1;
        myFrame.jTextField2 = jTextField2;
        myFrame.ketQua = ketQua;
    }

    @Test
    public void testValidInput() {
        jTextField1.setText("5");
        jTextField2.setText("3");
        myFrame.jButton1ActionPerformed(null);
        assertEquals("8.0", ketQua.getText());
        assertEquals(Color.BLACK, ketQua.getForeground());
    }

    @Test
    public void testValidRealNumberInput() {
        jTextField1.setText("2.5");
        jTextField2.setText("4.5");
        myFrame.jButton1ActionPerformed(null);
        assertEquals("7.0", ketQua.getText());
        assertEquals(Color.BLACK, ketQua.getForeground());
    }

    @Test
    public void testInvalidInputNonNumeric() {
        jTextField1.setText("abc");
        jTextField2.setText("2");
        myFrame.jButton1ActionPerformed(null);
        assertEquals("Nhập sai! ", ketQua.getText());
        assertEquals(Color.RED, ketQua.getForeground());
    }

    @Test
    public void testBothInputsNonNumeric() {
        jTextField1.setText("abc");
        jTextField2.setText("xyz");
        myFrame.jButton1ActionPerformed(null);
        assertEquals("Nhập sai! ", ketQua.getText());
        assertEquals(Color.RED, ketQua.getForeground());
    }

    @Test
    public void testEmptyInput() {
        jTextField1.setText("");
        jTextField2.setText("5");
        myFrame.jButton1ActionPerformed(null);
        assertEquals("Nhập sai! ", ketQua.getText());
        assertEquals(Color.RED, ketQua.getForeground());
    }

    @Test
    public void testWhitespaceInput() {
        jTextField1.setText(" ");
        jTextField2.setText("5");
        myFrame.jButton1ActionPerformed(null);
        assertEquals("Nhập sai! ", ketQua.getText());
        assertEquals(Color.RED, ketQua.getForeground());
    }

    @Test
    public void testNegativeInput() {
        jTextField1.setText("-3");
        jTextField2.setText("2");
        myFrame.jButton1ActionPerformed(null);
        assertEquals("-1.0", ketQua.getText());
        assertEquals(Color.BLACK, ketQua.getForeground());
    }

    @Test
    public void testBothNegativeInputs() {
        jTextField1.setText("-2");
        jTextField2.setText("-4");
        myFrame.jButton1ActionPerformed(null);
        assertEquals("-6.0", ketQua.getText());
        assertEquals(Color.BLACK, ketQua.getForeground());
    }

    @Test
    public void testZeroInput() {
        jTextField1.setText("0");
        jTextField2.setText("5");
        myFrame.jButton1ActionPerformed(null);
        assertEquals("5.0", ketQua.getText());
        assertEquals(Color.BLACK, ketQua.getForeground());
    }

    @Test
    public void testBothZeroInputs() {
        jTextField1.setText("0");
        jTextField2.setText("0");
        myFrame.jButton1ActionPerformed(null);
        assertEquals("0.0", ketQua.getText());
        assertEquals(Color.BLACK, ketQua.getForeground());
    }
    
}
