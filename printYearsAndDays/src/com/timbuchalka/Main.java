package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
	// write your code here
        printYearsAndDays(525600);
    }

    public static void printYearsAndDays(long minutes) {
     if (minutes < 0) {
         System.out.println("Invalid Value");
     }else {
         long hours = minutes / 60;
         long days = hours / 24;
         long year = days / 365;
         System.out.println(minutes+ " min = "+ (minutes/(60*24*365)%365) + " y and "+ (minutes/(60*24)%365)+ " d");
     }
    }
}
