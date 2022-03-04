/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg35.ps21572.nguyendoantung.lab2;

/**
 *
 * @author Nguyễn Doãn Tùng
 */
import java.util.Scanner;

public class PS21572NguyenDoanTungLab2 {

    public static void giaiPTB1() {
        float a, b;
        Scanner pt1 = new Scanner(System.in);
        System.out.print("Moi nhap so a:");
        a = pt1.nextFloat();
        System.out.print("Moi nhap so b:");
        b = pt1.nextFloat();
        if (a == 0) {
            if (b == 0) {
                System.out.printf("Phuong trinh vo so nghiem\n");
            } else {
                System.out.printf("Phuong trinh vo nghiem\n");
            }
        } else {
            System.out.printf("Phuong trinh co nghiem x=%g\n", -b / a);
        }
    }

    public static void giaiPTB2() {
        float a, b, c;
        float delta = 0;
        float x1, x2;
        Scanner pt2 = new Scanner(System.in);
        System.out.print("Moi nhap so a:");
        a = pt2.nextFloat();
        System.out.print("Moi nhap so b:");
        b = pt2.nextFloat();
        System.out.print("Moi nhap so c:");
        c = pt2.nextFloat();
        if (a == 0) {
            System.out.printf("Day la phuong trinh bac 1");
        } else {
            delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.printf("phuong trinh vo nghiem");
            } else if (delta == 0) {
                x1 = -b / (2 * a);
                //in ra ket qua 
                System.out.printf("phuong trinh co hai nghiem kep la: %.2f", x1);
            } else {     //// delta > 0
                x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
                x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
                //in rat ket qua
                System.out.printf("phuong trinh co 2 nghiem la: x1 = %.2f va x2 = %.2f", x1, x2);
            }
        }
    }

    public static void tinhTienDien() {
        Scanner td = new Scanner(System.in);
        int so_dien_Sd;
        float sotien;
        System.out.print("Moi nhap so dien hang thang:");
        so_dien_Sd = td.nextInt();
        if (so_dien_Sd <= 50) {
            sotien = so_dien_Sd * 1000;
        } else {
            sotien = 50 * 1000 + (so_dien_Sd - 50) * 1200;
        }
        System.out.printf("so tien dien can phai tra la: %f", sotien);
    }

    public static void bai5() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhap N: ");
            int n = scanner.nextInt();
            float S = 0, P = 1;
            for (int i = 1; i <= n; i++) {
                S = S + i;
                P = P * i;
                if (i % 3 == 0) {
                    System.out.printf("\nCac so chia het cho 3 la: %d", i);
                }
            }
            System.out.printf("\nTong: %f", S);
            System.out.printf("\nTich: %f", P);
            System.out.printf("\nNgich dao: ");
            for (int i = n; i > 0; i--) {
                System.out.printf("%d", i);
            }
        }
    }

    public static void main(String[] age) {
        int choose;
        Scanner menu = new Scanner(System.in);
        for (;;) {
            System.out.printf("\nBài 4 \n");
            System.out.printf("\n+---------------------------------------------------+\n");
            System.out.printf("1. Giai phuong trinh bac nhat\n");
            System.out.printf("2. Giai phuong trinh bac 2\n");
            System.out.printf("3. Tinh tien dien\n");
            System.out.printf("4. Bài 5 ( Giáo cho thêm )\n");
            System.out.printf("5. Ket thuc\n");
            System.out.printf("+---------------------------------------------------+\n");
            do {
                System.out.print("\t\tMoi chon chuc nang(1,2,3,4,5): ");
                choose = menu.nextInt();
            } while (choose < 1 && choose > 5);
            switch (choose) {
                case 1:
                    giaiPTB1();
                    break;
                case 2:
                    giaiPTB2();
                    break;
                case 3:
                    tinhTienDien();
                    break;
                case 4:
                    bai5();
                    break;
                case 5:
                    System.out.printf("Ket thuc chuong trinh");
                    System.exit(0);
                    break;
            }
        }
    }
}
