/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg35.ps21572.nguyendoantung.asm2;

/**
 *
 * @author Admin
 */
public class NhanVienHanhChinh extends NhanVien {

    private double ngayCong;

    public NhanVienHanhChinh(String ID, String hoTen, double luongCoBan, String phongBan, double ngayCong) {
        super(ID, hoTen, luongCoBan, phongBan);
        this.ngayCong = ngayCong;
    }

    public double getNgayCong() {
        return ngayCong;
    }

    public void setNgayCong(double ngayCong) {
        this.ngayCong = ngayCong;
    }

    @Override
    public Double getLuong() {
        return luongCoBan * ngayCong;
    }
}
