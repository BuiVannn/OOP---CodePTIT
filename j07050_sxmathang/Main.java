/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_ptit_netbean.j07050_sxmathang;
import java.util.*;
import java.io.*;
/**
 *
 * @author buiva
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
        Scanner sc = new Scanner(new File("MATHANG.in"));
        //Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Hang> list1 = new ArrayList<>();
        for(int i = 0; i < t; i++) {
            sc.nextLine();
            String maHang = "MH" + String.format("%02d", i + 1);
            String tenHang = sc.nextLine();
            String nhomHang = sc.nextLine();
            double giamua = sc.nextDouble();
            double giaban = sc.nextDouble();           
            list1.add(new Hang(maHang, tenHang, nhomHang, giamua, giaban));
        }
        list1.sort(new Comparator<Hang>() {
            @Override
            public int compare(Hang o1, Hang o2) {
                if(o1.getLoiNhuan() > o2.getLoiNhuan()) {
                    return -1;
                }
                else return 1;
            }
        });
        for(Hang i : list1) {
            System.out.println(i);
                   
        }
    }
}
