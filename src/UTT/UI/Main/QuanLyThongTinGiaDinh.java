/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UTT.UI.Main;

import UTT.DAO.CanBoDAO;
import UTT.DAO.QuanHeDAO;
import UTT.Model.QuanHe;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.prompt.PromptSupport;

/**
 *
 * @author luongtopp
 */
public class QuanLyThongTinGiaDinh extends javax.swing.JPanel {

    String id = "";

    public QuanLyThongTinGiaDinh() {
        initComponents();
        hienThiBangQuanHe();
        PromptSupport.setPrompt("Nhập mã cán bộ", txtTimKiem);
        btnSua.setVisible(false);
        tblQuanHe.setComponentPopupMenu(jPopupMenu1);
        ButtonGroup bg = new ButtonGroup();
        bg.add(rdoNam);
        bg.add(rdoNu);
    }

    private void hienThiBangQuanHe() {
        DefaultTableModel model = (DefaultTableModel) tblQuanHe.getModel();
        model.setRowCount(0);
        for (QuanHe item : new QuanHeDAO().hienQuanHe()) {
            model.addRow(
                    new Object[]{
                        item.getId(),
                        item.getMaCanBo(),
                        item.getQuanHe(),
                        item.getHoTen(),
                        item.getNgaySinh(),
                        item.getGioiTinh(),
                        item.getNgheNghiep(),
                        item.getDiaChi()

                    }
            );
        }
    }

    // Hiển thị bảng CÁN BỘ có tham số
    private void hienThiBangQuanHe(String timKiem) {
        DefaultTableModel model = (DefaultTableModel) tblQuanHe.getModel();
        model.setRowCount(0);
        for (QuanHe item : new QuanHeDAO().hienQuanHe(timKiem)) {
            model.addRow(
                    new Object[]{
                        item.getId(),
                        item.getMaCanBo(),
                        item.getQuanHe(),
                        item.getHoTen(),
                        item.getNgaySinh(),
                        item.getGioiTinh(),
                        item.getNgheNghiep(),
                        item.getDiaChi()

                    }
            );
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPopupMenu1 = new javax.swing.JPopupMenu();
        menuItemSua = new javax.swing.JMenuItem();
        menuItemXoa = new javax.swing.JMenuItem();
        scrollPaneWin111 = new UTT.UI.scroll.win11.ScrollPaneWin11();
        jPanel1 = new javax.swing.JPanel();
        pnlChucNang1 = new javax.swing.JPanel();
        btnTimKiem = new javax.swing.JButton();
        txtTimKiem = new javax.swing.JTextField();
        btnLamMoi = new javax.swing.JButton();
        pnlCaNhanCon = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMaCanBo = new javax.swing.JTextField();
        txtQuanHe = new javax.swing.JTextField();
        txtHoTenNguoiThan = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNgheNghiep = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        pnlGioiTinh = new javax.swing.JPanel();
        rdoNu = new javax.swing.JRadioButton();
        rdoNam = new javax.swing.JRadioButton();
        txtNgaySinh = new com.toedter.calendar.JDateChooser();
        pnlChucNang = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        scrollPaneWin112 = new UTT.UI.scroll.win11.ScrollPaneWin11();
        tblQuanHe = new javax.swing.JTable();

        menuItemSua.setText("Sửa");
        menuItemSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSuaActionPerformed(evt);
            }
        });
        jPopupMenu1.add(menuItemSua);

        menuItemXoa.setText("Xóa");
        menuItemXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemXoaActionPerformed(evt);
            }
        });
        jPopupMenu1.add(menuItemXoa);

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));

        pnlChucNang1.setLayout(new java.awt.GridBagLayout());

        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 12, 12);
        pnlChucNang1.add(btnTimKiem, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 300;
        pnlChucNang1.add(txtTimKiem, gridBagConstraints);

        btnLamMoi.setText("Làm mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 70);
        pnlChucNang1.add(btnLamMoi, gridBagConstraints);

        jPanel1.add(pnlChucNang1);

        pnlCaNhanCon.setBorder(javax.swing.BorderFactory.createTitledBorder("Người thân"));
        pnlCaNhanCon.setPreferredSize(new java.awt.Dimension(552, 250));
        pnlCaNhanCon.setRequestFocusEnabled(false);
        pnlCaNhanCon.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Mã cán bộ:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlCaNhanCon.add(jLabel1, gridBagConstraints);

        jLabel2.setText("Họ tên người thân:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlCaNhanCon.add(jLabel2, gridBagConstraints);

        jLabel5.setText("Quan hệ:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlCaNhanCon.add(jLabel5, gridBagConstraints);

        jLabel6.setText("Ngày sinh:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlCaNhanCon.add(jLabel6, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 123;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlCaNhanCon.add(txtMaCanBo, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 123;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlCaNhanCon.add(txtQuanHe, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 123;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlCaNhanCon.add(txtHoTenNguoiThan, gridBagConstraints);

        jLabel7.setText("Địa chỉ:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 100, 5, 5);
        pnlCaNhanCon.add(jLabel7, gridBagConstraints);

        jLabel10.setText("Nghề nghiệp:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 100, 5, 5);
        pnlCaNhanCon.add(jLabel10, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 123;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlCaNhanCon.add(txtNgheNghiep, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 123;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlCaNhanCon.add(txtDiaChi, gridBagConstraints);

        jLabel12.setText("Giới tính:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlCaNhanCon.add(jLabel12, gridBagConstraints);

        rdoNu.setText("Nữ");

        rdoNam.setText("Nam");

        javax.swing.GroupLayout pnlGioiTinhLayout = new javax.swing.GroupLayout(pnlGioiTinh);
        pnlGioiTinh.setLayout(pnlGioiTinhLayout);
        pnlGioiTinhLayout.setHorizontalGroup(
            pnlGioiTinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGioiTinhLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rdoNu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdoNam))
        );
        pnlGioiTinhLayout.setVerticalGroup(
            pnlGioiTinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlGioiTinhLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlGioiTinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoNu)
                    .addComponent(rdoNam))
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        pnlCaNhanCon.add(pnlGioiTinh, gridBagConstraints);

        txtNgaySinh.setDateFormatString("yyyy-MM-dd");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 97;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlCaNhanCon.add(txtNgaySinh, gridBagConstraints);

        jPanel1.add(pnlCaNhanCon);

        pnlChucNang.setLayout(new java.awt.GridBagLayout());

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 12, 12);
        pnlChucNang.add(btnThem, gridBagConstraints);

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 12, 12);
        pnlChucNang.add(btnSua, gridBagConstraints);

        btnHuy.setText("Hủy");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 12, 12);
        pnlChucNang.add(btnHuy, gridBagConstraints);

        jPanel1.add(pnlChucNang);

        scrollPaneWin112.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPaneWin112.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPaneWin112.setViewportView(null);

        tblQuanHe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Mã cán bộ", "Quan hệ", "Họ tên", "Năm sinh", "Giới tính", "Nghề nghiệp", "Địa chỉ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblQuanHe.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblQuanHe.setAutoscrolls(false);
        scrollPaneWin112.setViewportView(tblQuanHe);
        if (tblQuanHe.getColumnModel().getColumnCount() > 0) {
            tblQuanHe.getColumnModel().getColumn(1).setPreferredWidth(100);
            tblQuanHe.getColumnModel().getColumn(2).setPreferredWidth(200);
            tblQuanHe.getColumnModel().getColumn(3).setPreferredWidth(300);
            tblQuanHe.getColumnModel().getColumn(4).setPreferredWidth(200);
            tblQuanHe.getColumnModel().getColumn(5).setPreferredWidth(200);
            tblQuanHe.getColumnModel().getColumn(6).setPreferredWidth(300);
            tblQuanHe.getColumnModel().getColumn(7).setPreferredWidth(500);
        }

        jPanel1.add(scrollPaneWin112);

        scrollPaneWin111.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPaneWin111, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPaneWin111, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        hienThiBangQuanHe(txtTimKiem.getText());
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        hienThiBangQuanHe();
        txtTimKiem.setText("");
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        String maCanBo = txtMaCanBo.getText();
        if (maCanBo == null || maCanBo.trim().isEmpty()) {
            maCanBo = JOptionPane.showInputDialog("Nhập lại mã cán bộ:");
            txtMaCanBo.setText(maCanBo);
        }
        String quanHe = txtQuanHe.getText();
        if (quanHe == null || quanHe.trim().isEmpty()) {
            quanHe = JOptionPane.showInputDialog("Nhập lại mối quan hệ:");
            txtQuanHe.setText(quanHe);
        }
        String hoTen = txtHoTenNguoiThan.getText();
        if (hoTen == null || hoTen.trim().isEmpty()) {
            hoTen = JOptionPane.showInputDialog("Nhập lại họ tên:");
            txtHoTenNguoiThan.setText(hoTen);
        }
        String chuoiNgaySinh = "";
        Date ngaySinh = txtNgaySinh.getDate();
        if (ngaySinh == null) {
            JOptionPane.showMessageDialog(null, "Nhập lại ngày sinh:");
        } else {
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            chuoiNgaySinh = df.format(txtNgaySinh.getDate());
            System.out.println(ngaySinh);
        }
        String gioiTinh = "";
        if (rdoNam.isSelected()) {
            gioiTinh = "Nam";
        } else {
            if (rdoNu.isSelected()) {
                gioiTinh = "Nữ";
            } else {
                JOptionPane.showMessageDialog(null, "Vui lòng chọn giới tính.");
            }
        }
        String ngheNghiep = txtNgheNghiep.getText();
        if (ngheNghiep == null || ngheNghiep.trim().isEmpty()) {
            ngheNghiep = JOptionPane.showInputDialog("Nhập lại nghề nghiệp:");
            txtNgheNghiep.setText(ngheNghiep);
        }
        String diaChi = txtDiaChi.getText();
        if (diaChi == null || diaChi.trim().isEmpty()) {
            diaChi = JOptionPane.showInputDialog("Nhập lại địa chỉ:");
            txtDiaChi.setText(diaChi);
        }
        try {
            new QuanHeDAO().themQuanHe(maCanBo, quanHe, hoTen,
                    ngaySinh, gioiTinh, ngheNghiep,
                    diaChi,
                    null);
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyThongTinCanBo.class.getName()).log(Level.SEVERE, null, ex);
        }
        hienThiBangQuanHe();


    }//GEN-LAST:event_btnThemActionPerformed

    private void menuItemXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemXoaActionPerformed
        int dialogResult = JOptionPane.showConfirmDialog(null,
                "Bạn có muốn tiếp tục thực hiện câu lệnh không?",
                "Thông báo", JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {
            try {
                new QuanHeDAO().xoaQuanHe(tblQuanHe.getModel().getValueAt(tblQuanHe.getSelectedRow(), 0).toString());
                hienThiBangQuanHe();
            } catch (SQLException ex) {
                Logger.getLogger(QuanLyThongTinCanBo.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {

        }
    }//GEN-LAST:event_menuItemXoaActionPerformed

    private void menuItemSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSuaActionPerformed
        btnSua.setVisible(true);
        id = (tblQuanHe.getModel().getValueAt(tblQuanHe.getSelectedRow(), 0).toString());
        txtMaCanBo.setText(tblQuanHe.getModel().getValueAt(tblQuanHe.getSelectedRow(), 1).toString());
        txtQuanHe.setText(tblQuanHe.getModel().getValueAt(tblQuanHe.getSelectedRow(), 2).toString());
        txtHoTenNguoiThan.setText(tblQuanHe.getModel().getValueAt(tblQuanHe.getSelectedRow(), 3).toString());
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date ngaySinh = null;
        try {
            ngaySinh = df.parse(tblQuanHe.getModel().getValueAt(tblQuanHe.getSelectedRow(), 4).toString());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        txtNgaySinh.setDate(ngaySinh);

        String gioiTinh = tblQuanHe.getModel().getValueAt(tblQuanHe.getSelectedRow(), 5).toString();
        if ("Nam".equals(gioiTinh)) {
            rdoNam.setSelected(true);
        } else {
            rdoNu.setSelected(true);
        }

        txtNgheNghiep.setText(tblQuanHe.getModel().getValueAt(tblQuanHe.getSelectedRow(), 6).toString());
        txtDiaChi.setText(tblQuanHe.getModel().getValueAt(tblQuanHe.getSelectedRow(), 7).toString());

    }//GEN-LAST:event_menuItemSuaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed

        String maCanBo = txtMaCanBo.getText();
        if (maCanBo == null || maCanBo.trim().isEmpty()) {
            maCanBo = JOptionPane.showInputDialog("Nhập lại mã cán bộ:");
            txtMaCanBo.setText(maCanBo);
        }
        String quanHe = txtQuanHe.getText();
        if (quanHe == null || quanHe.trim().isEmpty()) {
            quanHe = JOptionPane.showInputDialog("Nhập lại mối quan hệ:");
            txtQuanHe.setText(quanHe);
        }
        String hoTen = txtHoTenNguoiThan.getText();
        if (hoTen == null || hoTen.trim().isEmpty()) {
            hoTen = JOptionPane.showInputDialog("Nhập lại họ tên:");
            txtHoTenNguoiThan.setText(hoTen);
        }
        String chuoiNgaySinh = "";
        Date ngaySinh = txtNgaySinh.getDate();
        if (ngaySinh == null) {
            JOptionPane.showMessageDialog(null, "Nhập lại ngày sinh:");
        } else {
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            chuoiNgaySinh = df.format(txtNgaySinh.getDate());
            System.out.println(ngaySinh);
        }
        String gioiTinh = "";
        if (rdoNam.isSelected()) {
            gioiTinh = "Nam";
        } else {
            if (rdoNu.isSelected()) {
                gioiTinh = "Nữ";
            } else {
                JOptionPane.showMessageDialog(null, "Vui lòng chọn giới tính.");
            }
        }
        String ngheNghiep = txtNgheNghiep.getText();
        if (ngheNghiep == null || ngheNghiep.trim().isEmpty()) {
            ngheNghiep = JOptionPane.showInputDialog("Nhập lại nghề nghiệp:");
            txtNgheNghiep.setText(ngheNghiep);
        }
        String diaChi = txtDiaChi.getText();
        if (diaChi == null || diaChi.trim().isEmpty()) {
            diaChi = JOptionPane.showInputDialog("Nhập lại địa chỉ:");
            txtDiaChi.setText(diaChi);
        }
        try {
            new QuanHeDAO().suaQuanHe(maCanBo, quanHe, hoTen,
                    ngaySinh, gioiTinh, ngheNghiep,
                    diaChi, id,
                    null);
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyThongTinCanBo.class.getName()).log(Level.SEVERE, null, ex);
        }
        hienThiBangQuanHe();
        btnSua.setVisible(false);


    }//GEN-LAST:event_btnSuaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JMenuItem menuItemSua;
    private javax.swing.JMenuItem menuItemXoa;
    private javax.swing.JPanel pnlCaNhanCon;
    private javax.swing.JPanel pnlChucNang;
    private javax.swing.JPanel pnlChucNang1;
    private javax.swing.JPanel pnlGioiTinh;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private UTT.UI.scroll.win11.ScrollPaneWin11 scrollPaneWin111;
    private UTT.UI.scroll.win11.ScrollPaneWin11 scrollPaneWin112;
    private javax.swing.JTable tblQuanHe;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtHoTenNguoiThan;
    private javax.swing.JTextField txtMaCanBo;
    private com.toedter.calendar.JDateChooser txtNgaySinh;
    private javax.swing.JTextField txtNgheNghiep;
    private javax.swing.JTextField txtQuanHe;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
