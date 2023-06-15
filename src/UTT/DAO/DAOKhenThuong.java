/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTT.DAO;

import UTT.Connection.JdbcHelper;
import UTT.Model.CanBo;
import UTT.Model.CanBoNghiHuu;
import UTT.Model.KhenThuong;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pvant
 */
public class DAOKhenThuong {

    public void themCanBoKhenThuong(String maKhenThuong, String maCanBo, String hinhThucKhenThuong, String ngayKhenThuong, String phongBan, String danhHieu) throws SQLException {
        String sql = "INSERT into khenthuong(makhenthuong, macanbo, hinhthuckhenthuong, ngaykhenthuong, donvi,danhhieu ) VALUES( "
                + "N'" + maKhenThuong + "'"
                + ",N'" + maCanBo + "'"
                + ",N'" + hinhThucKhenThuong + "'"
                + ",N'" + ngayKhenThuong + "'"
                + ",N'" + phongBan + "'"
                + ",N'" + danhHieu + "')";
        update(sql);
    }

    public List<KhenThuong> bangKhenThuong() {
        String sql = "SELECT * FROM khenthuong";
        return selectKhenThuong(sql);
    }

    public List<KhenThuong> timKiemCanBoKhenThuong(String maKhenThuong) throws SQLException {
        String sql = "SELECT * FROM khenthuong  WHERE makhenthuong like '%" + maKhenThuong + "%'";
        return selectKhenThuong(sql);
    }

    public List<CanBo> timKiemCanBo(String maCanBo) throws SQLException {
        String sql = "SELECT hotenkhaisinh, ngaysinh, gioitinh, quequan, chucvu.tenchucvu, phongban.tenphongban  FROM canbo \n"
                + "inner join chucvu on canbo.machucvu=chucvu.machucvu\n"
                + "inner join phongban on canbo.maphongban = phongban.maphongban\n"
                + " WHERE macanbo = '" + maCanBo + "';";
        return selectCanBo(sql);
    }

    public void xoaCanBoKhenThuong(String maKhenThuong) throws SQLException {
        String sql = "DELETE FROM khenthuong WHERE makhenthuong = N'" + maKhenThuong + "'";
        update(sql);
    }

    public void suaCanBoKhenThuong(String maKhenThuong, String maCanBo, String hinhThucKhenThuong, String ngayKhenThuong, String phongBan, String danhHieu) throws SQLException {
        String sql = "UPDATE khenthuong set macanbo = N'" + maCanBo + "'"
                + ", hinhthuckhenthuong = N'" + hinhThucKhenThuong + "'"
                + ", ngaykhenthuong = N'" + ngayKhenThuong + "'"
                + ", donvi = N'" + phongBan + "'"
                + ", danhhieu = N'" + danhHieu + "'"
                + " WHERE makhenthuong = N'" + maKhenThuong + "'";

        update(sql);
    }
//    public List<QuaTrinhCongTac> hienThiQuaTrinhCongTac(String maCanBo) {
//        String sql = "SELECT * FROM quatrinhcongtac WHERE macanbo = ?";
//        return selectQuaTrinhCongTac(sql, maCanBo);
//    }

    private List<KhenThuong> selectKhenThuong(String sql, Object... args) {
        List<KhenThuong> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);

                while (rs.next()) {
                    KhenThuong khenthuong = traTruyKhenThuong(rs);
                    list.add(khenthuong);
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

    private KhenThuong traTruyKhenThuong(ResultSet rs) throws SQLException {
        KhenThuong khenthuong = new KhenThuong();
        khenthuong.setMaKhenThuong(rs.getString("makhenthuong"));
        khenthuong.setMaCanBo(rs.getString("macanbo"));
        khenthuong.setHinhThucKhenThuong(rs.getString("hinhthuckhenthuong"));
        khenthuong.setNgayKhenThuong(rs.getDate("ngaykhenthuong"));
        khenthuong.setDonVi(rs.getString("donvi"));
        khenthuong.setDanhHieu(rs.getString("danhhieu"));

        return khenthuong;
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
