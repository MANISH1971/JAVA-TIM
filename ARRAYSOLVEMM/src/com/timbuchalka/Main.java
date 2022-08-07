package com.timbuchalka;

//import java.util.Scanner;
import java.util.*;

public class Main {
    // private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // write your code here
        // int[] myInteger = getInteger(5);
        /*
         * int[] values = new int[20];
         * for (int i = 0; i < values.length || scanner.nextInt() != 0; i++) {
         * values[i] = scanner.nextInt();
         * if (values[i] == 0) {
         * break;
         * }
         * System.out.println("Value Enter= " + values[i]);
         * }
         */
        int[] values = InsertSort();
        String str = Arrays.toString(values);
        System.out.println("Array Values = " + str + "\n");
        // SortArray(values);
        // Sortvalue(values);
        reverseArray(values);
    }

    /*
     * public static int[] getInteger(int numbers) {
     * // System.out.println("Enter "+numbers);
     * int[] values = new int[numbers];
     * int sums = 0;
     * for (int i = 0; i < values.length; i++) {
     * values[i] = scanner.nextInt();
     * System.out.println("values enter= " +values[i]);
     * }
     * return values;
     * }
     */
    public static int[] InsertSort() {
        Scanner scan = new Scanner(System.in);
        int counts;
        System.out.println("Enter the Array Size: ");
        counts = scan.nextInt();
        int num[] = new int[counts];
        System.out.println("Enter Array Value: ");
        for (int i = 0; i < counts; i++) {
            num[i] = scan.nextInt();
        }
        scan.close();
        return num;
    }

    // public static int[] SortArray(int[] values) {
    public static void SortArray(int[] values) {
        int temp;
        // getConsoleView().clear();
        for (int i = 0; i < values.length; i++) {
            for (int j = i + 1; j < values.length; j++) {
                // if (values[i] > values[j]) {
                if (values[i] < values[j]) { // higest to lowest number
                    temp = values[i];
                    System.out.print(temp + " \t\n");
                    values[i] = values[j];
                    System.out.print(values[i] + " \t\n");
                    System.out.print(values[j] + " \t\n");
                    values[j] = temp;
                }
            }
        }
        String str = Arrays.toString(values);
        System.out.println("Array Sort Values = " + str + "\n");
    }

    public static void Sortvalue(int[] arr1) {
        int temp;
        String str = Arrays.toString(arr1);
        System.out.println("Array Sort Values = " + str + "\n");
        for (int i = 0; i < arr1.length; i++) {
            for (int J = i + 1; J < arr1.length; J++) {
                if (arr1[i] > arr1[J]) {
                    temp = arr1[J];
                    arr1[i] = arr1[J];
                    arr1[J] = temp;
                    System.out.println("temp value : " + temp + " Value of J " + J);
                }
                System.out.println(" Value of i " + i);
            }
        }
    }

    public static void reverseArray(int[] values) {
        int j = 0;
        int val = values.length;
        int[] copyarray = new int[val];
        System.out.println("Array Lenght is: " + val);
        String str = Arrays.toString(copyarray);
        System.out.println("copyarray Values = " + str + "\n");
        str = "";
        for (int i = values.length - 1; i >= 0; i--) {
            copyarray[j] = values[i];
            j++;
        }
        System.out.println("copyarray Values Change = " + str + "\n");
        str = Arrays.toString(copyarray);
        System.out.println("copyarray Values Change = " + str + "\n");
    }
}