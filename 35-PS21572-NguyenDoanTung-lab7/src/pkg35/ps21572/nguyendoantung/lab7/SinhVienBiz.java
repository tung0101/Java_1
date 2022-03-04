/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg35.ps21572.nguyendoantung.lab7;

/**
 *
 * @author Admin
 */
public class SinhVienBiz extends SinhVienPoly {

    public double diemmarketing;
    public double diemsale;

    public SinhVienBiz(String hoTen, double marketing, double sale) {
        super(hoTen, "Biz");
        this.diemmarketing = marketing;
        this.diemsale = sale;
    }

    public double getMarketing() {
        return diemmarketing;
    }

    public void setMarketing(double marketing) {
        this.diemmarketing = marketing;
    }

    public double getSale() {
        return diemsale;
    }

    public void setSale(double sale) {
        this.diemsale = sale;
    }

    @Override
    public double getDiem() {
        return (2 * diemmarketing + diemsale) / 3;
    }

    @Override
    public String getHocBong() {
        if (getHocLuc().equals("Giỏi") || getHocLuc().equals("Xuất sắc") && this.diemmarketing >= 6.5 && this.diemsale >= 6.5) {
            return "Học bổng Giỏi";
        } else if (getHocLuc().equals("Khá") || getHocLuc().equals("Giỏi") || getHocLuc().equals("Xuất sắc") && this.diemmarketing >= 5 && this.diemsale >= 5) {
            return "Học bổng Khá";
        } else {
            return "Không có";
        }
    }
}
