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
public class Bai3 {
    public static void tinhtien(){
           System.out.println("tinh tien dien theo thang");
        Scanner s = new Scanner(System.in);
        float sodien = Float.parseFloat(s.nextLine());
        float tien=0;
        if(sodien<50){
           tien= sodien*1000;
            }
        else{
           tien=50*1000+(sodien-50)*1200;
        }
        System.out.println("");
        System.out.printf("tien dien la %.1f",tien);
        System.out.println("");
    }
    public static void main(String[] args) {
        tinhtien();
     }
}
