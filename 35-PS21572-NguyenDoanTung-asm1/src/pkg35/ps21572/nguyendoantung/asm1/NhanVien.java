package pkg35.ps21572.nguyendoantung.asm1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Admin
 */
public class NhanVien {

    String manv, hoten;
    double luongNV;

    public double Thuethunhap(double luong) {
        if (luong >= 9000000 && luong <= 15000000) {
            return luong * 0.1;
        } else if (luong > 15000000) {
            return luong * 0.12;
        } else {
            return 0;
        }
    }
}
