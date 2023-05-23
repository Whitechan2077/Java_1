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
public class Bai4 {   
    public static void menu(){
        System.out.println("");
        System.out.println("  Moi ban chon chuc nang");
        System.out.println("-----------------------------");
        System.out.println("1.Giai phuong trinh bac nhat");
        System.out.println("2. Giai phuong trinh bac hai");
        System.out.println("3. Giai phuong trinh bac ba");
        System.out.println("4. Thoat chuong trinh");
        System.out.println("-----------------------------");
        
        Scanner s = new Scanner(System.in);
        int op = Integer.parseInt(s.nextLine());
        
        switch (op) {
            case 1:
                Bai1.Giaipt1();
                menu();//chay lai menu
                break;
            case 2:
                Bai2.giaipt2();//goi bai2
                menu();//chay lai menu
                break;
            case 3:
                Bai3.tinhtien();//goi bai 3
                menu();//chay lai menu
                break;
            case 4:
                System.exit(0);//thoat ct
            default:
                System.out.println("Khong co chuc nang tren");//nhap so sai
        }
}  
    public static void main(String[] args) {
        menu();
    }
}

