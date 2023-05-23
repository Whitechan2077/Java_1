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
public class bai2 {
    public static void main(String[] args) {
        System.out.println("Nhap Chieu dai");
        double dai,rong;
        Scanner s = new Scanner(System.in);
        dai = Double.parseDouble(s.nextLine());
        System.out.println("Nhap chieu rong");
        rong = Double.parseDouble(s.nextLine());
        System.out.println("Dien tich");
        double cv = dai*rong;
        System.out.println("Chu vi");
        double dt = (dai+rong)*2;
        System.out.printf("dien tich %.1f",cv);
         System.out.printf("chu vi la %.1f",dt);
    }
}
