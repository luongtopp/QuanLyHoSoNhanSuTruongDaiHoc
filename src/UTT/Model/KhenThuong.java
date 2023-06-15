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
public class KhenThuong {

 
    String maKhenThuong; 
    String maCanBo;
    String hinhThucKhenThuong;
    Date ngayKhenThuong;
    String donVi;
    String danhHieu;

    public String getMaKhenThuong() {
        return maKhenThuong;
    }

    public void setMaKhenThuong(String maKhenThuong) {
        this.maKhenThuong = maKhenThuong;
    }

    public String getMaCanBo() {
        return maCanBo;
    }

    public void setMaCanBo(String maCanBo) {
        this.maCanBo = maCanBo;
    }

    public String getHinhThucKhenThuong() {
        return hinhThucKhenThuong;
    }

    public void setHinhThucKhenThuong(String hinhThucKhenThuong) {
        this.hinhThucKhenThuong = hinhThucKhenThuong;
    }

    public Date getNgayKhenThuong() {
        return ngayKhenThuong;
    }

    public void setNgayKhenThuong(Date ngayKhenThuong) {
        this.ngayKhenThuong = ngayKhenThuong;
    }

    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    public String getDanhHieu() {
        return danhHieu;
    }

    public void setDanhHieu(String danhHieu) {
        this.danhHieu = danhHieu;
    }

    public KhenThuong(String maKhenThuong, String maCanBo, String hinhThucKhenThuong, Date ngayKhenThuong, String donVi, String danhHieu) {
        this.maKhenThuong = maKhenThuong;
        this.maCanBo = maCanBo;
        this.hinhThucKhenThuong = hinhThucKhenThuong;
        this.ngayKhenThuong = ngayKhenThuong;
        this.donVi = donVi;
        this.danhHieu = danhHieu;
    }

    public KhenThuong() {
    }
}
