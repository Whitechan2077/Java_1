/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab1;

import java.util.Scanner;

/**
 *
 * @author buidu
 */
public class bai1 {
    public static void main(String[] args) {
       System.out.println("ten");
       String hoten;
        Scanner s = new Scanner(System.in);
        hoten = s.nextLine();
        System.out.println("Diem");
        double diem;
        diem = Double.parseDouble(s.nextLine());
        System.out.printf("Ten may la: %s, Diem may la %.1f",hoten,diem);
    }
  
    
}
