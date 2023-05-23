/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author buidu
 */
public class NewClass {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[] = new int[200];
        //toi da 200 lop
        int n;
        System.out.println("Nhap so luong lop");
        n = s.nextInt();
        while (n <= 0) {
            System.out.println("Nhap so lai luong lop");
            n = s.nextInt();
        }// w n>0;
        for (int i = 0; i < n; i++) {
            System.out.println("Sy so[" + i + "]");
            arr[i] = s.nextInt();
            while (arr[i] <= 0 || arr[i] > 40)//si so >0 va sy so <=40
            {
                System.out.println("Sy so[" + i + "]");
                arr[i] = s.nextInt();
            }//dong while
        }//end for3
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ;",arr[i]);
        }
        System.out.println("mang theo jav"+Arrays.toString(arr));
    }//main
}//class
