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
public class NhanVienTiepThi extends NhanVien {

    private int doanhSo;
    private double hoaHong;

    public NhanVienTiepThi(int doanhSo, double hoaHong, String maNhanVien, String tenNhanVien, long luong) {
        super(maNhanVien, tenNhanVien, luong);
        this.doanhSo = doanhSo;
        this.hoaHong = hoaHong;
    }

    public int getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(int doanhSo) {
        this.doanhSo = doanhSo;
    }

    public double getHoaHong() {
        return hoaHong;
    }

    public void setHoaHong(double hoaHong) {
        this.hoaHong = hoaHong;
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

    public NhanVienTiepThi() {
    }

    @Override
    public void input() {
        Scanner s = new Scanner(System.in);
        System.out.println("Moi nhap ma nhan vien TIEP THI");
        this.maNhanVien = s.nextLine();
        System.out.println("Nhap ten nhan vien TIEP THI");
        this.tenNhanVien = s.nextLine();
        System.out.println("Nhap luong");
        this.luong = s.nextLong();
        System.out.println("Nhap doanh so");
        this.doanhSo = s.nextInt();
        System.out.println("Nhap hoa hong");
        this.hoaHong = s.nextDouble();
    }

//    @Override
//    public long tinhLuong() {
//        if (this.luong >= 15000000) {
//            return (long) ((long) (this.luong - (this.luong * 0.12))+(this.doanhSo*this.hoaHong));
//        } else if (this.luong >= 900000) {
//            return (long) ((long) (this.luong - (this.luong * 0.1))+(this.doanhSo*this.hoaHong));
//        } else {
//            return (long) (this.luong +(this.doanhSo*this.hoaHong));
//        }
//    }

    @Override
    public long getThueThuNhap() {
        return super.getThueThuNhap(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    @Override
    public long tinhLuong() {
        return (long) (super.tinhLuong()+(this.hoaHong)); 
    }
    
    
    @Override
    public void output() {
        System.out.println("Ma nhan vien: " + this.maNhanVien + "; Ten nhan vien: " + this.tenNhanVien + "; Luong: " + tinhLuong()+"Thue Thu Nhap :"+getThueThuNhap());
    }

    @Override
    public String getName() {
        return super.getName(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
