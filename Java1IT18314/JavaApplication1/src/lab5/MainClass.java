/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

import java.util.Scanner;

/**
 *
 * @author buidu
 */
public class MainClass {

    public static void main(String[] args) {
        Function_Management fm = new Function_Management();
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("=============Product Menu=============");
            System.out.println("1.Insert Product ");
            System.out.println("2.Print All Product List");
            System.out.println("3.Sort By Product Price");
            System.out.println("4.Average All Product Price");
            System.out.println("0.Exit");
            int op;
            op = Integer.parseInt(s.nextLine());
            switch (op) {
                case 1:
                    fm.input();
                    break;
                case 2:
                    fm.output();
                    break;
                case 3:
                    fm.sortList();
                    break;
                case 4:
                    fm.averageAllPrice();
                    break;
                default:
                    System.out.println("Wrong !!!");
            }
            System.out.println("Do You Want To Choose More ?");
            if (s.nextLine().equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
