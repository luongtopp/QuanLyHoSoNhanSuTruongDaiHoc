package raven.main;

import DAO.CanBoDAO;
import DAO.ChucVuDAO;
import DAO.PhongBanDAO;
import Model.CanBo;
import Model.ChucVu;
import Model.PhongBan;
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
//        DefaultTableModel model = (DefaultTableModel) cboTenPhongBan.getModel();
//        model.setRowCount(0);
        for (PhongBan item : new PhongBanDAO().hienThiPhongBan()) {
//            model.addRow(
//                    new Object[]{
//                        item.getTenPhongBan()
//                    }
            cboTenPhongBan.addItem(item.getTenPhongBan());
            //                    
        
    

//    );
        }
    }
    private void hienThiBangChucVu() {
//        DefaultTableModel model = (DefaultTableModel) cboTenPhongBan.getModel();
//        model.setRowCount(0);
        for (ChucVu item : new ChucVuDAO().hienThiChucVu()) {
//            model.addRow(
//                    new Object[]{
//                        item.getTenPhongBan()
//                    }
            cboChucVu.addItem(item.getTenChucVu());
            //                    
        
    

//    );
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        scrollPaneWin111 = new raven.scroll.win11.ScrollPaneWin11();
        jPanel7 = new javax.swing.JPanel();
        pnlCaNhanCha = new javax.swing.JPanel();
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
        pnlCongViecCha = new javax.swing.JPanel();
        pnlCongViecCon = new javax.swing.JPanel();
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
        cboChucVu = new javax.swing.JComboBox<>();
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
        pnlChucNang = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        pnlBang = new javax.swing.JPanel();
        scrollPaneWin112 = new raven.scroll.win11.ScrollPaneWin11();
        tblCanBo = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(866, 728));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new java.awt.GridBagLayout());

        pnlCaNhanCha.setPreferredSize(new java.awt.Dimension(552, 250));
        pnlCaNhanCha.setLayout(new java.awt.BorderLayout());

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

        pnlCaNhanCha.add(pnlCaNhanCon, java.awt.BorderLayout.CENTER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        jPanel7.add(pnlCaNhanCha, gridBagConstraints);

        pnlCongViecCha.setLayout(new java.awt.BorderLayout());

        pnlCongViecCon.setBackground(new java.awt.Color(255, 255, 255));
        pnlCongViecCon.setBorder(javax.swing.BorderFactory.createTitledBorder("Công việc"));
        pnlCongViecCon.setAutoscrolls(true);
        pnlCongViecCon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlCongViecCon.setPreferredSize(new java.awt.Dimension(552, 250));

        jLabel13.setText("Mã cán bộ:");

        jLabel15.setText("Tên phòng ban:");

        jLabel17.setText("Mã phòng ban:");

        jLabel18.setText("Ngày hợp đồng:");

        jLabel22.setText("Công việc được giao:");

        jLabel25.setText("Chức vụ hiện tại:");

        cboTenPhongBan.setAutoscrolls(true);

        jLabel3.setText("Chuyên ngành đào tạo:");

        jLabel4.setText("Nơi đào tạo:");

        jLabel28.setText("Năm tốt nghiệp:");

        jLabel14.setText("Trình độ ngoại ngữ:");

        jLabel16.setText("Ảnh:");

        javax.swing.GroupLayout pnlCongViecConLayout = new javax.swing.GroupLayout(pnlCongViecCon);
        pnlCongViecCon.setLayout(pnlCongViecConLayout);
        pnlCongViecConLayout.setHorizontalGroup(
            pnlCongViecConLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCongViecConLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(pnlCongViecConLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15)
                    .addComponent(jLabel17)
                    .addComponent(jLabel14)
                    .addComponent(jLabel18))
                .addGap(10, 10, 10)
                .addGroup(pnlCongViecConLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMaCanBo, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboTenPhongBan, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaPhongBan, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTrinhDoNgoaiNgu, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNgayHopDong, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(pnlCongViecConLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel28)
                    .addComponent(jLabel25))
                .addGap(10, 10, 10)
                .addGroup(pnlCongViecConLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCongViecDuocGiao, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtChuyenNganhDaoTao, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNoiDaoTao, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNamTotNghiep, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89)
                .addComponent(jLabel16)
                .addGap(10, 10, 10)
                .addComponent(txtAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlCongViecConLayout.setVerticalGroup(
            pnlCongViecConLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCongViecConLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel13)
                .addGap(16, 16, 16)
                .addComponent(jLabel15)
                .addGap(16, 16, 16)
                .addComponent(jLabel17)
                .addGap(16, 16, 16)
                .addComponent(jLabel14)
                .addGap(16, 16, 16)
                .addComponent(jLabel18))
            .addGroup(pnlCongViecConLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(txtMaCanBo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(cboTenPhongBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtMaPhongBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtTrinhDoNgoaiNgu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtNgayHopDong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlCongViecConLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel22)
                .addGap(16, 16, 16)
                .addComponent(jLabel3)
                .addGap(16, 16, 16)
                .addComponent(jLabel4)
                .addGap(16, 16, 16)
                .addComponent(jLabel28)
                .addGap(16, 16, 16)
                .addComponent(jLabel25))
            .addGroup(pnlCongViecConLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(txtCongViecDuocGiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtChuyenNganhDaoTao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtNoiDaoTao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtNamTotNghiep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(cboChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlCongViecConLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel16))
            .addGroup(pnlCongViecConLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(txtAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlCongViecCha.add(pnlCongViecCon, java.awt.BorderLayout.PAGE_START);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        jPanel7.add(pnlCongViecCha, gridBagConstraints);

        pnlChucNang.setBackground(new java.awt.Color(255, 255, 255));
        pnlChucNang.setLayout(new java.awt.GridBagLayout());

        btnThem.setText("Thêm");
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

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 800;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        jPanel7.add(pnlChucNang, gridBagConstraints);

        pnlBang.setPreferredSize(new java.awt.Dimension(552, 300));
        pnlBang.setLayout(new java.awt.BorderLayout());

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

        pnlBang.add(scrollPaneWin112, java.awt.BorderLayout.CENTER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        jPanel7.add(pnlBang, gridBagConstraints);

        scrollPaneWin111.setViewportView(jPanel7);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPaneWin111, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 866, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPaneWin111, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cboChucVu;
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
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel pnlBang;
    private javax.swing.JPanel pnlCaNhanCha;
    private javax.swing.JPanel pnlCaNhanCon;
    private javax.swing.JPanel pnlChucNang;
    private javax.swing.JPanel pnlCongViecCha;
    private javax.swing.JPanel pnlCongViecCon;
    private javax.swing.JPanel pnlGioiTinh;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private raven.scroll.win11.ScrollPaneWin11 scrollPaneWin111;
    private raven.scroll.win11.ScrollPaneWin11 scrollPaneWin112;
    private javax.swing.JTable tblCanBo;
    private javax.swing.JTextField txtAnh;
    private javax.swing.JTextField txtChuyenNganhDaoTao;
    private javax.swing.JTextField txtCongViecDuocGiao;
    private javax.swing.JTextField txtDanToc;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHonNhan;
    private javax.swing.JTextField txtMaCanBo;
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
