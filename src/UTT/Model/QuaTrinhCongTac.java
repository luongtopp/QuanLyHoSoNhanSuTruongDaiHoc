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
public class QuaTrinhCongTac {

    public QuaTrinhCongTac(String maCanBo, Date ThoiGianBatDau, Date ThoiGianKetThuc, String CongViec, String NoiCongTac, String ChucVuCaoNhat) {
        this.maCanBo = maCanBo;
        this.ThoiGianBatDau = ThoiGianBatDau;
        this.ThoiGianKetThuc = ThoiGianKetThuc;
        this.CongViec = CongViec;
        this.NoiCongTac = NoiCongTac;
        this.ChucVuCaoNhat = ChucVuCaoNhat;
    }

    public String getMaCanBo() {
        return maCanBo;
    }

    public void setMaCanBo(String maCanBo) {
        this.maCanBo = maCanBo;
    }

    public Date getThoiGianBatDau() {
        return ThoiGianBatDau;
    }

    public void setThoiGianBatDau(Date ThoiGianBatDau) {
        this.ThoiGianBatDau = ThoiGianBatDau;
    }

    public Date getThoiGianKetThuc() {
        return ThoiGianKetThuc;
    }

    public void setThoiGianKetThuc(Date ThoiGianKetThuc) {
        this.ThoiGianKetThuc = ThoiGianKetThuc;
    }

    public String getCongViec() {
        return CongViec;
    }

    public void setCongViec(String CongViec) {
        this.CongViec = CongViec;
    }

    public String getNoiCongTac() {
        return NoiCongTac;
    }

    public void setNoiCongTac(String NoiCongTac) {
        this.NoiCongTac = NoiCongTac;
    }

    public String getChucVuCaoNhat() {
        return ChucVuCaoNhat;
    }

    public void setChucVuCaoNhat(String ChucVuCaoNhat) {
        this.ChucVuCaoNhat = ChucVuCaoNhat;
    }

    public QuaTrinhCongTac() {
    }

    

    private String maCanBo;
    private Date ThoiGianBatDau;
    private Date ThoiGianKetThuc;
    private String CongViec;
    private String NoiCongTac;
    private String ChucVuCaoNhat;

}
