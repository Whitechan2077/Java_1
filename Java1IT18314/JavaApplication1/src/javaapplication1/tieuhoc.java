/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author buidu
 */
public class tieuhoc {

    public static void main(String[] args) {
        //tap hcn1 goi ham tao k tham so
        MyLove hcn = new MyLove();
        hcn.getDai();
        hcn.getRong();
        hcn.tinhDt();
        hcn.tinhDt();
        hcn.setDai(5);
        hcn.setRong(5);
        System.out.println(hcn.toString());
        MyLove hcn2 = new MyLove(9, 3);
        System.out.println(hcn2.toString());
        int tong = 0;
        int a[] = {1, 9, 11, 2, 3, 4};
        for (int b : a) {
            tong += b;
        }
        System.out.println(tong);
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        int i = Arrays.binarySearch(a, 69);//tim index của 2 trong a
        System.out.println(i);
        Arrays.fill(a, 0);
        System.out.println(Arrays.toString(a));//cum mang = 0;

    }
}   
