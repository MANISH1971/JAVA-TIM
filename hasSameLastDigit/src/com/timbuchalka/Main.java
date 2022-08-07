package com.timbuchalka;

import javax.swing.*;

public class Main {
    public static int a;
    public static int b;
    public static int c;
    public static boolean status;
    public static void main(String[] args) {
	// write your code here
        status = hasSameLastDigit(23,32,42);
        System.out.println("hasSameLastDigit("+""+a+","+b+","+c+")"+" → should return "+ status);
//        System.out.println(isValid(10));
        status = isValid(1051);
        System.out.println("isValid("+a +")"+" → should return "+ status);
    }

    public static boolean hasSameLastDigit(int First, int Second, int Third){
        a=First;b=Second;c=Third;
        if (First <10 || First >1000 || Second <10 || Second >1000 || Third <10 || Third >1000){
            return false;
        } else {
            First = First %10;
            Second = Second %10;
            Third = Third %10;
            if (First == Second || Second == Third || First == Third){

                return true;
            }else{
                return false;
            }
        }
    }
    public static boolean isValid(int number){
        a = number;
        if (number>=10 && number <=1000){
            return true;
        }else{
            return false;
        }
    }
}
