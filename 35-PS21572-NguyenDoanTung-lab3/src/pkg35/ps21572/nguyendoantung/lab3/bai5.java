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

public class bai5 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int choose;
        do {
            System.out.printf("\n Bạn muốn tính số năm cần vay hay số tiền cần trả hàng tháng ");
            System.out.printf("\n\t 1.Tinh theo so nam                             ");
            System.out.printf("\n\t 2.Tinh theo so tien co the tra hang thang      ");
            System.out.printf("\n\t 0.Ket thuc:                                    \n\n");
            System.out.print("Xin mời chọn: ");
            choose = input.nextInt();
            switch (choose) {
                case 0:
                    System.exit(choose);
                    break;
                default:
                    System.out.print("\nBan chon khong dung chuc nang");
                case 1:
                    System.out.print("Nhap so tien can vay: ");
                    double tien = input.nextDouble();
                    System.out.print("nhap lai suat theo nam: ");
                    double phantram = input.nextDouble();
                    LaiXuatNam(tien, phantram);
                    break;
                case 2:
                    System.out.print("Nhap so tien can vay: ");
                    double tien1 = input.nextDouble();
                    System.out.print("nhap lai suat theo nam: ");
                    double phantram2 = input.nextDouble();
                    LaiXuatThang(tien1, phantram2);
                    break;
            }
        } while (true);
    }

    public static void LaiXuatNam(double tien, double phantram) {
        double tragoc, lai = 0, tongtra = 0;
        System.out.print("Tra trong bao nhieu nam: ");
        double thangtra = input.nextDouble();
        thangtra *= 12;
        tragoc = tien / thangtra;
        System.out.print(
                "|    So thang    |         Goc         |         Tra goc        |         Lai         |         Tong tra         |");
        for (int i = 0; i <= thangtra; i++) {
            lai = tien * phantram / 12;
            tongtra = tragoc + lai;
            System.out.printf(
                    "\n-----------------------------------------------------------------------------------------------------------------\n");
            System.out.printf("%9d %23.0f %22.0f %22.0f %24.0f", i, tien, tragoc, lai, tongtra);
            tien -= tragoc;
        }
    }

    public static void LaiXuatThang(double tien, double phantram) {
        double tragoc, lai = 0, tongtra = 0;
        int j = 1;
        System.out.print("Nhap so ten hang thang phai tra: ");
        double trathang = input.nextDouble();
        System.out.print(
                "|    So thang    |         Goc         |         Tra goc        |         Lai         |         Tong tra         |");
        for (double i = tien; i > 0;) {
            if (i < trathang) {
                tragoc = i;
                lai = tien * phantram / 12;
                tongtra = tragoc + lai;
                System.out.printf(
                        "\n-----------------------------------------------------------------------------------------------------------------\n");
                System.out.printf("%9d %23.0f %22.0f %22.0f %24.0f\n", j, tien, tragoc, lai, tongtra);
                break;
            } else {
                lai = tien * phantram / 12;
                tongtra = trathang + lai;
                tragoc = trathang;
            }
            System.out.printf(
                    "\n-----------------------------------------------------------------------------------------------------------------\n");
            System.out.printf("%9d %23.0f %22.0f %22.0f %24.0f\n", j, tien, tragoc, lai, tongtra);
            tien -= tragoc;
            j++;
            i -= trathang;
        }
    }
}
