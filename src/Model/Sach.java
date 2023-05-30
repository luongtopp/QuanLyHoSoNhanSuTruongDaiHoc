/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author luongtopp
 */
public class Sach {

    private int maSach;
    private String tenSach;
    private String tenTheLoai;
    private String tenNhaXuatBan;
    private String ngayNhap;
    private float giaTien;
    

    public Sach() {
    }

    public Sach(int maSach, String tenSach, String tenTheLoai, String tenNhaXuatBan, String ngayNhap, float giaTien) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tenTheLoai = tenTheLoai;
        this.tenNhaXuatBan = tenNhaXuatBan;
        this.ngayNhap = ngayNhap;
        this.giaTien = giaTien;
    }

 
    public void setMaSach(int maSach) {
        this.maSach = maSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public void setGiaTien(float giaTien) {
        this.giaTien = giaTien;
    }

    public void setTenTheLoai(String tenTheLoai) {
        this.tenTheLoai = tenTheLoai;
    }

    public void setTenNhaXuatBan(String tenNhaXuatBan) {
        this.tenNhaXuatBan = tenNhaXuatBan;
    }

    public int getMaSach() {
        return maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public float getGiaTien() {
        return giaTien;
    }

    public String getTenTheLoai() {
        return tenTheLoai;
    }

    public String getTenNhaXuatBan() {
        return tenNhaXuatBan;
    }

    

}
