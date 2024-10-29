/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_ptit_netbean.j07046_danhdachluutru;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 *
 * @author buiva
 */
public class Khach {
    private String maKH, ten, maPhong;
    private Date ngayden, ngaydi;
    //private  long ngayo;
    
    public Khach(String maKH, String maPhong, String ten, Date ngayden, Date ngaydi) {
        this.maKH = maKH;
        this.maPhong = maPhong;
        this.ten = ten;
        this.ngayden = ngayden;
        this.ngaydi = ngaydi;
        //this.ngayo = (ngaydi.getTime() - ngayden.getTime()) / (1000l * 60 * 60 * 24);
    }
    public long getNgayO() {
        return (ngaydi.getTime() - ngayden.getTime()) / (1000l * 60 * 60 * 24);
        
    }
    @Override
    public String toString() {
        
        return maKH + " " + ten + " " + maPhong + " " + getNgayO(); 
               
    }
     
}
