package thuchanh1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class FormNhanTest {
    private FormNhan1 formNhan;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JLabel ketQua;

    @BeforeEach
    public void setUp() {
        formNhan = new FormNhan1();
        jTextField1 = formNhan.jTextField1;
        jTextField2 = formNhan.jTextField2;
        ketQua = formNhan.ketQua;
    }

    @Test
    public void kiemTraInputHopLe() {
        jTextField1.setText("5");
        jTextField2.setText("3");
        formNhan.jButton1ActionPerformed(null);
        assertEquals("15.0", ketQua.getText());
        // Không cần kiểm tra màu sắc ở đây vì kết quả là đúng
    }

    @Test
    public void kiemTraInputSoThucHopLe() {
        jTextField1.setText("2.5");
        jTextField2.setText("4.5");
        formNhan.jButton1ActionPerformed(null);
        assertEquals("11.25", ketQua.getText());
        // Không cần kiểm tra màu sắc ở đây vì kết quả là đúng
    }

    @Test
    public void kiemTraInputKhongHopLe() {
        jTextField1.setText("abc");
        jTextField2.setText("2");
        formNhan.jButton1ActionPerformed(null);
        assertEquals("Nhập sai! ", ketQua.getText());
        assertEquals(Color.RED, ketQua.getForeground()); // Kiểm tra màu sắc vì kết quả là sai
    }

    @Test
    public void kiemTraInputCaHaiKhongHopLe() {
        jTextField1.setText("abc");
        jTextField2.setText("xyz");
        formNhan.jButton1ActionPerformed(null);
        assertEquals("Nhập sai! ", ketQua.getText());
        assertEquals(Color.RED, ketQua.getForeground()); // Kiểm tra màu sắc vì kết quả là sai
    }

    @Test
    public void kiemTraInputRong() {
        jTextField1.setText("");
        jTextField2.setText("5");
        formNhan.jButton1ActionPerformed(null);
        assertEquals("Nhập sai! ", ketQua.getText());
        assertEquals(Color.RED, ketQua.getForeground()); // Kiểm tra màu sắc vì kết quả là sai
    }

    @Test
    public void kiemTraInputChuaKhoangTrang() {
        jTextField1.setText(" ");
        jTextField2.setText("5");
        formNhan.jButton1ActionPerformed(null);
        assertEquals("Nhập sai! ", ketQua.getText());
        assertEquals(Color.RED, ketQua.getForeground()); // Kiểm tra màu sắc vì kết quả là sai
    }

    @Test
    public void kiemTraInputAm() {
        jTextField1.setText("-3");
        jTextField2.setText("2");
        formNhan.jButton1ActionPerformed(null);
        assertEquals("-6.0", ketQua.getText());
        // Không cần kiểm tra màu sắc ở đây vì kết quả là đúng
    }

    @Test
    public void kiemTraInputAmCaHai() {
        jTextField1.setText("-2");
        jTextField2.setText("-4");
        formNhan.jButton1ActionPerformed(null);
        assertEquals("8.0", ketQua.getText());
        // Không cần kiểm tra màu sắc ở đây vì kết quả là đúng
    }

    @Test
    public void kiemTraInputKhongHopLe1() {
        jTextField1.setText("0");
        jTextField2.setText("5");
        formNhan.jButton1ActionPerformed(null);
        assertEquals("0.0", ketQua.getText());
        // Không cần kiểm tra màu sắc ở đây vì kết quả là đúng
    }

    @Test
    public void kiemTraInputKhongHopLe2() {
        jTextField1.setText("0");
        jTextField2.setText("0");
        formNhan.jButton1ActionPerformed(null);
        assertEquals("0.0", ketQua.getText());
        // Không cần kiểm tra màu sắc ở đây vì kết quả là đúng
    }
}
