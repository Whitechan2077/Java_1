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
public class bai4 {
    public static void main(String[] args) {
        System.out.println("nhap a,b,c");
        double a,b,c;
        Scanner s = new Scanner(System.in);
        a = Double.parseDouble(s.nextLine());
        b = Double.parseDouble(s.nextLine());
        c = Double.parseDouble(s.nextLine());
        double delta = Math.pow(b,2)-4*a*c;
        double candelta = Math.sqrt(delta);
        System.out.printf("delta: %.1f , Can delta %.1f",delta,candelta);
    }
    
}
