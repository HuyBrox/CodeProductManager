/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpacket;

/**
 *
 * @author huytr
 */
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;

public class CustomRenderer extends DefaultTableCellRenderer {
     public CustomRenderer() {
        setHorizontalAlignment(SwingConstants.CENTER); // Căn giữa
        setFont(new Font("Arial", Font.PLAIN, 13)); // Cài đặt cỡ chữ
    }
     @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component cellComponent = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        if (isSelected) {
            cellComponent.setForeground(Color.WHITE); 
            cellComponent.setBackground(Color.ORANGE); 
        } else {
            cellComponent.setForeground(Color.WHITE); 
            // Thiết lập màu nền cho hàng chẵn và hàng lẻ
            if (row % 2 == 0) {
                cellComponent.setBackground(Color.decode("#ffd6b3")); // Màu cho hàng chẵn
                cellComponent.setForeground(Color.BLACK);
            } else {
                cellComponent.setBackground(Color.WHITE); // Màu cho hàng lẻ
                cellComponent.setForeground(Color.BLACK);
            }
        }
        if (column == 11) { // Cột "Sửa"
            cellComponent.setForeground(Color.BLUE);
            cellComponent.setFont(cellComponent.getFont().deriveFont(Font.BOLD)); 
        } else if (column == 12) { // Cột "Xóa"
            cellComponent.setForeground(Color.RED);
            cellComponent.setFont(cellComponent.getFont().deriveFont(Font.BOLD)); 
        }
        if (value instanceof Boolean) {
            JCheckBox checkBox = new JCheckBox();
            checkBox.setSelected((Boolean) value);
            checkBox.setHorizontalAlignment(SwingConstants.CENTER);
            return checkBox;
        }
        return cellComponent;
    }
}
