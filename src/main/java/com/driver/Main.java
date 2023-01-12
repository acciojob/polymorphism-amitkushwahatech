package com.driver;

public class Main {

    public static void main(String[] args) {
        Product p=new Product();
        p.product(5,10);
        p.product(5,10,15);
        p.product(10,5);
    }
}
class Product{
    public int product(int x, int y) {
        return x+y;
    }
    public int product(int x, int y, int z) {
        return x+y+z;
    }
    public double product(double x, double y) {
        return x+y;
    }
}