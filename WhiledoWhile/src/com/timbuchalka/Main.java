package com.timbuchalka;
// LECTURE NO 66
public class Main {

    public static void main(String[] args) {
        // write your code here
        //      System.out.println(isEvenNumber(1));
        //       int count = 6;
/*        while (count != 6) {
            System.out.println("While Count Value = " + count);
            count++;
        }*/
/*        for (count=1;count!=6;count++){
            System.out.println("Count Value = " + count );
        }*/
/*        count = 1;
        while (true) {
            if (count == 6) {
                break;
            }
            System.out.println("Count Value = " + count);
            count++;
        }*/
    /*    for (int i=6;i!=6;i++){
            System.out.println("Count Value = " + i);*/
/*        count=6;
        do {
            System.out.println("Do While Count Value Was = "+count);
            count++;
            if (count>100){
                break;
            }
        }   while (count !=6);*/
        // example done
/*    public static boolean isEvenNumber(int i){

        if (i %2 ==0){
            System.out.println("Even Value"+i);
            return true;
        }else if(i %3 ==0){
            System.out.println("Odd Value"+i);
            return false;
        }
        return false;
    }*/
        // EXAMPLE DONE BY TIM SIR
//        int number = 4;
        int number = 0;
        int finishNumber = 20;
        int everNumberFound=0;
//      WHILE LOOP
/*        while (number<=finishNumber){
            number++;
            if (!isEvenNumber(number)){
                continue;
            }
            System.out.println("Evem Number "+number);
        }*/
 /*       do {
            if (isEvenNumber(number)){
                System.out.println("Evem Number "+number);
            }
            number++;
        }while (number<=finishNumber);*/

        // Modify the while code above
        // Make it also record the total number of even numbers it has found
        // and break once 5 are found
        // and at the end, display the total number of even numbers found

 /*       while (number<=finishNumber){
            number++;
            if (!isEvenNumber(number)){
                continue;
            }
            System.out.println("Evem Number "+number);
            everNumberFound++;
            if (everNumberFound>=5){
                break;
            }
//            System.out.println("Evem Number "+number);
        }*/
// THE WHILE, DO WHILE BREAK AND CONTINUE RECAP
        while (number<15){
            number++;
            if (number<=5){
                System.out.println("Skipping mumber "+number);
                continue;
            }
            System.out.println("number "+number);
            if (number>=10){
                System.out.println("Breaking at "+number);
                break;
            }
        }
//        System.out.println("Total Evem Number Found "+everNumberFound);
    }

    public static boolean isEvenNumber ( int number){
        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
