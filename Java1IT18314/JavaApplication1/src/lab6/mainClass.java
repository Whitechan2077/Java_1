/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author buidu
 */
public class mainClass {

    public static void main(String[] args) {
        ArrayList<SanPham> listProduct = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        int op;
        do {
            System.out.println("1.nhap sp");
            System.out.println("2.so sanh vs nokia");
            System.out.println("0.thoat");
            op = s.nextInt();
            switch (op) {
                case 1:
                    SanPham pro = new SanPham();
                    pro.nhap();
                    listProduct.add(pro);
                    break;
                case 2:
                    for(SanPham x : listProduct){
                        if (x.getHang().equalsIgnoreCase("nokia")) {
                            x.xuat();
                        }
                    }
                    break;
                default:
                    System.out.println(":)))))");
            }

        } while (op!=0);
    }
}
