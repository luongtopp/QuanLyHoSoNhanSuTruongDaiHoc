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
public class CanBoNghiHuu {

    public CanBoNghiHuu(String maCanBo, String quyetDinhSo, Date thoiGianNghiHuu) {
        this.maCanBo = maCanBo;
        this.quyetDinhSo = quyetDinhSo;
        this.thoiGianNghiHuu = thoiGianNghiHuu;
    }

    public CanBoNghiHuu() {
    }

    public String getMaCanBo() {
        return maCanBo;
    }

    public void setMaCanBo(String maCanBo) {
        this.maCanBo = maCanBo;
    }

    public String getQuyetDinhSo() {
        return quyetDinhSo;
    }

    public void setQuyetDinhSo(String quyetDinhSo) {
        this.quyetDinhSo = quyetDinhSo;
    }

    public Date getThoiGianNghiHuu() {
        return thoiGianNghiHuu;
    }

    public void setThoiGianNghiHuu(Date thoiGianNghiHuu) {
        this.thoiGianNghiHuu = thoiGianNghiHuu;
    }

  
    

    private String maCanBo;
      private String quyetDinhSo;
    private Date thoiGianNghiHuu;

}
