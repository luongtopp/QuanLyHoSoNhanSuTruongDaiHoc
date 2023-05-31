/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author pvant
 */
public class PhongBan {
    private String maPhongBan;
    private String tenPhongBan;
    private String DiaChiPhongBan;
    private String SDTPhongBan;
    private String EmailPhongBan;

    public PhongBan(String maPhongBan, String tenPhongBan, String DiaChiPhongBan, String SDTPhongBan, String EmailPhongBan) {
        this.maPhongBan = maPhongBan;
        this.tenPhongBan = tenPhongBan;
        this.DiaChiPhongBan = DiaChiPhongBan;
        this.SDTPhongBan = SDTPhongBan;
        this.EmailPhongBan = EmailPhongBan;
    }

    public PhongBan() {
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

    public String getDiaChiPhongBan() {
        return DiaChiPhongBan;
    }

    public void setDiaChiPhongBan(String DiaChiPhongBan) {
        this.DiaChiPhongBan = DiaChiPhongBan;
    }

    public String getSDTPhongBan() {
        return SDTPhongBan;
    }

    public void setSDTPhongBan(String SDTPhongBan) {
        this.SDTPhongBan = SDTPhongBan;
    }

    public String getEmailPhongBan() {
        return EmailPhongBan;
    }

    public void setEmailPhongBan(String EmailPhongBan) {
        this.EmailPhongBan = EmailPhongBan;
    }
}
