/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg35.ps21572.nguyendoantung.lab5;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class dssanpham {

    private ArrayList<sanpham> list = new ArrayList<>();

    public void nhap() {
        Scanner a = new Scanner(System.in);
        do {
            System.out.println("Nhập tên sản phẩm: ");
            String ten = a.nextLine();
            if (ten == null || ten.equals("")) {
                break;
            }
            System.out.println("Nhập gia sản phẩm: ");
            double gia = a.nextDouble();

            list.add(new sanpham(ten, gia));
            a.nextLine();
            System.out.print("Bạn có muốn nhạp thêm không (y/n):");
            String c = a.nextLine();

            if (c.equals("n")) {
                break;
            }
        } while (true);
    }

    public void xuat() {
        System.out.println("Danh sach ho ten: ");
        for (sanpham sanpham : list) {
            System.out.printf("%10s |     %.2f \n", sanpham.getTen(), sanpham.getGia());
        }
    }

    public void sxten() {
        Comparator<sanpham> comp = new Comparator<sanpham>() {
            @Override
            public int compare(sanpham o1, sanpham o2) {
                return o2.getGia().compareTo(o1.getGia());
            }
        };
        Collections.sort(list, comp);
        xuat();
    }

    public void timvaxoa() {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhâp tên sản phẩm cần tìm và xóa: ");
        String ten = s.nextLine();
        sanpham found = null;

        for (sanpham sanpham : list) {
            if (sanpham.getTen().equals(ten)) {
                found = sanpham;
                break;
            }
        }
        if (found != null) {
            list.remove(found);
            System.out.println("Sản phẩm đã được xóa khỏi danh sách");
        } else {
            System.out.println("Sản phẩm không có tên trong danh sách");
        }
    }

    public void giatrungbinh() {
        double avg = 0, sum = 0;

        for (sanpham sanpham : list) {
            sum += sanpham.getGia();
        }
        avg = sum / list.size();
        System.out.println("Gía trung bình của các sản phẩm : " + avg);
    }

    public void sapxeptenandgia() {
        Comparator<sanpham> comp = new Comparator<sanpham>() {
            @Override
            public int compare(sanpham o1, sanpham o2) {
                int kt = o2.getTen().compareTo(o1.getTen());
                if (kt == 0) {
                    kt = o1.getGia().compareTo(o2.getGia());
                }
                return kt;
            }
        };
        Collections.sort(list, comp);
        xuat();
    }

    public void Menu() {
        Scanner b = new Scanner(System.in);
        do {
            System.out.println("Menu chuong trinh: ");
            System.out.println("0: Thoat chuong trinh");
            System.out.println("1: Nhập danh sách sản phẩm từ bàn phím");
            System.out.println("2: Sắp xếp giảm dần theo giá và xuất danh sách");
            System.out.println("3: Tìm và xóa sản phẩm theo tên nhập từ bàn phím");
            System.out.println("4: Xuất giá trung bình của các sản phẩm");
            System.out.println("5: Sắp xếp giảm dần theo tên");
            System.out.println("Lua chon cua ban la: ");
            int luachon = b.nextInt();
            switch (luachon) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    nhap();
                    break;
                case 2:
                    sxten();
                    break;
                case 3:
                    timvaxoa();
                    break;
                case 4:
                    giatrungbinh();
                    break;
                case 5:
                    sapxeptenandgia();
                    break;
            }
        } while (true);
    }

}
