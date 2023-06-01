/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author luongtopp
 */
public class TheLoai {
    private int maTheLoai;
    private String tenTheLoai;

    public TheLoai() {
    }

    public TheLoai(int maTheLoai, String tenTheLoai) {
        this.maTheLoai = maTheLoai;
        this.tenTheLoai = tenTheLoai;
    }

    public void setMaTheLoai(int maTheLoai) {
        this.maTheLoai = maTheLoai;
    }

    public void setTenTheLoai(String tenTheLoai) {
        this.tenTheLoai = tenTheLoai;
    }

    public int getMaTheLoai() {
        return maTheLoai;
    }

    public String getTenTheLoai() {
        return tenTheLoai;
    }
    
}
