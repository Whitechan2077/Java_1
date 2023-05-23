/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

import java.util.Scanner;

/**
 *
 * @author buidu
 */
public class Bai1 {
    public static void Giaipt1(){
        System.out.println("Nhap a b");//ax=b=0
        Scanner s = new Scanner(System.in);
        int a = Integer.parseInt(s.nextLine());
        int b = Integer.parseInt(s.nextLine());
        
        if(a==0){
            if (b==0) {
                System.out.println("vo so nghiem");
                        }
            else{
                System.out.println("vo nghiem");
            }
        }
        else{
            System.out.printf("nghiem cua phuong trinh %.1f", (float)-b/a);
        } 
        System.out.println("");
        System.err.println("");
        }
public static void main(String[] args){
 Giaipt1();
}
}