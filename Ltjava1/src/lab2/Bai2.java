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
public class Bai2 {
    public static void giaipt2(){
                System.out.println("giai phuong trinh bac 2");
        System.out.println("nhap luong a b c");
        Scanner s = new Scanner(System.in);
        int a = Integer.parseInt(s.nextLine());
        int b = Integer.parseInt(s.nextLine());
        int c = Integer.parseInt(s.nextLine());
        
        if (a==0) {
            if (b==0) {
                if (c==0) {
                    System.out.println("phuong trinh vo so nghiem");
                    System.out.println("");
                    }
                else{  
                    System.out.println("phuong trinh vo nghiem");
                    System.out.println("");
                }
                  }
        else{
                System.out.printf("phuong trinh co nghiem x= %.1f",(float)-c/b);
                System.out.println("");
        }
        
      }
        else{
            double delta=b*b-4*a*c;
            if (delta<0){
                System.out.print("phuong trinh vo nghiem");
                System.err.println("");
            }
            else if(delta==0){
                System.out.printf("Phuong trinh co nghiem duy nhat x= %.1f",(float)(-b/2*a));
                System.out.println("");
            }
            else {
                double candelta = Math.sqrt(delta);
                double x1=(-b+candelta)/2*a;
                double x2=(-b-candelta)/2*a;
                System.out.printf("x1= %.1f,x2=%.1f",x1,x2);
                System.out.println("");
            }
           
            }
    }
    public static void main(String[] args) {
    giaipt2();
}
}
