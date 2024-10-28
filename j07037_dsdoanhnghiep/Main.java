/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_ptit_netbean.j07037_dsdoanhnghiep;
import java.io.*;
import java.util.*;
/**
 *
 * @author buiva
 */
public class Main {
    public static void main(String[] args) throws  FileNotFoundException, IOException, ClassNotFoundException{
        Scanner sc = new Scanner(new File("DN.in"));
        //Scanner sc = new Scanner(System.in);
        ArrayList<DoanhNghiep> listDN = new ArrayList<>();
        int t = sc.nextInt();
        for(int i = 0; i < t; i++) {
            sc.nextLine();
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            int sosv = sc.nextInt();
            listDN.add(new DoanhNghiep(ma, ten, sosv));
            
        }
        listDN.sort(new Comparator<DoanhNghiep>(){
            @Override
            public int compare(DoanhNghiep o1, DoanhNghiep o2) {
                if(o1.getMa().compareTo(o2.getMa()) > 0) {
                    return 1;
                }
                else return -1;
            }
        });
        for(DoanhNghiep i : listDN) {
            System.out.println(i);
        }
    }
}
