/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg35.ps21572.nguyendoantung.lab7;

/**
 *
 * @author Admin
 */
public class ChuNhat {
     double cDai;
    double cRong;

    public ChuNhat() {
    }

    public ChuNhat(double doDai, double doRong) {
        this.cDai = doDai;
        this.cRong = doRong;
    }

   
    
    public double getChuVi(){
        return (this.cDai+this.cRong)*2;
    }
    
    public double getDienTich(){
        return (this.cDai*this.cRong);
    }
    
    public void xuat(){
        System.out.println("Chiều dài: "+this.cDai);
        System.out.println("Chiều rong: "+this.cRong);
        System.out.println("Chu vi: "+this.getChuVi());
        System.out.println("Diện tích: "+this.getDienTich());
    }
}
