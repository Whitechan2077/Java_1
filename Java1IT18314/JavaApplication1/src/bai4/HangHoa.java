/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4;

import java.util.Scanner;

/**
 *
 * @author buidu
 */
public class HangHoa {

    private String maHangHoa;
    private String tenHangHoa;
    private double donGia;
    private int soLuong;

    public HangHoa() {
        //co dc khoi tao gia tri ten = null ma = null dongia = 0 soluong =0 ;
    }

    public HangHoa(String maHangHoa, String tenHangHoa, double donGia, int soLuong) {
        this.maHangHoa = maHangHoa;
        this.tenHangHoa = tenHangHoa;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public String getMaHangHoa() {
        return maHangHoa;
    }

    public String getTenHangHoa() {
        return tenHangHoa;
    }

    public double getDonGia() {
        return donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setMaHangHoa(String maHangHoa) {
        this.maHangHoa = maHangHoa;
    }

    public void setTenHangHoa(String tenHangHoa) {
        this.tenHangHoa = tenHangHoa;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
     public double thue() {
        if (this.donGia > 500) {
            return this.donGia * 0.1;
        } else if (this.donGia > 300) {
            return this.donGia * 0.05;
        } else {
            return this.donGia * 0.02;
        }
    }
     public void input()
     {
         Scanner s = new Scanner(System.in);
         System.out.println("Nhap so luong");
         this.soLuong = s.nextInt();
         s.nextLine();
         System.out.println("Nhap Ma hang");
         this.maHangHoa = s.nextLine();
         System.out.println("Nhap don gia");
         this.donGia = s.nextDouble();
         System.out.println("Nhap ten hang hoa");
         s.nextLine();
         this.tenHangHoa = s.nextLine();
         //trooi lenh nhap so nhap chu nhap ki tu
     }
    @Override
    public String toString() {
        return "Ma Hang Hoa " + maHangHoa + " \nTen Hang Hoa " + tenHangHoa + " \nDon gia " + donGia + " \nThue " + thue();
    }

}
