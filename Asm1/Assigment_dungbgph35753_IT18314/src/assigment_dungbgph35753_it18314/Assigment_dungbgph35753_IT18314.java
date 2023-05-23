/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assigment_dungbgph35753_it18314;

import java.util.Scanner;

/**
 *
 * @author buidu
 */
public class Assigment_dungbgph35753_IT18314 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int op;
        Quanly ql = new Quanly();
        while (true) {
            System.out.println("=======MENU=======");
            System.out.println("1.Nhap nhan vien");
            System.out.println("2.Xuat nhan vien");
            System.out.println("3.Tim Nhan vien");
            System.out.println("4.Xoa Nhan vien");
            System.out.println("5.Cap nhat thong tin");
            System.out.println("6.Tim nhan vien theo luong");
            System.out.println("7.Xap xep theo ten NV");
            System.out.println("8.Xap xep theo luong NV");
            System.out.println("9.Xuat 5 nhan vien luong cao nhat");
            System.out.println("0.Ko chon nua");
            System.out.println("===================");
            System.out.println("Chon di");
            op = s.nextInt();
            s.nextLine();
            switch (op) {
                case 1:
                    ql.nhapNhanVien();
                    break;
                case 2:
                    ql.xuat();
                    break;
                case 3: {
                    String maNV;
                    System.out.println("Nhap ma nhan vien");
                    maNV = s.nextLine();
                    ql.timKiem(maNV);
                    break;
                }
                case 4: {
                    String maNV;
                    System.out.println("Nhap ma nhan vien");
                    maNV = s.nextLine();
                    ql.xoaNhanVien(maNV);
                    break;
                }
                case 5: {
                    String maNV;
                    System.out.println("Nhap ma nhan vien");
                    maNV = s.nextLine();
                    ql.capNhatTheoMa(maNV);
                    break;
                }
                case 6:
                    System.out.println("======Tim kiem theo khoan luong=====");
                    long n1,n2;
                    do {
                        System.out.println("Nhap Khoang luong");
                        System.out.println("Nhap khoang dau");
                        n1 = s.nextLong();
                        System.out.println("Nhap khoang cuoi");
                        n2 = s.nextLong();
                    } while (n1 > n2);
                    ql.timTheoLuong(n1, n2);
                    break;
                case 7:
                    ql.xapXep();
                    System.out.println("Da xap xep");
                    break;
                case 8:
                    ql.xepXepTheoThuNhap();
                    System.out.println("Da xap xep");
                    break;
                case 9:
                    System.out.println("========Top 5 Nhan vien thu nhap cao=======");
                    ql.xuatNamNhanVienThuNHapCao();
                    System.out.println("===========================================");
                    break;
                case 0:

                    break;
                default:
                    System.out.println("Mu chu a` ?");
            }
            System.out.println("Co mmuon chon tiep khong");
            if (s.nextLine().equalsIgnoreCase("n")) {
                break;
            }
        }//end while
    }
}
