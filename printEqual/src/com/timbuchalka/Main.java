package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
	printEqual(1,2,3);
    }

    public static void  printEqual(int a, int b, int c){
        if (a <0 || b<0 || c<0) {
            System.out.println("Invalid Value");
        } else if (a == b && b == c && a == c){
            System.out.println("All Number are equal");
        }else if (a != b && b != c && a != c) {
            System.out.println("All number are Different");
        }else {
            System.out.println("Neither all are equal or different");
        }
    }
}
