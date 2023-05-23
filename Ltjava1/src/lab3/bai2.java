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
public class bai2 {
    public static void main(String[] args) {
        
        System.out.println("Nhap so can kiem tra"); 
        Scanner s = new Scanner(System.in);
        int a = Integer.parseInt(s.nextLine());
        boolean isSNT = true;
        for( int i=2;i<a;i++){
            if (a%i==0){
               isSNT=false;
            }
            i++;
        }
        if(isSNT==true){
            System.out.println("la SNT");
        }
        else{
            System.out.println("ko la SNT");
        }
        
     }
    }

