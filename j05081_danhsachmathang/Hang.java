/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_ptit_netbean.j05081_danhsachmathang;

/**
 *
 * @author buiva
 */
public class Hang {
    private String ma;
    private String ten, donvi;
    private int giamua, giaban;
    private static int cnt = 1; 
    public Hang(String ten, String donvi, int giamua, int giaban) {
        this.ma = "MH" + String.format("%03d", cnt++);
        this.ten = ten;
        this.donvi = donvi;
        this.giamua = giamua;
        this.giaban = giaban;
    } 
    public int getLoiNhuan() { return giaban - giamua; } 
    public String getMa() {
        return this.ma;
    }
    
    @Override
    public String toString() {
        return ma + " " + ten + " " + donvi + " " + giamua + " " + giaban + " " + getLoiNhuan();
    }
    
          
}
