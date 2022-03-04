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

public class bai3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try (Scanner bai3 = new Scanner(System.in)) {
            System.out.printf("Nhap n: ");
            int n = bai3.nextInt();
            int f0 = 1;
            int f1 = 1;
            int sothun = 1;
            if (n > 1) {
                for (int i = 2; i <= n; i++) {
                    sothun = f0 + f1;
                    f0 = f1;
                    f1 = sothun;
                }
            }
            System.out.println("so thu " + n + " la " + sothun);
        }
    }
}
