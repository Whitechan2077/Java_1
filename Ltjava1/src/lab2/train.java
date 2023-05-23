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
public class train {
    public static void main(String[] args) {
        System.out.print("nhap so can kiem tra");
        Scanner s = new Scanner(System.in);
        int i = 2;
        float snt = s.nextFloat();
        boolean check = true;
        while(i<snt){
            if (snt%i==0){
                check=false;
            }
            i++;
        }
        if(check==true){
            System.out.println("la snt");
        }
        else{
            System.out.println("ko la snt");
        }
    }
    
}
