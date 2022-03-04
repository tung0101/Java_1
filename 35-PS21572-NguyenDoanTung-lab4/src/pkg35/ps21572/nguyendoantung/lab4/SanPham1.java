/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg35.ps21572.nguyendoantung.lab4;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class SanPham1 {

    /// thuoc tính
    private String tenSp;
    private Double donGia;
    private double giamGia;

    /// get va set
    public String gettenSp() {
        return tenSp;
    }

    public void settenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public double getdonGia() {
        return donGia;
    }

    public void setdonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getgiamGia() {
        return giamGia;
    }

    public void setgiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    /// Phuong thuc
    private double getThueNhapKhau() {
        if (this.donGia < 500000) {
            return 0;
        } else if (this.donGia < 1000000) {
            return this.donGia * 0.05;
        } else {
            return this.donGia * 0.1;
        }
    }

    public void xuat() {/// xuất
        System.out.println("Thong tin san pham: ");
        System.out.printf("Ten san pham: %s\n", tenSp);
        System.out.printf("Gia san pham: %.1f\n", donGia);
        System.out.printf("Giam gia: %.1f\n", giamGia);
        System.out.printf("Thue nhap khau: %.1f\n", getThueNhapKhau());

    }

    public void nhap() {/// nhập
        Scanner sc = new Scanner(System.in);
        System.out.print("\nten san pham:");
        String tenSP = sc.nextLine();
        System.out.print("\nđơn giá: ");
        donGia = sc.nextDouble();
        System.out.print("\nGiảm giá: ");
        giamGia = sc.nextDouble();
    }

    /// constructor
    public SanPham1(String tenSp, Double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public SanPham1() {

    }

    public SanPham1(String tenSp, Double donGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
    }
}
