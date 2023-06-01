/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTT.DAO;

import UTT.Connection.JdbcHelper;
import static UTT.Connection.JdbcHelper.executeUpdate;
import static UTT.Connection.JdbcHelper.preparedStatement;
import UTT.Model.CanBo;
import UTT.Model.QuanHe;
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
public class QuanHeDAO {

    public List<QuanHe> hienQuanHe() {
        String sql = "SELECT * FROM quanhe";
        return timQuanHe(sql);
    }

    public List<QuanHe> hienQuanHe(String timKiem) {
        String sql = "SELECT * FROM quanhe WHERE macanbo = ?";
        return timQuanHe(sql, timKiem);
    }

    public void themQuanHe(String maCanBo, String quanHe, String hoTen,
            Date ngaySinh, String gioiTinh, String ngheNghiep,
            String diaChi, Object... args) throws SQLException {

        String sql = """
                     INSERT INTO
                         quanhe (
                             macanbo,
                             quanhe,
                             hoten,
                             ngaysinh,
                             gioitinh,
                             nghenghiep,
                             diachi
                         )
                     VALUES
                         (?, ?, ?, ?, ?, ?, ?);
                    """;

        try (PreparedStatement pstmt = preparedStatement(sql, maCanBo, quanHe,
                hoTen, ngaySinh, gioiTinh, ngheNghiep, diaChi
        )) {
            int rowsAffected = pstmt.executeUpdate();
            System.out.println(rowsAffected + " row(s) affected.");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public void suaQuanHe(String maCanBo, String quanHe, String hoTen,
            Date ngaySinh, String gioiTinh, String ngheNghiep,
            String diaChi, String id, Object... args) throws SQLException {
        String sql = """
                     UPDATE quanhe
                     SET
                     macanbo = ?,
                     quanhe = ?,
                     hoten = ?,
                     ngaysinh = ?,
                     gioitinh = ?,
                     nghenghiep = ?,
                     diachi = ?
                     WHERE id = ?;
                    """;
        try {
            executeUpdate(sql, maCanBo, quanHe,
                    hoTen, ngaySinh, gioiTinh, ngheNghiep, diaChi, id
            );
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public void xoaQuanHe(String id, Object... args) throws SQLException {
        String sql = """
                      DELETE FROM quanhe WHERE id = ?
                     """;
        try {
            executeUpdate(sql, id);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    private List<QuanHe> timQuanHe(String sql, Object... args) {
        List<QuanHe> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);

                while (rs.next()) {
                    QuanHe quanHe = layDuLieuTuBangQuanHe(rs);
                    list.add(quanHe);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    private QuanHe layDuLieuTuBangQuanHe(ResultSet rs) throws SQLException {

        QuanHe quanHe = new QuanHe();
        quanHe.setId(rs.getInt("id"));
        quanHe.setMaCanBo(rs.getString("macanbo"));        
        quanHe.setQuanHe(rs.getNString("quanhe"));
        quanHe.setHoTen(rs.getNString("hoten"));
        quanHe.setNgaySinh(rs.getDate("ngaysinh"));
        quanHe.setGioiTinh(rs.getNString("gioitinh"));
        quanHe.setNgheNghiep(rs.getNString("nghenghiep"));        
        quanHe.setDiaChi(rs.getNString("diachi"));
        return quanHe;
    }

    public static void main(String[] args) throws SQLException {
        List<QuanHe> list = new QuanHeDAO().hienQuanHe();
        for (var item : list) {
            System.out.println(item.getHoTen());
        }

    }

}
