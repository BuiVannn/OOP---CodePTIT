/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_ptit_netbean;
import java.util.*;
import java.io.*;
import java.math.BigInteger;
/**
 *
 * @author buiva
 */
public class j07003_tachdoivatinhtong {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        //Scanner sc = new Scanner(System.in);
        BigInteger n = new BigInteger(sc.next());
        BigInteger ans = n;
        while(ans.compareTo(BigInteger.TEN) >= 0) {
            int len = n.toString().length();
            int hs = len - len / 2;
            BigInteger heso = new BigInteger("10");
            BigInteger du = heso.pow(hs);
            BigInteger a, b;
            a = n.divide(du);
            b = n.mod(du);
            //System.out.println(a);
            //System.out.println(b);
            ans = a.add(b);
            n = ans;
            System.out.println(ans);
        }
        //System.out.println(ans);
        
    }
}
