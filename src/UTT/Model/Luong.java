/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTT.Model;

import java.util.Date;

/**
 *
 * @author pvant
 */
public class Luong {

    public Luong(String maTinhLuong, String maCanBo, String hoTen, float tongLuong, String maPhuCap, String maChucVu, String tenPhuCap, float heSoPhuCap, String ghiChu, String maLuong, Date ngayHieuLuc, Date ngayHetHieuLuc, float mucLuong, String maBacNgach, String tenBacNgach, float heSoLuong) {
        this.maTinhLuong = maTinhLuong;
        this.maCanBo = maCanBo;
        this.hoTen = hoTen;
        this.tongLuong = tongLuong;
        this.maPhuCap = maPhuCap;
        this.maChucVu = maChucVu;
        this.tenPhuCap = tenPhuCap;
        this.heSoPhuCap = heSoPhuCap;
        this.ghiChu = ghiChu;
        this.maLuong = maLuong;
        this.ngayHieuLuc = ngayHieuLuc;
        this.ngayHetHieuLuc = ngayHetHieuLuc;
        this.mucLuong = mucLuong;
        this.maBacNgach = maBacNgach;
        this.tenBacNgach = tenBacNgach;
        this.heSoLuong = heSoLuong;
    }

    public String getMaTinhLuong() {
        return maTinhLuong;
    }

    public void setMaTinhLuong(String maTinhLuong) {
        this.maTinhLuong = maTinhLuong;
    }

    public String getMaCanBo() {
        return maCanBo;
    }

    public void setMaCanBo(String maCanBo) {
        this.maCanBo = maCanBo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public float getTongLuong() {
        return tongLuong;
    }

    public void setTongLuong(float tongLuong) {
        this.tongLuong = tongLuong;
    }

    public String getMaPhuCap() {
        return maPhuCap;
    }

    public void setMaPhuCap(String maPhuCap) {
        this.maPhuCap = maPhuCap;
    }

    public String getMaChucVu() {
        return maChucVu;
    }

    public void setMaChucVu(String maChucVu) {
        this.maChucVu = maChucVu;
    }

    public String getTenPhuCap() {
        return tenPhuCap;
    }

    public void setTenPhuCap(String tenPhuCap) {
        this.tenPhuCap = tenPhuCap;
    }

    public float getHeSoPhuCap() {
        return heSoPhuCap;
    }

    public void setHeSoPhuCap(float heSoPhuCap) {
        this.heSoPhuCap = heSoPhuCap;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public String getMaLuong() {
        return maLuong;
    }

    public void setMaLuong(String maLuong) {
        this.maLuong = maLuong;
    }

    public Date getNgayHieuLuc() {
        return ngayHieuLuc;
    }

    public void setNgayHieuLuc(Date ngayHieuLuc) {
        this.ngayHieuLuc = ngayHieuLuc;
    }

    public Date getNgayHetHieuLuc() {
        return ngayHetHieuLuc;
    }

    public void setNgayHetHieuLuc(Date ngayHetHieuLuc) {
        this.ngayHetHieuLuc = ngayHetHieuLuc;
    }

    public float getMucLuong() {
        return mucLuong;
    }

    public void setMucLuong(float mucLuong) {
        this.mucLuong = mucLuong;
    }

    public String getMaBacNgach() {
        return maBacNgach;
    }

    public void setMaBacNgach(String maBacNgach) {
        this.maBacNgach = maBacNgach;
    }

    public String getTenBacNgach() {
        return tenBacNgach;
    }

    public void setTenBacNgach(String tenBacNgach) {
        this.tenBacNgach = tenBacNgach;
    }

    public float getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(float heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public Luong() {
    }

   

    private String maTinhLuong;
    private String maCanBo;
private String hoTen;
//    Date ngayKetThuc;
    private float tongLuong;
   // private float mucLuong;

    //Phụ cấp
    private String maPhuCap;
    private String maChucVu;
    private String tenPhuCap;
    private float heSoPhuCap;
    private String ghiChu;

    //Lương cơ bản
    private String maLuong;
    Date ngayHieuLuc;
    Date ngayHetHieuLuc;
    private float mucLuong;

    //Bậc ngạch
    private String maBacNgach;
    private String tenBacNgach;
    private float heSoLuong;

}
