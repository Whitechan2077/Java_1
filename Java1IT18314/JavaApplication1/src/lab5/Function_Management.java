package lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Function_Management {

    ArrayList<Product> listProduct = new ArrayList<Product>();


    public void input() {
        Product pd = new Product();
        pd.input();
        listProduct.add(pd);
    }
    public void output(){
        for(Product x : listProduct){
            System.out.println(x.toString());
        }
    }
    public void sortList() {
        Comparator<Product> pro = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() > o2.getPrice()) {
                    return 1;
                }
                if (o1.getPrice() == o2.getPrice()) {
                    return 0;
                } else {
                    return -1;
                }
            }
        };
        Collections.sort(listProduct, pro);
    }

    public void sortName() {
        Comparator<Product> pro1 = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (o1.getProductName().compareToIgnoreCase(o2.getProductName()));
            }
        };
        Collections.sort(listProduct, pro1);
    }

    public void averageAllPrice() {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < listProduct.size(); i++) {
            sum += listProduct.get(i).getPrice();
            count++;
        }
        System.out.println("Average all product price: "+sum/count);
    }
}
