package com.timbuchalka;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

/* FIRST SOLUTION
        int min=0;
        int max=0;
*/

/*      SECOND SOLUTION
        int min=2147483647;
        int max=-2147483648;*/

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

//        boolean first = true; // boolean to make vlidate
        while (true) {
            System.out.println("Enter number:");
            boolean IsAnInt = scanner.hasNextInt();
            if (IsAnInt) {
                int number = scanner.nextInt();
/*                if (first) {
                    first=false;
                    min=number;
                    max=number;
                }*/
                if (number > max) {
                    max=number;
                }
                if (number < min) {
                    min=number;
                }
            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("min= "+min+", Max= "+max);
        scanner.close();
    }
}