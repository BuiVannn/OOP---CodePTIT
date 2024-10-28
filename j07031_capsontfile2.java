/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_ptit_netbean;
import java.io.*;
import java.util.*;

/**
 *
 * @author buiva
 */
public class j07031_capsontfile2 {
    static boolean nt(int n) {
        for(int i = 2; i <= (int) Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
             
            }
        }
        return n > 1;
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA1.in"));
        Set<Integer> list1 = new TreeSet<>((ArrayList) sc.readObject());
        sc = new ObjectInputStream(new FileInputStream("DATA2.in"));
        Set<Integer> list2 = new TreeSet<>((ArrayList) sc.readObject());
        for(Integer i : list1) {
            if(i < 1000000 - i && list1.contains(1000000 - i) && !list2.contains(i) && !list2.contains(1000000 - i) && nt(i) && nt(1000000 - i)) {
                System.out.println(i + " " + (1000000 - i));
            }
        }
    }
}
