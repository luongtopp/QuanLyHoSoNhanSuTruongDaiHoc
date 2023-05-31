/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Connection.JdbcHelper;
import Model.PhongBan;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luongtopp
 */
public class PhongBanDAO {

    public List<PhongBan> hienThiPhongBan() {
        String sql = "SELECT * FROM phongban";
        return selectPhongBan(sql);
    }

    private List<PhongBan> selectPhongBan(String sql, Object... args) {
        List<PhongBan> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);

                while (rs.next()) {
                    PhongBan phongBan = layDuLieuTuBangPhongBan(rs);
                    list.add(phongBan);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    private PhongBan layDuLieuTuBangPhongBan(ResultSet rs) throws SQLException {

        PhongBan phongBan = new PhongBan();
        phongBan.setMaPhongBan(rs.getString("maphongban"));
        phongBan.setTenPhongBan(rs.getString("tenphongban"));
        phongBan.setDiaChi(rs.getString("diachi"));
        phongBan.setSdt(rs.getString("sdt"));
        phongBan.setEmail(rs.getString("email"));
        return phongBan;
    }
}
