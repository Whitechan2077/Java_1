/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_hinh;

/**
 *
 * @author buidu
 */
public class Diem extends Hinh{
    
    public Diem(Toa_Do toaDo) {
        super(toaDo);
    }

    @Override
    public double tinhDienTich() {
        return 1;
    }

    @Override
    public void tao() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
