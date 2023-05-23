 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

import java.util.Scanner;

/**
 *
 * @author buidu
 */
public class bai1 {
    public static void main(String[] args) {
        System.out.println("Nhap so a");
        Scanner s = new Scanner(System.in);
        int a = Integer.parseInt(s.nextLine());
        for(int i =1;i<=10;i++){
            System.out.printf("%d*%d=%d\n",a,i,a*i);
        }
        
    }
    
}
