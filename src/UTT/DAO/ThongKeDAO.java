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
        String sql = "{CALL thong_ke_can_bo_sap_ve_huu}";
        return timKiemThongKe(sql);
    }

    public List<ThongKe> timKiemMaThongKe(String timKiem) {
        String sql = "SELECT * FROM chucvu WHERE tenchucvu = ?";
        return timKiemThongKe(sql, timKiem);
    }

    public List<ThongKe> timKiemTenThongKe(String timKiem) {
        String sql = "SELECT * FROM chucvu WHERE machucvu = ?";
        return timKiemThongKe(sql, timKiem);
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
        thongKe.setQueQuan(rs.getString("quequan"));

        thongKe.setNgaySinh(rs.getDate("ngaysinh"));
        thongKe.setNgayHopDong(rs.getDate("ngayhopdong"));
        thongKe.setNgayNghiHuu(rs.getDate("ngaynghihuu"));
//        thongKe.setNgayHetHopDong(rs.getDate("tenchucvu"));

        return thongKe;
    }


    public static void main(String[] args) throws SQLException {
        List<ThongKe> list = new ThongKeDAO().hienThiThongKe();
        for (var item : list) {
            System.out.println(item.toString());
           }
    }

}
