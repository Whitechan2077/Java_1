/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author buidu
 */
public class bai1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Float> a = new ArrayList<>();
        int yes = 1 ;
       do{
            float b  = s.nextFloat();
            a.add(b);
            System.out.println("1 nhap them ? 2 ket thuc");
            yes = s.nextInt();
            
       } while(yes == 1);
      
    }
}
