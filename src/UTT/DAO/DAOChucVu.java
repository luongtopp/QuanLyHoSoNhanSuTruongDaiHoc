/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTT.DAO;

import UTT.Connection.JdbcHelper;
import java.sql.SQLException;
import UTT.Model.ChucVu;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pvant
 */
public class DAOChucVu {

    public void themChucVu(String maChucVu, String tenChucVu) throws SQLException {
        String sql = "INSERT into chucvu(machucvu, tenchucvu) VALUES( "
                + "N'" + maChucVu + "'"
                + ",N'" + tenChucVu + "')";
        update(sql);
    }

    public void xoaChucVu(String MaChucVu) throws SQLException {
        String sql = "DELETE FROM chucvu WHERE machucvu = N'" + MaChucVu + "'";
        update(sql);
    }

    public void suaChucVu(String MachucVu, String TenChucVu) throws SQLException {
        String sql = "UPDATE chucvu set tenchucvu = N'" + TenChucVu + "'"
                + " WHERE machucvu = N'" + MachucVu + "'";
        update(sql);
    }

    public List<ChucVu> timChucVu() {
        String sql = "SELECT * FROM chucvu";
        return selectChucVu(sql);
    }

    public List<ChucVu> timKiemChucVu(String MaChucVu) throws SQLException {
        String sql = "SELECT * FROM chucvu WHERE machucvu like '%" + MaChucVu + "%'";
        return selectChucVu(sql);
    }

    private List<ChucVu> selectChucVu(String sql, Object... args) {
        List<ChucVu> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);

                while (rs.next()) {
                    ChucVu chucvu = traTruyVanChucVu(rs);
                    list.add(chucvu);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    private ChucVu traTruyVanChucVu(ResultSet rs) throws SQLException {
        ChucVu chucvu = new ChucVu();
        chucvu.setMaChucVu(rs.getString("machucvu"));
        chucvu.setTenChucVu(rs.getString("tenchucvu"));
        return chucvu;
    }

    private void update(String sql, Object... args) throws SQLException {
        JdbcHelper.executeUpdate(sql, args);
    }
}
