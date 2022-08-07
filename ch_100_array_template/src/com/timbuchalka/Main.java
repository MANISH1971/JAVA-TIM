package ch_100_array_template.src.com.timbuchalka;

import java.util.*;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // INTEGER SORTING ARRAY
        /*
         * Creating a program using array that sort the list of integer in descending
         * order.
         * Descending order is highest value to lowest.
         * In other words if the array had the values in it 106,26,81,5,15 your program
         * should
         * ultimately having a array with 106,81,26,15,5 in it
         * Set up the program so that the numbers to sort are read in from the keyboard.
         * Implement the following methods - getIntegers, printArray, and sortInegers
         * getIntegrs returns an array of entered integers from keyboard
         * printArray prints out the contents of the array.
         * and sortIntegrs should sort the array and retrun a new array containing the
         * sorted numbers
         * you will have to figure out how to copy the array elements from the passed
         * array into a new
         * array and sort them and return the new sorted array.
         */
        // System.out.println("Hellow");
        int[] myIntegers = getIntegers(5);
        int[] sorted = sortIntegrs(myIntegers);
        printArray(sorted);
    }

    public static int[] getIntegers(int capacity) {
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + "Integer valurs \r");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegrs(int[] array) {
        /*
         * int[] sortedArray = new int[array.length];
         * for (int i = 0; i < array.length; i++) {
         * sortedArray[i] = array[i];
         * }
         */
        // ALTERNATIVE METHOD
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            // element 0 = 50
            // element 1 = 160
            // element 2 = 40
            // element 3 =
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

}
