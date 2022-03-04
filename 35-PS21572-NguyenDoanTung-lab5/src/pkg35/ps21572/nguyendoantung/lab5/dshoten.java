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

public class dshoten {

    private ArrayList<String> list = new ArrayList<>();

    public void nhap() {
        Scanner b = new Scanner(System.in);
        do {
            System.out.println("Nhap ho ten: ");
            String ht = b.nextLine();
            list.add(ht);
            System.out.print("bạn có muốn nhập thêm không (y/n):");
            String a = b.nextLine();

            if (a.equals("n")) {
                break;
            }
        } while (true);
    }

    public void xuat() {
        System.out.println("Danh sach ho ten: ");
        for (String item : list) {
            System.out.println("Ho ten: " + item);
        }
    }

    public void xuatNgauNhien() {
        Collections.shuffle(list);

        xuat();
    }

    public void sapxep() {
        Collections.sort(list, (a, b) -> a.compareTo(b));

        xuat();
    }

    public void timvaxoa() {
        Scanner b = new Scanner(System.in);
        System.out.print("Nhap ho ten can tim va xoa: ");
        String ht = b.nextLine();
        for (String item : list) {
            if (item.equals(ht)) {
                list.remove(item);
                break;
            }
        }
    }

    public void Menu() {
        Scanner b = new Scanner(System.in);
        do {
            System.out.println("Menu chuong trinh: ");
            System.out.println("0: Thoat chuong trinh");
            System.out.println("1: Nhap danh sach");
            System.out.println("2: Hien thi danh sach");
            System.out.println("3: xuat danh sach ngau nhien ngau nhien danh sach");
            System.out.println("4: Sap xep giam dan va xuat danh sach");
            System.out.println("5: Tim kiem va xoa ho ten nhap tu ban phim");
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
                    xuat();
                    break;
                case 3:
                    xuatNgauNhien();
                    break;
                case 4:
                    sapxep();
                    break;
                case 5:
                    timvaxoa();
                    break;
            }
        } while (true);
    }
}
