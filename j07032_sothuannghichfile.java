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
public class j07032_sothuannghichfile {
    private static boolean check(int n) {
        String s = Integer.toString(n);
        if(s.length() == 1 || s.length() % 2 == 0) {
            return false;
        }
        for(int i = 0; i <= s.length() / 2; i++) {
            if(s.charAt(i) % 2 == 0) {
                return  false;
            }
            if(s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
        ObjectInputStream sc1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream sc2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) sc1.readObject();
        ArrayList<Integer> b = (ArrayList<Integer>) sc2.readObject();
        ArrayList<Integer> num = new ArrayList<>();
        Set<Integer> set1 = new TreeSet<>(a);
        Set<Integer> set2 = new TreeSet<>(b);
        for(Integer i : set1) {
            if(set2.contains(i) && check(i)) {
                num.add(i);
            }
            if(num.size() == 10) {
                break;
            }
        }
        for(int i : num) {
            System.out.println(i + " " + ((Collections.frequency(a, i)) + Collections.frequency(b, i)));
        }
        
    }
}
