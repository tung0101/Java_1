/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg35.ps21572.nguyendoantung.asm2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class NhanVien {
    
    ArrayList<NhanVien> list = new ArrayList<>();

    public String ID;
    public String hoTen;
    public Double luongCoBan;
    public String phongBan;

    public NhanVien(String ID, String hoTen, double luongCoBan, String phongBan) {
        this.ID = ID;
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
        this.phongBan = phongBan;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(Double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public double getthunhap() {
        return luongCoBan;
    }

    public Double getLuong(){
        return this.luongCoBan;
    }

    public double Thuethunhap(double luong) {
        if (luong >= 9000000 && luong <= 15000000) {
            return luong * 0.1;
        } else if (luong > 15000000) {
            return luong * 0.12;
        } else {
            return 0;
        }
    }

    public void xuat() {
        for (NhanVien nv : list) {
            System.out.printf("Ma nhan vien: %s | Ho ten: %s | Phong ban: %s | Luong: %.2f\n", nv.getID(), nv.getHoTen(), nv.getPhongBan(), nv.getLuong());
        }
    }

    public void timNV() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma nhan vien can tim: ");
        String ID = sc.nextLine();
        Boolean check = false;
        for (NhanVien nv : list) {
            if (ID.equalsIgnoreCase(nv.getID())) {
                System.out.printf("Ma nhan vien: %s | Ho ten: %s | Phong ban: %s | Luong: %.2f\n", nv.getID(), nv.getHoTen(), nv.getPhongBan(), nv.getLuong());
                check = true;
                break;
            }
        }

        if (check == false) {
            System.out.println("Nhan vien khong ton tai !");
        }
    }

    public void xoaNV() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma nhan vien can xoa: ");
        String ID = sc.nextLine();
        Boolean check = false;
        for (NhanVien nv : list) {
            if (ID.equalsIgnoreCase(nv.getID())) {
                list.remove(nv);
                check = true;
                break;
            }
        }

        if (check == false) {
            System.out.println("Nhan vien khong ton tai !");
        } else {
            System.out.println("Nhan vien da bi xoa !");
        }
    }
}
