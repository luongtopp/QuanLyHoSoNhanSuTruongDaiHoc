package UTT.UI.Main;

import UTT.DAO.CanBoDAO;
import UTT.DAO.ChucVuDAO;
import UTT.DAO.PhongBanDAO;
import UTT.Model.CanBo;
import UTT.Model.ChucVu;
import UTT.Model.PhongBan;
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
        tblCanBo.setComponentPopupMenu(jPopupMenu1);

//        cboTenPhongBan.setSelectedIndex(-1);
    }

    // Hiển thị bảng CÁN BỘ không tham số
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
                        item.getMaPhongBan()
                    }
            );
        }
    }

    // Hiển thị bảng CÁN BỘ có tham số
    private void hienThiBangCanBo(String timKiem) {

        DefaultTableModel model = (DefaultTableModel) tblCanBo.getModel();
        model.setRowCount(0);
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
                        item.getMaPhongBan()
       
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
        pnlCongViec = new javax.swing.JPanel();
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
        pnlChucNang = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        scrollPaneWin112 = new UTT.UI.scroll.win11.ScrollPaneWin11();
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

        setPreferredSize(new java.awt.Dimension(866, 728));

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));

        pnlChucNang1.setBackground(new java.awt.Color(255, 255, 255));
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

        txtNgaySinh.setBackground(new java.awt.Color(255, 255, 255));
        txtNgaySinh.setDateFormatString("yyyy-MM-dd");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 97;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlCaNhanCon.add(txtNgaySinh, gridBagConstraints);

        jPanel1.add(pnlCaNhanCon);

        pnlCongViec.setBackground(new java.awt.Color(255, 255, 255));
        pnlCongViec.setBorder(javax.swing.BorderFactory.createTitledBorder("Công việc"));
        java.awt.GridBagLayout pnlCongViecLayout = new java.awt.GridBagLayout();
        pnlCongViecLayout.columnWidths = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        pnlCongViecLayout.rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        pnlCongViec.setLayout(pnlCongViecLayout);

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
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlCongViec.add(jLabel15, gridBagConstraints);

        jLabel17.setText("Mã phòng ban:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 36;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlCongViec.add(jLabel17, gridBagConstraints);

        jLabel18.setText("Ngày hợp đồng:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
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
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 123;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlCongViec.add(txtMaPhongBan, gridBagConstraints);

        jLabel22.setText("Công việc được giao:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlCongViec.add(jLabel22, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.ipadx = 123;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlCongViec.add(txtCongViecDuocGiao, gridBagConstraints);

        jLabel25.setText("Chức vụ hiện tại:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
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
        gridBagConstraints.gridy = 2;
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
        gridBagConstraints.gridy = 6;
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
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlCongViec.add(jLabel4, gridBagConstraints);

        jLabel28.setText("Năm tốt nghiệp:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlCongViec.add(jLabel28, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 123;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlCongViec.add(txtNoiDaoTao, gridBagConstraints);

        jLabel14.setText("Trình độ ngoại ngữ:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 36;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlCongViec.add(jLabel14, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 123;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlCongViec.add(txtTrinhDoNgoaiNgu, gridBagConstraints);

        txtMaChucVu.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.ipadx = 123;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlCongViec.add(txtMaChucVu, gridBagConstraints);

        jLabel19.setText("Mã chức vụ:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlCongViec.add(jLabel19, gridBagConstraints);

        txtNgayHopDong.setBackground(new java.awt.Color(255, 255, 255));
        txtNgayHopDong.setDateFormatString("yyyy-MM-dd");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 97;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlCongViec.add(txtNgayHopDong, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 123;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlCongViec.add(txtNamTotNghiep, gridBagConstraints);

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

        jPanel1.add(pnlChucNang);

        scrollPaneWin112.setBackground(new java.awt.Color(255, 255, 255));
        scrollPaneWin112.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPaneWin112.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPaneWin112.setViewportView(null);

        tblCanBo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã cán bộ", "Họ tên khai sinh", "Giới tính", "Ngày sinh", "Tình trạng hôn nhân", "Số CMND", "Quê quán", "Nơi ở hiện tại", "Email", "Dân tộc", "Tôn giáo", "Ngày hợp đồng", "Công việc được giao", "Mã chức vụ", "Chuyên ngành đào tạo", "Nơi đào tạo", "Năm tốt nghiệp", "Trình độ ngoại ngữ", "Mã phòng ban"
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

       
        
        try {
            new CanBoDAO().themCanBo(maCanBo, hoTenKhaiSinh,
                    gioiTinh, chuoiNgaySinh, tinhTrangHonNhan,
                    soCMND, queQuan, noiOHienTai, email,
                    danToc, tonGiao, chuoiNgayHopDong,
                    congViecDuocGiao, maChucVu, chuyenNganhDaoTao,
                    noiDaoTao, namTotNghiep, trinhDoNgoaiNgu,
                    maPhongBan,
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

        System.out.println(new PhongBanDAO().timKiemTenPhongBan(txtMaPhongBan.getText()).get(0).getTenPhongBan());

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

        } else {

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

        } else {

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

   

        if ("".equals(maCanBo)) {

        }
        try {
            new CanBoDAO().suaCanBo(maCanBo, hoTenKhaiSinh,
                    gioiTinh, chuoiNgaySinh, tinhTrangHonNhan,
                    soCMND, queQuan, noiOHienTai, email,
                    danToc, tonGiao, chuoiNgayHopDong,
                    congViecDuocGiao, maChucVu, chuyenNganhDaoTao,
                    noiDaoTao, namTotNghiep, trinhDoNgoaiNgu,
                    maPhongBan,
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
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
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JMenuItem menuItemSua;
    private javax.swing.JMenuItem menuItemXoa;
    private javax.swing.JPanel pnlCaNhanCon;
    private javax.swing.JPanel pnlChucNang;
    private javax.swing.JPanel pnlChucNang1;
    private javax.swing.JPanel pnlCongViec;
    private javax.swing.JPanel pnlGioiTinh;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private UTT.UI.scroll.win11.ScrollPaneWin11 scrollPaneWin111;
    private UTT.UI.scroll.win11.ScrollPaneWin11 scrollPaneWin112;
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
