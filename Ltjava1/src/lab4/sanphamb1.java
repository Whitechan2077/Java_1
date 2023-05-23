/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

import java.util.Scanner;

/**
 *
 * @author buidu
 */
public class sanphamb1 
{
   private String tenSP;
   private double donGia;
   private double giamGia;
  
   public String setTenSP(String tenSP)
   {
       return tenSP;
   }
   public void getTenSp(String tenSP)
   {
       this.tenSP = tenSP;
   }
   
   public double setDongia(double donGia)
   {
       return donGia;
   }
   public void getDongia(double donGia)
   {
       this.donGia = donGia;
   }
    public double setGiamGia(double giamGia)
    {
        return giamGia;
    }
    public void getGiamgia(double giamGia)
    {
        this.giamGia=giamGia;
    }
   
  /* public sanphamb1(String tenSp,double donGia,double giamGia)
   {
       this.tenSP = tenSp;
       this.donGia = donGia;
       this.giamGia = giamGia;
   }
  
   
   public sanphamb1(String tenSp,double donGia)
   {
       this.tenSP = tenSp;
       this.donGia = donGia;
       this.giamGia = 0;
   }
  */
   
   public void input()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("NHap ten  sp");
        tenSP = s.nextLine();
        donGia = s.nextDouble();
        giamGia = s.nextDouble();
    }
   
   
   public void  ouput()
    {
        System.out.printf("Ten sp %s",tenSP);
        System.out.printf("don gia %f ,giam gia %f, thue %f ",donGia,giamGia,GetthueNhap());
    }
    

   private double GetthueNhap(){
        return donGia *= 0.1;
    }
}
