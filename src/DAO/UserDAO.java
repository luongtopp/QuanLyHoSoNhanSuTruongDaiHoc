/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Connection.JdbcHelper;
import Model.PhongBan;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author luongtopp
 */
public class UserDAO {
    
    public void themPhongBan(String maPhongBan, String tenPhongBan, String DiaChi, String SDT, String Email) throws SQLException {
        String sql = "INSERT into phongban(maphongban, tenphongban, diachi, sdt, email) VALUES( "
                + "N'" + maPhongBan + "'"
                + ",N'" + tenPhongBan + "'"
                + ",N'" + DiaChi + "'"
                 + ",N'" + SDT + "'"
                 + ",N'" + Email + "')";
        update(sql);
    }

    public List<PhongBan> timPhongBan() {
        String sql = "SELECT * FROM phongban";
        return selectPhongBan(sql);
    }
    
     public List<PhongBan> timKiemPhongBan(String MaPhongBan)throws SQLException {
        String sql = "SELECT * FROM phongban WHERE maphongban like '%" + MaPhongBan+ "%'";
      return selectPhongBan(sql);
    }

    public void xoaPhongBan(String MaPhongBan) throws SQLException {
        String sql = "DELETE FROM phongban WHERE maphongban = N'" + MaPhongBan+ "'";
        update(sql);
    }

    public void suaPhongBan(String MaPhongBan, String TenPhongBan, String DiaChi,
            String SDT, String Email) throws SQLException {
        String sql = "UPDATE phongban set tenphongban = N'" + TenPhongBan + "'"
                + ", diachi = N'" + DiaChi + "'"
                + ", sdt = N'" + SDT + "'"
                + ", email = N'" + Email + "'"
                + " WHERE maphongban = N'" + MaPhongBan+ "'";

        update(sql);
    }

    private List<PhongBan> selectPhongBan(String sql, Object... args) {
        List<PhongBan> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);

                while (rs.next()) {
                    PhongBan phongban = traTruyVanPhongBan(rs);
                    list.add(phongban);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }


    private PhongBan traTruyVanPhongBan(ResultSet rs) throws SQLException {
        PhongBan phongban = new PhongBan();
        phongban.setMaPhongBan(rs.getString("maphongban"));
        phongban.setTenPhongBan(rs.getString("tenphongban"));
        phongban.setSDTPhongBan(rs.getString("sdt"));
        phongban.setDiaChiPhongBan(rs.getString("diachi"));
        phongban.setEmailPhongBan(rs.getString("email"));

        return phongban;
    }


    private void update(String sql, Object... args) throws SQLException {
        JdbcHelper.executeUpdate(sql, args);
    }
}
