package thuchanh1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class FormCongTest {
    private FormCong formCong;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JLabel ketQua;

    @BeforeEach
    public void setUp() {
        formCong = new FormCong();
        jTextField1 = formCong.jTextField1;
        jTextField2 = formCong.jTextField2;
        ketQua = formCong.ketQua;
    }

    @Test
    public void kiemTraInputHopLe() {
        jTextField1.setText("5");
        jTextField2.setText("3");
        formCong.jButton1ActionPerformed(null);
        assertEquals("8.0", ketQua.getText());
        // Không cần kiểm tra màu sắc ở đây vì kết quả là đúng
    }

    @Test
    public void kiemTraInputSoThucHopLe() {
        jTextField1.setText("2.5");
        jTextField2.setText("4.5");
        formCong.jButton1ActionPerformed(null);
        assertEquals("7.0", ketQua.getText());

    }

    @Test
    public void kiemTraInputKhongHopLe() {
        jTextField1.setText("abc");
        jTextField2.setText("2");
        formCong.jButton1ActionPerformed(null);
        assertEquals("Nhập sai! ", ketQua.getText());
        assertEquals(Color.RED, ketQua.getForeground());
    }

    @Test
    public void kiemTraInputCaHaiKhongHopLe() {
        jTextField1.setText("abc");
        jTextField2.setText("xyz");
        formCong.jButton1ActionPerformed(null);
        assertEquals("Nhập sai! ", ketQua.getText());
        assertEquals(Color.RED, ketQua.getForeground());
    }

    @Test
    public void kiemTraInputRong() {
        jTextField1.setText("");
        jTextField2.setText("5");
        formCong.jButton1ActionPerformed(null);
        assertEquals("Nhập sai! ", ketQua.getText());
        assertEquals(Color.RED, ketQua.getForeground());
    }

    @Test
    public void kiemTraInputChuaKhoangTrang() {
        jTextField1.setText(" ");
        jTextField2.setText("5");
        formCong.jButton1ActionPerformed(null);
        assertEquals("Nhập sai! ", ketQua.getText());
        assertEquals(Color.RED, ketQua.getForeground());
    }

    @Test
    public void kiemTraInputAm() {
        jTextField1.setText("-3");
        jTextField2.setText("2");
        formCong.jButton1ActionPerformed(null);
        assertEquals("-1.0", ketQua.getText());

    }

    @Test
    public void kiemTraInputAmCaHai() {
        jTextField1.setText("-2");
        jTextField2.setText("-4");
        formCong.jButton1ActionPerformed(null);
        assertEquals("-6.0", ketQua.getText());

    }

    @Test
    public void kiemTraInputKhongHopLe1() {
        jTextField1.setText("0");
        jTextField2.setText("5");
        formCong.jButton1ActionPerformed(null);
        assertEquals("5.0", ketQua.getText());

    }

    @Test
    public void kiemTraInputKhongHopLe2() {
        jTextField1.setText("0");
        jTextField2.setText("0");
        formCong.jButton1ActionPerformed(null);
        assertEquals("0.0", ketQua.getText());
    }
}
