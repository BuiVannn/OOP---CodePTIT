/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_ptit_netbean;
import java.util.*;
import java.io.*;

/**
 *
 * @author buiva
 */
public class j07040_lketheottxhien {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
        ObjectInputStream sc1 = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        Scanner sc2 = new Scanner(new File("VANBAN.in"));
        ArrayList<String> a = (ArrayList<String>) sc1.readObject();
        ArrayList<String> b = new ArrayList<>();
        Set<String> set1 = new TreeSet<>(a);
        Set<String> set2 = new TreeSet<>(b);
        for(String i : a) {
            set1.addAll(Arrays.asList(i.trim().toLowerCase().split("\\s+")));
            
        }
        while(sc2.hasNextLine()) {
            String s = sc2.nextLine().trim().toLowerCase(); 
            b.addAll(Arrays.asList(s.split("\\s+")));
        }
        for(String i : b) {
            if(!set2.contains(i) && set1.contains(i)) {
                System.out.println(i);
                set2.add(i);
            }
        }
    }
}
