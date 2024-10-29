/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_ptit_netbean.j07048_dssanpham_2;

/**
 *
 * @author buiva
 */
public class SanPham {
    private String masp, tensp;
    private int giaban, thoihanbh;
    
    public SanPham(String masp, String tensp, int giaban, int thoihanbh) {
        this.masp = masp;
        this.tensp = tensp;
        this.giaban = giaban;
        this.thoihanbh = thoihanbh;
    }
    public int getGia() {
        return giaban;
    }
    public String getMasp() {
        return masp;
    }
    @Override
    public String toString() {
        return masp + " " + tensp + " " + giaban + " " + thoihanbh;
    }
}
