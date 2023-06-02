/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTT.Model;

import java.util.Date;

/**
 *
 * @author luongtopp
 */
public class KyLuat {

    public KyLuat() {
    }

    public KyLuat(int id, String maKyLuat, String maCanBo, Date namKyLuat, String hinhThucKyLuat) {
        this.id = id;
        this.maKyLuat = maKyLuat;
        this.maCanBo = maCanBo;
        this.namKyLuat = namKyLuat;
        this.hinhThucKyLuat = hinhThucKyLuat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaKyLuat() {
        return maKyLuat;
    }

    public void setMaKyLuat(String maKyLuat) {
        this.maKyLuat = maKyLuat;
    }

    public String getMaCanBo() {
        return maCanBo;
    }

    public void setMaCanBo(String maCanBo) {
        this.maCanBo = maCanBo;
    }

    public Date getNamKyLuat() {
        return namKyLuat;
    }

    public void setNamKyLuat(Date namKyLuat) {
        this.namKyLuat = namKyLuat;
    }

    public String getHinhThucKyLuat() {
        return hinhThucKyLuat;
    }

    public void setHinhThucKyLuat(String hinhThucKyLuat) {
        this.hinhThucKyLuat = hinhThucKyLuat;
    }

    private int id;
    private String maKyLuat;
    private String maCanBo;
    private Date namKyLuat;
    private String hinhThucKyLuat;
    
}
