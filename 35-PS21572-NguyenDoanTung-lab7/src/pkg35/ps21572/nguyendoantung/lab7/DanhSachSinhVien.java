/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg35.ps21572.nguyendoantung.lab7;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Admin
 */
public class DanhSachSinhVien {

    Scanner sc = new Scanner(System.in);
    ArrayList<SinhVienPoly> list = new ArrayList<>();

    public void nhap() {
        while (true) {
            System.out.print("Nhập họ tên sinh viên: ");
            String hoTen = sc.nextLine();
            System.out.print("Nhập tên ngành(IT/Biz): ");
            String nganh = sc.nextLine();
            if (nganh.equalsIgnoreCase("it")) {
                System.out.print("Điểm java: ");
                double java = sc.nextDouble();
                System.out.print("Điểm css: ");
                double css = sc.nextDouble();
                System.out.print("Điểm html: ");
                double html = sc.nextDouble();
                SinhVienPoly sv = new SinhVienIT(hoTen, nganh, java, css, html);
                list.add(sv);
                sc.nextLine();
                System.out.print("bạn có mốn nhập thêm(Y/N): ");
                String check = sc.nextLine();
                if (check.equals("n") || check.equals("N")) {
                    break;
                }
            } else if (nganh.equalsIgnoreCase("biz")) {
                System.out.print("Điểm marketing: ");
                double marketing = sc.nextDouble();
                System.out.print("Điểm sale: ");
                double sale = sc.nextDouble();
                SinhVienPoly sv = new SinhVienBiz(hoTen, marketing, sale);
                list.add(sv);
                sc.nextLine();
                System.out.print("bạn có mốn nhập thêm(Y/N): ");
                String check = sc.nextLine();
                if (check.equals("n") || check.equals("N")) {
                    break;
                }

            }
        }
    }

    public void xuat() {
        for (SinhVienPoly sv : list) {
            System.out.printf("Họ tên: %s - Ngành: %s - Điểm TB: %f - Học lực: %s\n", sv.getHoTen(), sv.getNganh(), sv.getDiem(), sv.getHocLuc());
        }
    }

    public void SVGioi() {
        for (SinhVienPoly sv : list) {
            if (sv.getHocLuc().equals("Giỏi")) {
                System.out.printf("Họ tên: %s - Ngành: %s - Điểm TB: %f - Học lực: %s\n", sv.getHoTen(), sv.getNganh(), sv.getDiem(), sv.getHocLuc());
            }
        }
    }

    public void sapXep() {
        Comparator<SinhVienPoly> comp = new Comparator<SinhVienPoly>() {
            @Override
            public int compare(SinhVienPoly o1, SinhVienPoly o2) {
                return Double.compare(o1.getDiem(), o2.getDiem());
            }
        };
        Collections.sort(list, comp);
        xuat();
    }

    public void xuatHocBong() {
        for (SinhVienPoly sv : list) {
            sv.xuat();
            System.out.printf(" - Học Bổng: %s \n", sv.getHocBong());
        }
    }
}
