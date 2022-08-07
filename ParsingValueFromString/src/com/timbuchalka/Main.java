package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String NumberAsString = "2018.125";
//        String NumberAsString = "2018a";
        System.out.println("NumberAsString "+NumberAsString);
//        int number = Integer.parseInt(NumberAsString);
        double number = Double.parseDouble(NumberAsString);
        System.out.println("number = "+number);
        NumberAsString +=1;
        number += 1;
        System.out.println("NumberAsString = "+NumberAsString);
        System.out.println("number = "+number);
    }
}
