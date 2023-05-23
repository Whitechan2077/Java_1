/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4;

/**
 *
 * @author buidu
 */
public class MainClass {
    public static void main(String[] args) {
        HangHoa h1 = new HangHoa();
        HangHoa h2 = new HangHoa("HH001","Dien Thoai", 400, 1);
//        System.out.println(h2.toString());
        HangHoa h3 = new HangHoa();
        h3.input();
        System.out.println(h3.toString());
    }
}
