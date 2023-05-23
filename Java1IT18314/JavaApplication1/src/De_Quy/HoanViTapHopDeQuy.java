/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De_Quy;

import java.util.Scanner;

public class HoanViTapHopDeQuy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương n = ");
        int n = sc.nextInt();
        sc.close();

        // Tạo một mảng chứa các số từ 1 đến n
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        // Tính số lần hoán vị của tập hợp từ 1 đến n và in ra từng trường hợp hoán vị
        tinhHoanViTapHop(arr, 0);
    }

    // Đệ quy tính số lần hoán vị của tập hợp từ 1 đến n và in ra từng trường hợp hoán vị
    public static void tinhHoanViTapHop(int[] arr, int index) {
        // Nếu đã xét hết các phần tử trong mảng, in ra trường hợp hoán vị
        if (index == arr.length - 1) {
            inHoanVi(arr);
            return;
        }

        // Đệ quy hoán vị các phần tử còn lại của mảng
        for (int i = index; i < arr.length; i++) {
            // Hoán vị phần tử thứ index với phần tử thứ i
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;

            // Đệ quy hoán vị các phần tử còn lại của mảng
            tinhHoanViTapHop(arr, index + 1);

            // Hoán vị lại phần tử thứ index với phần tử thứ i để tiếp tục đệ quy
            temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }

    // In ra một trường hợp hoán vị của mảng
    public static void inHoanVi(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
