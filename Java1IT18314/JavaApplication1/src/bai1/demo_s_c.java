/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author buidu
 */
public class demo_s_c {

    public static void main(String[] args) {
        int op;
        int a, b;
        Scanner s = new Scanner(System.in);
        System.out.println("Moi nhap a,b :");
        a = s.nextInt();
        System.out.println("Moi nnhap b :");
        b = s.nextInt();
        while (true) {
            System.out.println("------Menu--------");
            System.out.println("1.Cong");
            System.out.println("2.tru");
            System.out.println("3.nhan");
            System.out.println("4.chia");
            System.out.println("5.chia du");
            System.out.println("------------------");
            System.out.println("Moi chon menu");
            op = s.nextInt();
            switch (op) {
                case 1: {
                    System.out.println("tong :" + (a + b));
                    break;
                }
                case 2: {
                    System.out.println("hieu :" + (a - b));
                    break;
                }
                case 3: {
                    System.out.println("TICH :" + (a * b));
                    break;
                }
                case 4: {
                    if (true) {
                        
                    }
                    System.out.println("TICH :" + (a / b));
                    break;
                }
                case 5: {
                    System.out.println("TICH :" + (a % b));
                    break;
                }
                default:
                    throw new AssertionError();
            }
            
        }//dong 
    }
}
