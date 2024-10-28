/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_ptit_netbean;
import java.util.*;

/**
 *
 * @author buiva
 */
public class tang_giam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            TreeSet<Integer> chan = new TreeSet<>();
            TreeSet<Integer> le = new TreeSet<>(Collections.reverseOrder());
            
            for(int i = 0; i < n; i++) {
                int k = sc.nextInt();
                if(k % 2 == 0) {
                    chan.add(k);
                }
                else {
                    le.add(k);
                }
            }
            for(Integer x : chan) {
                System.out.print(x + " ");
            }
            System.out.println();
            for(Integer x : le) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}

