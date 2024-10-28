/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_ptit_netbean.j07037_dsdoanhnghiep;

/**
 *
 * @author buiva
 */
public class DoanhNghiep {
    private String ma, ten;
    private int sosv;
    
    public DoanhNghiep(String ma, String ten, int sosv) {
        this.ma = ma;
        this.ten = ten;
        this.sosv = sosv;
    }
    public String getMa() {
        return this.ma;
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + sosv;
    }
}
