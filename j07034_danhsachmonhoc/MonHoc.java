/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_ptit_netbean.j07034_danhsachmonhoc;

/**
 *
 * @author buiva
 */
public class MonHoc {
    private String mamon, tenmon;
    private int sotin;
    
    public MonHoc(String mamon, String tenmon, int sotin) {
        this.mamon = mamon;
        this.tenmon = tenmon;
        this.sotin = sotin;
    }
    public String getTen() {
        return this.tenmon;
    }
    
    @Override
    public String toString() {
        String tin = String.valueOf(sotin);
        return this.mamon + " " + this.tenmon + " " + tin;
    }
}
