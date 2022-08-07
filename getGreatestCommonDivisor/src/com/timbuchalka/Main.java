package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(getGreatestCommonDivisor(81,153));
    }

    public static int getGreatestCommonDivisor(int first,int second){
        int count=1;
        int reminder=1;
        if (first <10 || second <10){
            return -1;
        }
        int min = Math.min(first,second);
        int gcd=1;
        for (int i=2;i <=min;++i){
            // check if i perfectly divides both n1 and n2
            if (first % i ==0 && second %i ==0 && i > gcd){
                gcd = i;
            }
        }
        return gcd;
    }
}
