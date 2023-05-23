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
public class BieuThucChinhQuy {
    public static void main(String[] args) {
        //[0-9] lay du lieu 0 - 9;
        //[0-9] + lap lai nhieu lan
//        [\\w] lay du lieu ca so lan  chu
//        [\\w] + lay du lieu ca so lan  chu lap nhieu lan
//          String fullName; //chi chua a - z A -z + " "
//          int tuoi; //kieu int;
          String email ;// ca chu ca so + @
          Scanner s = new Scanner(System.in);
//          System.out.println("Nhap ho ten ");
//          fullName = s.nextLine();
          //check ho ten
//          String p_ten = "[a-zA-Z ]+";//bieu thuc chinh quy
//          if (fullName.matches(p_ten)) {
//            //khop du lieu
//              System.out.println("Ho ten "+fullName);
//        }
//          else System.out.println("Ko chuan ho ten");
//          try {
//            tuoi = Integer.parseInt(s.nextLine());
//        } catch (Exception e) {
//              System.out.println("Nhap sai");
//        }
//        String std;
//        String p_SDT = "0+[0-9]{9}";
//        System.out.println("Nhap sdt ");
//        std = s.nextLine();
//        if (std.matches(p_SDT)) {
//            System.out.println("std chuan");
//        }else SystDungem.out.println("sai sdt");
        String p_email = "^[\\w]+(?:\\.[\\w])*@(?:gmail|GoogleMail)\\.(?:com|edu|net|org|gov|mil|biz|info|co\\.uk|in)$"; 
        //dungbhph35753
        email =s.nextLine();
        if (email.matches(p_email)) {
            System.out.println("mail chuan");
        }else System.out.println("mai k chuan");
            String sdt = "23123dsfds";
            String regex = ".{1,10}"; //ký tự số ký tự đặc biệt {} trong khoảng 
            System.out.println(sdt.matches(regex));
            //{} khoang
            //{} 1 lan
            // ? chi dược có một kí tự
    }
}
