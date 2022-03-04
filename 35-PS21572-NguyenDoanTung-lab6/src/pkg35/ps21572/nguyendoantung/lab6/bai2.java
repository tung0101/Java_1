/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg35.ps21572.nguyendoantung.lab6;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<SanPham> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            SanPham sp = new SanPham();
            sp.nhap();
            list.add(sp);
        }
        for (SanPham sanpham : list) {
            if (sanpham.getHang().equalsIgnoreCase("Nokia")) {
                sanpham.xuat();
                System.out.println();
            }
        }
    }

}
