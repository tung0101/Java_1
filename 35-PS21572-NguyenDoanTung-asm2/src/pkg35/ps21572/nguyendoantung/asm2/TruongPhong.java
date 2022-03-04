/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg35.ps21572.nguyendoantung.asm2;

/**
 *
 * @author Admin
 */
public class TruongPhong extends NhanVien{
    private double Trachnhiem;

    public TruongPhong( String ID, String hoTen, double luongCoBan, String phongBan, double Trachnhiem) {
        super(ID, hoTen, luongCoBan, phongBan);
        this.Trachnhiem = Trachnhiem;
    }

    public double getTrachnhiem() {
        return Trachnhiem;
    }

    public void setTrachnhiem(double Tranhnhiem) {
        this.Trachnhiem = Trachnhiem;
    }
    
    @Override
    public double getthunhap(){
        return luongCoBan + Trachnhiem;
    }  
}
