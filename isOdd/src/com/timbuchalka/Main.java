package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        System.out.println(isOdd(1));
        System.out.println(sumOdd(100,1000));
    }

    public static boolean isOdd(int number){
        if( (number >0) && (number % 2 !=0)){
            return true;
        }
        return false;
    }

    public static int sumOdd(int start,int end){
        int sum=0;
        if (end < start || start <0 || end < 0 ){
            return -1;
        }
        for (int i =start;start<=end;start++){
            if (isOdd(start) == true){
                sum = sum + start;
            }
        }
        return sum;
    }
}
