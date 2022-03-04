/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg35.ps21572.nguyendoantung.lab7;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class bai4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        DanhSachSinhVien list = new DanhSachSinhVien();
        do {
            System.out.println("\t              Menu          ");
            System.out.println("\t1. Nhập danh sách sinh viên");
            System.out.println("\t2. Xuất danh sách sinh viên");
            System.out.println("\t3. Xuất danh sách sinh viên có học lực giỏi");
            System.out.println("\t4. Sắp xếp danh sách sinh viên theo điểm");
            System.out.println("\t5. Học bổng");
            System.out.println("\t0. Thoát Chương trình");

            System.out.print("Lựa chọn chức năng: ");
            int nhap = sc.nextInt();
            switch (nhap) {
                case 0:
                    System.exit(0);
                case 1:
                    list.nhap();
                    break;
                case 2:
                    list.xuat();
                    break;
                case 3:
                    list.SVGioi();
                    break;
                case 4:
                    list.sapXep();
                    break;
                case 5:
                    list.xuatHocBong();
            }
        } while (true);
    }

}
