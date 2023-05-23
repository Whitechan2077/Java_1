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
public class Bai3 {
    public static void main(String[] args) {
        System.out.println("Nhap canh hinh lap phuong");
        double a;
        Scanner s = new Scanner(System.in);
        a = Double.parseDouble(s.nextLine());
        double v = Math.pow(a, 3);
        System.out.printf("the tich %.1f",v);
//        a = s.nextInt();
    }
    }
