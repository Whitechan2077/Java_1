/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assigment_dungbgph35753_it18314;

import java.util.Scanner;

/**
 *
 * @author buidu
 */
public class NhanVienThuong extends NhanVien {

    public NhanVienThuong(String maNhanVien, String tenNhanVien, long luong) {
        super(maNhanVien, tenNhanVien, luong);
    }

    public NhanVienThuong() {
    }

    @Override
    public String getMaNhanVien() {
        return maNhanVien;
    }

    @Override
    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    @Override
    public String getTenNhanVien() {
        return tenNhanVien;
    }

    @Override
    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    @Override
    public long getLuong() {
        return luong;
    }

    @Override
    public void setLuong(long luong) {
        this.luong = luong;
    }
    
    @Override
    public void input() {
        Scanner s = new Scanner(System.in);
        System.out.println("Moi nhap ma nhan vien");
        this.maNhanVien = s.nextLine();
        System.out.println("Nhap ten nhan vien");
        this.tenNhanVien = s.nextLine();
        System.out.println("Nhap luong");
        this.luong = s.nextLong();
    }

    @Override
    public void output() {
        System.out.println("Ma nhan vien: " + this.maNhanVien + "; Ten nhan vien: " + this.tenNhanVien + "; Luong: " + tinhLuong()+" Thue Thu NHap"+getThueThuNhap());
    }
    
//    @Override
//    public long tinhLuong() {
//        if (this.luong >= 15000000) {
//            return (long) (this.luong - (this.luong * 0.12));
//        } else if (this.luong >= 900000) {
//            return (long) (this.luong - (this.luong * 0.1));
//        } else {
//            return this.luong;
//        }
//    }

    @Override
    public long tinhLuong() {
        return super.tinhLuong();
    }

    @Override
    public long getThueThuNhap() {
        return super.getThueThuNhap(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getName() {
        return super.getName(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
