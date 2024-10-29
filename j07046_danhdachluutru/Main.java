/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_ptit_netbean.j07046_danhdachluutru;
import java.util.*;
import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeParseException;
/**
 *
 * @author buiva
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, DateTimeParseException, ParseException{
        Scanner sc = new Scanner(new File("KHACH.in"));
        //Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<Khach> list1 = new ArrayList<>();
        DateFormat dfm = new SimpleDateFormat("dd/MM/yyyy");
        for(int i = 1; i <= t; i++) {
            String maKH = "KH" + String.format("%02d", i);
            String ten = sc.nextLine();
            String maPhong = sc.nextLine();
            
            Date ngayden = dfm.parse(sc.nextLine());
            Date ngaydi = dfm.parse(sc.nextLine());
            list1.add(new Khach(maKH, maPhong, ten, ngayden, ngaydi));
        }
        list1.sort(new Comparator<Khach>() {
            @Override
            public int compare(Khach o1, Khach o2) {
                if(o1.getNgayO() > o2.getNgayO()) {
                    return -1;
                }
                else return 1;
            }
        });
        for(Khach i : list1) {
            System.out.println(i);
        }
    }
}


