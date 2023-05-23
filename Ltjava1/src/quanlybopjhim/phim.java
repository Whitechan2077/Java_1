/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlybopjhim;

/**
 *
 * @author buidu
 */
public class phim {
   private String tenPhim;
   private int namSX;
   private ngay ngayChieu;
   private float giaVe;

    public phim(String tenPhim, int namSX, ngay ngayChieu, float giaVe) {
        this.tenPhim = tenPhim;
        this.namSX = namSX;
        this.ngayChieu = ngayChieu;
        this.giaVe = giaVe;
    }

    public String getTenPhim() {
        return tenPhim;
    }

    public int getNamSX() {
        return namSX;
    }

    public ngay getNgayChieu() {
        return ngayChieu;
    }

    public float getGiaVe() {
        return giaVe;
    }

    public void setTenPhim(String tenPhim) {
        this.tenPhim = tenPhim;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    public void setNgayChieu(ngay ngayChieu) {
        this.ngayChieu = ngayChieu;
    }

    public void setGiaVe(float giaVe) {
        this.giaVe = giaVe;
    }
     public boolean ktNam(phim phimKhac)
     {
         return this.giaVe<phimKhac.giaVe;
     }
    
}
