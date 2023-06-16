/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTT.Model;

/**
 *
 * @author luongtopp
 */
public class ChucVu {

    public ChucVu(String maChucVu, String tenChucVu, String maPhuCap, String maBacNgach, String maLuong) {
        this.maChucVu = maChucVu;
        this.tenChucVu = tenChucVu;
        this.maPhuCap = maPhuCap;
        this.maBacNgach = maBacNgach;
        this.maLuong = maLuong;
    }

    public String getMaChucVu() {
        return maChucVu;
    }

    public void setMaChucVu(String maChucVu) {
        this.maChucVu = maChucVu;
    }

    public String getTenChucVu() {
        return tenChucVu;
    }

    public void setTenChucVu(String tenChucVu) {
        this.tenChucVu = tenChucVu;
    }

    public String getMaPhuCap() {
        return maPhuCap;
    }

    public void setMaPhuCap(String maPhuCap) {
        this.maPhuCap = maPhuCap;
    }

    public String getMaBacNgach() {
        return maBacNgach;
    }

    public void setMaBacNgach(String maBacNgach) {
        this.maBacNgach = maBacNgach;
    }

    public String getMaLuong() {
        return maLuong;
    }

    public void setMaLuong(String maLuong) {
        this.maLuong = maLuong;
    }

    public ChucVu() {
    }



    private String maChucVu;
    private String tenChucVu;
    private String maPhuCap;
    private String maBacNgach;
        private String maLuong;


}
