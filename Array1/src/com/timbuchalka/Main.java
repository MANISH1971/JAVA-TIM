//package com.timbuchalka;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // write your code here
        int[] myintegers = getIntegrs(5);
        for (int i = 0; i < myintegers.length; i++) {
            System.out.println("Elements " + i + ", type value was " + myintegers[i]);
        }
        System.out.println("The average is " + getAverage(myintegers));
        /*
         * Defination of array ----------
         * int [] myvariable;
         * /* -----------------------------
         * 
         * /* first patterm
         * int [] myVariable;
         * myVariable = new int[10]; // it will assing 10 element of array;
         * /* -----------------
         * /* 2nd pattern
         * int [] myVariable = new int[10];
         * ARRAY START WITH [0] (ZERO)
         */
        /*
         * int [] myIntArry = new int[25];
         * int [] myIntArry = {1,2,3,4,5,6,7,8,9,10};
         * myIntArry[0] = 45;
         * myIntArry[1] = 476;
         * myIntArry[5] = 50;
         * double [] myDoubleArray = new double[10];
         * System.out.println(myIntArry[0]);
         * System.out.println(myIntArry[6]);
         * System.out.println(myIntArry[8]);
         * for (int i = 0; i <myIntArry.length; i++) {
         * myIntArry[i] = i *10;
         * }
         * printarray(myIntArry);
         * }
         * public static void printarray(int[] array) {
         * for (int i = 0; i < array.length; i++) {
         * System.out.println("Element "+i+", Value is "+array[i]);
         * }
         */

    }

    public static int[] getIntegrs(int number) {
        System.out.println("Enter " + number + " integers values. \r");
        int[] values = new int[number];
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / (double) array.length;
    }
}
