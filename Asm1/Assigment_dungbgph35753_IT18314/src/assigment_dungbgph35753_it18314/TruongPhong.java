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
public class TruongPhong extends NhanVien {

    private long luongTrachNghiem;

    public TruongPhong() {
    }

    public TruongPhong(long luongTrachNghiem, String maNhanVien, String tenNhanVien, long luong) {
        super(maNhanVien, tenNhanVien, luong);
        this.luongTrachNghiem = luongTrachNghiem;
    }

    public long getLuongTrachNghiem() {
        return luongTrachNghiem;
    }

    public void setLuongTrachNghiem(long luongTrachNghiem) {
        this.luongTrachNghiem = luongTrachNghiem;
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
        System.out.println("Moi nhap ma TRUONG PHONG");
        this.maNhanVien = s.nextLine();
        System.out.println("Nhap ten TRUONG PHONG");
        this.tenNhanVien = s.nextLine();
        System.out.println("Nhap luong");
        this.luong = s.nextLong();
        System.out.println("Nhap luong trach cmn nhiem");
        this.luongTrachNghiem = s.nextLong();
    }

    @Override
    public long tinhLuong() {
        return super.tinhLuong() + luongTrachNghiem;
    }
    
    @Override
    public void output() {
        System.out.println("Ma truong phong: " + this.maNhanVien + "; Ten truong phong: " + this.tenNhanVien + "; Luong: " + tinhLuong()+" Thue thu Nhap: "+getThueThuNhap());

    }

//    @Override
//    public long tinhLuong() {
//        if (this.luong >= 15000000) {
//            return (long) (this.luong - (this.luong * 0.12) + this.luongTrachNghiem);
//        } else if (this.luong >= 900000) {
//            return (long) (this.luong - (this.luong * 0.1) + this.luongTrachNghiem);
//        } else {
//            return this.luong + this.luongTrachNghiem;
//        }
//    }

    @Override
    public long getThueThuNhap() {
        return super.getThueThuNhap(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getName() {
        return super.getName(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
