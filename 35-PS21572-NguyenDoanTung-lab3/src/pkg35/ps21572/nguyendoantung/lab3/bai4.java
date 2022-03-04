/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg35.ps21572.nguyendoantung.lab3;

/**
 *
 * @author Nguyễn Doãn Tùng
 */
import java.util.Scanner;

public class bai4 {

    static Scanner sc = new Scanner(System.in);

    public static void ho(String[] name, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập họ thứ " + (i + 1) + ": ");
            name[i] = sc.nextLine();
        }
    }

    public static void tenlot(String[] name, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập tên đệm thứ " + (i + 1) + ": ");
            name[i] = sc.nextLine();
        }
    }

    public static void ten(String[] name, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập tên thứ " + (i + 1) + ": ");
            name[i] = sc.nextLine();
        }
    }

    public static void main(String[] args) {
        int a, b, c;
        System.out.print("Nhập số lượng họ: ");
        a = sc.nextInt();
        sc.nextLine();
        String[] ho = new String[a];
        ho(ho, a);
        System.out.print("Nhập số lượng tên đệm: ");
        b = sc.nextInt();
        sc.nextLine();
        String[] tl = new String[b];
        tenlot(tl, b);
        System.out.print("Nhập số lượng tên: ");
        c = sc.nextInt();
        sc.nextLine();
        String[] ten = new String[c];
        ten(ten, c);
        int dem = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                for (int k = 0; k < c; k++) {
                    System.out.print(ho[i] + " ");
                    System.out.print(tl[j] + " ");
                    System.out.print(ten[k] + "\n");
                    dem++;
                }
            }
        }
        System.out.println("co tong cong " + dem + " ho ten");
    }
}
