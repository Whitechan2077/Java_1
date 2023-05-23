/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author buidu
 */
public class QuanLyNguoiYeu {

    //service tao doi tuong uqng ly
    public QuanLyNguoiYeu() {
    }

    ArrayList<MyLove> listLove = new ArrayList();
    ArrayList<MyLove> listLove1 = new ArrayList<>();
    public void inputNguoiYeu() {//nhap nguoi yeu may vao trong ArrayList
        MyLove ml = new MyLove();
        ml.input();
        listLove.add(ml);
    }

    public void output() {
        for (MyLove x : listLove) {
            x.cum();//lấy từng đối tượng MyLove rồi gán cho x và x là một đối tượng có kiểu là MyLove
        }
    }

    public void timTheoTenNY(String tenNY) {
        boolean check = false;
        if (listLove.isEmpty()) {
            System.out.println("Khong co nguoi yeu");
        } else {
            for (MyLove x : listLove) {
                if (x.getHoVaTen().equalsIgnoreCase(tenNY)) {
                    x.cum();
                    check = true;
                    break;
                }
            }//x
            if (check == false) {
                System.out.println("kho tim thay");
            }
        }//dong else
    }//dong class

   
    public void xoaNY(String tenNY) {
        int i=0;
        while(i<listLove.size())
        {
            if(listLove.get(i).getHoVaTen().equalsIgnoreCase(tenNY))
            {
                listLove.remove(i);
            }
            else i++;
        }
//for(i=0;i<listLove.size();)
//        {
//            if(listLove.get(i).getHoVaTen().equalsIgnoreCase(tenNY))
//            {
//                listLove.remove(i);
//            }
//            else i++;
//        }
     }

    public void sapXep() {
        Collections.sort(listLove,(o1, o2) -> o1.getTuoi()-o2.getTuoi());
        Collections.reverse(listLove);
        this.output();
    }
    public void saXepTuoi()
    {
//        Comparator<MyLove> com = new Comparator<MyLove>() {
//            @Override
//            public int compare(MyLove o1, MyLove o2) {
//                if(o1.getTuoi()>o2.getTuoi()) return 1;
//                if(o1.getTuoi() == o2.getTuoi()) return 0;
//                else return -1;
//            }
//        };
//        Collections.sort(listLove,(o1, o2) -> o2.getTuoi()-o1.getTuoi());
    }
    
    public void update(String tenNY)
    {
        boolean check = false;
        for(MyLove x : listLove){
            if (x.getHoVaTen().equalsIgnoreCase(tenNY)) {
                x.input();
                check = true;
                break;
            }
        }
        if (check == true) {
            System.out.println("Ko tim thay");
        }
    }
}
