/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTT.DAO;

import UTT.Connection.JdbcHelper;
import UTT.Model.Luong;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pvant
 */
public class DAOLuong {

    //Lương cơ bản
    public void themLuongCoBan(String maLuongCoBan, String ngayHieuLuc, String ngayHetHieuLuc, Float mucLuong) throws SQLException {
        String sql = "INSERT into luongcoban(maluong, ngayhieuluc, ngayhethieuluc, mucluong) VALUES( "
                + "N'" + maLuongCoBan + "'"
                + ",N'" + ngayHieuLuc + "'"
                + ",N'" + ngayHetHieuLuc + "'"
                + ",N'" + mucLuong + "')";
        update(sql);
    }

    public void xoaLuongCoBan(String maLuongCoBan) throws SQLException {
        String sql = "DELETE FROM luongcoban WHERE maluong = N'" + maLuongCoBan + "'";
        update(sql);
    }

    public void suaLuongCoBan(String maLuongCoBan, String ngayHieuLuc, String ngayHetHieuLuc, Float mucLuong) throws SQLException {
        String sql = "UPDATE luongcoban set ngayhieuluc = N'" + ngayHieuLuc + "'"
                + ", ngayhethieuluc = N'" + ngayHetHieuLuc + "'"
                + ", mucluong = N'" + mucLuong + "'"
                + " WHERE maluong = N'" + maLuongCoBan + "'";
        update(sql);
    }

    public List<Luong> bangLuongCoBan() {
        String sql = "SELECT * FROM luongcoban";
        return selectLuongCoBan(sql);
    }
//
//    public List<ChucVu> timKiemChucVu(String MaChucVu) throws SQLException {
//        String sql = "SELECT * FROM chucvu WHERE machucvu like '%" + MaChucVu + "%'";
//        return selectChucVu(sql);
//    }

    private List<Luong> selectLuongCoBan(String sql, Object... args) {
        List<Luong> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);

                while (rs.next()) {
                    Luong chucvu = traTruyVanLuong(rs);
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

    private Luong traTruyVanLuong(ResultSet rs) throws SQLException {
        Luong luong = new Luong();
        luong.setMaLuong(rs.getString("maluong"));
        luong.setNgayHieuLuc(rs.getDate("ngayhieuluc"));
        luong.setNgayHetHieuLuc(rs.getDate("ngayhethieuluc"));
        luong.setMucLuong(rs.getFloat("mucluong"));

        return luong;
    }

    //Bậc lương
    public void themBacLuong(String maBacNgach, String tenBacNgach, Float heSoLuong) throws SQLException {
        String sql = "INSERT into bacngach(mabacngach, tenbacngach, hesoluong) VALUES( "
                + "N'" + maBacNgach + "'"
                + ",N'" + tenBacNgach + "'"
                + ",N'" + heSoLuong + "')";
        update(sql);
    }

    public void xoaBacLuong(String maBacNgach) throws SQLException {
        String sql = "DELETE FROM bacngach WHERE mabacngach = N'" + maBacNgach + "'";
        update(sql);
    }

    public void suaBacLuong(String maBacNgach, String tenBacNgach, Float heSoLuong) throws SQLException {
        String sql = "UPDATE bacngach set tenbacngach = N'" + tenBacNgach + "'"
                + ", hesoluong = N'" + heSoLuong + "'"
                + " WHERE mabacngach = N'" + maBacNgach + "'";
        update(sql);
    }

    public List<Luong> bangBacLuong() {
        String sql = "SELECT * FROM bacngach";
        return selectBacNgach(sql);
    }

    private List<Luong> selectBacNgach(String sql, Object... args) {
        List<Luong> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);

                while (rs.next()) {
                    Luong bacngach = traTruyVanBacNgach(rs);
                    list.add(bacngach);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    private Luong traTruyVanBacNgach(ResultSet rs) throws SQLException {
        Luong bacngach = new Luong();
        bacngach.setMaBacNgach(rs.getString("mabacngach"));
        bacngach.setTenBacNgach(rs.getString("tenbacngach"));
        bacngach.setHeSoLuong(rs.getFloat("hesoluong"));

        return bacngach;
    }

    //Phụ cấp
    public void themPhuCap(String maPhuCap, String tenPhuCap, Float heSoPhuCap, String ghiChu) throws SQLException {
        String sql = "INSERT into phucap(maphucap, tenphucap, hesophucap, ghichu) VALUES( "
                + "N'" + maPhuCap + "'"
                + ",N'" + tenPhuCap + "'"
                + ",N'" + heSoPhuCap + "'"
                + ",N'" + ghiChu + "')";
        update(sql);
    }

    public void xoaPhucap(String maPhuCap) throws SQLException {
        String sql = "DELETE FROM phucap WHERE maphucap = N'" + maPhuCap + "'";
        update(sql);
    }

    public void suaPhuCap(String maPhuCap, String tenPhuCap, Float heSoPhuCap, String ghiChu) throws SQLException {
        String sql = "UPDATE phucap set tenphucap = N'" + tenPhuCap + "'"
                + ", hesophucap = N'" + heSoPhuCap + "'"
                + ", ghichu = N'" + ghiChu + "'"
                + " WHERE maPhuCap = N'" + maPhuCap + "'";
        update(sql);
    }

    public List<Luong> bangPhuCap() {
        String sql = "SELECT * FROM phucap";
        return selectPhuCap(sql);
    }

    private List<Luong> selectPhuCap(String sql, Object... args) {
        List<Luong> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);

                while (rs.next()) {
                    Luong phucap = traTruyVanPhuCap(rs);
                    list.add(phucap);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    private Luong traTruyVanPhuCap(ResultSet rs) throws SQLException {
        Luong phucap = new Luong();
        phucap.setMaPhuCap(rs.getString("maphucap"));
        phucap.setTenPhuCap(rs.getString("tenphucap"));
        phucap.setHeSoPhuCap(rs.getFloat("hesophucap"));
        phucap.setGhiChu(rs.getString("ghichu"));

        return phucap;
    }

    //Tính lương
    public List<Luong> tinhLuong() {
        String sql = "SELECT cb.macanbo, cb.hotenkhaisinh,bn.hesoluong, pc.hesophucap,lcb.mucluong, mucluong*hesophucap+mucluong*hesoluong as tongluong  FROM canbo cb"
                + " inner join chucvu cv on cb.machucvu = cv.machucvu "
                + "  inner join luongcoban lcb on cv.maluong = lcb.maluong"
                + "  inner join phucap pc on cv.maphucap = pc.maphucap "
                + "   inner join bacngach bn on cv.mabacngach = bn.mabacngach ";

        //+"inner join chucvu cv on cb.machucvu = cv.machucvu "
//              inner join luongcoban lcb on cv.maluong = lcb.maluong\n" +
//                inner join phucap pc on cv.maphucap = pc.maphucap\n" +
//              inner join bacngach bn on cv.mabacngach = bn.mabacngach\n"'"; 
        return selectTongLuong(sql);
    }

    private List<Luong> selectTongLuong(String sql, Object... args) {
        List<Luong> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);

                while (rs.next()) {
                    Luong tongluong = traTruyVanTongLuong(rs);
                    list.add(tongluong);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    private Luong traTruyVanTongLuong(ResultSet rs) throws SQLException {
        Luong tongluong = new Luong();
        tongluong.setMaCanBo(rs.getString("macanbo"));
        tongluong.setHoTen(rs.getString("hotenkhaisinh"));
        tongluong.setHeSoLuong(rs.getFloat("hesoluong"));
        tongluong.setHeSoPhuCap(rs.getFloat("hesophucap"));
        tongluong.setMucLuong(rs.getFloat("mucluong"));
        tongluong.setTongLuong(rs.getFloat("tongluong"));

        return tongluong;
    }

    private void update(String sql, Object... args) throws SQLException {
        JdbcHelper.executeUpdate(sql, args);
    }
}
