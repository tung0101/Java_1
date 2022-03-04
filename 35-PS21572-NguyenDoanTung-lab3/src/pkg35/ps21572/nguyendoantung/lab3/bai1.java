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

public class bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner snt = new Scanner(System.in);
        int n;
        System.out.printf("Moi nhap so can kiem tra: ");
        n = snt.nextInt();
        boolean ok = true;
        for (int i = 2; i <= (n / 2); i++) {
            if (n % i == 0) {
                ok = false;
                break;
            }
            i++;
        }
        if (ok == true) {
            System.out.printf("\n%d la so nguyen to \n", n);
        } else {
            System.out.printf("\n%d khong phai so nguyen to \n", n);
        }
    }
}
