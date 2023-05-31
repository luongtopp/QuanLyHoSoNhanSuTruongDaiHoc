/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTT.DAO;

import UTT.Connection.JdbcHelper;
import UTT.Model.CanBo;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author luongtopp
 */
public class CanBoDAO {

    public List<CanBo> hienThiCanBo() {
        String sql = "SELECT * FROM canbo";
        return selectCanBo(sql);
    }

    public void themCanBo(String maCanBo, String hoTenKhaiSinh,
            String gioiTinh, String ngaySinh, String tinhTrangHonNhan,
            String soCMND, String queQuan, String noiOHienTai, String email,
            String danToc, String tonGiao, String ngayHopDong,
            String congViecDuocGiao, String maChucVu, String chuyenNganhDaoTao,
            String noiDaoTao, String namTotNghiep, String trinhDoNgoaiNgu,
            String maPhongBan, String anh, Object... args) throws SQLException {

        String sql = "INSERT INTO\n"
                + "    `quan_ly_ho_so_nhan_su_truong_dai_hoc`.`canbo` (\n"
                + "        `macanbo`,\n"
                + "        `hotenkhaisinh`,\n"
                + "        `gioitinh`,\n"
                + "        `ngaysinh`,\n"
                + "        `tinhtranghonnhan`,\n"
                + "        `soCMND`,\n"
                + "        `quequan`,\n"
                + "        `noiohientai`,\n"
                + "        `email`,\n"
                + "        `dantoc`,\n"
                + "        `tongiao`,\n"
                + "        `ngayhopdong`,\n"
                + "        `congviecduocgiao`,\n"
                + "        `machucvu`,\n"
                + "        `chuyennganhdaotao`,\n"
                + "        `noidaotao`,\n"
                + "        `namtotnghiep`,\n"
                + "        `trinhdongoainnguthanhthaonhat`,\n"
                + "        `maphongban`,\n"
                + "        `anh`\n"
                + "    )\n"
                + "VALUES\n"
                + "    (\n"
                + "        '?',\n"
                + "        N'?',\n"
                + "        N'?',\n"
                + "        '?',\n"
                + "        N'?',\n"
                + "        '?',\n"
                + "        N'?',\n"
                + "        N'?',\n"
                + "        '?',\n"
                + "        N'?',\n"
                + "        N'?',\n"
                + "        '?',\n"
                + "        N'?',\n"
                + "        '?',\n"
                + "        N'?',\n"
                + "        N'?',\n"
                + "        '?',\n"
                + "        N'?',\n"
                + "        '?',\n"
                + "        '?'\n"
                + "    ),";

        PreparedStatement statement = JdbcHelper.preparedStatement(sql);
        statement.setString(1, maCanBo);
        statement.setString(2, hoTenKhaiSinh);
        statement.setString(3, gioiTinh);
        statement.setString(4, ngaySinh);
        statement.setString(5, tinhTrangHonNhan);
        statement.setString(6, soCMND);
        statement.setString(7, queQuan);
        statement.setString(8, noiOHienTai);
        statement.setString(9, email);
        statement.setString(10, danToc);
        statement.setString(11, tonGiao);
        statement.setString(12, ngayHopDong);
        statement.setString(13, congViecDuocGiao);
        statement.setString(14, maChucVu);
        statement.setString(15, chuyenNganhDaoTao);
        statement.setString(16, noiDaoTao);
        statement.setString(17, namTotNghiep);
        statement.setString(18, trinhDoNgoaiNgu);
        statement.setString(19, maPhongBan);
        statement.setString(20, anh);
        statement.executeUpdate();

    }

    private List<CanBo> selectCanBo(String sql, Object... args) {
        List<CanBo> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);

                while (rs.next()) {
                    CanBo canBo = layDuLieuTuBangCanBo(rs);
                    list.add(canBo);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    private CanBo layDuLieuTuBangCanBo(ResultSet rs) throws SQLException {

        CanBo canBo = new CanBo();
        canBo.setMaCanBo(rs.getString("macanbo"));
        canBo.setHoTenKhaiSinh(rs.getNString("hotenkhaisinh"));
        canBo.setGioiTinh(rs.getNString("gioitinh"));
        canBo.setNgaySinh(rs.getDate("ngaysinh"));
        canBo.setTinhTrangHonNhan(rs.getNString("tinhtranghonnhan"));
        canBo.setSoCMND(rs.getNString("soCMND"));
        canBo.setQueQuan(rs.getNString("quequan"));
        canBo.setNoiOHienTai(rs.getNString("noiohientai"));
        canBo.setEmail(rs.getNString("email"));
        canBo.setDanToc(rs.getNString("dantoc"));
        canBo.setTonGiao(rs.getNString("tongiao"));
        canBo.setNgayHopDong(rs.getDate("ngayhopdong"));
        canBo.setCongViecDuocGiao(rs.getNString("congviecduocgiao"));
        canBo.setMaChucVu(rs.getString("machucvu"));
        canBo.setChuyenNganhDaoTao(rs.getNString("chuyennganhdaotao"));
        canBo.setNoiDaoTao(rs.getNString("noidaotao"));
        canBo.setNamTotNghiep(rs.getDate("namtotnghiep"));
        canBo.setTrinhDoNgoaiNgu(rs.getNString("trinhdongoainnguthanhthaonhat"));
        canBo.setMaPhongBan(rs.getString("maphongban"));
        canBo.setAnh(rs.getString("anh"));
        return canBo;
    }

    public static void main(String[] args) throws SQLException {
        new CanBoDAO().themCanBo("1", "LOL", "Nam", "2002-04-04", "Alone", "12345", "Thái Bình",
                "Hà Nội", "luong@gmail.com", "Kinh", "Đức thánh chúa trời", "2023-04-04", "Giảng viên",
                "CV01", "Chơi", "UTT", "2022-02-02", "Trung của", "PB206", "a.jpg", args);
    }

}
