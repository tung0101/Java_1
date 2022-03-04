/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg35.ps21572.nguyendoantung.lab7;

/**
 *
 * @author Admin
 */
public class Hinhvuong extends ChuNhat {

    double canh;

    public Hinhvuong() {
        super();
    }

    public Hinhvuong(double canh) {
        super(canh, canh);
        this.canh = canh;
    }

    @Override
    public void xuat() {
        System.out.println("Cạnh: " + this.cDai);
        System.out.println("Chu vi: " + this.getChuVi());
        System.out.println("Diện tích: " + this.getDienTich());
    }
}
