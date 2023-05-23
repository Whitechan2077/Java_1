/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai5;

import java.util.Scanner;

/**
 *
 * @author buidu
 */
public class MyLove {

    private String hoVaTen;
    private int tuoi;
    private int canNang;

    public MyLove() {
    }

    public MyLove(String hoVaTen, int tuoi, int canNang) {
        this.hoVaTen = hoVaTen;
        this.tuoi = tuoi;
        this.canNang = canNang;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getCanNang() {
        return canNang;
    }

    public void setCanNang(int canNang) {
        this.canNang = canNang;
    }

    public void input() {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap ten");
        this.hoVaTen = s.nextLine();
        System.out.println("Nhap tuoi");
        this.tuoi = s.nextInt();
        System.out.println("Nhap can nang");
        this.canNang = s.nextInt();
    }

    public void cum() {
        System.out.println("\nten " + this.hoVaTen + " Tuoi " + tuoi + " Can nang " + canNang+" Phan loai "+phanLoai());
    }

    public String phanLoai() {
        if (canNang > 80) {
            return "Me May beo";
        } else if (canNang > 60) {
            return "Tap Gym";
        } else if (canNang > 50) {
            return "Chuan dep";
        } else {
            return "may an het roi";
        }
    }

    boolean equalsIgnoreCase(String tenNY) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
