/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlybopjhim;

/**
 *
 * @author buidu
 */
public class main {
    public static void main(String[] args) {
        ngay d1 = new ngay(20, 11, 1969);
        hangsanxuat h1 =new hangsanxuat("hangs", "USA");
        phim p1 =new phim("JAV", 2069, d1, 690000);
        
        ngay d2 = new ngay(1, 1, 2004);
        hangsanxuat h2 = new hangsanxuat("Hang E","jp");
        phim p2 = new phim("CRON", 2096, d2, 69000);
        
        System.out.println( p1.ktNam(p2));
        if (p1.ktNam(p2)==true) 
        {
            System.out.println("phim1 < phim 2");  
        }
        else System.out.println("Phim 1 > phim 2");
        
        }
    }
