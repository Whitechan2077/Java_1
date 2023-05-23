/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlysach;

/**
 *
 * @author buidu
 */
   public class tacgia {
   private String tenTG;
   private ngay ngaySinh;

    public tacgia(String tenTG, ngay ngaySinh) {
        this.tenTG = tenTG;
        this.ngaySinh = ngaySinh;
    }

    public String getTenTG() {
        return tenTG;
    }

    public ngay getNgaySinh() {
        return ngaySinh;
    }

    public void setTenTG(String tenTG) {
        this.tenTG = tenTG;
    }

    public void setNgaySinh(ngay ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    @Override
    public String toString() {
        return  "" + tenTG + "" + ngaySinh ;
    }
    
}
