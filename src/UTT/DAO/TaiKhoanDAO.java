/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTT.DAO;

import UTT.Connection.JdbcHelper;
import static UTT.Connection.JdbcHelper.executeUpdate;
import static UTT.Connection.JdbcHelper.preparedStatement;
import UTT.Model.TaiKhoan;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author luongtopp
 */
public class TaiKhoanDAO {

    public TaiKhoanDAO() {
 
    }

    public List<TaiKhoan> hienTaiKhoan() {
        String sql = "SELECT * FROM taikhoan";
        return timQuanHe(sql);
    }

    public List<TaiKhoan> hienTaiKhoan(String timKiem) {
        String sql = "SELECT * FROM taikhoan WHERE tendangnhap = ?";
        return timQuanHe(sql, timKiem);
    }
    public List<TaiKhoan> isAdmin(String timKiem) {
        String sql = "SELECT * FROM taikhoan WHERE tendangnhap = ?";
        return timQuanHe(sql, timKiem);
    }

    public void themTaiKhoan(String tenDangNhap, String matKhau,
            String ngayCapQuyen, Boolean admin, String hoTen,
            String maPhongBan, String maChucVu, String email,
            Object... args) throws SQLException {

        String sql = """
                     INSERT INTO taikhoan (tendangnhap, matkhau, 
                     ngaycapquyen, admin, hoten, maphongban, machucvu, email)
                         VALUES (?, ?, ?, ?, ?, ?, ?, ?)
                    """;

        try (PreparedStatement pstmt = preparedStatement(sql, tenDangNhap, matKhau,
                ngayCapQuyen, admin, hoTen, maPhongBan, maChucVu, email
        )) {
            int rowsAffected = pstmt.executeUpdate();
            System.out.println(rowsAffected + " row(s) affected.");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public void suaTaiKhoan(String tenDangNhap, String matKhau,
            Date ngayCapQuyen, Boolean admin, String hoTen,
            String maPhongBan, String maChucVu, String email,
            Object... args) throws SQLException {
        String sql = """
                     UPDATE taikhoan
                     SET
                         matkhau = ?,
                         ngaycapquyen = ?,
                         admin = ?,
                         hoten = ?,
                         maphongban = ?,
                         machucvu = ?,
                         email = ?
                     WHERE
                         tendangnhap = ?;
                    """;
        try {
            executeUpdate(sql, matKhau,
                    ngayCapQuyen, admin, hoTen, maPhongBan, maChucVu, email,
                    tenDangNhap
            );
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public void xoaTaiKhoan(String tenDangNhap, Object... args) throws SQLException {
        String sql = """
                      DELETE FROM taikhoan WHERE tendangnhap = ?
                     """;
        try {
            executeUpdate(sql, tenDangNhap);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    private List<TaiKhoan> timQuanHe(String sql, Object... args) {
        List<TaiKhoan> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);

                while (rs.next()) {
                    TaiKhoan taiKhoan = layDuLieuTuBangQuanHe(rs);
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

    private TaiKhoan layDuLieuTuBangQuanHe(ResultSet rs) throws SQLException {

        TaiKhoan taiKhoan = new TaiKhoan();
        taiKhoan.setTenDangNhap(rs.getNString("tendangnhap"));
        taiKhoan.setMatKhau(rs.getString("matkhau"));
        taiKhoan.setNgayCapQuyen(rs.getDate("ngaycapquyen"));
        taiKhoan.setAdmin(rs.getBoolean("admin"));
        taiKhoan.setHoTen(rs.getNString("hoten"));
        taiKhoan.setMaPhongBan(rs.getNString("maphongban"));
        taiKhoan.setMaChucVu(rs.getNString("machucvu"));
        taiKhoan.setEmail(rs.getNString("email"));
        return taiKhoan;
    }

    public static void main(String[] args) throws SQLException {
        List<TaiKhoan> list = new TaiKhoanDAO().hienTaiKhoan();
        for (var item : list) {
            System.out.println(item.getHoTen());
        }

    }
}
