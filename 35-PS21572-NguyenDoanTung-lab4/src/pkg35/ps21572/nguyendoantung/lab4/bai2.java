/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg35.ps21572.nguyendoantung.lab4;

/**
 *
 * @author Admin
 */
public class bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SanPham sp1 = new SanPham();
        SanPham sp2 = new SanPham();
        System.out.printf("nhập sản phẩm 1\n ");
        sp1.nhap();
        System.out.printf("nhập sản phẩm 2\n ");
        sp2.nhap();
        System.out.printf("Sản Phẩm 1\n");
        sp1.xuat();
        System.out.printf("Sản Phẩm 2\n");
        sp2.xuat();
    }
}
