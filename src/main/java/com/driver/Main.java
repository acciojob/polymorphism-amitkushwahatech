package com.driver;

public class Main {

    public static void main(String[] args) {
        Product p=new Product();
        p.product(5,10);
        p.product(5,10,15);
        p.product(10,5);
    }

  public static  class   Product{
        public int product(int x, int y) {
            System.out.println("Method 1");
            return x+y;
        }
        public int product(int x, int y, int z) {
            System.out.println("Method 2");
            return x+y+z;
        }
        public double product(double x, double y) {
            System.out.println("Method 3");
            return x+y;
        }
    }
}
