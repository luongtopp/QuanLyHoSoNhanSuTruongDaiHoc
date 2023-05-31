/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTT.DAO;

import UTT.Connection.JdbcHelper;
import UTT.Model.ChucVu;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luongtopp
 */
public class ChucVuDAO {
    public List<ChucVu> hienThiChucVu() {
        String sql = "SELECT * FROM chucvu";
        return selectChucVu(sql);
    }

    private List<ChucVu> selectChucVu(String sql, Object... args) {
        List<ChucVu> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);

                while (rs.next()) {
                    ChucVu chuVu = layDuLieuTuBangChucVu(rs);
                    list.add(chuVu);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    private ChucVu layDuLieuTuBangChucVu(ResultSet rs) throws SQLException {

        ChucVu chucVu = new ChucVu();
        chucVu.setMaChucVu(rs.getString("machucvu"));
        chucVu.setTenChucVu(rs.getString("tenchucvu"));
        return chucVu;
    }
    
}
