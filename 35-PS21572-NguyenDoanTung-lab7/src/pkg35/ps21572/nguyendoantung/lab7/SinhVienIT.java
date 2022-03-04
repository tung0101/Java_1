/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg35.ps21572.nguyendoantung.lab7;

/**
 *
 * @author Admin
 */
public class SinhVienIT extends SinhVienPoly {

    public double diemJava;
    public double diemCss;
    public double diemHtml;

    public SinhVienIT(String hoTen, String nganh, double diemJava, double diemCss, double diemHtml) {
        super(hoTen, nganh);
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }

    public double getDiemJava() {
        return diemJava;
    }

    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }

    public double getDiemCss() {
        return diemCss;
    }

    public void setDiemCss(double diemCss) {
        this.diemCss = diemCss;
    }

    public double getDiemHtml() {
        return diemHtml;
    }

    public void setDiemHtml(double diemHtml) {
        this.diemHtml = diemHtml;
    }

    @Override
    public double getDiem() {
        return (diemJava * 2 + diemCss + diemHtml) / 4;
    }

    @Override
    public String getHocBong() {
        if (getHocLuc().equals("Giỏi") || getHocLuc().equals("Xuất sắc") && this.diemJava >= 6.5 && this.diemCss >= 6.5 && this.diemHtml >= 6.5) {
            return "Học bổng Giỏi";
        } else if (getHocLuc().equals("Khá") || getHocLuc().equals("Giỏi") || getHocLuc().equals("Xuất sắc") && this.diemJava >= 5 && this.diemCss >= 5 && this.diemHtml >= 5) {
            return "Học bổng Khá";
        } else {
            return "Không có";
        }
    }
}
