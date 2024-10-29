/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_ptit_netbean.j07050_sxmathang;

/**
 *
 * @author buiva
 */
public class Hang {
    private String maHang, tenHang, nhomHang;
    private double giamua, giaban;
    
    public Hang(String maHang, String tenHang, String nhomHang, double giamua, double giaban) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.nhomHang = nhomHang;
        this.giaban = giaban;
        this.giamua = giamua;
    } 
    public double getLoiNhuan(){
        return giaban - giamua;
    }
    
    @Override
    public String toString() {
        return maHang + " " + tenHang + " " + nhomHang + " " + String.format("%.2f", getLoiNhuan());
    }
}
