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

    public ChucVu() {
    }

    public ChucVu(String maChucVu, String tenChucVu) {
        this.maChucVu = maChucVu;
        this.tenChucVu = tenChucVu;
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

    private String maChucVu;
    private String tenChucVu;
    
    

}
