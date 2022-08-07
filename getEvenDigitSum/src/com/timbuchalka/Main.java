package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int number){
        if (number <0){
            return -1;
        }
     int sums = 0;int nums = 0;
       while (number!=0){
           nums = number %10;
           if (nums % 2 == 0){
               sums = sums+ nums;
           }
           number /= 10;
       }
     return sums;
    }
}
