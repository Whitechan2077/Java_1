/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2;

import java.util.Scanner;

/**
 *
 * @author buidu
 */
public class cn2 {
    public static void cn2() {
        Scanner s = new Scanner(System.in);
        boolean checkSnt = true;
        int tong = 0;
        System.out.println("nhap so n");
        int snt = s.nextInt();
        
        if (snt == 1) {
            checkSnt = false;
        }
        else
        {
            for (int i = 2; i < Math.sqrt(snt) ; i++) {
                if(snt % i == 0 ) checkSnt = false;
            }
        }
        if (checkSnt == true) {
            System.out.println("la snt");
        }
        else
        {
            System.out.println("ko la snt");
        }
        for (int j = 1; j <= snt; j++) {
            tong += j;
        }
        System.out.println("Tong"+tong);
    }
}
