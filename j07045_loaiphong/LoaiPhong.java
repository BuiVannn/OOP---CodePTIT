/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_ptit_netbean.j07045_loaiphong;

/**
 *
 * @author buiva
 */
public class LoaiPhong implements Comparable<LoaiPhong>
{
    private String data;
    private String name;

    public LoaiPhong(String s)
    {
        data = s;
        String arr[] = s.split("\\s+");
        this.name = arr[1];
    }

    @Override
    public String toString()
    {
        return data;
    }

    @Override
    public int compareTo(LoaiPhong o)
    {
        return this.name.compareTo(o.name);
    }
}
