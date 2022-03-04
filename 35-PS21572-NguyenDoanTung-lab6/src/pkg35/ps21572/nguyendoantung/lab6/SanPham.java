/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg35.ps21572.nguyendoantung.lab6;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SanPham {

    private String tensp;
    private String hang;
    private Double dongia;

    public void nhap() {
        Scanner s = new Scanner(System.in);
        System.out.println("Ten sp: ");
        tensp = s.nextLine();

        System.out.println("Hang: ");
        hang = s.nextLine();

        System.out.println("Don gia: ");
        dongia = s.nextDouble();
        s.nextLine();
    }

    public void xuat() {
        System.out.printf("Ten: %s - Don gia: %.2f - Hang: %s", tensp, dongia, hang);

    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public Double getDongia() {
        return dongia;
    }

    public void setDongia(Double dongia) {
        this.dongia = dongia;
    }

}
