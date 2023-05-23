/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_hinh;

/**
 *
 * @author buidu
 */
public abstract class Hinh {
    protected Toa_Do toaDo;

    public Hinh(Toa_Do toaDo) {
        this.toaDo = toaDo;
    }  

    public Toa_Do getToưaDo() {
        return toaDo;
    }

    public void setToaDo(Toa_Do toaDo) {
        this.toaDo = toaDo;
    }
    
    public abstract double tinhDienTich();
    public abstract void tao();
}
