/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg35.ps21572.nguyendoantung.lab4;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class SanPham {

    /*
     * class bao gồm:
     * Thuộc tính
     * Get và set tự tạo
     * Hàm tạo (constructor) tự tạo
     * Phương thức
     */

    /// thuoc tính
    private String tenSp;
    private Double donGia;
    private double giamGia;

    /// get va set
    public String gettenSp() {
        return tenSp;
    }

    public void settenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public double getdonGia() {
        return donGia;
    }

    public void setdonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getgiamGia() {
        return giamGia;
    }

    public void setgiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    /// Phuong thuc
    public double getThueNhapKhau() {
        double tnk = donGia * 0.1; /// tính thuế nhập khẩu
        return tnk;/// trả về giá trị
    }

    public void xuat() {/// xuất
        System.out.println("Thong tin san pham: ");
        System.out.printf("Ten san pham: %s\n", tenSp);
        System.out.printf("Gia san pham: %.1f\n", donGia);
        System.out.printf("Giam gia: %.1f\n", giamGia);
        System.out.printf("Thue nhap khau: %.1f\n", getThueNhapKhau());

    }

    public void nhap() {/// nhập
        System.out.println("Moi ban nhap thong tin san pham: Ten ; Gia ; Giam gia ");
        Scanner sp = new Scanner(System.in);
        System.out.println("Moi nhap tên sản phẩm: ");
        tenSp = sp.nextLine();
        System.out.println("Moi nhap giá sản phẩm: ");
        donGia = Double.parseDouble(sp.nextLine());
        System.out.println("Moi nhap giảm giá của sản phẩm: ");
        giamGia = Double.parseDouble(sp.nextLine());
    }

    /// constructor
    public SanPham(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public SanPham() {/// hàm không tham số

    }

    public SanPham(String tenSp, double donGia) { /// hàm có 2 tham số
        this(tenSp, donGia, 0); /// không giảm giá
    }
}
