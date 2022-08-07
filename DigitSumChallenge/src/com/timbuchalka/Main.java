package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        System.out.println(sumDigits(125));
        System.out.println("The sum of the digits is number 125 is "+sumDigits(125));
        System.out.println("The sum of the digits is number -125 is "+sumDigits(-125));
        System.out.println("The sum of the digits is number 4 is "+sumDigits(4));
        System.out.println("The sum of the digits is number 321230 is "+sumDigits(321230));
    }
    private static int sumDigits(int number){
        if (number<10){
            return -1;
        }
        int sum=0;
        // 125 -> 125 / 10  = 12 -> 12 * 10 = 120 -> 125 - 120 = 5
        while (number>0){
            // extract the test-significant digit
            int digit = number % 10;
            sum += digit;
            // drop the least - significant digit.
            number /= 10; // same as number = number / 10;
        }
        return sum;
    }
// SELF DONE THE SOLUTION
    /*public static int sumDigits(int number){
        int sum=0,i=0;
        if (number>=10){
            while (number!=0){
*//*                i = number % 10;
                System.out.println("i value ="+i);
                sum = sum + i;
                System.out.println("sum value ="+sum);
                number = number /10;*//*
                for (i=0;number!=0;i++){
//                    number = number / 10;
                    sum = sum + number % 10;
//                    sum++;
                    number = number / 10;
                    System.out.println("Sum "+sum);
                }
            }
            return sum;
        }else {
            return -1;
        }
    }*/
}
