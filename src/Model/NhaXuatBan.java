/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author luongtopp
 */
public class NhaXuatBan {
    private int maNhaXuatBan;
    private String tenNhaXuatBan;

    public NhaXuatBan() {
    }

    public NhaXuatBan(int maNhaXuatBan, String tenNhaXuatBan) {
        this.maNhaXuatBan = maNhaXuatBan;
        this.tenNhaXuatBan = tenNhaXuatBan;
    }

    public void setMaNhaXuatBan(int maNhaXuatBan) {
        this.maNhaXuatBan = maNhaXuatBan;
    }

    public void setTenNhaXuatBan(String tenNhaXuatBan) {
        this.tenNhaXuatBan = tenNhaXuatBan;
    }

    public int getMaNhaXuatBan() {
        return maNhaXuatBan;
    }

    public String getTenNhaXuatBan() {
        return tenNhaXuatBan;
    }
    
    
}
