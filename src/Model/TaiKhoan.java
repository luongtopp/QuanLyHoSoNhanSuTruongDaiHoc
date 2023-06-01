/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author luongtopp
 */
public class TaiKhoan {
    private int maTaiKhoan;
    private String tenTaiKhoan;
    private String hoTen;
    private String matKhau;
    private boolean isAdmin;

    public TaiKhoan() {
        
    }
    
    public TaiKhoan(int maTaiKhoan, String tenTaiKhoan, String hoTen, String matKhau, boolean isAdmin) {
        this.maTaiKhoan = maTaiKhoan;
        this.tenTaiKhoan = tenTaiKhoan;
        this.hoTen = hoTen;
        this.matKhau = matKhau;
        this.isAdmin = isAdmin;
    }

    public void setMaTaiKhoan(int maTaiKhoan) {
        this.maTaiKhoan = maTaiKhoan;
    }

    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public int getMaTaiKhoan() {
        return maTaiKhoan;
    }

    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public boolean isIsAdmin() {
        return isAdmin;
    }
    
    
}
