/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_hinh;

/**
 *
 * @author buidu
 */
public class Hinh_Tron extends Hinh{
    private double r;

    public Hinh_Tron(double r, Toa_Do toaDo) {
        super(toaDo);
        this.r = r;
    }

    @Override
    public String toString() {
        return ""+tinhDienTich();
    }

    @Override
    public double tinhDienTich() {
       return Math.pow(this.r, 2)*2 * 3.14;
    }   

    @Override
    public void tao() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
