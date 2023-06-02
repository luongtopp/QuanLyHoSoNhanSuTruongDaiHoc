/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTT.DAO;

import UTT.Connection.JdbcHelper;
import UTT.Model.CanBo;
import UTT.Model.CanBoNghiHuu;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pvant
 */
public class DAONghiHuu {

    public void themCanBoNghiHuu(String maCanBo, String quyetDinhSo, String ngayBatDau) throws SQLException {
        String sql = "INSERT into thong_tin_nghi_huu(macanbo, soqdnghihuu, thoigiannghihuu ) VALUES( "
                + "N'" + maCanBo + "'"
                + ",N'" + quyetDinhSo + "'"
                + ",N'" + ngayBatDau + "')";
        update(sql);
    }

    public List<CanBoNghiHuu> bangCanBoNghiHuu() {
        String sql = "SELECT * FROM thong_tin_nghi_huu";
        return selectCanBoNghiHuu(sql);
    }

    public List<CanBoNghiHuu> timKiemCanBoNghiHuu(String maCanBo) throws SQLException {
        String sql = "SELECT * FROM thong_tin_nghi_huu  WHERE macanbo like '%" + maCanBo + "%'";
        return selectCanBoNghiHuu(sql);
    }

    public List<CanBo> timKiemCanBo(String maCanBo) throws SQLException {
        String sql = "SELECT hotenkhaisinh, ngaysinh, gioitinh, quequan, chucvu.tenchucvu, phongban.tenphongban  FROM canbo \n"
                + "inner join chucvu on canbo.machucvu=chucvu.machucvu\n"
                + "inner join phongban on canbo.maphongban = phongban.maphongban\n"
                + " WHERE macanbo = '" + maCanBo + "';";
        return selectCanBo(sql);
    }

    public void xoaCanBoNghiHuu(String maCanBo) throws SQLException {
        String sql = "DELETE FROM thong_tin_nghi_huu WHERE macanbo = N'" + maCanBo + "'";
        update(sql);
    }

    public void suaCanBoNghiHuu(String maCanBo, String quyetDinhSo, String ngayBatDau) throws SQLException {
        String sql = "UPDATE thong_tin_nghi_huu set soqdnghihuu = N'" + quyetDinhSo + "'"
                + ", thoigiannghihuu = N'" + ngayBatDau + "'"
                + " WHERE macanbo = N'" + maCanBo + "'";

        update(sql);
    }
//    public List<QuaTrinhCongTac> hienThiQuaTrinhCongTac(String maCanBo) {
//        String sql = "SELECT * FROM quatrinhcongtac WHERE macanbo = ?";
//        return selectQuaTrinhCongTac(sql, maCanBo);
//    }

    private List<CanBoNghiHuu> selectCanBoNghiHuu(String sql, Object... args) {
        List<CanBoNghiHuu> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);

                while (rs.next()) {
                    CanBoNghiHuu canbonghihuu = traTruyVanCanBoNghiHuu(rs);
                    list.add(canbonghihuu);
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

    private CanBoNghiHuu traTruyVanCanBoNghiHuu(ResultSet rs) throws SQLException {
        CanBoNghiHuu canbonghihuu = new CanBoNghiHuu();
        canbonghihuu.setMaCanBo(rs.getString("macanbo"));
        canbonghihuu.setQuyetDinhSo(rs.getString("soqdnghihuu"));
        canbonghihuu.setThoiGianNghiHuu(rs.getDate("thoigiannghihuu"));

        return canbonghihuu;
    }

    private CanBo traTruyVanCanBo(ResultSet rs) throws SQLException {
        CanBo canbo = new CanBo();
        // canbo.setMaCanBo(rs.getString("macanbo"));
        canbo.setHoTenKhaiSinh(rs.getString("hotenkhaisinh"));
        canbo.setNgaySinh(rs.getDate("ngaysinh"));
        canbo.setGioiTinh(rs.getString("gioitinh"));
        canbo.setQueQuan(rs.getString("quequan"));
        canbo.setMaChucVu(rs.getString("tenchucvu"));
        canbo.setMaPhongBan(rs.getString("tenphongban"));

        return canbo;
    }

    private void update(String sql, Object... args) throws SQLException {
        JdbcHelper.executeUpdate(sql, args);
    }

    public static void main(String[] args) throws SQLException {
//        List<QuaTrinhCongTac> list = new DAONghiHuu().timKiemQuaTrinhCongTac("CB003");
//        for (var item : list) {
//            System.out.println(item.getThoiGianBatDau());
     //   }
    }
}
