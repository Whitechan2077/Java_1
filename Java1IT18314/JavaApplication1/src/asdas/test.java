package asdas;

import java.util.Scanner;


class Student{
    private String name;
    private String ID;

    public Student(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }

    public Student() {
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    
    public void input(){
        Scanner s = new Scanner(System.in);
        this.ID = s.nextLine();
        this.name = s.nextLine();
    }
    
}
class IT_Student extends Student{
    private double diemJava;

    public IT_Student(String name, String ID) {
        super(name, ID);
    }

    public IT_Student() {
    }
    
    public IT_Student(double diemJava, String name, String ID) {
        super(name, ID);
        this.diemJava = diemJava;
    }

    public double getDiemJava() {
        return diemJava;
    }

    public void setDiemJav(double diemJava) {
        this.diemJava = diemJava;
    }

    @Override
    public void input() {
        super.input();
        Scanner s = new Scanner(System.in);
        diemJava = s.nextDouble();
    }
    

    @Override
    public String toString() {
        return "Ten " + super.getName()+" ID : "+super.getID()+" Diem : "+diemJava;
    }   
}
class test {
    public static void main(String[] args) {
        IT_Student sit = new IT_Student(69, "dung","ph35753");
        System.out.println(sit);
        System.out.println(sit.getName());
        IT_Student st2 = new IT_Student(69,"NGu","ococococococ");
        System.out.println(st2.toString());
        IT_Student st3 = new IT_Student();
        st3.input();
        System.out.println(st3.toString());
    }
}
