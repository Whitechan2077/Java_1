/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2;

import java.util.Random;

/**
 *
 * @author buidu
 */
public class cn1 {
  public static void chucNang1(){
      Random r = new Random();
    int low = 2;
    int hight = 20;
    
    int result = r.nextInt(hight - low);
    double canBac = Math.sqrt(result);
    System.out.println(canBac);
}
}
