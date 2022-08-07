package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(hasSharedDigit(285000, 811111));
        System.out.println(hasSharedDigit(825000, 811111));
        System.out.println(hasSharedDigit(825, 815));
    }
    public static boolean hasSharedDigit(int Firstnum, int SecondNumber) {
/*        if (Firstnum <10 || Firstnum >99  || SecondNumber <10 || SecondNumber >99) {
            return false;
           }else*/
//          limited variable
/*            int rem1 = Firstnum %10;
            int rem2 = SecondNumber %10;
            if (rem1 == rem2)
            {
                return true;
            }
            int q1 = Firstnum /10;
            int q2 = SecondNumber / 10;
            if (q1 == q2){
                return true;
            }*/
        // UNLIMITED VALUE
        int rem1 = Firstnum % 10;
        int rem2 = SecondNumber % 10;
        if (rem1==rem2){
            return true;
        }
            int rem3 = Firstnum / 10;
            int rem4 = SecondNumber / 10;
            hasSharedDigit(rem3,rem4);
            return false;
        }

/*        int min,max,calls;
        calls=1;
        max = Math.max(Firstnum,SecondNumber);
        min = Math.min(Firstnum,SecondNumber);
        System.out.println("Max "+max+"\nMin"+min);
        max = max - min;
        System.out.println("Max "+max);
        if (max == min){
            return true;
        }
        if (){
            hasSharedDigit(max,min);
        }*/
    }