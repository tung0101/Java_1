/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg35.ps21572.nguyendoantung.asm2;

/**
 *
 * @author Admin
 */
public class TiepThi extends NhanVien {

    private double doanhso;
    private double huehong;

    public TiepThi(String ID, String hoTen, double luongCoBan, String phongBan, double doanhso, double huehong) {
        super(ID, hoTen, luongCoBan, phongBan);
        this.doanhso = doanhso;
        this.huehong = huehong;
    }

    public double getDoanhso() {
        return doanhso;
    }

    public void setDoanhso(double doanhso) {
        this.doanhso = doanhso;
    }

    public double getHuehong() {
        return huehong;
    }

    public void setHuehong(double huehong) {
        this.huehong = huehong;
    }

    @Override
    public double getthunhap() {
        return luongCoBan + doanhso + huehong;
    }
}
