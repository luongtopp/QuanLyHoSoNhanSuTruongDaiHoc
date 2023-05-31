/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTT.Model;

/**
 *
 * @author luongtopp
 */
public class PhongBan {

    public PhongBan() {
    }

    public PhongBan(String maPhongBan, String tenPhongBan, String diaChi, String sdt, String email) {
        this.maPhongBan = maPhongBan;
        this.tenPhongBan = tenPhongBan;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.email = email;
    }

    public String getMaPhongBan() {
        return maPhongBan;
    }

    public void setMaPhongBan(String maPhongBan) {
        this.maPhongBan = maPhongBan;
    }

    public String getTenPhongBan() {
        return tenPhongBan;
    }

    public void setTenPhongBan(String tenPhongBan) {
        this.tenPhongBan = tenPhongBan;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String maPhongBan;
    private String tenPhongBan;
    private String diaChi;
    private String sdt;
    private String email;

}
