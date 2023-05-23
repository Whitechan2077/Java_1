/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2;

import java.util.Scanner;

/**
 *
 * @author buidu
 */
public class menu {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int op;
        do {
            System.out.println("---------Menu---------");
            System.out.println("1.sqrt random");
            System.out.println("2.snt0");
            System.out.println("3.mang si so");
            System.out.println("4.exit");
            System.out.println("Chon chuc nang");
            op = s.nextInt();
            switch (op) {
                case 1:
                    cn1.chucNang1();
                    break;
                case 2:
                    cn2.cn2();
                    break;
                case 3:
                    cn3.chucNang3();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("sai");
            }
        } while (op != 4);//dong
    }
}
