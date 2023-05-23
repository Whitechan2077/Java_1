package assigment_dungbgph35753_it18314;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

public class Quanly {

    public Quanly() {
    }

    Scanner s = new Scanner(System.in);
    int op;
    ArrayList<NhanVien> listNV = new ArrayList<>();

    public void nhapNhanVien() {
        while (true) {
            System.out.println("=========================");
            System.out.println("1.nhap nhan vien");
            System.out.println("2.nhap truong phong");
            System.out.println("3.nhap nhan vien tiep thi");
            System.out.println("0.Khong chon nua");
            System.out.println("=========================");
            System.out.println("chon di");
            op = s.nextInt();
            s.nextLine();
            switch (op) {
                case 1:
                    NhanVien nv = new NhanVienThuong();

                    nv.input();
                    listNV.add(nv);
                    break;

                case 2:
                    NhanVien tp = new TruongPhong();

                    tp.input();
                    listNV.add(tp);
                    break;
                case 3:
                    NhanVien nvtt = new NhanVienTiepThi();

                    nvtt.input();
                    listNV.add(nvtt);
                    break;
                case 0:

                    break;
                default:
                    System.out.println("Co biet doc khong ?");
            }
            System.out.println("Muon nhap nhan vien nua khong em n de thoat?");
            if (s.nextLine().equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    public void xuat() {
        if (listNV.isEmpty()) {
            System.out.println("ko co ai dau em");
        } else {
            for (NhanVien x : listNV) {
                x.output();
            }
        }
    }

    public void timKiem(String maNV) {
        boolean check = false;
        for (NhanVien x : listNV) {
            if (maNV.equalsIgnoreCase(x.getMaNhanVien())) {
                System.out.println("tim thay");
                x.output();
                check = true;
                break;
            }
        }
        if (check == false) {
            System.out.println("Ko co dau em");
        }
    }

    public void xoaNhanVien(String maNV) {
        boolean check = false;
        for (NhanVien x : listNV) {
            if (maNV.equalsIgnoreCase(x.getMaNhanVien())) {
                System.out.println("tim thay da xoa nhan vien :");
                x.output();
                listNV.remove(x);
                check = true;
                break;
            }
        }
        if (check == false) {
            System.out.println("Khong co dau em");
        }
    }

    public void capNhatTheoMa(String maNV) {
        boolean check = false;
        for (NhanVien x : listNV) {
            if (maNV.equalsIgnoreCase(x.maNhanVien)) {
                x.input();
                check = true;
            }
        }
        if (check == false) {
            System.out.println("Ko tim thay");
        }
    }

    public void timTheoLuong(long n1 ,long n2) {
        boolean check = false;
        for (NhanVien x : listNV) {
            if (x.tinhLuong() >= n1 && x.tinhLuong() <= n2) {
                x.output();
                check = true;
            }
        }
        if (check == false) {
            System.out.println("ko tim thay");
        }
    }/// luong theo thu nhap

    public void xapXep() {
        Collections.sort(listNV, (o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()));
    }

    public void xepXepTheoThuNhap() {
        Comparator<NhanVien> comp = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                if (o1.tinhLuong()>o2.tinhLuong()) {
                    return 1;
                }
                if (o1.tinhLuong() == o2.tinhLuong()) {
                    return 0;
                }
                else return -1;
            }
        };
        Collections.sort(listNV, comp);
    }

    public void xuatNamNhanVienThuNHapCao() {
        Comparator<NhanVien> comp = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                if (o1.tinhLuong()>o2.tinhLuong()) {
                    return -1;
                }
                if (o1.tinhLuong() == o1.tinhLuong()) {
                    return 0;
                }
                else return 1;
            }
        };
        Collections.sort(listNV, comp);
        for(int i = 0 ; i<5;i++){
            listNV.get(i).output();
        }
    }
}
