/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Connection.JdbcHelper;
import Model.CanBo;
import Model.QuaTrinhCongTac;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pvant
 */
public class DAOQuaTrinhCongTac {

    public void themQuaTrinhCongTac(String maQuaTrinhCongTac, String tenQuaTrinhCongTac, String DiaChi, String SDT, String Email) throws SQLException {
        String sql = "INSERT into phongban(maphongban, tenphongban, diachi, sdt, email) VALUES( "
                + "N'" + maQuaTrinhCongTac + "'"
                + ",N'" + tenQuaTrinhCongTac + "'"
                + ",N'" + DiaChi + "'"
                + ",N'" + SDT + "'"
                + ",N'" + Email + "')";
        update(sql);
    }

    public List<QuaTrinhCongTac> timQuaTrinhCongTac() {
        String sql = "SELECT * FROM phongban";
        return selectQuaTrinhCongTac(sql);
    }

    public List<QuaTrinhCongTac> timKiemQuaTrinhCongTac(String maCanBo) throws SQLException {
        String sql = "SELECT canbo.macanbo as macanbo, canbo.hotenkhaisinh as hoten, canbo.ngaysinh as ngaysinh, canbo.gioitinh as gioitinh, canbo.noiohientai as noio, \n"
                + "       quatrinhcongtac.thoigianbatdau as thoigianbatdau, quatrinhcongtac.thoigianketthuc as thoigianketthuc, \n"
                + "       quatrinhcongtac.congviec as congviec, quatrinhcongtac.noicongtac as noicongtac, quatrinhcongtac.chucvucaonhat as chucvucaonhat\n"
                + "FROM quan_ly_ho_so_nhan_su_truong_dai_hoc1.quatrinhcongtac \n"
                + "INNER JOIN canbo ON quatrinhcongtac.macanbo = canbo.macanbo \n"
                + "WHERE canbo.macanbo LIKE ?";
        return selectQuaTrinhCongTac(sql, maCanBo);
    }

    public void xoaQuaTrinhCongTac(String MaQuaTrinhCongTac) throws SQLException {
        String sql = "DELETE FROM phongban WHERE maphongban = N'" + MaQuaTrinhCongTac + "'";
        update(sql);
    }

    public void suaQuaTrinhCongTac(String MaQuaTrinhCongTac, String TenQuaTrinhCongTac, String DiaChi,
            String SDT, String Email) throws SQLException {
        String sql = "UPDATE phongban set tenphongban = N'" + TenQuaTrinhCongTac + "'"
                + ", diachi = N'" + DiaChi + "'"
                + ", sdt = N'" + SDT + "'"
                + ", email = N'" + Email + "'"
                + " WHERE maphongban = N'" + MaQuaTrinhCongTac + "'";

        update(sql);
    }

    public List<QuaTrinhCongTac> hienThiQuaTrinhCongTac(String maCanBo) {
        String sql = "SELECT * FROM quatrinhcongtac WHERE macanbo = ?";
        return selectQuaTrinhCongTac(sql, maCanBo);
    }

    private List<QuaTrinhCongTac> selectQuaTrinhCongTac(String sql, Object... args) {
        List<QuaTrinhCongTac> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);

                while (rs.next()) {
                    QuaTrinhCongTac quatrinhcongtac = traTruyVanQuaTrinhCongTac(rs);
                    list.add(quatrinhcongtac);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    private QuaTrinhCongTac traTruyVanQuaTrinhCongTac(ResultSet rs) throws SQLException {
        QuaTrinhCongTac quatrinhcongtac = new QuaTrinhCongTac();
        quatrinhcongtac.setMaCanBo(rs.getString("macanbo"));
        quatrinhcongtac.setThoiGianBatDau(rs.getDate("thoigianbatdau"));
        quatrinhcongtac.setThoiGianKetThuc(rs.getDate("ngaysinh"));
        quatrinhcongtac.setCongViec(rs.getString("gioitinh"));
        quatrinhcongtac.setNoiCongTac(rs.getString("noio"));
        quatrinhcongtac.setChucVuCaoNhat(rs.getString("thoigianbatdau"));
        quatrinhcongtac.setThoiGianKetThuc(rs.getString("thoigianketthuc"));
      
        return quatrinhcongtac;
    }

    private void update(String sql, Object... args) throws SQLException {
        JdbcHelper.executeUpdate(sql, args);
    }

    public static void main(String[] args) throws SQLException {
        List<QuaTrinhCongTac> list = new DAOQuaTrinhCongTac().timKiemQuaTrinhCongTac("CB003");
        for (var item : list) {
            System.out.println(item.getThoiGianBatDau());
        }
    }
}
