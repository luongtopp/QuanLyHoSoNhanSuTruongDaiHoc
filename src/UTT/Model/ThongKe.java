/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTT.Model;

import java.util.Date;

/**
 *
 * @author luongtopp
 */
public class ThongKe {

    public ThongKe() {
    }

    public ThongKe(String maCanBo, String hoTenKhaiSinh, String queQuan, Date ngaySinh, Date ngayHopDong, Date ngayNghiHuu, Date ngayHetHopDong) {
        this.maCanBo = maCanBo;
        this.hoTenKhaiSinh = hoTenKhaiSinh;
        this.queQuan = queQuan;
        this.ngaySinh = ngaySinh;
        this.ngayHopDong = ngayHopDong;
        this.ngayNghiHuu = ngayNghiHuu;
        this.ngayHetHopDong = ngayHetHopDong;
    }

    public String getMaCanBo() {
        return maCanBo;
    }

    public void setMaCanBo(String maCanBo) {
        this.maCanBo = maCanBo;
    }

    public String getHoTenKhaiSinh() {
        return hoTenKhaiSinh;
    }

    public void setHoTenKhaiSinh(String hoTenKhaiSinh) {
        this.hoTenKhaiSinh = hoTenKhaiSinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public Date getNgayHopDong() {
        return ngayHopDong;
    }

    public void setNgayHopDong(Date ngayHopDong) {
        this.ngayHopDong = ngayHopDong;
    }

    public Date getNgayNghiHuu() {
        return ngayNghiHuu;
    }

    public void setNgayNghiHuu(Date ngayNghiHuu) {
        this.ngayNghiHuu = ngayNghiHuu;
    }

    public Date getNgayHetHopDong() {
        return ngayHetHopDong;
    }

    public void setNgayHetHopDong(Date ngayHetHopDong) {
        this.ngayHetHopDong = ngayHetHopDong;
    }

    @Override
    public String toString() {
        return "ThongKe{" + "maCanBo=" + maCanBo + ", hoTenKhaiSinh=" + hoTenKhaiSinh + ", queQuan=" + queQuan + ", ngaySinh=" + ngaySinh + ", ngayHopDong=" + ngayHopDong + ", ngayNghiHuu=" + ngayNghiHuu + ", ngayHetHopDong=" + ngayHetHopDong + '}';
    }

    private String maCanBo;
    private String hoTenKhaiSinh;    
    private String queQuan;
    private Date ngaySinh;
    private Date ngayHopDong;
    private Date ngayNghiHuu;
    private Date ngayHetHopDong;

}
