/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.util.Scanner;

/**
 *
 * @author buidu
 */
public class Demo_2B2 {

public static void main(String[] args) {
        int soLuong;//hinh lac da
        //nhap n so nguyen duong >0
        //tim max min cua cac so vua nhap
        //tinh tb cac so le
        int n;
        int max = 0; int min = 0;
        int tongLe=0, demLe=0;
        int number;
        Scanner scan= new Scanner(System.in);
        System.out.println("moi nhap so luong so nguyen n: ");
        n=scan.nextInt();
        while(n<=0){
            System.out.println("moi nhap lai so luong so nguyen n: ");
        n=scan.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println("moi nhap so nguyen number: ");
            number=scan.nextInt();
            while(number<=0){
                System.out.println("moi nhap lai so nguyen number: ");
            number=scan.nextInt();
            }//dong number
            if (i==0) {
                min = number;
            }
            if(number%2==1){
                tongLe+=tongLe+number;
                demLe++;
            }
            if (number>max) {
                max = number;
            }
            if (number<min) {
                min = number;
            }
            
        }//for
        System.out.println("tble: "+(float)tongLe/demLe);
        System.out.println("max "+max);
        System.out.println("min "+min);
    }
}
