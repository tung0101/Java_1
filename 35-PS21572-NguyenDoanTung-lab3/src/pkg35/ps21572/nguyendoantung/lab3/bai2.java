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

public class bai2 {

    public static int soNguyento(int n) {
        int a = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                a++;
            }
        }
        if (a == 1) {
            return n;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int dem = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi nhap n: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int temp = soNguyento(i);
            if (temp != 0) {
                System.out.print(i + " ");
                dem++;
            }
        }
        System.out.println("\n co " + dem + " so nguyen to tu 1 den " + n);
    }
}
