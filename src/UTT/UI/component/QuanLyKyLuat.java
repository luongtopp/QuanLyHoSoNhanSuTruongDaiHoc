package UTT.UI.component;

import UTT.DAO.KyLuatDAO;
import UTT.Model.KyLuat;
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
public class QuanLyKyLuat extends javax.swing.JPanel {

    public QuanLyKyLuat() {

        initComponents();
        btnSua.setVisible(false);
        hienThiBangKyLuat();
        if (!TaiKhoan.isAdmin) {
//            pnlChucNang.setVisible(false);
//            pnlKyLuat.setVisible(false);
        } else {
        }
                    tblKyLuat.setComponentPopupMenu(jPopupMenu1);

    }

    private void hienThiBangKyLuat() {
        DefaultTableModel model = (DefaultTableModel) tblKyLuat.getModel();
        model.setRowCount(0);
        for (KyLuat item : new KyLuatDAO().hienThiKyLuat()) {
            model.addRow(
                    new Object[]{
                        item.getId(),
                        item.getMaKyLuat(),
                        item.getMaCanBo(),
                        item.getNamKyLuat(),
                        item.getHinhThucKyLuat()}
            );
        }
    }

    private void hienThiBangKyLuat(String timKiem) {
        DefaultTableModel model = (DefaultTableModel) tblKyLuat.getModel();
        model.setRowCount(0);
        for (KyLuat item : new KyLuatDAO().hienThiKyLuat(timKiem)) {
            model.addRow(
                    new Object[]{
                        item.getId(),
                        item.getMaKyLuat(),
                        item.getMaCanBo(),
                        item.getNamKyLuat(),
                        item.getHinhThucKyLuat()}
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
        scrollPaneWin111 = new UTT.UI.effect.ScrollPaneWin11();
        jPanel1 = new javax.swing.JPanel();
        pnlTimKiem = new javax.swing.JPanel();
        btnTimKiem = new javax.swing.JButton();
        txtTimKiem = new javax.swing.JTextField();
        btnLamMoi = new javax.swing.JButton();
        pnlKyLuat = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMaKyLuat = new javax.swing.JTextField();
        txtHinhThucKyLuat = new javax.swing.JTextField();
        txtMaCanBo = new javax.swing.JTextField();
        txtNamKyLuat = new com.toedter.calendar.JDateChooser();
        pnlChucNang = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        scrollPaneWin112 = new UTT.UI.effect.ScrollPaneWin11();
        tblKyLuat = new javax.swing.JTable();

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

        pnlKyLuat.setBorder(javax.swing.BorderFactory.createTitledBorder("Người thân"));
        pnlKyLuat.setPreferredSize(new java.awt.Dimension(288, 47));
        pnlKyLuat.setRequestFocusEnabled(false);
        pnlKyLuat.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Mã kỷ luật:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlKyLuat.add(jLabel1, gridBagConstraints);

        jLabel2.setText("Mã cán bộ:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlKyLuat.add(jLabel2, gridBagConstraints);

        jLabel5.setText("Năm kỷ luật:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 100, 5, 5);
        pnlKyLuat.add(jLabel5, gridBagConstraints);

        jLabel6.setText("Hình thức kỷ luật:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 100, 5, 5);
        pnlKyLuat.add(jLabel6, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 123;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlKyLuat.add(txtMaKyLuat, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 123;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlKyLuat.add(txtHinhThucKyLuat, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 123;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlKyLuat.add(txtMaCanBo, gridBagConstraints);

        txtNamKyLuat.setDateFormatString("yyyy-MM-dd");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 97;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlKyLuat.add(txtNamKyLuat, gridBagConstraints);

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
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 12, 12);
        pnlChucNang.add(btnHuy, gridBagConstraints);

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

        scrollPaneWin112.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPaneWin112.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPaneWin112.setViewportView(null);

        tblKyLuat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Mã kỷ luật", "Mã cán bộ", "Năm kỷ luật", "Hình thức kỷ luật"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblKyLuat.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblKyLuat.setAutoscrolls(false);
        scrollPaneWin112.setViewportView(tblKyLuat);
        if (tblKyLuat.getColumnModel().getColumnCount() > 0) {
            tblKyLuat.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblKyLuat.getColumnModel().getColumn(2).setPreferredWidth(200);
            tblKyLuat.getColumnModel().getColumn(3).setPreferredWidth(200);
            tblKyLuat.getColumnModel().getColumn(4).setPreferredWidth(500);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlChucNang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(scrollPaneWin112, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlKyLuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, 854, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pnlTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlKyLuat, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlChucNang, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(scrollPaneWin112, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        scrollPaneWin111.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPaneWin111, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 865, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPaneWin111, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        hienThiBangKyLuat(txtTimKiem.getText());
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed

        txtTimKiem.setText("");
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        String maKyLuat = txtMaCanBo.getText();
        if (maKyLuat == null || maKyLuat.trim().isEmpty()) {
            maKyLuat = JOptionPane.showInputDialog("Nhập lại mã kỷ luật:");
            txtMaKyLuat.setText(maKyLuat);
        }
        String maCanBo = txtMaCanBo.getText();
        if (maCanBo == null || maCanBo.trim().isEmpty()) {
            maCanBo = JOptionPane.showInputDialog("Nhập lại mã cán bộ:");
            txtMaCanBo.setText(maCanBo);
        }

        Date ngayKyLuat = txtNamKyLuat.getDate();
        if (ngayKyLuat == null) {
            JOptionPane.showMessageDialog(null, "Nhập lại ngày kỷ luật");
        }

        String hinhThucKyLuat = txtHinhThucKyLuat.getText();
        if (hinhThucKyLuat == null || hinhThucKyLuat.trim().isEmpty()) {
            hinhThucKyLuat = JOptionPane.showInputDialog("Nhập lại nghề nghiệp:");
            txtHinhThucKyLuat.setText(hinhThucKyLuat);
        }
        try {
            new KyLuatDAO().themKyLuat(maKyLuat,
                    maCanBo, ngayKyLuat, hinhThucKyLuat,
                    null);
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyKyLuat.class.getName()).log(Level.SEVERE, null, ex);
        }
        hienThiBangKyLuat();

    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        String maKyLuat = txtMaCanBo.getText();
        if (maKyLuat == null || maKyLuat.trim().isEmpty()) {
            maKyLuat = JOptionPane.showInputDialog("Nhập lại mã kỷ luật:");
            txtMaKyLuat.setText(maKyLuat);
        }
        String maCanBo = txtMaCanBo.getText();
        if (maCanBo == null || maCanBo.trim().isEmpty()) {
            maCanBo = JOptionPane.showInputDialog("Nhập lại mã cán bộ:");
            txtMaCanBo.setText(maCanBo);
        }

        Date ngayKyLuat = txtNamKyLuat.getDate();
        if (ngayKyLuat == null) {
            JOptionPane.showMessageDialog(null, "Nhập lại ngày kỷ luật");
        }

        String hinhThucKyLuat = txtHinhThucKyLuat.getText();
        if (hinhThucKyLuat == null || hinhThucKyLuat.trim().isEmpty()) {
            hinhThucKyLuat = JOptionPane.showInputDialog("Nhập lại nghề nghiệp:");
            txtHinhThucKyLuat.setText(hinhThucKyLuat);
        }
        try {
            new KyLuatDAO().suaKyLuat(id, maKyLuat,
                    maCanBo, ngayKyLuat, hinhThucKyLuat,
                    null);
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyKyLuat.class.getName()).log(Level.SEVERE, null, ex);
        }
        hienThiBangKyLuat();

    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int dialogResult = JOptionPane.showConfirmDialog(null,
                "Bạn có muốn tiếp tục thực hiện câu lệnh không?",
                "Thông báo", JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {
            try {
                new KyLuatDAO().xoaKyLuat(id);
                hienThiBangKyLuat();
            } catch (SQLException ex) {
                Logger.getLogger(QuanLyKyLuat.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {

        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void menuItemSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSuaActionPerformed
        btnSua.setVisible(true);
        id = Integer.parseInt((tblKyLuat.getModel().getValueAt(tblKyLuat.getSelectedRow(), 0).toString()));
        txtMaKyLuat.setText(tblKyLuat.getModel().getValueAt(tblKyLuat.getSelectedRow(), 1).toString());
        txtMaCanBo.setText(tblKyLuat.getModel().getValueAt(tblKyLuat.getSelectedRow(), 2).toString());
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date namKyLuat = null;
        try {
            namKyLuat = df.parse(tblKyLuat.getModel().getValueAt(tblKyLuat.getSelectedRow(), 3).toString());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        txtNamKyLuat.setDate(namKyLuat);

        txtHinhThucKyLuat.setText(tblKyLuat.getModel().getValueAt(tblKyLuat.getSelectedRow(), 4).toString());
    }//GEN-LAST:event_menuItemSuaActionPerformed

    private void menuItemXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemXoaActionPerformed
        int dialogResult = JOptionPane.showConfirmDialog(null,
                "Bạn có muốn tiếp tục thực hiện câu lệnh không?",
                "Thông báo", JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {
            try {
                new KyLuatDAO().xoaKyLuat(Integer.parseInt(
                        tblKyLuat.getModel().getValueAt(
                                tblKyLuat.getSelectedRow(), 0).toString()));
            } catch (SQLException ex) {
                Logger.getLogger(QuanLyKyLuat.class.getName()).log(Level.SEVERE, null, ex);
            }
            hienThiBangKyLuat();
        }
    }//GEN-LAST:event_menuItemXoaActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        txtMaKyLuat.setText("");       
        txtMaCanBo.setText("");
        txtNamKyLuat.setDate(null);
        txtHinhThucKyLuat.setText("");
        btnSua.setVisible(false);

    }//GEN-LAST:event_btnHuyActionPerformed

    private int id;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JMenuItem menuItemSua;
    private javax.swing.JMenuItem menuItemXoa;
    private javax.swing.JPanel pnlChucNang;
    private javax.swing.JPanel pnlKyLuat;
    private javax.swing.JPanel pnlTimKiem;
    private UTT.UI.effect.ScrollPaneWin11 scrollPaneWin111;
    private UTT.UI.effect.ScrollPaneWin11 scrollPaneWin112;
    private javax.swing.JTable tblKyLuat;
    private javax.swing.JTextField txtHinhThucKyLuat;
    private javax.swing.JTextField txtMaCanBo;
    private javax.swing.JTextField txtMaKyLuat;
    private com.toedter.calendar.JDateChooser txtNamKyLuat;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
