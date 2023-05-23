/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assigment_dungbgph35753_it18314;

/**
 *
 * @author buidu
 */
public abstract class NhanVien {

    protected String maNhanVien;
    protected String tenNhanVien;
    protected long luong;

    public NhanVien() {
    }

    public NhanVien(String maNhanVien, String tenNhanVien, long luong) {
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.luong = luong;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public long getLuong() {
        return luong;
    }

    public void setLuong(long luong) {
        this.luong = luong;
    }

    public abstract void input();

    public abstract void output();

    public long getThueThuNhap() {
        if (this.luong >= 15000000) {
            return (long) (this.luong * 0.12);
        } else if (this.luong >= 900000) {
            return (long) (this.luong * 0.1);
        } else {
            return 0;
        }
    }
//    public String getName()
//    {
//        String name = getTenNhanVien().;
//        return name;
//        
//    }
    public String getName(){
        String fullName = this.tenNhanVien;
        String[] arr = fullName.split(" ");
        String name = arr[arr.length-1];
        return name;        
    }
    public long tinhLuong() {
        if (this.luong > 15000000) {
            return (long) (this.luong - (this.luong * 0.12));
        } else if (this.luong >= 900000) {
            return (long) (this.luong - (this.luong * 0.1));
        } else {
            return this.luong;
        }
    }
    
}
