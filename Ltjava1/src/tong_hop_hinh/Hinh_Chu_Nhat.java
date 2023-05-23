/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_hinh;

/**
 *
 * @author buidu
 */
public class Hinh_Chu_Nhat extends Hinh {
    private int dai;
    private int rong;
    
    public Hinh_Chu_Nhat(Toa_Do toaDo) {
        super(toaDo);
    }

    public Hinh_Chu_Nhat(int dai, int rong, Toa_Do toaDo) {
        super(toaDo);
        this.dai = dai;
        this.rong = rong;
    }

    @Override
    public double tinhDienTich() {
       return this.dai* this.rong;    
      }

    @Override
    public void tao() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
