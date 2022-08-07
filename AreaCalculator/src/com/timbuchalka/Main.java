package AreaCalculator.src.com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // area(5.0);
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5, 4));
        System.out.println(area(-1, 4));
    }
    // AREA CALCULATOR

    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        }
        return Math.PI * (radius * radius);
    }

    public static double area(double x, double y) {
        if ((x < 0) || (y < 0)) {
            return -1.0;
        } else {
            return x * y;
        }
    }
}