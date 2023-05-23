/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlysach;

/**
 *
 * @author buidu
 */
public class sach {
    private String tenSach;
    private double giaBan;
    private int namXuatban;
    private tacgia tacGia;

    public sach(String tenSach, double giaBan, int namXuatban, tacgia tacGia) {
        this.tenSach = tenSach;
        this.giaBan = giaBan;
        this.namXuatban = namXuatban;
        this.tacGia = tacGia;
    }

    public String getTenSach() {
        return tenSach;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public int getNamXuatban() {
        return namXuatban;
    }

    public tacgia getTacGia() {
        return tacGia;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public void setNamXuatban(int namXuatban) {
        this.namXuatban = namXuatban;
    }

    public void setTacGia(tacgia tacGia) {
        this.tacGia = tacGia;
    }

    @Override
    public String toString() {
        return "tenSach=" + tenSach + ", giaBan=" + giaBan + ", namXuatban=" + namXuatban + ", tacGia=" + tacGia ;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final sach other = (sach) obj;
        return this.namXuatban == other.namXuatban;
    }
    public void OUT()
    {
        System.out.println(this.tenSach);
    }
}
