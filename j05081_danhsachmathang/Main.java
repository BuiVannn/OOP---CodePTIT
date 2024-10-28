/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_ptit_netbean.j05081_danhsachmathang;
import java.util.*;
import java.io.*;

/**
 *
 * @author buiva
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Hang> dsach = new ArrayList<Hang>();
        
        while(t-- > 0) {
            sc.nextLine();
            String ten = sc.nextLine();
            String loai = sc.next();
            int giamua = sc.nextInt();
            int giaban = sc.nextInt();
            dsach.add(new Hang(ten, loai, giamua, giaban));
            
        }
        dsach.sort(new Comparator<Hang> (){
        @Override
        public int compare (Hang o1, Hang o2) {
            if(o1.getLoiNhuan() == o2.getLoiNhuan()) {
                return o1.getMa().compareTo(o2.getMa());
            }
            else {
                if(o1.getLoiNhuan() > o2.getLoiNhuan()) {
                    return -1;
                }
                else return 1;
            }
        }
    });
        for(Hang x : dsach) {
            System.out.println(x);
        }
    }
}
