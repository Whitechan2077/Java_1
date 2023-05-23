/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author buidu
 */
public class MyLove {
    private int dai;
    private int rong;
    
    public int tinhcv()
    {
        return (dai + rong)/2;
    }
    public int tinhDt()
    {
        return dai * rong;
    }

    public MyLove(int dai, int rong) {
        this.dai = dai;
        this.rong = rong;
    }
    //khởi tạo giá trị cho thuộc tính
    //dau hieu contrucctor ten = ten class
    //khong co kieu trả về 
    //public
    // nếu không tạo contructor thì java sẽ tự tạo một contructor rỗng
    public MyLove() {
    }//gt mac dinh 0 , null
    
    public int getDai() {
        return dai;
    }

    public int getRong() {
        return rong;
    }

    public void setDai(int dai) {
        this.dai = dai;
    }

    public void setRong(int rong) {
        this.rong = rong;
    }

    @Override
    public String toString() {
        return "Chieu dai " + dai +" chieu rong "+rong+" chu vi "+tinhcv()+"dien tich "+tinhDt();
    }
    
}
