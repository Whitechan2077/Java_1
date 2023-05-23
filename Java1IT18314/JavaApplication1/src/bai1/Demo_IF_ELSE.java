package bai1;

import java.util.Scanner;

public class Demo_IF_ELSE {

    public static void main(String[] args) {
        int age;
        Scanner s = new Scanner(System.in);
        System.out.println("In thong tin");
        System.out.println("Nhap tuoi cua ban");
        age = s.nextInt();
        System.out.printf("Tuoi : %d \n", age);
        if (age > 40) {
            System.out.println("Pilot");
        } else if (age > 25) {
            System.out.println("Nuoi dc di hoc");
        } else if (age >= 18) {
            System.out.println("tan gioi");
        } else if (age <= 18) {
            System.out.println("di tu");
        }
    }
}
