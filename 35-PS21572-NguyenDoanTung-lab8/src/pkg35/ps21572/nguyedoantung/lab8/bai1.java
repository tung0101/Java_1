/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg35.ps21572.nguyedoantung.lab8;

/**
 *
 * @author Admin
 */
public class bai1 {

    /**
     * @param args the command line arguments
     */
    public static double sum(double... nums) {
        double tong = 0;
        for (double a : nums) {
            tong += a;

        }
        return tong;
    }//end sum

    public static void main(String[] args) {
        double kp = sum(3);
        System.out.println("Ket qua: " + kp);

        kp = sum(2, 5.6, 8);
        System.out.println("Ket qua: " + kp);
    }

}
