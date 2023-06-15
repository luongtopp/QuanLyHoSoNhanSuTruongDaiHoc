package UTT.UI.component;

import UTT.DAO.CanBoDAO;
import UTT.DAO.ChucVuDAO;
import UTT.DAO.PhongBanDAO;
import UTT.Model.CanBo;
import UTT.Model.ChucVu;
import UTT.Model.PhongBan;
import UTT.Model.TaiKhoan;
import java.awt.Component;
import java.awt.Image;
import java.io.File;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

/**
 *
 * @author luongtopp
 */
public class QuanLyThongTinCanBo extends javax.swing.JPanel {

    public QuanLyThongTinCanBo() {
        initComponents();
        ButtonGroup bg = new ButtonGroup();
        bg.add(rdoNam);
        bg.add(rdoNu);
        hienThiBangCanBo();
        hienThiBangPhongBan();
        hienThiBangChucVu();
        cboTenChucVu.setPrototypeDisplayValue("");
        cboTenPhongBan.setPrototypeDisplayValue("");
//        System.out.println("Trang thai cua tai khoan la: " + TaiKhoan.isAdmin);
        if (!TaiKhoan.isAdmin) {

            pnlCaNhanCha.setVisible(false);
            pnlCongViecCha.setVisible(false);
            pnlChucNang.setVisible(false);
        } else {
        }
        tblCanBo.setComponentPopupMenu(jPopupMenu1);

//        cboTenPhongBan.setSelectedIndex(-1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPopupMenu1 = new javax.swing.JPopupMenu();
        menuItemSua = new javax.swing.JMenuItem();
        menuItemXoa = new javax.swing.JMenuItem();
        popNhapXuatExcel = new javax.swing.JPopupMenu();
        menuItemNhapExcel = new javax.swing.JMenuItem();
        menuItemXuatExcel = new javax.swing.JMenuItem();
        scrollPaneWin111 = new UTT.UI.effect.ScrollPaneWin11();
        jPanel1 = new javax.swing.JPanel();
        pnlTimKiem = new javax.swing.JPanel();
        btnTimKiem = new javax.swing.JButton();
        txtTimKiem = new javax.swing.JTextField();
        btnLamMoi = new javax.swing.JButton();
        btnNhapXuat = new javax.swing.JButton();
        pnlCaNhanCha = new javax.swing.JPanel();
        pnlCaNhanCon = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTenKhaiSinh = new javax.swing.JTextField();
        txtQueQuan = new javax.swing.JTextField();
        txtNoiOHienTai = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtDanToc = new javax.swing.JTextField();
        txtHonNhan = new javax.swing.JTextField();
        txtSoCMND = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtTonGiao = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        pnlGioiTinh = new javax.swing.JPanel();
        rdoNu = new javax.swing.JRadioButton();
        rdoNam = new javax.swing.JRadioButton();
        txtNgaySinh = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        lblAnh = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnThemAnh = new javax.swing.JButton();
        pnlCongViecCha = new javax.swing.JPanel();
        pnlCongViecCon = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtMaCanBo = new javax.swing.JTextField();
        txtMaPhongBan = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtCongViecDuocGiao = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        cboTenPhongBan = new javax.swing.JComboBox<>();
        cboTenChucVu = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtChuyenNganhDaoTao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtNoiDaoTao = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtTrinhDoNgoaiNgu = new javax.swing.JTextField();
        txtMaChucVu = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtNgayHopDong = new com.toedter.calendar.JDateChooser();
        txtNamTotNghiep = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        pnlChucNang = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        scrollPaneWin112 = new UTT.UI.effect.ScrollPaneWin11();
        tblCanBo = new javax.swing.JTable();

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

        menuItemNhapExcel.setText("jMenuItem1");
        menuItemNhapExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemNhapExcelActionPerformed(evt);
            }
        });
        popNhapXuatExcel.add(menuItemNhapExcel);

        menuItemXuatExcel.setText("jMenuItem1");
        menuItemXuatExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemXuatExcelActionPerformed(evt);
            }
        });
        popNhapXuatExcel.add(menuItemXuatExcel);

        setPreferredSize(new java.awt.Dimension(866, 728));

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
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 12, 12);
        pnlTimKiem.add(btnTimKiem, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 300;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
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
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 70);
        pnlTimKiem.add(btnLamMoi, gridBagConstraints);

        btnNhapXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTT/UI/Anh/excel.png"))); // NOI18N
        btnNhapXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNhapXuatMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 12, 12);
        pnlTimKiem.add(btnNhapXuat, gridBagConstraints);

        pnlCaNhanCha.setLayout(new java.awt.BorderLayout());

        pnlCaNhanCon.setBorder(javax.swing.BorderFactory.createTitledBorder("Cá nhân"));
        pnlCaNhanCon.setPreferredSize(new java.awt.Dimension(552, 250));
        pnlCaNhanCon.setRequestFocusEnabled(false);

        jLabel1.setText("Tên khai sinh:");

        jLabel2.setText("Ngày sinh:");

        jLabel5.setText("Quên quán:");

        jLabel6.setText("Nơi ở hiện tại:");

        jLabel7.setText("Hôn nhân:");

        jLabel8.setText("Số CMND:");

        jLabel9.setText("Email:");

        jLabel10.setText("Dân tộc:");

        jLabel11.setText("Tôn giáo:");

        jLabel12.setText("Giới tính:");

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

        txtNgaySinh.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 165, Short.MAX_VALUE)
        );

        jLabel16.setText("Ảnh:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 165, Short.MAX_VALUE)
        );

        btnThemAnh.setText("Thêm");
        btnThemAnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemAnhActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCaNhanConLayout = new javax.swing.GroupLayout(pnlCaNhanCon);
        pnlCaNhanCon.setLayout(pnlCaNhanConLayout);
        pnlCaNhanConLayout.setHorizontalGroup(
            pnlCaNhanConLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCaNhanConLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pnlCaNhanConLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel12))
                .addGap(10, 10, 10)
                .addGroup(pnlCaNhanConLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTenKhaiSinh)
                    .addComponent(txtQueQuan)
                    .addComponent(txtNoiOHienTai)
                    .addComponent(pnlGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlCaNhanConLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11))
                .addGap(10, 10, 10)
                .addGroup(pnlCaNhanConLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDanToc, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHonNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTonGiao, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoCMND, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(pnlCaNhanConLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCaNhanConLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(21, 21, 21)
                        .addComponent(btnThemAnh))
                    .addComponent(lblAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        pnlCaNhanConLayout.setVerticalGroup(
            pnlCaNhanConLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCaNhanConLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addGap(16, 16, 16)
                .addComponent(jLabel5)
                .addGap(16, 16, 16)
                .addComponent(jLabel6)
                .addGap(21, 21, 21)
                .addComponent(jLabel12))
            .addGroup(pnlCaNhanConLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(txtTenKhaiSinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtQueQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtNoiOHienTai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(pnlGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlCaNhanConLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlCaNhanConLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel10)
                .addGap(16, 16, 16)
                .addComponent(jLabel7)
                .addGap(16, 16, 16)
                .addComponent(jLabel8)
                .addGap(16, 16, 16)
                .addComponent(jLabel9)
                .addGap(21, 21, 21)
                .addComponent(jLabel11))
            .addGroup(pnlCaNhanConLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(txtDanToc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtHonNhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtTonGiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(txtSoCMND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlCaNhanConLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlCaNhanConLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(pnlCaNhanConLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCaNhanConLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel16))
                    .addComponent(btnThemAnh))
                .addGap(10, 10, 10)
                .addComponent(lblAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlCaNhanCha.add(pnlCaNhanCon, java.awt.BorderLayout.CENTER);

        pnlCongViecCha.setLayout(new java.awt.BorderLayout());

        pnlCongViecCon.setBorder(javax.swing.BorderFactory.createTitledBorder("Công việc"));

        jLabel13.setText("Mã cán bộ:");

        jLabel15.setText("Tên phòng ban:");

        jLabel17.setText("Mã phòng ban:");

        jLabel18.setText("Ngày hợp đồng:");

        txtMaPhongBan.setEnabled(false);

        jLabel22.setText("Công việc được giao:");

        jLabel25.setText("Chức vụ hiện tại:");

        cboTenPhongBan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        cboTenPhongBan.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cboTenPhongBan.setMaximumSize(new java.awt.Dimension(72, 23));
        cboTenPhongBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTenPhongBanActionPerformed(evt);
            }
        });

        cboTenChucVu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        cboTenChucVu.setToolTipText("");
        cboTenChucVu.setAutoscrolls(true);
        cboTenChucVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTenChucVuActionPerformed(evt);
            }
        });

        jLabel3.setText("Chuyên ngành đào tạo:");

        jLabel4.setText("Nơi đào tạo:");

        jLabel28.setText("Năm tốt nghiệp:");

        jLabel14.setText("Trình độ ngoại ngữ:");

        txtMaChucVu.setEnabled(false);

        jLabel19.setText("Mã chức vụ:");

        txtNgayHopDong.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 198, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlCongViecConLayout = new javax.swing.GroupLayout(pnlCongViecCon);
        pnlCongViecCon.setLayout(pnlCongViecConLayout);
        pnlCongViecConLayout.setHorizontalGroup(
            pnlCongViecConLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCongViecConLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnlCongViecConLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15)
                    .addComponent(jLabel17)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGap(10, 10, 10)
                .addGroup(pnlCongViecConLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMaCanBo)
                    .addComponent(txtTrinhDoNgoaiNgu)
                    .addComponent(txtCongViecDuocGiao)
                    .addComponent(cboTenPhongBan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMaPhongBan)
                    .addComponent(txtNgayHopDong, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlCongViecConLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel28)
                    .addComponent(jLabel25)
                    .addComponent(jLabel19))
                .addGap(10, 10, 10)
                .addGroup(pnlCongViecConLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtChuyenNganhDaoTao)
                    .addComponent(txtNoiDaoTao)
                    .addComponent(txtNamTotNghiep)
                    .addComponent(txtMaChucVu)
                    .addComponent(cboTenChucVu, 0, 179, Short.MAX_VALUE))
                .addGap(8, 8, 8))
        );
        pnlCongViecConLayout.setVerticalGroup(
            pnlCongViecConLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCongViecConLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel13)
                .addGap(16, 16, 16)
                .addComponent(jLabel15)
                .addGap(16, 16, 16)
                .addComponent(jLabel17)
                .addGap(16, 16, 16)
                .addComponent(jLabel14)
                .addGap(16, 16, 16)
                .addComponent(jLabel18)
                .addGap(16, 16, 16)
                .addComponent(jLabel22))
            .addGroup(pnlCongViecConLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(txtMaCanBo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(cboTenPhongBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtMaPhongBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtTrinhDoNgoaiNgu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtNgayHopDong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtCongViecDuocGiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(pnlCongViecConLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel3)
                .addGap(16, 16, 16)
                .addComponent(jLabel4)
                .addGap(16, 16, 16)
                .addComponent(jLabel28)
                .addGap(16, 16, 16)
                .addComponent(jLabel25)
                .addGap(16, 16, 16)
                .addComponent(jLabel19))
            .addGroup(pnlCongViecConLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(txtChuyenNganhDaoTao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtNoiDaoTao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtNamTotNghiep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(cboTenChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtMaChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlCongViecCha.add(pnlCongViecCon, java.awt.BorderLayout.CENTER);

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
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 12, 12);
        pnlChucNang.add(btnHuy, gridBagConstraints);

        scrollPaneWin112.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPaneWin112.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPaneWin112.setViewportView(null);

        tblCanBo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã cán bộ", "Họ tên khai sinh", "Giới tính", "Ngày sinh", "Tình trạng hôn nhân", "Số CMND", "Quê quán", "Nơi ở hiện tại", "Email", "Dân tộc", "Tôn giáo", "Ngày hợp đồng", "Công việc được giao", "Mã chức vụ", "Chuyên ngành đào tạo", "Nơi đào tạo", "Năm tốt nghiệp", "Trình độ ngoại ngữ", "Mã phòng ban", "Ảnh"
            }
        ));
        tblCanBo.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblCanBo.setAutoscrolls(false);
        scrollPaneWin112.setViewportView(tblCanBo);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlChucNang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlCongViecCha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlCaNhanCha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(scrollPaneWin112, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pnlTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCaNhanCha, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlCongViecCha, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlChucNang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(scrollPaneWin112, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        scrollPaneWin111.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPaneWin111, javax.swing.GroupLayout.DEFAULT_SIZE, 871, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPaneWin111, javax.swing.GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    public JLabel hienThiAnh(String selectedImagePath) {

        JLabel imageLabel = new JLabel();
        ImageIcon imageicon = new ImageIcon(selectedImagePath);
        //Resize image to fixed dimensions 60 * 60 (width and height).
        Image imageIc = imageicon.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);

//        Set Description
        ImageIcon excelSetDescription = new ImageIcon(imageIc);
        excelSetDescription.setDescription(selectedImagePath);
        //Storing imageicon in a jlabel
        imageLabel.setIcon(excelSetDescription);

        //Checking if one or more field is empty
        if (imageIc == null) {
            JOptionPane.showMessageDialog(null, "One Or More Fields Are Empty");
        }
        return imageLabel;
    }

    public void themAnh() {
        // TODO add your handling code here:
//        Setting default browser location
        JFileChooser browseImageFile = new JFileChooser("//Users//luongtopp//Documents//study//UTT//junior//semester-2//software_technology//QuanLyHoSoNhanSuTruongDaiHoc//src//UTT//UI//Anh//AnhCanBo");
        //Filter image extensions
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("IMAGES", "png", "jpg", "jpeg");
        browseImageFile.addChoosableFileFilter(fnef);
        int showOpenDialogue = browseImageFile.showOpenDialog(null);

        if (showOpenDialogue == JFileChooser.APPROVE_OPTION) {
            File selectedImageFile = browseImageFile.getSelectedFile();
            selectedImagePath = selectedImageFile.getAbsolutePath();
            JOptionPane.showMessageDialog(null, selectedImagePath);
            //Display image on jlable
            ImageIcon ii = new ImageIcon(selectedImagePath);
//            Resize image to fit jlabel
            Image image = ii.getImage().getScaledInstance(lblAnh.getWidth(), lblAnh.getHeight(), Image.SCALE_SMOOTH);

            lblAnh.setIcon(new ImageIcon(image));
        }
    }

    class myTableCellRenderer implements TableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

//            Change Image column minimum width and maximum width
            TableColumn tb = tblCanBo.getColumn("Ảnh");
            tb.setMaxWidth(60);
            tb.setMinWidth(60);
            tblCanBo.setRowHeight(60);
            return (Component) value;

        }

    }

    // Hiển thị bảng CÁN BỘ không tham số
    private void hienThiBangCanBo() {
        DefaultTableModel model = (DefaultTableModel) tblCanBo.getModel();
        model.setRowCount(0);
        tblCanBo.getColumn("Ảnh").setCellRenderer(new myTableCellRenderer());
        for (CanBo item : new CanBoDAO().hienThiCanBo()) {
            model.addRow(
                    new Object[]{
                        item.getMaCanBo(),
                        item.getHoTenKhaiSinh(),
                        item.getGioiTinh(),
                        item.getNgaySinh(),
                        item.getTinhTrangHonNhan(),
                        item.getSoCMND(),
                        item.getQueQuan(),
                        item.getNoiOHienTai(),
                        item.getEmail(),
                        item.getDanToc(),
                        item.getTonGiao(),
                        item.getNgayHopDong(),
                        item.getCongViecDuocGiao(),
                        item.getMaChucVu(),
                        item.getChuyenNganhDaoTao(),
                        item.getNoiDaoTao(),
                        item.getNamTotNghiep(),
                        item.getTrinhDoNgoaiNgu(),
                        item.getMaPhongBan(),
                        hienThiAnh(item.getAnh())
                    }
            );

        }

    }

    // Hiển thị bảng CÁN BỘ có tham số
    private void hienThiBangCanBo(String timKiem) {

        DefaultTableModel model = (DefaultTableModel) tblCanBo.getModel();
        model.setRowCount(0);
        tblCanBo.getColumn("Ảnh").setCellRenderer(new myTableCellRenderer());
        for (CanBo item : new CanBoDAO().hienThiCanBo(timKiem)) {
            model.addRow(
                    new Object[]{
                        item.getMaCanBo(),
                        item.getHoTenKhaiSinh(),
                        item.getGioiTinh(),
                        item.getNgaySinh(),
                        item.getTinhTrangHonNhan(),
                        item.getSoCMND(),
                        item.getQueQuan(),
                        item.getNoiOHienTai(),
                        item.getEmail(),
                        item.getDanToc(),
                        item.getTonGiao(),
                        item.getNgayHopDong(),
                        item.getCongViecDuocGiao(),
                        item.getMaChucVu(),
                        item.getChuyenNganhDaoTao(),
                        item.getNoiDaoTao(),
                        item.getNamTotNghiep(),
                        item.getTrinhDoNgoaiNgu(),
                        item.getMaPhongBan(),
                        hienThiAnh(item.getAnh())
                    }
            );
        }
    }

    // Hiển COMBOBOX PHÒNG BAN 
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

    private void cboTenPhongBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTenPhongBanActionPerformed
        String maPhongBan = (String) cboTenPhongBan.getSelectedItem();
        if ("".equals(maPhongBan)) {
        } else {
            txtMaPhongBan.setText(new PhongBanDAO().timKiemMaPhongBan(maPhongBan).get(0).getMaPhongBan());
        }
    }//GEN-LAST:event_cboTenPhongBanActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed

        String maCanBo = txtMaCanBo.getText();
        if (maCanBo == null || maCanBo.trim().isEmpty()) {
            maCanBo = JOptionPane.showInputDialog("Nhập lại mã cán bộ:");
            txtMaCanBo.setText(maCanBo);
        }
        String hoTenKhaiSinh = txtTenKhaiSinh.getText();
        if (hoTenKhaiSinh == null || hoTenKhaiSinh.trim().isEmpty()) {
            hoTenKhaiSinh = JOptionPane.showInputDialog("Nhập lại họ tên khai sinh:");
            txtTenKhaiSinh.setText(hoTenKhaiSinh);
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
        String chuoiNgaySinh = "";
        Date ngaySinh = txtNgaySinh.getDate();
        if (ngaySinh == null) {
            JOptionPane.showMessageDialog(null, "Nhập lại ngày sinh:");
        } else {
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            chuoiNgaySinh = df.format(txtNgaySinh.getDate());
            System.out.println(ngaySinh);
        }

        String tinhTrangHonNhan = txtHonNhan.getText();
        if (tinhTrangHonNhan == null || tinhTrangHonNhan.trim().isEmpty()) {
            tinhTrangHonNhan = JOptionPane.showInputDialog("Nhập lại tình trạng hôn nhân:");
            txtHonNhan.setText(tinhTrangHonNhan);
        }

        String soCMND = txtSoCMND.getText();
        if (soCMND == null || soCMND.trim().isEmpty()) {
            soCMND = JOptionPane.showInputDialog("Nhập lại số CMND:");
            txtSoCMND.setText(soCMND);

        }

        String queQuan = txtQueQuan.getText();
        if (queQuan == null || queQuan.trim().isEmpty()) {
            queQuan = JOptionPane.showInputDialog("Nhập lại quê quán:");
            txtQueQuan.setText(queQuan);
        }

        String noiOHienTai = txtNoiOHienTai.getText();
        if (noiOHienTai == null || noiOHienTai.trim().isEmpty()) {
            noiOHienTai = JOptionPane.showInputDialog("Nhập lại nơi ở hiện tại:");
            txtNoiOHienTai.setText(noiOHienTai);
        }

        String email = txtEmail.getText();
        if (email == null || email.trim().isEmpty()) {
            email = JOptionPane.showInputDialog("Nhập lại email:");
            txtEmail.setText(email);
        }

        String danToc = txtDanToc.getText();
        if (danToc == null || danToc.trim().isEmpty()) {
            danToc = JOptionPane.showInputDialog("Nhập lại dân tộc:");
            txtDanToc.setText(danToc);
        }

        String tonGiao = txtTonGiao.getText();
        if (tonGiao == null || tonGiao.trim().isEmpty()) {
            tonGiao = JOptionPane.showInputDialog("Nhập lại tôn giáo:");
            txtTonGiao.setText(tonGiao);
        }

        String chuoiNgayHopDong = "";
        Date ngayHopDong = txtNgayHopDong.getDate();
        if (ngayHopDong == null) {
            JOptionPane.showMessageDialog(null, "Nhập lại ngày hợp đồng:");
        } else {
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            chuoiNgayHopDong = df.format(txtNgaySinh.getDate());
            System.out.println(chuoiNgayHopDong);
        }

        String congViecDuocGiao = txtCongViecDuocGiao.getText();
        if (congViecDuocGiao == null || congViecDuocGiao.trim().isEmpty()) {
            congViecDuocGiao = JOptionPane.showInputDialog("Nhập lại công việc được giao:");
            txtCongViecDuocGiao.setText(congViecDuocGiao);
        }
        String maChucVu = txtMaChucVu.getText();
        while (maChucVu == null || maChucVu.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn chức vụ");
        }

        String chuyenNganhDaoTao = txtChuyenNganhDaoTao.getText();
        if (chuyenNganhDaoTao == null || chuyenNganhDaoTao.trim().isEmpty()) {
            chuyenNganhDaoTao = JOptionPane.showInputDialog("Nhập lại chuyên ngành đào tạo:");
            txtChuyenNganhDaoTao.setText(chuyenNganhDaoTao);
        }

        String noiDaoTao = txtNoiDaoTao.getText();
        if (noiDaoTao == null || noiDaoTao.trim().isEmpty()) {
            noiDaoTao = JOptionPane.showInputDialog("Nhập lại nơi đào tạo:");
            txtNoiDaoTao.setText(noiDaoTao);
        }

        String namTotNghiep = txtNamTotNghiep.getText();
        if (namTotNghiep == null || namTotNghiep.trim().isEmpty()) {
            namTotNghiep = JOptionPane.showInputDialog("Nhập lại năm tốt nghiệp:");
            txtNamTotNghiep.setText(namTotNghiep);
        }

        String trinhDoNgoaiNgu = txtTrinhDoNgoaiNgu.getText();
        if (trinhDoNgoaiNgu == null || trinhDoNgoaiNgu.trim().isEmpty()) {
            trinhDoNgoaiNgu = JOptionPane.showInputDialog("Nhập lại trình độ ngoại ngữ:");
            txtTrinhDoNgoaiNgu.setText(trinhDoNgoaiNgu);
        }

        String maPhongBan = txtMaPhongBan.getText();
        if (maPhongBan == null || maPhongBan.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn phòng ban");
        }

        if (selectedImagePath == null || maPhongBan.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập ảnh");
        }
        try {
            new CanBoDAO().themCanBo(maCanBo, hoTenKhaiSinh,
                    gioiTinh, chuoiNgaySinh, tinhTrangHonNhan,
                    soCMND, queQuan, noiOHienTai, email,
                    danToc, tonGiao, chuoiNgayHopDong,
                    congViecDuocGiao, maChucVu, chuyenNganhDaoTao,
                    noiDaoTao, namTotNghiep, trinhDoNgoaiNgu,
                    maPhongBan, selectedImagePath,
                    null);
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyThongTinCanBo.class.getName()).log(Level.SEVERE, null, ex);
        }
        hienThiBangCanBo();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        hienThiBangCanBo(txtTimKiem.getText());
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        hienThiBangCanBo();
        txtTimKiem.setText("");
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void menuItemSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSuaActionPerformed
        txtMaCanBo.setEnabled(false);
        txtMaCanBo.setText(tblCanBo.getModel().getValueAt(tblCanBo.getSelectedRow(), 0).toString());
        txtTenKhaiSinh.setText(tblCanBo.getModel().getValueAt(tblCanBo.getSelectedRow(), 1).toString());

        String gioiTinh = tblCanBo.getModel().getValueAt(tblCanBo.getSelectedRow(), 2).toString();
        if ("Nam".equals(gioiTinh)) {
            rdoNam.setSelected(true);
        } else {
            rdoNu.setSelected(true);
        }
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date ngaySinh = null;
        try {
            ngaySinh = df.parse(tblCanBo.getModel().getValueAt(tblCanBo.getSelectedRow(), 3).toString());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        txtNgaySinh.setDate(ngaySinh);

        txtHonNhan.setText(tblCanBo.getModel().getValueAt(tblCanBo.getSelectedRow(), 4).toString());
        txtSoCMND.setText(tblCanBo.getModel().getValueAt(tblCanBo.getSelectedRow(), 5).toString());
        txtQueQuan.setText(tblCanBo.getModel().getValueAt(tblCanBo.getSelectedRow(), 6).toString());
        txtNoiOHienTai.setText(tblCanBo.getModel().getValueAt(tblCanBo.getSelectedRow(), 7).toString());
        txtEmail.setText(tblCanBo.getModel().getValueAt(tblCanBo.getSelectedRow(), 8).toString());
        txtDanToc.setText(tblCanBo.getModel().getValueAt(tblCanBo.getSelectedRow(), 9).toString());
        txtTonGiao.setText(tblCanBo.getModel().getValueAt(tblCanBo.getSelectedRow(), 10).toString());

        Date ngayHopDong = null;
        try {
            ngayHopDong = df.parse(tblCanBo.getModel().getValueAt(tblCanBo.getSelectedRow(), 11).toString());
        } catch (ParseException e) {
            e.printStackTrace();
        }

        txtNgayHopDong.setDate(ngayHopDong);
        txtCongViecDuocGiao.setText(tblCanBo.getModel().getValueAt(tblCanBo.getSelectedRow(), 12).toString());
        txtMaChucVu.setText(tblCanBo.getModel().getValueAt(tblCanBo.getSelectedRow(), 13).toString());
        txtChuyenNganhDaoTao.setText(tblCanBo.getModel().getValueAt(tblCanBo.getSelectedRow(), 14).toString());
        txtNoiDaoTao.setText(tblCanBo.getModel().getValueAt(tblCanBo.getSelectedRow(), 15).toString());
        txtNamTotNghiep.setText(tblCanBo.getModel().getValueAt(tblCanBo.getSelectedRow(), 16).toString());
        txtTrinhDoNgoaiNgu.setText(tblCanBo.getModel().getValueAt(tblCanBo.getSelectedRow(), 17).toString());
        txtMaPhongBan.setText(tblCanBo.getModel().getValueAt(tblCanBo.getSelectedRow(), 18).toString());

        cboTenPhongBan.setSelectedItem(new PhongBanDAO().timKiemTenPhongBan(txtMaPhongBan.getText()).get(0).getTenPhongBan());
        cboTenChucVu.setSelectedItem(new ChucVuDAO().timKiemTenChucVu(txtMaChucVu.getText()).get(0).getTenChucVu());
        String urlAnh = new CanBoDAO().timAnh(txtMaCanBo.getText()).get(0).getAnh();
        ImageIcon ii = new ImageIcon(urlAnh);
        Image image = ii.getImage().getScaledInstance(lblAnh.getWidth(), lblAnh.getHeight(), Image.SCALE_SMOOTH);

        lblAnh.setIcon(new ImageIcon(image));

    }//GEN-LAST:event_menuItemSuaActionPerformed

    private void menuItemXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemXoaActionPerformed

        int dialogResult = JOptionPane.showConfirmDialog(null,
                "Bạn có muốn tiếp tục thực hiện câu lệnh không?",
                "Thông báo", JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {
            try {
                new CanBoDAO().xoaCanBo(tblCanBo.getModel().getValueAt(tblCanBo.getSelectedRow(), 0).toString());
                hienThiBangCanBo();
            } catch (SQLException ex) {
                Logger.getLogger(QuanLyThongTinCanBo.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_menuItemXoaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int dialogResult = JOptionPane.showConfirmDialog(null,
                "Bạn có muốn tiếp tục thực hiện câu lệnh không?",
                "Thông báo", JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {
            try {
                new CanBoDAO().xoaCanBo(txtMaCanBo.getText());
                hienThiBangCanBo();
            } catch (SQLException ex) {
                Logger.getLogger(QuanLyThongTinCanBo.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        txtMaCanBo.setEnabled(true);
        txtMaCanBo.setText("");
        txtTenKhaiSinh.setText("");
        rdoNam.setSelected(false);
        rdoNu.setSelected(false);
        txtNgaySinh.setDate(null);
        txtHonNhan.setText("");
        txtSoCMND.setText("");
        txtQueQuan.setText("");
        txtNoiOHienTai.setText("");
        txtEmail.setText("");
        txtDanToc.setText("");
        txtTonGiao.setText("");
        txtNgayHopDong.setDate(null);
        txtCongViecDuocGiao.setText("");
        txtMaChucVu.setText("");
        txtChuyenNganhDaoTao.setText("");
        txtNoiDaoTao.setText("");
        txtNamTotNghiep.setText("");
        txtTrinhDoNgoaiNgu.setText("");
        txtMaPhongBan.setText("");
        cboTenChucVu.setSelectedItem("");
        cboTenPhongBan.setSelectedItem("");


    }//GEN-LAST:event_btnHuyActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed

        String maCanBo = txtMaCanBo.getText();
        if (maCanBo == null || maCanBo.trim().isEmpty()) {
            maCanBo = JOptionPane.showInputDialog("Nhập lại mã cán bộ:");
            txtMaCanBo.setText(maCanBo);
        }
        String hoTenKhaiSinh = txtTenKhaiSinh.getText();
        if (hoTenKhaiSinh == null || hoTenKhaiSinh.trim().isEmpty()) {
            hoTenKhaiSinh = JOptionPane.showInputDialog("Nhập lại họ tên khai sinh:");
            txtTenKhaiSinh.setText(hoTenKhaiSinh);
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
        String chuoiNgaySinh = "";
        Date ngaySinh = txtNgaySinh.getDate();
        if (ngaySinh == null) {
            JOptionPane.showMessageDialog(null, "Nhập lại ngày sinh:");
        } else {
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            chuoiNgaySinh = df.format(txtNgaySinh.getDate());
            System.out.println(ngaySinh);
        }

        String tinhTrangHonNhan = txtHonNhan.getText();
        if (tinhTrangHonNhan == null || tinhTrangHonNhan.trim().isEmpty()) {
            tinhTrangHonNhan = JOptionPane.showInputDialog("Nhập lại tình trạng hôn nhân:");
            txtHonNhan.setText(tinhTrangHonNhan);
        }

        String soCMND = txtSoCMND.getText();
        if (soCMND == null || soCMND.trim().isEmpty()) {
            soCMND = JOptionPane.showInputDialog("Nhập lại số CMND:");
            txtSoCMND.setText(soCMND);

        }

        String queQuan = txtQueQuan.getText();
        if (queQuan == null || queQuan.trim().isEmpty()) {
            queQuan = JOptionPane.showInputDialog("Nhập lại quê quán:");
            txtQueQuan.setText(queQuan);
        }

        String noiOHienTai = txtNoiOHienTai.getText();
        if (noiOHienTai == null || noiOHienTai.trim().isEmpty()) {
            noiOHienTai = JOptionPane.showInputDialog("Nhập lại nơi ở hiện tại:");
            txtNoiOHienTai.setText(noiOHienTai);
        }

        String email = txtEmail.getText();
        if (email == null || email.trim().isEmpty()) {
            email = JOptionPane.showInputDialog("Nhập lại email:");
            txtEmail.setText(email);
        }

        String danToc = txtDanToc.getText();
        if (danToc == null || danToc.trim().isEmpty()) {
            danToc = JOptionPane.showInputDialog("Nhập lại dân tộc:");
            txtDanToc.setText(danToc);
        }

        String tonGiao = txtTonGiao.getText();
        if (tonGiao == null || tonGiao.trim().isEmpty()) {
            tonGiao = JOptionPane.showInputDialog("Nhập lại tôn giáo:");
            txtTonGiao.setText(tonGiao);
        }

        String chuoiNgayHopDong = "";
        Date ngayHopDong = txtNgayHopDong.getDate();
        if (ngayHopDong == null) {
            JOptionPane.showMessageDialog(null, "Nhập lại ngày hợp đồng:");
        } else {
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            chuoiNgayHopDong = df.format(txtNgaySinh.getDate());
            System.out.println(chuoiNgayHopDong);
        }

        String congViecDuocGiao = txtCongViecDuocGiao.getText();
        if (congViecDuocGiao == null || congViecDuocGiao.trim().isEmpty()) {
            congViecDuocGiao = JOptionPane.showInputDialog("Nhập lại công việc được giao:");
            txtCongViecDuocGiao.setText(congViecDuocGiao);
        }
        String maChucVu = txtMaChucVu.getText();
        while (maChucVu == null || maChucVu.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn chức vụ");
        }

        String chuyenNganhDaoTao = txtChuyenNganhDaoTao.getText();
        if (chuyenNganhDaoTao == null || chuyenNganhDaoTao.trim().isEmpty()) {
            chuyenNganhDaoTao = JOptionPane.showInputDialog("Nhập lại chuyên ngành đào tạo:");
            txtChuyenNganhDaoTao.setText(chuyenNganhDaoTao);
        }

        String noiDaoTao = txtNoiDaoTao.getText();
        if (noiDaoTao == null || noiDaoTao.trim().isEmpty()) {
            noiDaoTao = JOptionPane.showInputDialog("Nhập lại nơi đào tạo:");
            txtNoiDaoTao.setText(noiDaoTao);
        }

        String namTotNghiep = txtNamTotNghiep.getText();
        if (namTotNghiep == null || namTotNghiep.trim().isEmpty()) {
            namTotNghiep = JOptionPane.showInputDialog("Nhập lại năm tốt nghiệp:");
            txtNamTotNghiep.setText(namTotNghiep);
        }

        String trinhDoNgoaiNgu = txtTrinhDoNgoaiNgu.getText();
        if (trinhDoNgoaiNgu == null || trinhDoNgoaiNgu.trim().isEmpty()) {
            trinhDoNgoaiNgu = JOptionPane.showInputDialog("Nhập lại trình độ ngoại ngữ:");
            txtTrinhDoNgoaiNgu.setText(trinhDoNgoaiNgu);
        }

        String maPhongBan = txtMaPhongBan.getText();
        if (maPhongBan == null || maPhongBan.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn phòng ban");
        }
        if (selectedImagePath == null || maPhongBan.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập ảnh");
        }

        try {
            new CanBoDAO().suaCanBo(maCanBo, hoTenKhaiSinh,
                    gioiTinh, chuoiNgaySinh, tinhTrangHonNhan,
                    soCMND, queQuan, noiOHienTai, email,
                    danToc, tonGiao, chuoiNgayHopDong,
                    congViecDuocGiao, maChucVu, chuyenNganhDaoTao,
                    noiDaoTao, namTotNghiep, trinhDoNgoaiNgu,
                    maPhongBan, selectedImagePath,
                    null);
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyThongTinCanBo.class.getName()).log(Level.SEVERE, null, ex);
        }
        hienThiBangCanBo();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void cboTenChucVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTenChucVuActionPerformed
        String maChuVu = (String) cboTenChucVu.getSelectedItem();
        if ("".equals(maChuVu)) {
        } else {
            txtMaChucVu.setText(new ChucVuDAO().timKiemMaChucVu(maChuVu).get(0).getMaChucVu());
        }
    }//GEN-LAST:event_cboTenChucVuActionPerformed

    private void btnNhapXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNhapXuatMouseClicked
        popNhapXuatExcel.show(btnNhapXuat, evt.getX(), evt.getY());
    }//GEN-LAST:event_btnNhapXuatMouseClicked

    private void menuItemNhapExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemNhapExcelActionPerformed


    }//GEN-LAST:event_menuItemNhapExcelActionPerformed

    private void menuItemXuatExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemXuatExcelActionPerformed
//        File file = new File();

    }//GEN-LAST:event_menuItemXuatExcelActionPerformed

    private void btnThemAnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemAnhActionPerformed

        JFileChooser browseImageFile = new JFileChooser("//Users//luongtopp//Desktop");
        //Filter image extensions
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("IMAGES", "png", "jpg", "jpeg");
        browseImageFile.addChoosableFileFilter(fnef);
        int showOpenDialogue = browseImageFile.showOpenDialog(null);

        if (showOpenDialogue == JFileChooser.APPROVE_OPTION) {
            File selectedImageFile = browseImageFile.getSelectedFile();
            selectedImagePath = selectedImageFile.getAbsolutePath();

            //Display image on jlable
            ImageIcon ii = new ImageIcon(selectedImagePath);
//            Resize image to fit jlabel
            Image image = ii.getImage().getScaledInstance(lblAnh.getWidth(), lblAnh.getHeight(), Image.SCALE_SMOOTH);

            lblAnh.setIcon(new ImageIcon(image));
        }
    }//GEN-LAST:event_btnThemAnhActionPerformed

    private String selectedImagePath;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnNhapXuat;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThemAnh;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cboTenChucVu;
    private javax.swing.JComboBox<String> cboTenPhongBan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JLabel lblAnh;
    private javax.swing.JMenuItem menuItemNhapExcel;
    private javax.swing.JMenuItem menuItemSua;
    private javax.swing.JMenuItem menuItemXoa;
    private javax.swing.JMenuItem menuItemXuatExcel;
    private javax.swing.JPanel pnlCaNhanCha;
    private javax.swing.JPanel pnlCaNhanCon;
    private javax.swing.JPanel pnlChucNang;
    private javax.swing.JPanel pnlCongViecCha;
    private javax.swing.JPanel pnlCongViecCon;
    private javax.swing.JPanel pnlGioiTinh;
    private javax.swing.JPanel pnlTimKiem;
    private javax.swing.JPopupMenu popNhapXuatExcel;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private UTT.UI.effect.ScrollPaneWin11 scrollPaneWin111;
    private UTT.UI.effect.ScrollPaneWin11 scrollPaneWin112;
    private javax.swing.JTable tblCanBo;
    private javax.swing.JTextField txtChuyenNganhDaoTao;
    private javax.swing.JTextField txtCongViecDuocGiao;
    private javax.swing.JTextField txtDanToc;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHonNhan;
    private javax.swing.JTextField txtMaCanBo;
    private javax.swing.JTextField txtMaChucVu;
    private javax.swing.JTextField txtMaPhongBan;
    private javax.swing.JTextField txtNamTotNghiep;
    private com.toedter.calendar.JDateChooser txtNgayHopDong;
    private com.toedter.calendar.JDateChooser txtNgaySinh;
    private javax.swing.JTextField txtNoiDaoTao;
    private javax.swing.JTextField txtNoiOHienTai;
    private javax.swing.JTextField txtQueQuan;
    private javax.swing.JTextField txtSoCMND;
    private javax.swing.JTextField txtTenKhaiSinh;
    private javax.swing.JTextField txtTimKiem;
    private javax.swing.JTextField txtTonGiao;
    private javax.swing.JTextField txtTrinhDoNgoaiNgu;
    // End of variables declaration//GEN-END:variables
}
