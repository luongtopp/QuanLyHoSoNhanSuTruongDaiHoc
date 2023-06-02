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

    public void themQuaTrinhCongTac(String maCanBo, String ngayBatDau, String ngayKetThuc, String congViec, String noiCongTac, String chucVuCaoNhat) throws SQLException {
        String sql = "INSERT into quatrinhcongtac(macanbo, thoigianbatdau, thoigianketthuc, congviec, noicongtac, chucvucaonhat ) VALUES( "
                + "N'" + maCanBo + "'"
                + ",N'" + ngayBatDau + "'"
                + ",N'" + ngayKetThuc + "'"
                + ",N'" + congViec + "'"
                + ",N'" + noiCongTac + "'"
                + ",N'" + chucVuCaoNhat + "')";
        update(sql);
    }

    public List<QuaTrinhCongTac> timQuaTrinhCongTac() {
        String sql = "SELECT * FROM quatrinhcongtac";
        return selectQuaTrinhCongTac(sql);
    }

    public List<QuaTrinhCongTac> timKiemQuaTrinhCongTac(String maCanBo) throws SQLException {
        String sql = "SELECT * FROM quatrinhcongtac  WHERE macanbo like '%" + maCanBo + "%'";
        return selectQuaTrinhCongTac(sql);
    }

    public List<CanBo> timKiemCanBo(String MaCanBo) throws SQLException {
        String sql = "SELECT hotenkhaisinh, ngaysinh, gioitinh, quequan FROM canbo WHERE macanbo = '" + MaCanBo + "'";
        return selectCanBo(sql);
    }

    public void xoaQuaTrinhCongTac(String maQuaTrinhCongTac) throws SQLException {
       String sql = "DELETE FROM quatrinhcongtac WHERE macanbo = N'" + maQuaTrinhCongTac + "'";
        update(sql);
    }

    public void suaQuaTrinhCongTac(String maCanBo, String ngayBatDau, String ngayKetThuc, String congViec, String noiCongTac, String chucVuCaoNhat) throws SQLException {
        String sql = "UPDATE quatrinhcongtac set thoigianbatdau = N'" + ngayBatDau + "'"
                + ", thoigianketthuc = N'" + ngayKetThuc + "'"
                + ", congviec = N'" + congViec + "'"
                + ", noicongtac = N'" + noiCongTac + "'"
                 + ", chucvucaonhat = N'" + chucVuCaoNhat + "'"
                + " WHERE macanbo = N'" + maCanBo + "'";

        update(sql);
    }
//    public List<QuaTrinhCongTac> hienThiQuaTrinhCongTac(String maCanBo) {
//        String sql = "SELECT * FROM quatrinhcongtac WHERE macanbo = ?";
//        return selectQuaTrinhCongTac(sql, maCanBo);
//    }
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

    private List<CanBo> selectCanBo(String sql, Object... args) {
        List<CanBo> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);

                while (rs.next()) {
                    CanBo canbo = traTruyVanCanBo(rs);
                    list.add(canbo);
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
        quatrinhcongtac.setThoiGianKetThuc(rs.getDate("thoigianketthuc"));
        quatrinhcongtac.setCongViec(rs.getString("congviec"));
        quatrinhcongtac.setNoiCongTac(rs.getString("noicongtac"));
        quatrinhcongtac.setChucVuCaoNhat(rs.getString("chucvucaonhat"));

        return quatrinhcongtac;
    }

    private CanBo traTruyVanCanBo(ResultSet rs) throws SQLException {
        CanBo canbo = new CanBo();
        // canbo.setMaCanBo(rs.getString("macanbo"));
        canbo.setHoTenKhaiSinh(rs.getString("hotenkhaisinh"));
        canbo.setNgaySinh(rs.getDate("ngaysinh"));
        canbo.setGioiTinh(rs.getString("gioitinh"));
        canbo.setQueQuan(rs.getString("quequan"));

        return canbo;
    }

    private void update(String sql, Object... args) throws SQLException {
        JdbcHelper.executeUpdate(sql, args);
    }

    public static void main(String[] args) throws SQLException {
        List<CanBo> list = new CanBoDAO().timKiemCanBo("CB003");
        for (var item : list) {
            System.out.println(item.getMaCanBo());
        }
    }
}
