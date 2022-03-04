/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg35.ps21572.nguyedoantung.lab8;

/**
 *
 * @author Admin
 */
public class XPoly {

    /**
     * @param args the command line arguments
     */
    public static double min(double... nums) {
        double m = nums[0];
        for (double item : nums) {
            m = Math.min(m, item);
        }
        return m;
    }

    public static double sum(double... nums) {
        double tong = 0;
        for (double a : nums) {
            tong += a;

        }
        return tong;
    }

    public static double max(double... nums) {
        double m = nums[0];
        for (double item : nums) {
            m = Math.max(m, item);
        }
        return m;
    }

    public static String toUpperFirstChar(String name) {
        String[] arr = name.split(" ");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            String item = arr[i];
            if (!item.equals("")) {
                String ch = item.substring(0, 1).toUpperCase();
                item = ch + item.substring(1).toLowerCase();
                sb.append(item).append(" ");
            }
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        double kp;
        kp = sum(3);
        System.out.println("Ket qua: " + kp);

        kp = sum(2, 5.6, 8);
        System.out.println("Ket qua: " + kp);
        kp = min(67, 89);
        System.out.println("số nhỏ nhất: " + kp);

        kp = max(6, 3.6, 9);
        System.out.println("số lớn nhất: " + kp);
        System.out.println("");

        String name = "nguyen van teo";
        String newName = toUpperFirstChar(name);
        System.out.println("New name: " + newName);

        name = "ho quynh huong";
        newName = toUpperFirstChar(name);
        System.out.println("New name: " + newName);
    }
}
