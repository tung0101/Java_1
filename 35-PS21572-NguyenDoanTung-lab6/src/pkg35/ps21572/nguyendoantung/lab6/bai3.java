package pkg35.ps21572.nguyendoantung.lab6;

import java.util.ArrayList;
import java.util.Scanner;

public class bai3 {
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<SinhVien> sinhvien = new ArrayList<SinhVien>();

    public static void Nhap() {
        System.out.print("Mời nhập số lượng sinh viên: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Mời nhập thông tin sinh viên thứ " + (i + 1));
            SinhVien sv = new SinhVien();
            sv.setDS();
            sinhvien.add(sv);
        }
    }

    public static void Xuat() {
               System.out.println(
                            "\t|                                                                          DANH SACH SINH VIEN                                                                       |");
                    System.out.printf(
                            "\t|      Ho Ten    \t|\t      Email       \t|\t    SDT    \t|\t    CMND    \t|\t    DTB   \t|\t   Hoc Luc   \t|\t Hoc bong \t|\n");
        for (SinhVien item : sinhvien) {
            item.getDS();
        }
    }
    
    public static void findCMND() {
        String str;
        do {
            System.out.print("Nhập CMND của sinh viên cần tìm: ");
            str = sc.nextLine();
            if (str.matches(SinhVien.recmnd)) {
                break;
            } else {
                System.out.println("CMND không hợp lệ");
            }
        } while (true);
        SinhVien.findCMND(str, sinhvien);
    }

    public static void findName() {
        System.out.print("NHập tên sinh viên cần tìm: ");
        String str = sc.nextLine();
        SinhVien.findTen(str, sinhvien);
    }
    
     public static void main(String[] args) {
        
        int menu = 0;
        do {
            System.out.println("\tMENU");
            System.out.println(" 1. Nhập danh sách sinh viên    ");
            System.out.println(" 2. Xuất danh sách sinh viên    ");
            System.out.println(" 3. Tìm sinh viên theo tên      ");
            System.out.println(" 4. Tìm sinh viên theo cmmd     ");
            System.out.println(" 0. Thoát chương trình          ");
            System.out.print("Vui Lòng chọn chức năng: ");
            menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    Nhap();
                    break;
                case 2:
                    Xuat();
                    break;
                case 3:
                    findName();
                    break;
                case 4:
                    findCMND();
                    break;
                default:
                    System.out.println("Số bạn nhập không hợp lệ vui lòng nhập lại");
                    break;
            }
        } while (true);
    }
}
