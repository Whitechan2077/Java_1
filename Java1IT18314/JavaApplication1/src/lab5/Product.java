/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

import java.util.Scanner;

/**
 *
 * @author buidu
 */
public class Product {
    private String productName;
    private double price;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public Product() {
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public void input(){
        Scanner s = new Scanner(System.in);
        System.out.println("Insert product name : ");
        this.productName = s.nextLine();
        System.out.println("Insert price : ");
        this.price = s.nextDouble();
    }

    @Override
    public String toString() {
        return "Product name : "+this.productName + " Price: "+this.price;
    }
    
    
}
