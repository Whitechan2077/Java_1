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
public class demoString {

    public static void main(String[] args) {
        System.out.println("Ten cua");
        Scanner s = new Scanner(System.in);
        String fullName = s.nextLine();
        //tach ho dem ten;
        String[] name = fullName.split(" ");
        System.out.println(name[name.length - 1]);
        System.out.println(name[0]);
        for(int i = 2 ; i<name.length-1;i++){
            System.out.println(name[i]);
        }
        //Do dai ho ten;
//        System.out.println("Do dai "+ fullName.length());
//        System.out.println("In hoa "+fullName.toUpperCase());
//        System.out.println("In thuong "+fullName.toLowerCase());
//        String ho = fullName.substring(0, fullName.indexOf(" "));
//        System.out.println("Ho " + ho);
//        String ten = fullName.substring(fullName.lastIndexOf(" ") + 1);
//        System.out.println("Ten " + ten);
//        String dem = fullName.substring(fullName.indexOf(" "),fullName.lastIndexOf(" "));
        System.out.println("Dem "+fullName.indexOf(" "));
        System.out.println("Dem "+fullName.lastIndexOf(" "));
//Bui hoang dung
    }
}
