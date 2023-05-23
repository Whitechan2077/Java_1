/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String_btcq;

/**
 *
 * @author buidu
 */
public class test {
    public static void main(String[] args) {
        String name = "Bui Hoang Dung";
        String[] arr = name.split(" ");
        System.out.println(arr[0].toUpperCase());
        System.out.println(arr[arr.length-1].toUpperCase());
//        for(String X : arr){
//            System.out.println(X);
//        }
    }
}
