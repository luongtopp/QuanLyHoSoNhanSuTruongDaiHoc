/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTT.DAO;

import UTT.Connection.JdbcHelper;
import UTT.Model.ThongKe;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luongtopp
 */
public class ThongKeDAO {

    public List<ThongKe> hienThiThongKe() {
        String sql = "{CALL tinh_luong}";
        return timKiemThongKe(sql);
    }

    private List<ThongKe> timKiemThongKe(String sql, Object... args) {
        List<ThongKe> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);

                while (rs.next()) {
                    ThongKe thongKe = layDuLieuTuBangThongKe(rs);
                    list.add(thongKe);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    private ThongKe layDuLieuTuBangThongKe(ResultSet rs) throws SQLException {

        ThongKe thongKe = new ThongKe();
        thongKe.setMaCanBo(rs.getString("macanbo"));
        thongKe.setHoTenKhaiSinh(rs.getString("hotenkhaisinh"));
        thongKe.setMaChucVu(rs.getNString("machucvu"));
        thongKe.setMaPhongBan(rs.getNString("maphongban"));
        thongKe.setMucLuong(rs.getFloat("mucluong"));

        return thongKe;
    }

    public static void main(String[] args) throws SQLException {
        List<ThongKe> list = new ThongKeDAO().hienThiThongKe();
        for (var item : list) {
            System.out.println(item.toString());
        }
    }

}
