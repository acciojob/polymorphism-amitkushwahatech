package com.driver;

public class Main {

    public static void main(String[] args) {
        Product p=new Product();
        p.product(5,10);
        p.product(5,10,15);
        p.product(10.21,5.2);
    }

  public static  class   Product{
        public int product(int x, int y) {
            System.out.println("Method 1");
            return (x+y);
        }
        public int product(int x, int y, int z) {
            System.out.println("Method 2");
            return (x+y+z);
        }
        public double product(double x, double y) {
            System.out.println("Method 3");
            return (x+y);
        }
    }

  /*  public static void main(String[] args) {
        Product p = new Product();
        System.out.println(p.product(2, 3) + " " + p.product(2, 3, 4) + " " + p.product(2.0, 3.0));
    }


    public static class Product{
        public static int product(int x, int y) {
            return x*y;
        }

        public static int product(int x, int y, int z) {
            return x*y*z;
        }

        public static double product(double x, double y) {
            return x*y;
        }
    }

   */
}
