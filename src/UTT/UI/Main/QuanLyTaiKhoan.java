/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UTT.UI.Main;

import UTT.DAO.CanBoDAO;
import UTT.DAO.ChucVuDAO;
import UTT.DAO.PhongBanDAO;
import UTT.DAO.TaiKhoanDAO;
import UTT.Model.ChucVu;
import UTT.Model.PhongBan;
import UTT.Model.TaiKhoan;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author luongtopp
 */
public class QuanLyTaiKhoan extends javax.swing.JPanel {

    /**
     * Creates new form QuanLyTaiKhoan
     */
    public QuanLyTaiKhoan() {
        initComponents();
        hienThiBangTaiKhoan();
        hienThiBangPhongBan();
        hienThiBangChucVu();
        cboTenChucVu.setPrototypeDisplayValue("");        
        cboTenPhongBan.setPrototypeDisplayValue("");
        btnSua.setVisible(false);
        if (!TaiKhoan.isAdmin) {

            pnlTaiKhoan.setVisible(false);
            pnlChucNang.setVisible(false);

        } else {
            tblTaiKhoan.setComponentPopupMenu(jPopupMenu1);
        }
           }

    private void hienThiBangTaiKhoan() {
        DefaultTableModel model = (DefaultTableModel) tblTaiKhoan.getModel();
        model.setRowCount(0);
        for (TaiKhoan item : new TaiKhoanDAO().hienTaiKhoan()) {
            model.addRow(
                    new Object[]{
                        item.getTenDangNhap(),
                        item.getMatKhau(),
                        item.getNgayCapQuyen(),
                        item.isAdmin(),
                        item.getHoTen(),
                        item.getMaPhongBan(),
                        item.getMaChucVu(),
                        item.getEmail(),}
            );
        }
    }

    private void hienThiBangTaiKhoan(String timKiem) {
        DefaultTableModel model = (DefaultTableModel) tblTaiKhoan.getModel();
        model.setRowCount(0);
        for (TaiKhoan item : new TaiKhoanDAO().hienTaiKhoan(timKiem)) {
            model.addRow(
                    new Object[]{
                        item.getTenDangNhap(),
                        item.getMatKhau(),
                        item.getNgayCapQuyen(),
                        item.isAdmin(),
                        item.getHoTen(),
                        item.getMaPhongBan(),
                        item.getMaChucVu(),
                        item.getEmail(),}
            );
        }
    }

    private void hienThiBangPhongBan() {

        for (PhongBan item : new PhongBanDAO().hienThiPhongBan()) {
            cboTenPhongBan.addItem(item.getTenPhongBan());

        }
    }

    private void hienThiBangPhongBan(String timKiem) {

        for (PhongBan item : new PhongBanDAO().timKiemTenPhongBan(timKiem)) {
            cboTenPhongBan.addItem(item.getTenPhongBan());

        }
    }

    private void hienThiBangChucVu() {

        for (ChucVu item : new ChucVuDAO().hienThiChucVu()) {
            cboTenChucVu.addItem(item.getTenChucVu());
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
        pnlTimKiem = new javax.swing.JPanel();
        btnTimKiem = new javax.swing.JButton();
        txtTimKiem = new javax.swing.JTextField();
        btnLamMoi = new javax.swing.JButton();
        pnlTaiKhoan = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTenDangNhap = new javax.swing.JTextField();
        txtMatKhau = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtNgayCapQuyen = new com.toedter.calendar.JDateChooser();
        jLabel19 = new javax.swing.JLabel();
        txtMaChucVu = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        cboTenChucVu = new javax.swing.JComboBox<>();
        cboTenPhongBan = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtMaPhongBan = new javax.swing.JTextField();
        cboCapQuyen = new javax.swing.JCheckBox();
        pnlChucNang = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        scrollPaneWin112 = new UTT.UI.scroll.win11.ScrollPaneWin11();
        tblTaiKhoan = new javax.swing.JTable();

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

        pnlTimKiem.setPreferredSize(new java.awt.Dimension(813, 47));
        pnlTimKiem.setLayout(new java.awt.GridBagLayout());

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
        pnlTimKiem.add(btnTimKiem, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 300;
        pnlTimKiem.add(txtTimKiem, gridBagConstraints);

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
        pnlTimKiem.add(btnLamMoi, gridBagConstraints);

        pnlTaiKhoan.setBorder(javax.swing.BorderFactory.createTitledBorder("Tài khoản"));
        pnlTaiKhoan.setPreferredSize(new java.awt.Dimension(552, 250));
        pnlTaiKhoan.setRequestFocusEnabled(false);
        pnlTaiKhoan.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Tên đăng nhập:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlTaiKhoan.add(jLabel1, gridBagConstraints);

        jLabel2.setText("Mật khẩu:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlTaiKhoan.add(jLabel2, gridBagConstraints);

        jLabel5.setText("Ngày cấp quyền:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlTaiKhoan.add(jLabel5, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 123;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlTaiKhoan.add(txtTenDangNhap, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 123;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlTaiKhoan.add(txtMatKhau, gridBagConstraints);

        jLabel9.setText("Email:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlTaiKhoan.add(jLabel9, gridBagConstraints);

        jLabel10.setText("Họ tên:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlTaiKhoan.add(jLabel10, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 123;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlTaiKhoan.add(txtHoTen, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 123;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlTaiKhoan.add(txtEmail, gridBagConstraints);

        jLabel12.setText("Admin:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlTaiKhoan.add(jLabel12, gridBagConstraints);

        txtNgayCapQuyen.setDateFormatString("yyyy-MM-dd");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 97;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlTaiKhoan.add(txtNgayCapQuyen, gridBagConstraints);

        jLabel19.setText("Mã chức vụ:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlTaiKhoan.add(jLabel19, gridBagConstraints);

        txtMaChucVu.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 123;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlTaiKhoan.add(txtMaChucVu, gridBagConstraints);

        jLabel25.setText("Chức vụ:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlTaiKhoan.add(jLabel25, gridBagConstraints);

        cboTenChucVu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        cboTenChucVu.setToolTipText("");
        cboTenChucVu.setMaximumSize(new java.awt.Dimension(72, 23));
        cboTenChucVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTenChucVuActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 115;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlTaiKhoan.add(cboTenChucVu, gridBagConstraints);

        cboTenPhongBan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        cboTenPhongBan.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cboTenPhongBan.setMaximumSize(new java.awt.Dimension(72, 23));
        cboTenPhongBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTenPhongBanActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 115;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlTaiKhoan.add(cboTenPhongBan, gridBagConstraints);

        jLabel15.setText("Tên phòng ban:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlTaiKhoan.add(jLabel15, gridBagConstraints);

        jLabel17.setText("Mã phòng ban:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlTaiKhoan.add(jLabel17, gridBagConstraints);

        txtMaPhongBan.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 123;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlTaiKhoan.add(txtMaPhongBan, gridBagConstraints);

        cboCapQuyen.setText("Cấp quyền");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlTaiKhoan.add(cboCapQuyen, gridBagConstraints);

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

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 12, 12);
        pnlChucNang.add(btnXoa, gridBagConstraints);

        btnHuy.setText("Hủy");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 12, 12);
        pnlChucNang.add(btnHuy, gridBagConstraints);

        scrollPaneWin112.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPaneWin112.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPaneWin112.setViewportView(null);

        tblTaiKhoan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên đăng nhập", "Mật khẩu", "Ngày cấp quyền", "Admin", "Họ tên", "Mã phòng ban", "Mã chức vụ", "Email"
            }
        ));
        tblTaiKhoan.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblTaiKhoan.setAutoscrolls(false);
        scrollPaneWin112.setViewportView(tblTaiKhoan);
        if (tblTaiKhoan.getColumnModel().getColumnCount() > 0) {
            tblTaiKhoan.getColumnModel().getColumn(0).setPreferredWidth(200);
            tblTaiKhoan.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblTaiKhoan.getColumnModel().getColumn(2).setPreferredWidth(200);
            tblTaiKhoan.getColumnModel().getColumn(4).setPreferredWidth(200);
            tblTaiKhoan.getColumnModel().getColumn(5).setPreferredWidth(200);
            tblTaiKhoan.getColumnModel().getColumn(6).setPreferredWidth(200);
            tblTaiKhoan.getColumnModel().getColumn(7).setPreferredWidth(200);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, 852, Short.MAX_VALUE)
            .addComponent(pnlChucNang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(scrollPaneWin112, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pnlTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlChucNang, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(scrollPaneWin112, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE))
        );

        scrollPaneWin111.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPaneWin111, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPaneWin111, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        hienThiBangTaiKhoan(txtTimKiem.getText());
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        hienThiBangTaiKhoan();
        txtTimKiem.setText("");
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed

        String tenDangNhap = txtTenDangNhap.getText();
        if (tenDangNhap == null || tenDangNhap.trim().isEmpty()) {
            tenDangNhap = JOptionPane.showInputDialog("Nhập lại tên đăng nhập:");
            txtTenDangNhap.setText(tenDangNhap);
        }
        String matKhau = txtMatKhau.getText();
        if (matKhau == null || matKhau.trim().isEmpty()) {
            matKhau = JOptionPane.showInputDialog("Nhập lại mật khẩu:");
            txtMatKhau.setText(matKhau);
        }
        String chuoiNgayCapQuyen = "";
        Date ngayCaoQuyen = txtNgayCapQuyen.getDate();
        if (ngayCaoQuyen == null) {
            JOptionPane.showMessageDialog(null, "Chọn  ngày cấp quyền");
        } else {
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            chuoiNgayCapQuyen = df.format(txtNgayCapQuyen.getDate());
        }
        Boolean admin = false;
        if (cboCapQuyen.isSelected()) {
            admin = true;
        }

        String hoTen = txtHoTen.getText();
        if (hoTen == null || hoTen.trim().isEmpty()) {
            hoTen = JOptionPane.showInputDialog("Nhập lại họ tên:");
            txtHoTen.setText(hoTen);

        }
        String maPhongBan = txtMaPhongBan.getText();
        if (maPhongBan == null || maPhongBan.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn phòng ban");
        }
        String maChucVu = txtMaChucVu.getText();
        if (maPhongBan == null || maPhongBan.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn chức vụ");
        }

        String email = txtEmail.getText();
        if (email == null || email.trim().isEmpty()) {
            email = JOptionPane.showInputDialog("Nhập lại email:");
            txtEmail.setText(email);
        }

        try {
            new TaiKhoanDAO().themTaiKhoan(tenDangNhap, matKhau,
                    chuoiNgayCapQuyen, admin, hoTen, maPhongBan, maChucVu, email,
                    null);
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyThongTinCanBo.class.getName()).log(Level.SEVERE, null, ex);
        }
        hienThiBangTaiKhoan();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        btnSua.setVisible(false);
        txtTenDangNhap.setEnabled(true);
        String tenDangNhap = txtTenDangNhap.getText();
        if (tenDangNhap == null || tenDangNhap.trim().isEmpty()) {
            tenDangNhap = JOptionPane.showInputDialog("Nhập lại tên đăng nhập:");
            txtTenDangNhap.setText(tenDangNhap);
        }
        String matKhau = txtMatKhau.getText();
        if (matKhau == null || matKhau.trim().isEmpty()) {
            matKhau = JOptionPane.showInputDialog("Nhập lại mật khẩu:");
            txtMatKhau.setText(matKhau);
        }
        String chuoiNgayCapQuyen = "";
        Date ngayCapQuyen = txtNgayCapQuyen.getDate();
        if (ngayCapQuyen == null) {
            JOptionPane.showMessageDialog(null, "Chọn  ngày cấp quyền");
        } else {
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            chuoiNgayCapQuyen = df.format(txtNgayCapQuyen.getDate());
        }
        Boolean admin = false;
        if (cboCapQuyen.isSelected()) {
            admin = true;
        }

        String hoTen = txtHoTen.getText();
        if (hoTen == null || hoTen.trim().isEmpty()) {
            hoTen = JOptionPane.showInputDialog("Nhập lại họ tên:");
            txtHoTen.setText(hoTen);

        }
        String maPhongBan = txtMaPhongBan.getText();
        if (maPhongBan == null || maPhongBan.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn phòng ban");
        }
        String maChucVu = txtMaChucVu.getText();
        if (maPhongBan == null || maPhongBan.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn chức vụ");
        }

        String email = txtEmail.getText();
        if (email == null || email.trim().isEmpty()) {
            email = JOptionPane.showInputDialog("Nhập lại email:");
            txtEmail.setText(email);
        }

        try {
            new TaiKhoanDAO().suaTaiKhoan(tenDangNhap, matKhau,
                    ngayCapQuyen, admin, hoTen, maPhongBan, maChucVu, email,
                    null);
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyTaiKhoan.class.getName()).log(Level.SEVERE, null, ex);
        }
        hienThiBangTaiKhoan();

    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int dialogResult = JOptionPane.showConfirmDialog(null,
                "Bạn có muốn tiếp tục thực hiện câu lệnh không?",
                "Thông báo", JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {
            try {
                new CanBoDAO().xoaCanBo(txtTenDangNhap.getText());
                hienThiBangTaiKhoan();
            } catch (SQLException ex) {
                Logger.getLogger(QuanLyThongTinCanBo.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {

        }

    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        txtTenDangNhap.setEnabled(true);
        txtTenDangNhap.setText("");
        txtMatKhau.setText("");
        txtNgayCapQuyen.setDate(null);
        txtHoTen.setText("");
        cboCapQuyen.setSelected(false);
        txtEmail.setText("");
        txtMaChucVu.setText("");
        txtMaPhongBan.setText("");
        txtEmail.setText("");
        cboTenChucVu.setSelectedItem("");
        cboTenPhongBan.setSelectedItem("");


    }//GEN-LAST:event_btnHuyActionPerformed

    private void cboTenPhongBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTenPhongBanActionPerformed
        String maPhongBan = (String) cboTenPhongBan.getSelectedItem();
        if ("".equals(maPhongBan)) {
        } else {
            txtMaPhongBan.setText(new PhongBanDAO().timKiemMaPhongBan(maPhongBan).get(0).getMaPhongBan());
        }
    }//GEN-LAST:event_cboTenPhongBanActionPerformed

    private void cboTenChucVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTenChucVuActionPerformed
        String maChuVu = (String) cboTenChucVu.getSelectedItem();
        if ("".equals(maChuVu)) {
        } else {
            txtMaChucVu.setText(new ChucVuDAO().timKiemMaChucVu(maChuVu).get(0).getMaChucVu());
        }
    }//GEN-LAST:event_cboTenChucVuActionPerformed

    private void menuItemSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSuaActionPerformed
        btnSua.setVisible(true);
        txtTenDangNhap.setEnabled(false);
        txtTenDangNhap.setText(tblTaiKhoan.getModel().getValueAt(tblTaiKhoan.getSelectedRow(), 0).toString());
        txtMatKhau.setText(tblTaiKhoan.getModel().getValueAt(tblTaiKhoan.getSelectedRow(), 1).toString());
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date ngayCapQuyen = null;
        try {
            ngayCapQuyen = df.parse(tblTaiKhoan.getModel().getValueAt(tblTaiKhoan.getSelectedRow(), 2).toString());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        txtNgayCapQuyen.setDate(ngayCapQuyen);

        String admin = tblTaiKhoan.getModel().getValueAt(tblTaiKhoan.getSelectedRow(), 3).toString();
        System.out.println("Hiển thị trnagj thái:" + admin);
        if (admin == "true") {
            cboCapQuyen.setSelected(true);
        }
        txtHoTen.setText(tblTaiKhoan.getModel().getValueAt(tblTaiKhoan.getSelectedRow(), 4).toString());
        txtMaPhongBan.setText(tblTaiKhoan.getModel().getValueAt(tblTaiKhoan.getSelectedRow(), 5).toString());
        txtMaChucVu.setText(tblTaiKhoan.getModel().getValueAt(tblTaiKhoan.getSelectedRow(), 6).toString());
        cboTenPhongBan.setSelectedItem(new PhongBanDAO().timKiemTenPhongBan(txtMaPhongBan.getText()).get(0).getTenPhongBan());
        System.out.println("In ra tên phòng ban:" + new PhongBanDAO().timKiemTenPhongBan(txtMaPhongBan.getText()).get(0).getTenPhongBan());
        cboTenChucVu.setSelectedItem(new ChucVuDAO().timKiemTenChucVu(txtMaChucVu.getText()).get(0).getTenChucVu());
        txtEmail.setText(tblTaiKhoan.getModel().getValueAt(tblTaiKhoan.getSelectedRow(), 7).toString());
        System.out.println(new PhongBanDAO().timKiemTenPhongBan(txtMaPhongBan.getText()).get(0).getTenPhongBan());


    }//GEN-LAST:event_menuItemSuaActionPerformed

    private void menuItemXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemXoaActionPerformed
        int dialogResult = JOptionPane.showConfirmDialog(null,
                "Bạn có muốn tiếp tục thực hiện câu lệnh không?",
                "Thông báo", JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {
            try {
                new TaiKhoanDAO().xoaTaiKhoan(tblTaiKhoan.getModel().getValueAt(tblTaiKhoan.getSelectedRow(), 0).toString());
                hienThiBangTaiKhoan();
            } catch (SQLException ex) {
                Logger.getLogger(QuanLyTaiKhoan.class.getName()).log(Level.SEVERE, null, ex);
            }

        } 
        
    }//GEN-LAST:event_menuItemXoaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JCheckBox cboCapQuyen;
    private javax.swing.JComboBox<String> cboTenChucVu;
    private javax.swing.JComboBox<String> cboTenPhongBan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JMenuItem menuItemSua;
    private javax.swing.JMenuItem menuItemXoa;
    private javax.swing.JPanel pnlChucNang;
    private javax.swing.JPanel pnlTaiKhoan;
    private javax.swing.JPanel pnlTimKiem;
    private UTT.UI.scroll.win11.ScrollPaneWin11 scrollPaneWin111;
    private UTT.UI.scroll.win11.ScrollPaneWin11 scrollPaneWin112;
    private javax.swing.JTable tblTaiKhoan;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMaChucVu;
    private javax.swing.JTextField txtMaPhongBan;
    private javax.swing.JTextField txtMatKhau;
    private com.toedter.calendar.JDateChooser txtNgayCapQuyen;
    private javax.swing.JTextField txtTenDangNhap;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
