/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_hinh;

import java.util.ArrayList;
//thu vien arrlist
import java.util.Arrays;
// thu vien arr list
/**
 *
 * @author buidu
 */
public class Test {

    public static void main(String[] args) {
        Toa_Do td1 = new Toa_Do(5, 6);
        Toa_Do td2 = new Toa_Do(5, 7);
        Toa_Do td3 = new Toa_Do(5, 8);

        Hinh h1 = new Hinh_Chu_Nhat(6, 9, td3);
        Hinh h2 = new Hinh_Tron(69, td1);
        System.out.println(h1.tinhDienTich());
        System.out.println(h2.tinhDienTich());
//        ArrayList arr = new ArrayList();
//        arr.add(h2);
//        int arr1[] = new int[5]; 
//        int arr2[] = {1,9,3,4,5};
//        ArrayList arr3 =  new ArrayList();
//        int ditMeMay[] = new int [5];
    }
}
