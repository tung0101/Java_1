/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg35.ps21572.nguyendoantung.lab7;

/**
 *
 * @author Admin
 */
public abstract class SinhVienPoly {

    public String hoTen;
    public String nganh;

    public SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public abstract double getDiem();

    public abstract String getHocBong();

    public String getHocLuc() {
        if (this.getDiem() >= 9) {
            return "Xuất sắc";
        } else if (this.getDiem() >= 7.5) {
            return "Giỏi";
        } else if (this.getDiem() >= 6.5) {
            return "Khá";
        } else if (this.getDiem() >= 5) {
            return "Trung bình";
        } else {
            return "Yếu";
        }
    }

    public void xuat() {
        System.out.printf("Họ tên: %s",hoTen);
        System.out.printf("Ngành: %s",nganh);
        System.out.printf("Điểm: %f",getDiem());
        System.out.printf("Học lực: %s",getHocLuc());
        
    }
}
