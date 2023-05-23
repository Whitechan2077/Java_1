/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlysach;

import java.util.Scanner;

/**
 *
 * @author buidu
 */
public class main {
    public static void main(String[] args) {
         ngay ngay1 = new ngay(1, 12, 2004);
         tacgia tg1 = new tacgia("Lmao", ngay1);
         sach sach1 = new sach("Bi kip tinh duc", 69000, 2069, tg1);
         
         ngay ngay2 = new ngay(12, 12, 2069);
         tacgia tg2 = new tacgia("Buoi Hoang Dung", ngay2);
         sach sach2 = new sach("Bi kip dinh duc 2", 690000, 2060, tg2);
         sach1.OUT();
         sach2.OUT();

    }
}
