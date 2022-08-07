package com.timbuchalka;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int count=0;
        int sum = 0;
        long avg = 0;

        while (true) {
            boolean IsAnInt = scanner.hasNextInt();
            if (IsAnInt) {
                int number = scanner.nextInt();
                sum += number;
                count++;

            } else {
                break;
            }
        }
        scanner.close();
        if(count!= 0) avg = Math.round((double)sum/count);
        System.out.println(count);
        System.out.print("SUM = "+sum+" AVG = "+avg);// print does not go to new line; println goes to new line
    }
}
