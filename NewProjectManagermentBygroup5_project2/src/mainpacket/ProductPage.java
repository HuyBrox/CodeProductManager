/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mainpacket;

import java.awt.HeadlessException;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import static javax.swing.GroupLayout.Alignment.CENTER;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.xmlbeans.impl.xb.xmlconfig.NamespaceList.Member2.Item;
/**
 *
 * @author huytr
 */
public class ProductPage extends javax.swing.JFrame {

    private ProductList productList;

    public ProductPage() {
        initComponents();
        productList = new ProductList();
        String programName = "Product Management";
        setTitle(programName); 
        // Khởi tạo và hiển thị danh sách sản phẩm
        displayProductList();
        box.addItem("Dừng hoạt động"); 
        

        box.revalidate();
        box.repaint();
    }

    private void displayProductList() {

        productList.addProduct(new Product(1001, "Coca Cola", "Nước giải khát có ga", 10000, 10, 4.5, true, 50, "Nước"));
        productList.addProduct(new Product(1002, "Pepsi", "Nước giải khát có ga", 10000, 10, 4.4, true, 60, "Nước"));
        productList.addProduct(new Product(1003, "Sprite", "Nước giải khát có ga", 10000, 10, 4.3, true, 70, "Nước"));
        productList.addProduct(new Product(1004, "Fanta", "Nước giải khát có ga", 10000, 10, 4.2, true, 80, "Nước"));
        productList.addProduct(new Product(1005, "Aquafina", "Nước suối", 5000, 5, 4.6, true, 100, "Nước"));
        productList.addProduct(new Product(1006, "Lavie", "Nước suối", 5000, 5, 4.7, true, 90, "Nước"));
        productList.addProduct(new Product(1007, "Red Bull", "Nước tăng lực", 15000, 15, 4.8, true, 40, "Nước"));
        productList.addProduct(new Product(1008, "Number 1", "Nước tăng lực", 15000, 15, 4.5, true, 60, "Nước"));
        productList.addProduct(new Product(1009, "Oolong Tea", "Trà ô long", 20000, 20, 4.6, true, 50, "Nước"));
        productList.addProduct(new Product(1010, "Green Tea", "Trà xanh", 20000, 20, 4.7, true, 50, "Nước"));

        productList.addProduct(new Product(1011, "Oreo", "Bánh quy sô cô la", 25000, 10, 4.5, true, 100, "Bánh"));
        productList.addProduct(new Product(1012, "ChocoPie", "Bánh sô cô la", 30000, 15, 4.6, true, 80, "Bánh"));
        productList.addProduct(new Product(1013, "Lays", "Snack khoai tây", 20000, 5, 4.4, true, 90, "Bánh"));
        productList.addProduct(new Product(1014, "Doritos", "Snack ngô", 20000, 5, 4.5, true, 70, "Bánh"));
        productList.addProduct(new Product(1015, "Pringles", "Snack khoai tây", 25000, 10, 4.6, true, 60, "Bánh"));
        productList.addProduct(new Product(1016, "KitKat", "Bánh sô cô la", 30000, 15, 4.8, true, 50, "Bánh"));
        productList.addProduct(new Product(1017, "Snickers", "Kẹo sô cô la", 20000, 5, 4.7, true, 100, "Bánh"));
        productList.addProduct(new Product(1018, "Mars", "Kẹo sô cô la", 20000, 5, 4.5, true, 90, "Bánh"));
        productList.addProduct(new Product(1019, "Twix", "Kẹo sô cô la", 25000, 10, 4.6, true, 80, "Bánh"));
        productList.addProduct(new Product(1020, "Hershey's", "Kẹo sô cô la", 30000, 15, 4.8, true, 70, "Bánh"));
        
        // Hiển thị danh sách sản phẩm trên giao diện người dùng
        // Ví dụ: hiển thị các sản phẩm trong một JTable
//        displayProductsInTable();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        addNew = new javax.swing.JButton();
        deleteMulti = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        search = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        box = new javax.swing.JComboBox<>();
        importExcel = new javax.swing.JButton();
        ok = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setBackground(new java.awt.Color(255, 250, 248));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "All", "STT", "ID", "Tên SP", "Miêu tả", "Giá", "% Giảm giá", "Xếp hạng", "Trạng thái", "Số lượng", "Loại", "Sửa", "Xóa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Byte.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Byte.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jTable1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTable1FocusGained(evt);
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/lisloaisanpham.png"))); // NOI18N
        jLabel1.setText("TRANG QUẢN LÍ SẢN PHẨM");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 102, 0), new java.awt.Color(255, 102, 0), new java.awt.Color(255, 102, 0), new java.awt.Color(255, 102, 0)));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 102, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/dangxuat.png"))); // NOI18N
        jButton1.setText("Đăng xuất");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/nhanvien.png"))); // NOI18N
        jLabel2.setText("Name");

        addNew.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addNew.setForeground(new java.awt.Color(255, 102, 0));
        addNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Button-Add-icon.png"))); // NOI18N
        addNew.setText("Thêm mới");
        addNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewActionPerformed(evt);
            }
        });

        deleteMulti.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deleteMulti.setForeground(new java.awt.Color(255, 102, 0));
        deleteMulti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Delete-icon.png"))); // NOI18N
        deleteMulti.setText("Xóa nhiều bản ghi");
        deleteMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteMultiActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 102, 0));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/sanpham.png"))); // NOI18N
        jButton4.setText("Xuất file excel");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        search.setBackground(new java.awt.Color(204, 204, 204));
        search.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        search.setToolTipText("");

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 102, 0));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/timkiem.png"))); // NOI18N
        jButton5.setText("Tìm ");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        box.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        box.setForeground(new java.awt.Color(255, 102, 0));
        box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mặc định", "Giá thấp đến cao", "Giá cao đến thấp", "Trạng thái hoạt động" }));
        box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxActionPerformed(evt);
            }
        });

        importExcel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        importExcel.setForeground(new java.awt.Color(255, 102, 0));
        importExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pencil-red-icon.png"))); // NOI18N
        importExcel.setText("Thêm từ file excel");
        importExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importExcelActionPerformed(evt);
            }
        });

        ok.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ok.setForeground(new java.awt.Color(255, 102, 0));
        ok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/hethong.png"))); // NOI18N
        ok.setText("Áp dụng");
        ok.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1017, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(6, 56, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(addNew, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(importExcel))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(deleteMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton4)))
                                .addGap(88, 88, 88)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(box, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(ok, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(135, 135, 135))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addNew)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(importExcel)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton4)
                        .addComponent(box, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ok, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(deleteMulti))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void exportToExcel(JTable table, String filePath) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Product Data");

        // Tạo hàng đầu tiên (tiêu đề)
        Row headerRow = sheet.createRow(0);
        for (int col = 0; col < model.getColumnCount(); col++) {
            Cell cell = headerRow.createCell(col);
            cell.setCellValue(model.getColumnName(col));
        }

        // Đổ dữ liệu từ bảng vào file Excel
        for (int row = 0; row < model.getRowCount(); row++) {
            Row excelRow = sheet.createRow(row + 1);
            for (int col = 0; col < model.getColumnCount(); col++) {
                Cell cell = excelRow.createCell(col);
                Object value = model.getValueAt(row, col);
                if (value != null) {
                    cell.setCellValue(value.toString());
                }
            }
        }

        // Lưu workbook vào file Excel
        try (FileOutputStream fileOut = new FileOutputStream(filePath)) {
            workbook.write(fileOut);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTable1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1FocusGained
    //add new==============================
    private void addNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewActionPerformed
        AddNew newProduct = new AddNew(productList);
        newProduct.setLocationRelativeTo(null);
        String programName = "Product Management";
        newProduct.setTitle(programName);

        newProduct.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                refreshTable();
            }
        });

        newProduct.setVisible(true);
    }//GEN-LAST:event_addNewActionPerformed
    //====================filter==============
    private List<Product> filterByPriceLowToHigh(List<Product> list) {
        List<Product> filteredList = new ArrayList<>(list);
        Collections.sort(filteredList, new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return Double.compare(p1.getPrice(), p2.getPrice());
            }
        });
        return filteredList;
    }

    private List<Product> filterByPriceHighToLow(List<Product> list) {
        List<Product> filteredList = new ArrayList<>(list);
        Collections.sort(filteredList, new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return Double.compare(p2.getPrice(), p1.getPrice());
            }
        });
        return filteredList;
    }

    private List<Product> filterByStatus(List<Product> list) {
        List<Product> activeProducts = new ArrayList<>();
        List<Product> inactiveProducts = new ArrayList<>();

        for (Product product : list) {
            if (product.isStatus()) {
                activeProducts.add(product);
            } else {
                inactiveProducts.add(product);
            }
        }

        List<Product> filteredList = new ArrayList<>();
        filteredList.addAll(activeProducts);
        filteredList.addAll(inactiveProducts);

        return filteredList;
    }
    //delete multi
    private void deleteMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteMultiActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int confirmed = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn xóa sản phẩm đã chọn?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION);
        if (confirmed == JOptionPane.YES_OPTION) {
            for (int i = model.getRowCount() - 1; i >= 0; i--) {
                boolean isSelected = (boolean) model.getValueAt(i, 0);
                if (isSelected) {
                    int productId = (int) model.getValueAt(i, 2); 
                    Product productToRemove = productList.getProductById(productId); 
                    if (productToRemove != null) {
                        productList.removeProduct(productToRemove); 
                    }
                    model.removeRow(i); 
                }
            }
        }
    }//GEN-LAST:event_deleteMultiActionPerformed
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Chọn nơi lưu file Excel");
        int userSelection = fileChooser.showSaveDialog(this);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            String filePath = fileChooser.getSelectedFile().getAbsolutePath() + ".xlsx"; // Mở rộng mặc định là .xlsx
            try {
                exportToExcel(jTable1, filePath);
                JOptionPane.showMessageDialog(this, "Dữ liệu đã được xuất thành công vào file Excel!", "Xuất Excel", JOptionPane.INFORMATION_MESSAGE);
            } catch (HeadlessException ex) {
                JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi khi xuất dữ liệu vào file Excel:\n" + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable1AncestorAdded

    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

    model.setRowCount(0);

    for (Product product : productList.getProductList()) {
        Object[] rowData = {
            false, // All (chứa nút check)
            model.getRowCount() + 1, // STT tự tăng
            product.getId(),
            product.getName(),
            product.getDescription(),
            product.getPrice(),
            product.getDiscountPercentage(),
            product.getRating(),
            product.isStatus() ? "Hoạt động" : "Không hoạt động",
            product.getQuantity(),
            product.getCategory(),
            "Sửa", // Button Sửa
            "Xóa"
        };
        CustomRenderer customRenderer = new CustomRenderer();
        for (int i = 0; i < jTable1.getColumnCount(); i++) {
            jTable1.getColumnModel().getColumn(i).setCellRenderer(customRenderer);
        }
        model.addRow(rowData);
    }
    }//GEN-LAST:event_jTable1AncestorAdded
    private void refreshTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0); // Xóa hết các dòng hiện tại trong bảng

        // Lặp qua từng sản phẩm trong productList và thêm vào bảng
        for (Product product : productList.getProductList()) {
            Object[] rowData = {
                false, // All (chứa nút check)
                model.getRowCount() + 1, // STT tự tăng
                product.getId(),
                product.getName(),
                product.getDescription(),
                product.getPrice(),
                product.getDiscountPercentage(),
                product.getRating(),
                product.isStatus() ? "Hoạt động" : "Không hoạt động",
                product.getQuantity(),
                product.getCategory(),
                "Sửa", // Button Sửa
                "Xóa"
            };
            CustomRenderer customRenderer = new CustomRenderer();
            for (int i = 0; i < jTable1.getColumnCount(); i++) {
                jTable1.getColumnModel().getColumn(i).setCellRenderer(customRenderer);
            }
            model.addRow(rowData);
        }
    }
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int column = jTable1.getColumnModel().getColumnIndexAtX(evt.getX()); 
                int row = evt.getY() / jTable1.getRowHeight(); 

                if (column == jTable1.getColumnModel().getColumnIndex("Sửa") && evt.getClickCount() == 1 ) {
            int option = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn sửa sản phẩm này?", "Xác nhận", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
            if (option == JOptionPane.YES_OPTION) {
                FormChange change = new FormChange(this.productList);
                change.setLocationRelativeTo(null);
                String programName = "Product Management";
                change.setTitle(programName);
                change.setVisible(true);

                change.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosed(WindowEvent e) {
                        refreshTable(); 
                    }
                });
            } 
        } else if (column == jTable1.getColumnModel().getColumnIndex("Xóa") && evt.getClickCount() == 1) {
            int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn xóa sản phẩm này?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                int productId = (int) jTable1.getValueAt(row, jTable1.getColumnModel().getColumnIndex("ID")); 
                Product productToRemove = productList.getProductById(productId); 
                if (productToRemove != null) {
                    productList.removeProduct(productToRemove); 
                    refreshTable();
                }
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void importExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importExcelActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Chọn file Excel để import");
        fileChooser.setFileFilter(new FileNameExtensionFilter("Excel Files", "xlsx", "xls"));
        int userSelection = fileChooser.showOpenDialog(this);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            // Gọi phương thức để đọc dữ liệu từ file Excel và cập nhật vào danh sách sản phẩm
            try {
                importFromExcel(selectedFile);
                JOptionPane.showMessageDialog(this, "Dữ liệu đã được import thành công từ file Excel!", "Import Excel", JOptionPane.INFORMATION_MESSAGE);
                // Cập nhật lại hiển thị danh sách sản phẩm
                displayProductList();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi khi import dữ liệu từ file Excel:\n" + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_importExcelActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String searchText = search.getText().trim(); // Lấy nội dung từ ô nhập liệu jTextFieldSearch

        // Kiểm tra xem ô nhập liệu có rỗng không
        if (searchText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập từ khóa tìm kiếm!", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Xóa hết các dòng hiện tại trong mô hình DefaultTableModel
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        // Tìm kiếm sản phẩm và thêm vào mô hình DefaultTableModel
        List<Product> searchResults = productList.searchProductByName(searchText);
        for (Product product : searchResults) {
            Object[] rowData = {
                false, // All (chứa nút check)
                model.getRowCount() + 1, // STT tự tăng
                product.getId(),
                product.getName(),
                product.getDescription(),
                product.getPrice(),
                product.getDiscountPercentage(),
                product.getRating(),
                product.isStatus() ? "Hoạt động" : "Không hoạt động",
                product.getQuantity(),
                product.getCategory(),
                "Sửa", // Button Sửa
                "Xóa"
            };
            CustomRenderer customRenderer = new CustomRenderer();
            for (int i = 0; i < jTable1.getColumnCount(); i++) {
                jTable1.getColumnModel().getColumn(i).setCellRenderer(customRenderer);
            }
            model.addRow(rowData);
        }
    }//GEN-LAST:event_jButton5ActionPerformed
    
    private void boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
         String selectedValue = (String) box.getSelectedItem(); // Lấy giá trị từ JComboBox

        // Xóa hết các dòng hiện tại trong mô hình DefaultTableModel
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        // Lấy dữ liệu ban đầu từ productList (hoặc nguồn dữ liệu của bạn)
        List<Product> originalList = productList.getProductList();

        // Khởi tạo danh sách mới để lưu kết quả lọc (nếu cần)
        List<Product> filteredList = new ArrayList<>();

        // Thực hiện lọc và sắp xếp dữ liệu dựa trên giá trị từ JComboBox
        switch (selectedValue) {
            case "Mặc định" -> filteredList = originalList;
            case "Giá thấp đến cao" -> filteredList = filterByPriceLowToHigh(originalList);
            case "Giá cao đến thấp" -> filteredList = filterByPriceHighToLow(originalList);
            case "Trạng thái hoạt động" -> filteredList = filterByStatus(originalList);
            default -> {
            }
        }

        // Hiển thị dữ liệu đã lọc và sắp xếp vào bảng
        for (int i = 0; i < filteredList.size(); i++) {
            Product product = filteredList.get(i);
            Object[] rowData = {
                false, // All (chứa nút check)
                i + 1, // STT tự tăng
                product.getId(),
                product.getName(),
                product.getDescription(),
                product.getPrice(),
                product.getDiscountPercentage(),
                product.getRating(),
                product.isStatus() ? "Hoạt động" : "Không hoạt động",
                product.getQuantity(),
                product.getCategory(),
                "Sửa", // Button Sửa
                "Xóa"
            };
            model.addRow(rowData);
        }
    }//GEN-LAST:event_okActionPerformed
    private void importFromExcel(File file) throws IOException {
        FileInputStream inputStream = new FileInputStream(file);
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheetAt(0); // Lấy sheet đầu tiên

        // Lặp qua từng dòng trong sheet (bỏ qua dòng tiêu đề)
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            if (row != null) {
                // Đọc dữ liệu từ từng ô và tạo sản phẩm mới
                int id = (int) getCellValueAsNumeric(row.getCell(1)); // Cột ID
                String name = getCellValueAsString(row.getCell(2)); // Cột Tên SP
                String description = getCellValueAsString(row.getCell(3)); // Cột Miêu tả
                double price = getCellValueAsNumeric(row.getCell(4)); // Cột Giá
                double discountPercentage = getCellValueAsNumeric(row.getCell(5)); // Cột % Giảm giá
                double rating = getCellValueAsNumeric(row.getCell(6)); // Cột Xếp hạng
                boolean status = getCellValueAsBoolean(row.getCell(7)); // Cột Trạng thái
                int quantity = (int) getCellValueAsNumeric(row.getCell(8)); // Cột Số lượng
                String category = getCellValueAsString(row.getCell(9)); // Cột Loại

                Product product = new Product(id, name, description, price, discountPercentage, rating, status, quantity, category);
                // Thêm sản phẩm vào danh sách
                productList.addProduct(product);
            }
        }
        
        workbook.close();
        this.refreshTable();
        inputStream.close();
    }
    private String getCellValueAsString(Cell cell) {
        switch (cell.getCellType()) {
            case STRING:
                return cell.getStringCellValue();
            case NUMERIC:
                return String.valueOf(cell.getNumericCellValue());
            case BOOLEAN:
                return String.valueOf(cell.getBooleanCellValue());
            case FORMULA:
                return cell.getCellFormula();
            default:
                return "";
        }
    }

    private double getCellValueAsNumeric(Cell cell) {
        switch (cell.getCellType()) {
            case NUMERIC:
                return cell.getNumericCellValue();
            case STRING:
                try {
                    return Double.parseDouble(cell.getStringCellValue());
                } catch (NumberFormatException e) {
                    return 0;
                }
            default:
                return 0;
        }
    }

    private boolean getCellValueAsBoolean(Cell cell) {
        switch (cell.getCellType()) {
            case BOOLEAN:
                return cell.getBooleanCellValue();
            case STRING:
                return Boolean.parseBoolean(cell.getStringCellValue());
            default:
                return false;
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProductPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNew;
    private javax.swing.JComboBox<String> box;
    private javax.swing.JButton deleteMulti;
    private javax.swing.JButton importExcel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton ok;
    private javax.swing.JTextField search;
    // End of variables declaration//GEN-END:variables
}
