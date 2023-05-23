/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linh;

import java.util.Scanner;

/**
 *
 * @author buidu
 */
public class SanPham {
    private String tenSanpham;
    private double donGia;
    private double giamGia;    

    public SanPham(String tenSanpham, double donGia, double giamGia) {
        this.tenSanpham = tenSanpham;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public SanPham() {
    }
    
    public void setTenSanPham(String tenSanPham)
    {
        this.tenSanpham = tenSanPham;
    }
    public void setDonGia(double donGia)
    {
        this.donGia = donGia;
    }
    public void setGiamGia(double giamGia)
    {
        this.giamGia = giamGia;
    }

    public String getTenSanpham() {
        return tenSanpham;
    }

    public double getDonGia() {
        return donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }
    
    
    public double tinhThueNhapKhau()
    {
        return Math.round(this.donGia*0.1);
    }
    public void input()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap ten san pham");
        this.tenSanpham = s.nextLine();
        System.out.println("Don gia");
        this.donGia = s.nextDouble();
        System.out.println("Giam gia");
        this.giamGia = s.nextDouble();
    }
    public void output()
    {
        System.out.println("Ten:" +this.tenSanpham);
        System.out.println("Don Gia : "+this.donGia);
        System.out.println("Giam Gia"+this.giamGia);
        System.out.println("Thue nhap Khau : "+tinhThueNhapKhau());
    }
}
