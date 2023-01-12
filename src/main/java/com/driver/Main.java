package com.driver;

public class Main {

    public static void main(String[] args) {

        Product p = new Product();
        System.out.print(p.product(4,5)+" "+p.product(3,5,6)+" "+p.product(2.3,4.6));
    }
    public static class Product{
        public  static int product(int x, int y) {
            return x+y;
        }
        public  static int product(int x, int y, int z) {
            return x+y+z;
        }
        public  static double product(double x, double y) {
            return  x+y;
        }
    }


}
