package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
    }
    public static boolean isPalindrome(int number){
        int reverse = 0;
        int lastDigit=0;
        int store=0;
        store = Math.abs(number);
        while (store !=0){
            lastDigit = store % 10;
            reverse = reverse * 10 + lastDigit;
            store /=10;
        }
        if (reverse == Math.abs(number)){
            return true;
        }
        return false;
    }
}
