/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg35.ps21572.nguyendoantung.lab5;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
import java.util.ArrayList;

public class bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<Double>();
        while (true) {
            System.out.print("Moi nhap so thuc: ");
            list.add(scanner.nextDouble());
            scanner.nextLine();
            System.out.print("\n Nhập thêm (y/n):");
            String a = scanner.nextLine();

            if (a.equals("n")) {
                break;
            }
        }
        System.out.println("in mang");
        double tong = 0;
        for (double arr : list) {
            System.out.println(arr + " , ");
            tong += arr;
        }
        System.out.println("tong la: " + tong);
    }

}
