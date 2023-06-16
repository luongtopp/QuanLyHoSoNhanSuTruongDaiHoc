package UTT.UI.component;

import UTT.DAO.DAOChucVu;
import UTT.Model.ChucVu;
import UTT.Model.TaiKhoan;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pvant
 */
public class QuanLyChucVu extends javax.swing.JPanel {

    public QuanLyChucVu() {
        initComponents();
        hienThiBangChucVu();
//        System.out.println("Trang thai cua tai khoan la: " + TaiKhoan.isAdmin);
        if (!TaiKhoan.isAdmin) {
            pnlQuanLyChucVu.setVisible(false);
            pnlChucNang.setVisible(false);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel3 = new javax.swing.JPanel();
        txtTimKiem = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        pnlQuanLyChucVu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMaChucVu = new javax.swing.JTextField();
        txtTenChucVu = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMaBacNgach = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMaPhuCap = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtMaLuong = new javax.swing.JTextField();
        pnlChucNang = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblChucVu = new javax.swing.JTable();

        jPanel3.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 169;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 12, 12);
        jPanel3.add(txtTimKiem, gridBagConstraints);

        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 12, 12);
        jPanel3.add(btnTimKiem, gridBagConstraints);

        btnLamMoi.setText("Làm mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        jPanel3.add(btnLamMoi, gridBagConstraints);

        pnlQuanLyChucVu.setBorder(javax.swing.BorderFactory.createTitledBorder("Quản lý chức vụ"));

        jLabel1.setText("Mã chức vụ");

        jLabel2.setText("Tên chức vụ");

        jLabel3.setText("Mã Phụ cấp");

        jLabel4.setText("Mã bậc ngạch");

        jLabel5.setText("Mã lương");

        javax.swing.GroupLayout pnlQuanLyChucVuLayout = new javax.swing.GroupLayout(pnlQuanLyChucVu);
        pnlQuanLyChucVu.setLayout(pnlQuanLyChucVuLayout);
        pnlQuanLyChucVuLayout.setHorizontalGroup(
            pnlQuanLyChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQuanLyChucVuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlQuanLyChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlQuanLyChucVuLayout.createSequentialGroup()
                        .addGroup(pnlQuanLyChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlQuanLyChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlQuanLyChucVuLayout.createSequentialGroup()
                                .addComponent(txtMaBacNgach, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtMaPhuCap))
                            .addGroup(pnlQuanLyChucVuLayout.createSequentialGroup()
                                .addComponent(txtMaChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTenChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlQuanLyChucVuLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMaLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        pnlQuanLyChucVuLayout.setVerticalGroup(
            pnlQuanLyChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQuanLyChucVuLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnlQuanLyChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMaChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtTenChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlQuanLyChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMaBacNgach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaPhuCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(pnlQuanLyChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtMaLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        tblChucVu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã chức vụ", "Tên chức vụ", "Mã bậc ngạch", "Mã phụ cấp", "Mã lương"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblChucVu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblChucVuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblChucVu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlQuanLyChucVu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlChucNang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlQuanLyChucVu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlChucNang, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void hienThiBangChucVu() {
        DefaultTableModel model = (DefaultTableModel) tblChucVu.getModel();
        model.setRowCount(0);
        for (ChucVu item : new DAOChucVu().timChucVu()) {
            model.addRow(new Object[]{
                item.getMaChucVu(),
                item.getTenChucVu(),
                item.getMaPhuCap(),
                item.getMaBacNgach(),
                item.getMaLuong()

            });
        }
    }

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        String MaChucVu = txtMaChucVu.getText();
        String TenChucVu = txtTenChucVu.getText();
        String MaPhuCap = txtMaPhuCap.getText();
        String MaBacNgach = txtMaBacNgach.getText();
        String MaLuong = txtMaLuong.getText();

        if (MaChucVu.equals("") || TenChucVu.equals("") || MaPhuCap.equals("") || MaBacNgach.equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin Chức vụ!");
        } else {
            DAOChucVu DAOchucvu = new DAOChucVu();
            try {
                DAOchucvu.themChucVu(MaChucVu, TenChucVu, MaPhuCap, MaBacNgach, MaLuong);
                JOptionPane.showMessageDialog(this, "Thêm Chức vụ thành công!");
            } catch (SQLException ex) {
                //Logger.getLogger(DangKyJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }

            hienThiBangChucVu();
        }


    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        String MaChucVu = txtMaChucVu.getText();
        String TenChucVu = txtTenChucVu.getText();
        String MaPhuCap = txtMaPhuCap.getText();
        String MaBacNgach = txtMaBacNgach.getText();
        String MaLuong = txtMaLuong.getText();

        if (MaChucVu.equals("") || TenChucVu.equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin Chức vụ!");
        } else {
            DAOChucVu DAOchucvu = new DAOChucVu();
            try {
                DAOchucvu.suaChucVu(MaChucVu, TenChucVu, MaPhuCap, MaBacNgach, MaLuong);
                JOptionPane.showMessageDialog(this, "Sửa Chức vụ thành công!");
            } catch (SQLException ex) {
                //Logger.getLogger(DangKyJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }

            hienThiBangChucVu();
        }

    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        String MaChucVu = txtMaChucVu.getText();
        DAOChucVu DAOchucvu = new DAOChucVu();
        try {
            DAOchucvu.xoaChucVu(MaChucVu);
        } catch (SQLException ex) {
            //Logger.getLogger(DangKyJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

        hienThiBangChucVu();

    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void tblChucVuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblChucVuMouseClicked
        int row = tblChucVu.getSelectedRow();
        String MaChucVu = tblChucVu.getValueAt(row, 0).toString();
        String TenChucVu = tblChucVu.getValueAt(row, 1).toString();
        String maPhuCap = tblChucVu.getValueAt(row, 2).toString();
        String maBacNgach = tblChucVu.getValueAt(row, 3).toString();
        String maLuong = tblChucVu.getValueAt(row, 4).toString();

        //  String PhuCap = tblChucVu.getValueAt(row, 2).toString();
        txtMaChucVu.setText(MaChucVu);
        txtTenChucVu.setText(TenChucVu);
        txtMaPhuCap.setText(maPhuCap);
        txtMaBacNgach.setText(maBacNgach);
        txtMaLuong.setText(maLuong);

        txtMaChucVu.setEditable(false);
    }//GEN-LAST:event_tblChucVuMouseClicked

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed

    }//GEN-LAST:event_btnTimKiemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlChucNang;
    private javax.swing.JPanel pnlQuanLyChucVu;
    private javax.swing.JTable tblChucVu;
    private javax.swing.JTextField txtMaBacNgach;
    private javax.swing.JTextField txtMaChucVu;
    private javax.swing.JTextField txtMaLuong;
    private javax.swing.JTextField txtMaPhuCap;
    private javax.swing.JTextField txtTenChucVu;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
