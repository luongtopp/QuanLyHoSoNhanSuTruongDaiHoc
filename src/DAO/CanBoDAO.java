/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Connection.JdbcHelper;
import Model.CanBo;
import java.util.ArrayList;
import java.util.List;
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

    public void themNhaXuatBan(String tenNhaXuatBan) throws SQLException {
        String sql = "INSERT nha_xuat_ban(ten_nha_xuat_ban) VALUES( "
                + "N'" + tenNhaXuatBan + "')";
        update(sql);
    }

    public void themTaiKhoan(String tenTaiKhoan, String hoTen, String matKhau) throws SQLException {
        String sql = "INSERT tai_khoan(ten_tai_khoan, ho_ten, mat_khau) VALUES( "
                + "N'" + tenTaiKhoan + "'"
                + ",N'" + hoTen + "'"
                + ",N'" + matKhau + "')";
        update(sql);
    }

    public void themSach(String tenSach, String tenTheLoai,
            String tenNhaXuatBan, String ngayNhap, float giaTien) throws SQLException {
        String sql = "INSERT sach(ten_sach, ten_the_loai,"
                + " ten_nha_xuat_ban, ngay_nhap, gia_tien) VALUES( "
                + "N'" + tenSach + "'"
                + ",N'" + tenTheLoai + "'"
                + ",N'" + tenNhaXuatBan + "'"
                + ",N'" + ngayNhap + "'"
                + "," + giaTien + ")";
        update(sql);
    }

    public void xoaSach(String maSach) throws SQLException {
        String sql = "DELETE FROM sach WHERE ma_sach = " + maSach;
        update(sql);
    }

    public void suaSach(String maSach, String tenSach, String tenTheLoai,
            String tenNhaXuatBan, String ngayNhap, float giaTien) throws SQLException {
        String sql = "UPDATE sach set ten_sach = N'" + tenSach + "'"
                + ", ten_the_loai = N'" + tenTheLoai + "'"
                + ", ten_nha_xuat_ban = N'" + tenNhaXuatBan + "'"
                + ", ngay_nhap = N'" + ngayNhap + "'"
                + ", gia_tien = " + giaTien
                + " WHERE ma_sach = " + maSach;

        update(sql);
    }

    public void themTheLoai(String tenTheLoai) throws SQLException {
        String sql = "INSERT the_loai(ten_the_loai) VALUES( "
                + "N'" + tenTheLoai + "')";
        update(sql);
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

    private void update(String sql, Object... args) throws SQLException {
        JdbcHelper.executeUpdate(sql, args);
    }
}
