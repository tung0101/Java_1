/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg35.ps21572.nguyendoantung.lab6;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner a = new Scanner(System.in);
        System.out.print("Moi nhap ho ten: ");
        String hoten = a.nextLine();

        String[] xyz = hoten.split(" ");
        String ho = xyz[0];
        String ten = xyz[xyz.length - 1];

        ho = ho.toUpperCase();
        ten = ten.toUpperCase();

        System.out.print("\n Ho va ten duoc dinh dang: ");
        System.out.print(ten + " " + ho + " ");
        for (int i = 1; i < xyz.length - 1; i++) {
            System.out.println(xyz[i] + " ");
        }
    }

}
