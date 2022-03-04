/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg35.ps21572.nguyendoantung.lab5;

/**
 *
 * @author Admin
 */
public class sanpham {
    private String ten;
    private Double gia;
    
    public sanpham(){
        this.ten=null;
    }
    public sanpham(String ten, double gia){
        this.ten= ten;
        this.gia= gia;
    }

    public Double getGia() {
        return gia;
    }

    public void setGia(Double gia) {
        this.gia = gia;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }  
}
