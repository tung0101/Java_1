/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg35.ps21572.nguyendoantung.asm2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class PS21572NguyenDoanTungAsm2 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        DanhSachNhanVien dsnv = new DanhSachNhanVien();
        int menu = 0;
        do{
            System.out.printf("\t\t _________________ MENU _____________________ \n");
            System.out.printf("\t\t| 1. Nhập danh sách nhân viên                |\n");
            System.out.printf("\t\t| 2. Xuất danh sách nhân viên                |\n");
            System.out.printf("\t\t| 3. Tìm và hiển thị nhân viên theo mã       |\n");
            System.out.printf("\t\t| 4. Xóa nhân viên theo mã                   |\n");
            System.out.printf("\t\t| 5. Cập nhật thông tin nhân viên theo mã    |\n");
            System.out.printf("\t\t| 6. Tìm các nhân viên theo khoảng lương     |\n");
            System.out.printf("\t\t| 7. Sắp xếp nhân viên theo họ và tên        |\n");
            System.out.printf("\t\t| 8. Sắp xếp nhân viên theo thu nhập         |\n");
            System.out.printf("\t\t| 9. Xuất 5 nhân viên có thu nhập cao nhất   |\n");
            System.out.printf("\t\t| 0. Ngưng chạy chuong trinh                 |\n");
            System.out.printf("\t\t|____________________________________________|\n\n");
            System.out.print("\t\t\t\t Xin mời lựa chọn: ");
            menu = sc.nextInt();
            switch (menu) {
                case 0:
                    System.exit(0);
                case 1:
                    dsnv.nhap();
                    break;
                case 2:
                    dsnv.xuat();
                    break;
                case 3:
                    dsnv.timNV();
                    break;
                case 4:
                    dsnv.xoaNV();
                    break;
                case 5:
                    dsnv.capNhatNV();
                    break;
                case 6:
                    dsnv.timTheoKhoangLuong();
                    break;
                case 7:
                    dsnv.sortName();
                    break;
                case 8:
                    dsnv.sortLuong();
                    break;
                case 9:
                    dsnv.xuatTop5();
                    break;
                default:
                    System.out.println("\t\tSố nhập không hợp lệ vui lòng nhập lại");
                    break;
            }
        }while(true);
    }
}
