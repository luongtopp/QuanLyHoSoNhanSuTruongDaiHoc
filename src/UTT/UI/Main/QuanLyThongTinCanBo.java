package UTT.UI.Main;

import UTT.DAO.CanBoDAO;
import UTT.DAO.ChucVuDAO;
import UTT.DAO.PhongBanDAO;
import UTT.Model.CanBo;
import UTT.Model.ChucVu;
import UTT.Model.PhongBan;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;

import javax.swing.table.DefaultTableModel;

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
//        cboTenPhongBan.setSelectedIndex(-1);

    }

    private void hienThiBangCanBo() {
        DefaultTableModel model = (DefaultTableModel) tblCanBo.getModel();
        model.setRowCount(0);
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
                        item.getAnh()
                    }
            );
        }
    }

    private void hienThiBangPhongBan() {

        for (PhongBan item : new PhongBanDAO().hienThiPhongBan()) {
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

        scrollPaneWin111 = new UTT.UI.scroll.win11.ScrollPaneWin11();
        jPanel1 = new javax.swing.JPanel();
        pnlCaNhanCon = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTenKhaiSinh = new javax.swing.JTextField();
        txtNgaySinh = new javax.swing.JTextField();
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
        pnlCongViec = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtMaCanBo = new javax.swing.JTextField();
        txtMaPhongBan = new javax.swing.JTextField();
        txtNgayHopDong = new javax.swing.JTextField();
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
        txtNamTotNghiep = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtTrinhDoNgoaiNgu = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtAnh = new javax.swing.JTextField();
        txtMaChucVu = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        pnlChucNang = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        scrollPaneWin112 = new UTT.UI.scroll.win11.ScrollPaneWin11();
        tblCanBo = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(866, 728));

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));

        pnlCaNhanCon.setBackground(new java.awt.Color(255, 255, 255));
        pnlCaNhanCon.setBorder(javax.swing.BorderFactory.createTitledBorder("Cá nhân"));
        pnlCaNhanCon.setPreferredSize(new java.awt.Dimension(552, 250));
        pnlCaNhanCon.setRequestFocusEnabled(false);
        pnlCaNhanCon.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Tên khai sinh:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlCaNhanCon.add(jLabel1, gridBagConstraints);

        jLabel2.setText("Ngày sinh:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlCaNhanCon.add(jLabel2, gridBagConstraints);

        jLabel5.setText("Quên quán:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlCaNhanCon.add(jLabel5, gridBagConstraints);

        jLabel6.setText("Nơi ở hiện tại:");
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
        pnlCaNhanCon.add(txtTenKhaiSinh, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 123;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlCaNhanCon.add(txtNgaySinh, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 123;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlCaNhanCon.add(txtQueQuan, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 123;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlCaNhanCon.add(txtNoiOHienTai, gridBagConstraints);

        jLabel7.setText("Hôn nhân:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 100, 5, 5);
        pnlCaNhanCon.add(jLabel7, gridBagConstraints);

        jLabel8.setText("Số CMND:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 100, 5, 5);
        pnlCaNhanCon.add(jLabel8, gridBagConstraints);

        jLabel9.setText("Email:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 100, 5, 5);
        pnlCaNhanCon.add(jLabel9, gridBagConstraints);

        jLabel10.setText("Dân tộc:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 100, 5, 5);
        pnlCaNhanCon.add(jLabel10, gridBagConstraints);

        jLabel11.setText("Tôn giáo:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 100, 5, 5);
        pnlCaNhanCon.add(jLabel11, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 123;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlCaNhanCon.add(txtDanToc, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 123;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlCaNhanCon.add(txtHonNhan, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 123;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlCaNhanCon.add(txtSoCMND, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 123;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlCaNhanCon.add(txtEmail, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 123;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlCaNhanCon.add(txtTonGiao, gridBagConstraints);

        jLabel12.setText("Giới tính:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlCaNhanCon.add(jLabel12, gridBagConstraints);

        pnlGioiTinh.setBackground(new java.awt.Color(255, 255, 255));

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

        jPanel1.add(pnlCaNhanCon);

        pnlCongViec.setBackground(new java.awt.Color(255, 255, 255));
        pnlCongViec.setBorder(javax.swing.BorderFactory.createTitledBorder("Công việc"));
        pnlCongViec.setLayout(new java.awt.GridBagLayout());

        jLabel13.setText("Mã cán bộ:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlCongViec.add(jLabel13, gridBagConstraints);

        jLabel15.setText("Tên phòng ban:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlCongViec.add(jLabel15, gridBagConstraints);

        jLabel17.setText("Mã phòng ban:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 36;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlCongViec.add(jLabel17, gridBagConstraints);

        jLabel18.setText("Ngày hợp đồng:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 36;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlCongViec.add(jLabel18, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 123;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlCongViec.add(txtMaCanBo, gridBagConstraints);

        txtMaPhongBan.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 123;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlCongViec.add(txtMaPhongBan, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 123;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlCongViec.add(txtNgayHopDong, gridBagConstraints);

        jLabel22.setText("Công việc được giao:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlCongViec.add(jLabel22, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 123;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlCongViec.add(txtCongViecDuocGiao, gridBagConstraints);

        jLabel25.setText("Chức vụ hiện tại:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlCongViec.add(jLabel25, gridBagConstraints);

        cboTenPhongBan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        cboTenPhongBan.setAutoscrolls(true);
        cboTenPhongBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTenPhongBanActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 115;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlCongViec.add(cboTenPhongBan, gridBagConstraints);

        cboTenChucVu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        cboTenChucVu.setToolTipText("");
        cboTenChucVu.setAutoscrolls(true);
        cboTenChucVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTenChucVuActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 115;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlCongViec.add(cboTenChucVu, gridBagConstraints);

        jLabel3.setText("Chuyên ngành đào tạo:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlCongViec.add(jLabel3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 123;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlCongViec.add(txtChuyenNganhDaoTao, gridBagConstraints);

        jLabel4.setText("Nơi đào tạo:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlCongViec.add(jLabel4, gridBagConstraints);

        jLabel28.setText("Năm tốt nghiệp:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlCongViec.add(jLabel28, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 123;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlCongViec.add(txtNoiDaoTao, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 123;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlCongViec.add(txtNamTotNghiep, gridBagConstraints);

        jLabel14.setText("Trình độ ngoại ngữ:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 36;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlCongViec.add(jLabel14, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 123;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlCongViec.add(txtTrinhDoNgoaiNgu, gridBagConstraints);

        jLabel16.setText("Ảnh:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlCongViec.add(jLabel16, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 100;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        pnlCongViec.add(txtAnh, gridBagConstraints);

        txtMaChucVu.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 123;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlCongViec.add(txtMaChucVu, gridBagConstraints);

        jLabel19.setText("Mã chức vụ:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlCongViec.add(jLabel19, gridBagConstraints);

        jPanel1.add(pnlCongViec);

        pnlChucNang.setBackground(new java.awt.Color(255, 255, 255));
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
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 12, 12);
        pnlChucNang.add(btnSua, gridBagConstraints);

        btnXoa.setText("Xóa");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 12, 12);
        pnlChucNang.add(btnXoa, gridBagConstraints);

        btnHuy.setText("Hủy");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 12, 12);
        pnlChucNang.add(btnHuy, gridBagConstraints);

        jPanel1.add(pnlChucNang);

        scrollPaneWin112.setBackground(new java.awt.Color(255, 255, 255));
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

        jPanel1.add(scrollPaneWin112);

        scrollPaneWin111.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPaneWin111, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 839, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPaneWin111, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cboTenPhongBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTenPhongBanActionPerformed
        txtMaPhongBan.setText(new PhongBanDAO().hienThiPhongBan((String) cboTenPhongBan.getSelectedItem()));
    }//GEN-LAST:event_cboTenPhongBanActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed

        String maCanBo = txtMaCanBo.getText();
        String hoTenKhaiSinh = txtTenKhaiSinh.getText();
        String gioiTinh = "";
        if (rdoNam.isSelected()) {
            gioiTinh = "Nam";
        } else {
            gioiTinh = "Nữ";
        }
        String ngaySinh = txtNgaySinh.getText();
        String tinhTrangHonNhan = txtHonNhan.getText();
        String soCMND = txtSoCMND.getText();
        String queQuan = txtQueQuan.getText();
        String noiOHienTai = txtNoiOHienTai.getText();
        String email = txtEmail.getText();
        String danToc = txtDanToc.getText();
        String tonGiao = txtTonGiao.getText();
        String ngayHopDong = txtNgayHopDong.getText();
        String congViecDuocGiao = txtCongViecDuocGiao.getText();
        String maChucVu = "";
        String chuyenNganhDaoTao = txtChuyenNganhDaoTao.getText();
        String noiDaoTao = txtNoiDaoTao.getText();
        String namTotNghiep = txtNamTotNghiep.getText();
        String trinhDoNgoaiNgu = txtTrinhDoNgoaiNgu.getText();
        String maPhongBan = txtMaPhongBan.getText();
        String anh = txtAnh.getText();
        try {
            new CanBoDAO().themCanBo(maCanBo, hoTenKhaiSinh,
                    gioiTinh, ngaySinh, tinhTrangHonNhan,
                    soCMND, queQuan, noiOHienTai, email,
                    danToc, tonGiao, ngayHopDong,
                    congViecDuocGiao, maChucVu, chuyenNganhDaoTao,
                    noiDaoTao, namTotNghiep, trinhDoNgoaiNgu,
                    maPhongBan, anh,
                     null);
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyThongTinCanBo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void cboTenChucVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTenChucVuActionPerformed
        txtMaChucVu.setText(new ChucVuDAO().hienThiChucVu((String) cboTenChucVu.getSelectedItem()));
    }//GEN-LAST:event_cboTenChucVuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
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
    private javax.swing.JPanel pnlCaNhanCon;
    private javax.swing.JPanel pnlChucNang;
    private javax.swing.JPanel pnlCongViec;
    private javax.swing.JPanel pnlGioiTinh;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private UTT.UI.scroll.win11.ScrollPaneWin11 scrollPaneWin111;
    private UTT.UI.scroll.win11.ScrollPaneWin11 scrollPaneWin112;
    private javax.swing.JTable tblCanBo;
    private javax.swing.JTextField txtAnh;
    private javax.swing.JTextField txtChuyenNganhDaoTao;
    private javax.swing.JTextField txtCongViecDuocGiao;
    private javax.swing.JTextField txtDanToc;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHonNhan;
    private javax.swing.JTextField txtMaCanBo;
    private javax.swing.JTextField txtMaChucVu;
    private javax.swing.JTextField txtMaPhongBan;
    private javax.swing.JTextField txtNamTotNghiep;
    private javax.swing.JTextField txtNgayHopDong;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtNoiDaoTao;
    private javax.swing.JTextField txtNoiOHienTai;
    private javax.swing.JTextField txtQueQuan;
    private javax.swing.JTextField txtSoCMND;
    private javax.swing.JTextField txtTenKhaiSinh;
    private javax.swing.JTextField txtTonGiao;
    private javax.swing.JTextField txtTrinhDoNgoaiNgu;
    // End of variables declaration//GEN-END:variables
}