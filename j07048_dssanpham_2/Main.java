/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_ptit_netbean.j07048_dssanpham_2;

import java.util.*;
import java.io.*;
/**
 *
 * @author buiva
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        //Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        ArrayList<SanPham> list1 = new ArrayList<>();
        for(int i = 0; i < t; i++) {
            sc.nextLine();
            String masp = sc.nextLine();
            
            String tensp = sc.nextLine();
            int giaban = sc.nextInt();
            int thoihan = sc.nextInt();
            list1.add(new SanPham(masp, tensp, giaban, thoihan));
        }
        list1.sort(new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) {
                if(o1.getGia() == o2.getGia()) {
                    return o1.getMasp().compareTo(o2.getMasp()) ;
                }
                else {
                    if(o1.getGia() > o2.getGia()) {
                        return -1;
                    }
                    else return 1;
                }
            }
            
        });
        for(SanPham i : list1) {
            System.out.println(i);
        }
    }
}
