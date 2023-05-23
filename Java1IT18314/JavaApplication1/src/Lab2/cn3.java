/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author buidu
 */
public class cn3 {

    public static void chucNang3() {
        Scanner s = new Scanner(System.in);
        System.out.println("nhap n");
        int n = s.nextInt();
        int max = 0;
        int vt1 = 0;
        int vt = 0;
        int d = 0;
        int arr[] = new int[n];
        boolean check = true;
        for (int i = 0; i < n; i++) {
            do{
            arr[i] = s.nextInt();
            }while(arr[i]<40);
        }
        for (int j = 0; j < n; j++) {
            if (arr[j] > max) {
                max = arr[j];
            }
        }
        int min = arr[0];
        for (int j = 1; j < n; j++) {
            if (arr[j] < min) {
                min = arr[j];
            }
        }

        //2/4/2/4/2/4
        for (int i = 0; i < n; i++) {
            if (arr[i] == max) {
                //vt = i;\
                System.out.print("\t" + i);
            } else if (arr[i] == min) {
                System.out.print("\t " + i);
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 20 && arr[i] <= 30) {
                d++;
            }
        }
        if (check == true) {
            System.out.println(Arrays.toString(arr));
            System.out.println("max: " + max + "min :" + min);
            System.out.println("vt max " + vt + " vt min " + vt1);
            System.out.println("so lop co hs 20 - 30: " + d);
        }
    }
}
