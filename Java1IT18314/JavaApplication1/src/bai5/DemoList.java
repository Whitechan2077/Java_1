/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author buidu
 */
public class DemoList {

    public static void main(String[] args) {
        int a[] = new int [100];//index 0 - 9
        ArrayList arr = new ArrayList();
        //tao mot danh sach khong co kieu;
//        a[101] = 10; // khong dung kieu du lieu;
        arr.add("lmao");
        arr.add(69);
        arr.add("dvls");
        arr.add(false);
        arr.add("lalala");
        System.out.println(arr.toString());
        
        ArrayList<String> ten = new ArrayList();
        ten.add("10");
        ten.add(1, "Trang");
        ten.add("nguoi yeu");
        ten.remove(1);// xoa tai vi tri index;
        System.out.println(ten.size());
        ten.set(0, "bu lon");
        System.out.println(ten.toString());
        MyLove ml = new MyLove();
        ml.input();
        ml.cum();
    }
}
