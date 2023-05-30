/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Connection.JdbcHelper;
import Model.NhaXuatBan;
import Model.Sach;
import Model.TaiKhoan;
import Model.TheLoai;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author luongtopp
 */
public class UserDAO {

    public List<TaiKhoan> timTaiKhoan(String tenTaiKhoan) {
        String sql = "SELECT * FROM tai_khoan WHERE ten_tai_khoan = N'" + tenTaiKhoan + "'";
        return selectTaiKhoan(sql);
    }

    public List<Sach> timSach(String tenSach) {
        String sql = "SELECT * FROM sach WHERE ten_sach = N'" + tenSach + "'";
        return selectSach(sql);
       
    }

    public List<Sach> timSach() {
        String sql = "SELECT * FROM sach";
        return selectSach(sql);
    }

    public List<TheLoai> timTheLoai(String tenTheLoai) {
        String sql = "SELECT * FROM the_loai WHERE ten_the_loai = N'" + tenTheLoai + "'";
        return selectTheLoai(sql);
    }

    public List<TheLoai> timTheLoai() {
        String sql = "SELECT * FROM the_loai";
        return selectTheLoai(sql);
    }

    public List<NhaXuatBan> timNhaXuatBan(String tenNhaXuatBan) {
        String sql = "SELECT * FROM nha_xuat_ban WHERE ten_nha_xuat_ban = N'" + tenNhaXuatBan + "'";
        return selectNhaXuatBan(sql);
    }

    public List<NhaXuatBan> timNhaXuatBan() {
        String sql = "SELECT * FROM nha_xuat_ban";
        return selectNhaXuatBan(sql);
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
        String sql = "DELETE FROM sach WHERE ma_sach = "+ maSach;
        update(sql);
    }

    public void suaSach(String maSach, String tenSach, String tenTheLoai,
            String tenNhaXuatBan, String ngayNhap, float giaTien) throws SQLException {
        String sql = "UPDATE sach set ten_sach = N'" + tenSach + "'"
                + ", ten_the_loai = N'" + tenTheLoai + "'"
                + ", ten_nha_xuat_ban = N'" + tenNhaXuatBan + "'"
                + ", ngay_nhap = N'" + ngayNhap + "'"
                + ", gia_tien = " + giaTien 
                + " WHERE ma_sach = "+maSach;

        update(sql);
    }

    public void themTheLoai(String tenTheLoai) throws SQLException {
        String sql = "INSERT the_loai(ten_the_loai) VALUES( "
                + "N'" + tenTheLoai + "')";
        update(sql);
    }


    private List<TaiKhoan> selectTaiKhoan(String sql, Object... args) {
        List<TaiKhoan> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);

                while (rs.next()) {
                    TaiKhoan taiKhoan = traTruyVanTaiKhoan(rs);
                    list.add(taiKhoan);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    private List<TheLoai> selectTheLoai(String sql, Object... args) {
        List<TheLoai> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);

                while (rs.next()) {
                    TheLoai theLoai = traTruyVanTheLoai(rs);
                    list.add(theLoai);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    private List<NhaXuatBan> selectNhaXuatBan(String sql, Object... args) {
        List<NhaXuatBan> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);

                while (rs.next()) {
                    NhaXuatBan nhaXuatBan = traTruyVanNhaXuatBan(rs);
                    list.add(nhaXuatBan);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    private List<Sach> selectSach(String sql, Object... args) {
        List<Sach> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);

                while (rs.next()) {
                    Sach sach = traTruyVanSach(rs);
                    list.add(sach);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    private TaiKhoan traTruyVanTaiKhoan(ResultSet rs) throws SQLException {
        TaiKhoan taiKhoan = new TaiKhoan();
        taiKhoan.setMaTaiKhoan(Integer.parseInt(rs.getString("ma_tai_khoan")));
        taiKhoan.setTenTaiKhoan(rs.getString("ten_tai_khoan"));
        taiKhoan.setHoTen(rs.getString("ho_ten"));
        taiKhoan.setMatKhau(rs.getString("mat_khau"));
        taiKhoan.setIsAdmin(Boolean.parseBoolean(rs.getString("is_admin")));
        return taiKhoan;
    }

    private TheLoai traTruyVanTheLoai(ResultSet rs) throws SQLException {
        TheLoai theLoai = new TheLoai();
        theLoai.setMaTheLoai(Integer.parseInt(rs.getString("ma_the_loai")));
        theLoai.setTenTheLoai(rs.getString("ten_the_loai"));
        return theLoai;
    }

    private NhaXuatBan traTruyVanNhaXuatBan(ResultSet rs) throws SQLException {
        NhaXuatBan nhaXuatBan = new NhaXuatBan();
        nhaXuatBan.setMaNhaXuatBan(Integer.parseInt(rs.getString("ma_nha_xuat_ban")));
        nhaXuatBan.setTenNhaXuatBan(rs.getString("ten_nha_xuat_ban"));
        return nhaXuatBan;
    }

    private Sach traTruyVanSach(ResultSet rs) throws SQLException {
        Sach sach = new Sach();
        sach.setMaSach(Integer.parseInt(rs.getString("ma_sach")));
        sach.setTenSach(rs.getString("ten_sach"));
        sach.setNgayNhap(rs.getString("ngay_nhap"));
        sach.setGiaTien(Float.parseFloat(rs.getString("gia_tien")));
        sach.setTenNhaXuatBan(rs.getString("ten_nha_xuat_ban"));
        sach.setTenTheLoai(rs.getString("ten_the_loai"));
        return sach;
    }

    private void update(String sql, Object... args) throws SQLException {
        JdbcHelper.executeUpdate(sql, args);
    }
}
