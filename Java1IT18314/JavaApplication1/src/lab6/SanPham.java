/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

import java.util.Scanner;

/**
 *
 * @author buidu
 */
public class SanPham {
    private String tenSp;
    private double donGia;
    private String hang;

    public SanPham() {
    }

    public SanPham(String tenSp, double donGia, String hang) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.hang = hang;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }
    
    public void nhap(){
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap ten :");
        tenSp = s.nextLine();
        System.out.println("Gia :");
        donGia = Double.parseDouble(s.nextLine());
        System.out.println("Hang :");
        hang = s.nextLine();
    }
    public void xuat(){
        System.out.println("Ten sp"+tenSp+" Gia: "+donGia+" Hang: "+hang);
    }
}
