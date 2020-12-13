package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
	// write your code here
    checkNumber(0);
    checkNumber(1);
    checkNumber(-1);
    }
    public static void checkNumber(int parameter){
        if (parameter>0){
            System.out.println("possitive = "+parameter);
        }else if (parameter<0){
            System.out.println("negetive = "+parameter);
        }else if (parameter==0){
            System.out.println("zero = "+parameter);
        }
    }
}
