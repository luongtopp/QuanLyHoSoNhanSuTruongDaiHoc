/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTT.DAO;

import UTT.Connection.JdbcHelper;
import static UTT.Connection.JdbcHelper.executeUpdate;
import static UTT.Connection.JdbcHelper.preparedStatement;


import UTT.Model.CanBo;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author luongtopp
 */
public class CanBoDAO {

    public List<CanBo> hienThiCanBo() {
        String sql = "SELECT * FROM canbo";
        return timCanBo(sql);
    }
    public List<CanBo> hienThiCanBo(String timKiem) {
        String sql = "{Call tim_kiem_can_bo(?)}";
        return timCanBo(sql, timKiem);
    }

    public void themCanBo(String maCanBo, String hoTenKhaiSinh,
            String gioiTinh, String ngaySinh, String tinhTrangHonNhan,
            String soCMND, String queQuan, String noiOHienTai, String email,
            String danToc, String tonGiao, String ngayHopDong,
            String congViecDuocGiao, String maChucVu, String chuyenNganhDaoTao,
            String noiDaoTao, String namTotNghiep, String trinhDoNgoaiNgu,
            String maPhongBan, Object... args) throws SQLException {

        String sql = """
                     INSERT INTO canbo (
                             macanbo,
                             hotenkhaisinh,
                             gioitinh,
                             ngaysinh,
                             tinhtranghonnhan,
                             soCMND,
                             quequan,
                             noiohientai,
                             email,
                             dantoc,
                             tongiao,
                             ngayhopdong,
                             congviecduocgiao,
                             machucvu,
                             chuyennganhdaotao,
                             noidaotao,
                             namtotnghiep,
                             trinhdongoainnguthanhthaonhat,
                             maphongban
                          
                         ) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)""";

        try (PreparedStatement pstmt = preparedStatement(sql, maCanBo, hoTenKhaiSinh,
                gioiTinh, ngaySinh, tinhTrangHonNhan,
                soCMND, queQuan, noiOHienTai, email,
                danToc, tonGiao, ngayHopDong,
                congViecDuocGiao, maChucVu, chuyenNganhDaoTao,
                noiDaoTao, namTotNghiep, trinhDoNgoaiNgu,
                maPhongBan
        )) {
            int rowsAffected = pstmt.executeUpdate();
            System.out.println(rowsAffected + " row(s) affected.");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public void suaCanBo(String maCanBo, String hoTenKhaiSinh,
            String gioiTinh, String ngaySinh, String tinhTrangHonNhan,
            String soCMND, String queQuan, String noiOHienTai, String email,
            String danToc, String tonGiao, String ngayHopDong,
            String congViecDuocGiao, String maChucVu, String chuyenNganhDaoTao,
            String noiDaoTao, String namTotNghiep, String trinhDoNgoaiNgu,
            String maPhongBan, Object... args) throws SQLException {
        String sql = """
                     UPDATE canbo 
                     SET
                     hotenkhaisinh = ?,
                     gioitinh = ?,
                     ngaysinh = ?,
                     tinhtranghonnhan = ?,
                     soCMND = ?,
                     quequan = ?,
                     noiohientai = ?,
                     email = ?,
                     dantoc = ?,
                     tongiao = ?,
                     ngayhopdong = ?,
                     congviecduocgiao = ?,
                     machucvu = ?,
                     chuyennganhdaotao = ?,
                     noidaotao = ?,
                     namtotnghiep = ?,
                     trinhdongoainnguthanhthaonhat = ?,
                     maphongban = ?
                     WHERE macanbo = ?""";
        try {
            executeUpdate(sql, hoTenKhaiSinh,
                    gioiTinh, ngaySinh, tinhTrangHonNhan,
                    soCMND, queQuan, noiOHienTai, email,
                    danToc, tonGiao, ngayHopDong,
                    congViecDuocGiao, maChucVu, chuyenNganhDaoTao,
                    noiDaoTao, namTotNghiep, trinhDoNgoaiNgu,
                    maPhongBan, maCanBo
            );
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public void xoaCanBo(String maCanBo, Object... args) throws SQLException {
        String sql = """
                      DELETE FROM canbo WHERE macanbo = ?
                     """;
        try {
            executeUpdate(sql, maCanBo);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    private List<CanBo> timCanBo(String sql, Object... args) {
        List<CanBo> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);

                while (rs.next()) {
                    CanBo canBo = layDuLieuTuBangCanBo(rs);
                    list.add(canBo);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    private CanBo layDuLieuTuBangCanBo(ResultSet rs) throws SQLException {

        CanBo canBo = new CanBo();
        canBo.setMaCanBo(rs.getString("macanbo"));
        canBo.setHoTenKhaiSinh(rs.getNString("hotenkhaisinh"));
        canBo.setGioiTinh(rs.getNString("gioitinh"));
        canBo.setNgaySinh(rs.getDate("ngaysinh"));
        canBo.setTinhTrangHonNhan(rs.getNString("tinhtranghonnhan"));
        canBo.setSoCMND(rs.getNString("soCMND"));
        canBo.setQueQuan(rs.getNString("quequan"));
        canBo.setNoiOHienTai(rs.getNString("noiohientai"));
        canBo.setEmail(rs.getNString("email"));
        canBo.setDanToc(rs.getNString("dantoc"));
        canBo.setTonGiao(rs.getNString("tongiao"));
        canBo.setNgayHopDong(rs.getDate("ngayhopdong"));
        canBo.setCongViecDuocGiao(rs.getNString("congviecduocgiao"));
        canBo.setMaChucVu(rs.getString("machucvu"));
        canBo.setChuyenNganhDaoTao(rs.getNString("chuyennganhdaotao"));
        canBo.setNoiDaoTao(rs.getNString("noidaotao"));
        canBo.setNamTotNghiep(rs.getInt("namtotnghiep"));
        canBo.setTrinhDoNgoaiNgu(rs.getNString("trinhdongoainnguthanhthaonhat"));
        canBo.setMaPhongBan(rs.getString("maphongban"));
        return canBo;
    }

    public static void main(String[] args) throws SQLException {
        List<CanBo>  list =new CanBoDAO().hienThiCanBo("Kinh");
       
           for(var item : list) {
               
               System.out.println(item.getChuyenNganhDaoTao());
           }

        
        
    }

}
