package mainpacket;

import com.formdev.flatlaf.FlatIntelliJLaf;

import javax.swing.*;

public class Main {
public static void main(String[] args) {
     ListAcc listAcc = new ListAcc();
    try {
        UIManager.setLookAndFeel(new FlatIntelliJLaf());
    } catch (Exception ex) {
        ex.printStackTrace();
    }

    SwingUtilities.invokeLater(() -> {
        login login = new login(listAcc);
        login.setLocationRelativeTo(null);
        login.setVisible(true);
    });
}
}