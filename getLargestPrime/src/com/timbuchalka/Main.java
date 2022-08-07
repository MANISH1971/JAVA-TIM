package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
    }
    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }
        for (int j = number/2; j > 1; j--) {
//                System.out.print(j+" is divided ");
                if (number%j==0)number=j;
//            System.out.print(number+" number is "+number + " " +number%j+"\n");
        }
        return number;
    }
}
