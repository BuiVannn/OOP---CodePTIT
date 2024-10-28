/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_ptit_netbean.j07034_danhsachmonhoc;
import java.util.*;
import java.io.*;
/**
 *
 * @author buiva
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("MONHOC.in"));
        //Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<MonHoc> dsmon = new ArrayList<MonHoc>();
        //sc.nextLine();
        while(t-- > 0) {
            sc.nextLine();
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            int sotin = sc.nextInt();
            dsmon.add(new MonHoc(ma, ten, sotin));
        }
        dsmon.sort(new Comparator<MonHoc>() {
            @Override
            public int compare (MonHoc o1, MonHoc o2) {
                if(o1.getTen().compareTo(o2.getTen()) > 0) {
                    return 1;
                }
                else return -1;
            }
        });
        for(MonHoc x : dsmon) {
            System.out.println(x);
        }
    }
}
