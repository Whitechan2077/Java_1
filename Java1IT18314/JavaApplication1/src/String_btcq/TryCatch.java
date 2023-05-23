/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String_btcq;

import java.util.Scanner;

/**
 *
 * @author buidu
 */
public class TryCatch {

    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in);
        int a = 8, b;
        System.out.println("lenh 1");
        b = 0;
        try {
            System.out.println("a/b" + a / b);

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("100 code ");
        System.out.println("nhap lai a");
        try {
               a = s.nextInt();
               System.out.println("Dung");
        } catch (Exception e) {
            System.out.println("Sai");
        }
    }
}
