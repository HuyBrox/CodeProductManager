package thuchanh1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class FormChiaTest {
    private FormChia formChia;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JLabel ketQua;

    @BeforeEach
    public void setUp() {
        formChia = new FormChia();
        jTextField1 = formChia.jTextField1;
        jTextField2 = formChia.jTextField2;
        ketQua = formChia.ketQua;
    }

    @Test
    public void kiemTraInputHopLe() {
        jTextField1.setText("6");
        jTextField2.setText("3");
        formChia.jButton1ActionPerformed(null);
        assertEquals("2.0", ketQua.getText());

    }

    @Test
    public void kiemTraInputSoThucHopLe() {
        jTextField1.setText("4.5");
        jTextField2.setText("1.5");
        formChia.jButton1ActionPerformed(null);
        assertEquals("3.0", ketQua.getText());

    }

    @Test
    public void kiemTraInputKhongHopLe() {
        jTextField1.setText("abc");
        jTextField2.setText("2");
        formChia.jButton1ActionPerformed(null);
        assertEquals("Nhập sai! ", ketQua.getText());
        assertEquals(Color.RED, ketQua.getForeground());
    }

    @Test
    public void kiemTraInputCaHaiKhongHopLe() {
        jTextField1.setText("abc");
        jTextField2.setText("xyz");
        formChia.jButton1ActionPerformed(null);
        assertEquals("Nhập sai! ", ketQua.getText());
        assertEquals(Color.RED, ketQua.getForeground());
    }

    @Test
    public void kiemTraInputRong() {
        jTextField1.setText("");
        jTextField2.setText("5");
        formChia.jButton1ActionPerformed(null);
        assertEquals("Nhập sai! ", ketQua.getText());
        assertEquals(Color.RED, ketQua.getForeground());
    }

    @Test
    public void kiemTraInputChuaKhoangTrang() {
        jTextField1.setText(" ");
        jTextField2.setText("5");
        formChia.jButton1ActionPerformed(null);
        assertEquals("Nhập sai! ", ketQua.getText());
        assertEquals(Color.RED, ketQua.getForeground());
    }

    @Test
    public void kiemTraInputAm() {
        jTextField1.setText("-6");
        jTextField2.setText("2");
        formChia.jButton1ActionPerformed(null);
        assertEquals("-3.0", ketQua.getText());
    }

    @Test
    public void kiemTraInputAmCaHai() {
        jTextField1.setText("-6");
        jTextField2.setText("-2");
        formChia.jButton1ActionPerformed(null);
        assertEquals("3.0", ketQua.getText());

    }

    @Test
    public void kiemTraInputKhongHopLe1() {
        jTextField1.setText("0");
        jTextField2.setText("5");
        formChia.jButton1ActionPerformed(null);
        assertEquals("0.0", ketQua.getText());

    }

}
