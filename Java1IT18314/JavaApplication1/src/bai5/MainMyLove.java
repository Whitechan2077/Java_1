/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai5;

import java.util.Scanner;

/**
 *
 * @author buidu
 */
public class MainMyLove {
    
    public static void main(String[] args) {
        int op;
        Scanner s = new Scanner(System.in);
        QuanLyNguoiYeu ql = new QuanLyNguoiYeu();
        while (true) {
            System.out.println("1.:nhap Mylove");
            System.out.println("2.Out My Love");
            System.out.println("3.tim nguoi yeu");
            System.out.println("4.Xoa ny");
            System.out.println("5.Xap xep ten");
            System.out.println("6.Sap xep tuoi");
            System.out.println("Chon chuc nang");
            op = s.nextInt();
            s.nextLine();
            switch (op) {
                case 1:
                    ql.inputNguoiYeu();
                    break;
                case 2:
                    ql.output();
                    break;
                case 3:
                    String tenNguoiYeu;
                    System.out.println("Nhap ten ny");
                    tenNguoiYeu = s.nextLine();
                    ql.timTheoTenNY(tenNguoiYeu);
                    break;
                    case 4:
                        System.out.println("Nhap ten Ny");
                        tenNguoiYeu = s.nextLine();
                        ql.xoaNY(tenNguoiYeu);
                    break;
                   case 5:
                        System.out.println("xap xep ten");
                        ql.sapXep();
                    break;
                    case 6:
                        ql.saXepTuoi();;
                    break;
                   
                case 0:
                    
                    break;
                default:
                    System.out.println("Ngu vcl co biet doc khong");
            }
            System.out.println("Co mun nhap tiep k y/n");
            if (s.nextLine().equalsIgnoreCase("n")) {
                break;
            } 
        }//dong while
    }//main
}//class
