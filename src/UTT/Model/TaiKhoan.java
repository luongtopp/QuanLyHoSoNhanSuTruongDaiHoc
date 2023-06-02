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
public class TaiKhoan {

    public TaiKhoan() {
    }

    public TaiKhoan(String tenDangNhap, String matKhau, Date ngayCapQuyen, boolean admin, String hoTen, String maPhongBan, String maChucVu, String email) {
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
        this.ngayCapQuyen = ngayCapQuyen;
        this.admin = admin;
        this.hoTen = hoTen;
        this.maPhongBan = maPhongBan;
        this.maChucVu = maChucVu;
        this.email = email;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public Date getNgayCapQuyen() {
        return ngayCapQuyen;
    }

    public void setNgayCapQuyen(Date ngayCapQuyen) {
        this.ngayCapQuyen = ngayCapQuyen;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMaPhongBan() {
        return maPhongBan;
    }

    public void setMaPhongBan(String maPhongBan) {
        this.maPhongBan = maPhongBan;
    }

    public String getMaChucVu() {
        return maChucVu;
    }

    public void setMaChucVu(String maChucVu) {
        this.maChucVu = maChucVu;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

  

    private String tenDangNhap;
    private String matKhau;
    private Date ngayCapQuyen;
    private boolean admin;
    private String hoTen;
    private String maPhongBan;
    private String maChucVu;
    private String email;

}
