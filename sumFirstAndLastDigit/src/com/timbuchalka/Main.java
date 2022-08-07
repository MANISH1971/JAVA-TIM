package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(sumFirstAndLastDigit(123));
    }

    public static int sumFirstAndLastDigit(int number){
        if (number <0){
            System.out.println("Invalid Value");
            return -1;
        }
        int FirstDigit =0;
        int LastDigit = 0;
        LastDigit = number %10;
        while (number != 0) {
                FirstDigit = number % 10;
                number /= 10;
        }return FirstDigit + LastDigit;

    }
}
