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

    public ThongKe(String maCanBo, String hoTenKhaiSinh, String maChucVu, String maPhongBan, float mucLuong) {
        this.maCanBo = maCanBo;
        this.hoTenKhaiSinh = hoTenKhaiSinh;
        this.maChucVu = maChucVu;
        this.maPhongBan = maPhongBan;
        this.mucLuong = mucLuong;
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

    public String getMaChucVu() {
        return maChucVu;
    }

    public void setMaChucVu(String maChucVu) {
        this.maChucVu = maChucVu;
    }

    public String getMaPhongBan() {
        return maPhongBan;
    }

    public void setMaPhongBan(String maPhongBan) {
        this.maPhongBan = maPhongBan;
    }

    public float getMucLuong() {
        return mucLuong;
    }

    public void setMucLuong(float mucLuong) {
        this.mucLuong = mucLuong;
    }

    @Override
    public String toString() {
        return "ThongKe{" + "maCanBo=" + maCanBo + ", hoTenKhaiSinh=" + hoTenKhaiSinh + ", maChucVu=" + maChucVu + ", maPhongBan=" + maPhongBan + ", mucLuong=" + mucLuong + '}';
    }
    

   
    private String maCanBo;
    private String hoTenKhaiSinh;    
    private String maChucVu;    
    private String maPhongBan;    
    private float mucLuong;



   

}
