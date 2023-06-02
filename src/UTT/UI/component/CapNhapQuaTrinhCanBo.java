/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UTT.UI.component;

import UTT.DAO.CanBoDAO;
import UTT.DAO.DAOPhongBan;
import UTT.DAO.DAOQuaTrinhCongTac;
import UTT.Model.CanBo;
import UTT.Model.QuaTrinhCongTac;
import UTT.Model.TaiKhoan;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pvant
 */
public class CapNhapQuaTrinhCanBo extends javax.swing.JPanel {

    /**
     * Creates new form QuanLyPhongBan
     */
    public CapNhapQuaTrinhCanBo() {
        initComponents();
        hienThiBangQuaTrinhCongTac();
        if (!TaiKhoan.isAdmin) {
            pnlChucNang.setVisible(false);
            pnlQuaTrinhCongTac.setVisible(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pnlTimKiem = new javax.swing.JPanel();
        txtTiemKiem = new javax.swing.JTextField();
        btnTimKiem3 = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        pnlQuaTrinhCongTac = new javax.swing.JPanel();
        jpDaoTao1 = new javax.swing.JPanel();
        dtpThoiGianBatDau = new com.toedter.calendar.JDateChooser();
        dtpThoiGianKetThuc = new com.toedter.calendar.JDateChooser();
        txtChucVuCaoNhat = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtCongViec = new javax.swing.JTextField();
        txtNoiLamViec = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtMaCanBo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTenCanBo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtQueQuan = new javax.swing.JTextField();
        cboGioiTinh = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dtpNgaySinh = new com.toedter.calendar.JDateChooser();
        btnTimKiemCanBo = new javax.swing.JButton();
        pnlChucNang = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblQuaTrinhCongTac = new javax.swing.JTable();

        pnlTimKiem.setPreferredSize(new java.awt.Dimension(878, 47));
        pnlTimKiem.setLayout(new java.awt.GridBagLayout());

        txtTiemKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTiemKiemActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 169;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 12, 12);
        pnlTimKiem.add(txtTiemKiem, gridBagConstraints);

        btnTimKiem3.setText("Tìm kiếm");
        btnTimKiem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiem3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 12, 12);
        pnlTimKiem.add(btnTimKiem3, gridBagConstraints);

        btnLamMoi.setText("Làm mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        pnlTimKiem.add(btnLamMoi, gridBagConstraints);

        pnlQuaTrinhCongTac.setBorder(javax.swing.BorderFactory.createTitledBorder("Quá trình công tác"));

        jpDaoTao1.setRequestFocusEnabled(false);

        dtpThoiGianBatDau.setDateFormatString("dd/MM/yyyy");

        dtpThoiGianKetThuc.setDateFormatString("dd/MM/yyyy");

        txtChucVuCaoNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChucVuCaoNhatActionPerformed(evt);
            }
        });

        jLabel19.setText("Thời gian bắt đầu");

        jLabel20.setText("THời gian kết thúc");

        jLabel21.setText("Công việc");

        txtCongViec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCongViecActionPerformed(evt);
            }
        });

        jLabel22.setText("Nới công tác");

        jLabel23.setText("Chức vụ cao nhất");

        javax.swing.GroupLayout jpDaoTao1Layout = new javax.swing.GroupLayout(jpDaoTao1);
        jpDaoTao1.setLayout(jpDaoTao1Layout);
        jpDaoTao1Layout.setHorizontalGroup(
            jpDaoTao1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDaoTao1Layout.createSequentialGroup()
                .addGroup(jpDaoTao1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDaoTao1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpDaoTao1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))
                        .addGroup(jpDaoTao1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpDaoTao1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(dtpThoiGianKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpDaoTao1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(dtpThoiGianBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addGroup(jpDaoTao1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpDaoTao1Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtChucVuCaoNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpDaoTao1Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNoiLamViec, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jpDaoTao1Layout.createSequentialGroup()
                        .addGap(331, 331, 331)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(txtCongViec, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13))
        );
        jpDaoTao1Layout.setVerticalGroup(
            jpDaoTao1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDaoTao1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jpDaoTao1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpDaoTao1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel22)
                        .addComponent(txtNoiLamViec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dtpThoiGianBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpDaoTao1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDaoTao1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel23)
                        .addComponent(txtChucVuCaoNhat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dtpThoiGianKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpDaoTao1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCongViec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Mã cán bộ");

        txtMaCanBo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaCanBoActionPerformed(evt);
            }
        });

        jLabel2.setText("Tên cán bộ");

        txtTenCanBo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenCanBoActionPerformed(evt);
            }
        });

        jLabel3.setText("Giới tính");

        txtQueQuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQueQuanActionPerformed(evt);
            }
        });

        cboGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ", " " }));

        jLabel4.setText("Quê quán");

        jLabel5.setText("Ngày sinh");

        dtpNgaySinh.setDateFormatString("dd/MM/yyyy");

        btnTimKiemCanBo.setText("Kiểm tra thông tin cán bộ");
        btnTimKiemCanBo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemCanBoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMaCanBo, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTenCanBo)
                            .addComponent(cboGioiTinh, 0, 144, Short.MAX_VALUE))))
                .addGap(56, 56, 56)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTimKiemCanBo)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dtpNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtQueQuan, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(112, 112, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMaCanBo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addComponent(jLabel1)
                    .addComponent(dtpNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTenCanBo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtQueQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cboGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiemCanBo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlQuaTrinhCongTacLayout = new javax.swing.GroupLayout(pnlQuaTrinhCongTac);
        pnlQuaTrinhCongTac.setLayout(pnlQuaTrinhCongTacLayout);
        pnlQuaTrinhCongTacLayout.setHorizontalGroup(
            pnlQuaTrinhCongTacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQuaTrinhCongTacLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlQuaTrinhCongTacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlQuaTrinhCongTacLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jpDaoTao1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlQuaTrinhCongTacLayout.setVerticalGroup(
            pnlQuaTrinhCongTacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlQuaTrinhCongTacLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpDaoTao1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
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

        tblQuaTrinhCongTac.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        tblQuaTrinhCongTac.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã cán bộ", "Ngày bắt đầu", "Ngày kết thúc", "Công việc", "Nơi công tác", "Chức vụ cao nhất"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblQuaTrinhCongTac.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        tblQuaTrinhCongTac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblQuaTrinhCongTacMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblQuaTrinhCongTac);
        if (tblQuaTrinhCongTac.getColumnModel().getColumnCount() > 0) {
            tblQuaTrinhCongTac.getColumnModel().getColumn(5).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTimKiem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 884, Short.MAX_VALUE)
            .addComponent(pnlQuaTrinhCongTac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addComponent(pnlChucNang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlQuaTrinhCongTac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlChucNang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void hienThiBangQuaTrinhCongTac() {
        DefaultTableModel model = (DefaultTableModel) tblQuaTrinhCongTac.getModel();
        model.setRowCount(0);
        for (QuaTrinhCongTac item : new DAOQuaTrinhCongTac().timQuaTrinhCongTac()) {
            model.addRow(new Object[]{
                item.getMaCanBo(),
                item.getThoiGianBatDau(),
                item.getThoiGianKetThuc(),
                item.getCongViec(),
                item.getNoiCongTac(),
                item.getChucVuCaoNhat(),});
        }
    }

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        String maCanBo = txtMaCanBo.getText();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String ngayBatDau = df.format(dtpThoiGianBatDau.getDate());
        String ngayKetThuc = df.format(dtpThoiGianKetThuc.getDate());
        String congViec = txtCongViec.getText();
        String noiCongTac = txtNoiLamViec.getText();
        String chucVuCaoNhat = txtChucVuCaoNhat.getText();

        if (maCanBo.equals("") || ngayBatDau.equals("")
                || ngayKetThuc.equals("") || congViec.equals("") || noiCongTac.equals("") || chucVuCaoNhat.equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin Quá trình công tác cán bộ!");
        } else {
            DAOQuaTrinhCongTac quatrinhcongtac = new DAOQuaTrinhCongTac();
            try {
                quatrinhcongtac.themQuaTrinhCongTac(maCanBo, ngayBatDau, ngayKetThuc, congViec, noiCongTac, chucVuCaoNhat);
                JOptionPane.showMessageDialog(this, "Thêm Quá trình công tác của cán bộ thành công!");
            } catch (SQLException ex) {
                //Logger.getLogger(DangKyJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }

            hienThiBangQuaTrinhCongTac();
        }

    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        String maCanBo = txtMaCanBo.getText();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String ngayBatDau = df.format(dtpThoiGianBatDau.getDate());
        String ngayKetThuc = df.format(dtpThoiGianKetThuc.getDate());
        String congViec = txtCongViec.getText();
        String noiCongTac = txtNoiLamViec.getText();
        String chucVuCaoNhat = txtChucVuCaoNhat.getText();

        if (maCanBo.equals("") || ngayBatDau.equals("")
                || ngayKetThuc.equals("") || congViec.equals("") || noiCongTac.equals("") || chucVuCaoNhat.equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin Quá trình công tác cán bộ!");
        } else {
            DAOQuaTrinhCongTac quatrinhcongtac = new DAOQuaTrinhCongTac();
            try {
                quatrinhcongtac.suaQuaTrinhCongTac(maCanBo, ngayBatDau, ngayKetThuc, congViec, noiCongTac, chucVuCaoNhat);
                JOptionPane.showMessageDialog(this, "Sửa Quá trình công tác của cán bộ thành công!");
            } catch (SQLException ex) {
                //Logger.getLogger(DangKyJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }

            hienThiBangQuaTrinhCongTac();

        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        String maCanBo = txtMaCanBo.getText();

        if (maCanBo.equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập Mã cán bộ!");
        } else {
            DAOQuaTrinhCongTac quatrinhcongtac = new DAOQuaTrinhCongTac();
            try {
                quatrinhcongtac.xoaQuaTrinhCongTac(maCanBo);
                JOptionPane.showMessageDialog(this, "Xóa Quá trình công tác của cán bộ thành công!");
            } catch (SQLException ex) {
                //Logger.getLogger(DangKyJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }

            hienThiBangQuaTrinhCongTac();

        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        txtTenCanBo.setText("");
        cboGioiTinh.setSelectedIndex(-1);
        dtpThoiGianBatDau.setDate(null);
        dtpThoiGianKetThuc.setDate(null);
        dtpNgaySinh.setDate(null);
        txtCongViec.setText("");
        txtNoiLamViec.setText("");
        txtChucVuCaoNhat.setText("");
        txtQueQuan.setText("");

        hienThiBangQuaTrinhCongTac();
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void txtChucVuCaoNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChucVuCaoNhatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtChucVuCaoNhatActionPerformed

    private void txtCongViecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCongViecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCongViecActionPerformed

    private void txtMaCanBoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaCanBoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaCanBoActionPerformed

    private void txtTenCanBoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenCanBoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenCanBoActionPerformed

    private void txtQueQuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQueQuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQueQuanActionPerformed

    private void btnTimKiemCanBoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemCanBoActionPerformed
        String maCanBo = txtMaCanBo.getText();
        try {
            List<CanBo> listQTCT = new DAOQuaTrinhCongTac().timKiemCanBo(maCanBo);
            if (listQTCT.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Không tìm thấy Cán bộ có mã trên!");
            } else {
                for (CanBo item : listQTCT) {
                    txtTenCanBo.setText(item.getHoTenKhaiSinh());
                    DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                    Date ngaySinh = null;
                    try {
                        ngaySinh = df.parse(item.getNgaySinh().toString());
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    dtpNgaySinh.setDate(ngaySinh);
                    String gioiTinh = item.getGioiTinh();
                    int i = 0;
                    while (true) {
                        String nameFromCbbox = cboGioiTinh.getItemAt(i).toString();
                        if (nameFromCbbox.equalsIgnoreCase(gioiTinh)) {
                            cboGioiTinh.setSelectedIndex(i);
                            break;
                        }
                        i++;
                    }
                    txtQueQuan.setText(item.getQueQuan());
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(CapNhapQuaTrinhCanBo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnTimKiemCanBoActionPerformed

    private void tblQuaTrinhCongTacMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblQuaTrinhCongTacMouseClicked
        int row = tblQuaTrinhCongTac.getSelectedRow();
        String maCanBo = tblQuaTrinhCongTac.getValueAt(row, 0).toString();
        String thoiGianBatDau = tblQuaTrinhCongTac.getValueAt(row, 1).toString();
        // Định dạng chuỗi ngày/tháng từ bảng thành đối tượng Date
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date ngayBatDau = null;
        try {
            ngayBatDau = sdf.parse(thoiGianBatDau);
        } catch (ParseException ex) {
            Logger.getLogger(CapNhapQuaTrinhCanBo.class.getName()).log(Level.SEVERE, null, ex);
        }

        String thoiGianKetThuc = tblQuaTrinhCongTac.getValueAt(row, 2).toString();
        Date ngayKetThuc = null;
        try {
            ngayKetThuc = sdf.parse(thoiGianKetThuc);
        } catch (ParseException ex) {
            Logger.getLogger(CapNhapQuaTrinhCanBo.class.getName()).log(Level.SEVERE, null, ex);
        }
        String congViec = tblQuaTrinhCongTac.getValueAt(row, 3).toString();
        String noiCongTac = tblQuaTrinhCongTac.getValueAt(row, 4).toString();
        String chucVuCaoNhat = tblQuaTrinhCongTac.getValueAt(row, 5).toString();

        txtMaCanBo.setText(maCanBo);
        dtpThoiGianBatDau.setDate(ngayBatDau);
        dtpThoiGianKetThuc.setDate(ngayKetThuc);
        txtCongViec.setText(congViec);
        txtNoiLamViec.setText(noiCongTac);
        txtChucVuCaoNhat.setText(chucVuCaoNhat);
    }//GEN-LAST:event_tblQuaTrinhCongTacMouseClicked

    private void txtTiemKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTiemKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTiemKiemActionPerformed

    private void btnTimKiem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiem3ActionPerformed
        String MaCanBo = txtTiemKiem.getText();
        DefaultTableModel model = (DefaultTableModel) tblQuaTrinhCongTac.getModel();
        model.setRowCount(0);
        try {
            List<QuaTrinhCongTac> listQTCT = new DAOQuaTrinhCongTac().timKiemQuaTrinhCongTac(MaCanBo);
            if (listQTCT.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Không tìm thấy Cán bộ có mã trên!");
            } else {
                for (QuaTrinhCongTac item : listQTCT) {
                    model.addRow(new Object[]{
                        item.getMaCanBo(),
                        item.getThoiGianBatDau(),
                        item.getThoiGianKetThuc(),
                        item.getCongViec(),
                        item.getNoiCongTac(),
                        item.getChucVuCaoNhat()
                    }
                    );
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(CapNhapQuaTrinhCanBo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnTimKiem3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem3;
    private javax.swing.JButton btnTimKiemCanBo;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cboGioiTinh;
    private com.toedter.calendar.JDateChooser dtpNgaySinh;
    private com.toedter.calendar.JDateChooser dtpThoiGianBatDau;
    private com.toedter.calendar.JDateChooser dtpThoiGianKetThuc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpDaoTao1;
    private javax.swing.JPanel pnlChucNang;
    private javax.swing.JPanel pnlQuaTrinhCongTac;
    private javax.swing.JPanel pnlTimKiem;
    private javax.swing.JTable tblQuaTrinhCongTac;
    private javax.swing.JTextField txtChucVuCaoNhat;
    private javax.swing.JTextField txtCongViec;
    private javax.swing.JTextField txtMaCanBo;
    private javax.swing.JTextField txtNoiLamViec;
    private javax.swing.JTextField txtQueQuan;
    private javax.swing.JTextField txtTenCanBo;
    private javax.swing.JTextField txtTiemKiem;
    // End of variables declaration//GEN-END:variables
}
