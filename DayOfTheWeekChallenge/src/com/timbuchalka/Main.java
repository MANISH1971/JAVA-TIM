package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
	// write your code here
    //int day=0;
        printDayOfTheWeek(-1);
        printDayOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
        printDayOfTheWeek(7);
  }
    public static void printDayOfTheWeek(int day){
        if (day==0){
            System.out.println(day+" Sunday");
        }else if (day==1){
            System.out.println(day+" Monday");
        }else if (day==2){
            System.out.println(day+" Tuesday");
        }else if (day==3){
            System.out.println(day+" Wednesday");
        }else if (day==4){
            System.out.println(day+" Thrusday");
        }else if (day==5){
            System.out.println(day+" Friday");
        }else if (day==6){
            System.out.println(day+" Saturday");
        }else if (day>6){
            System.out.println("Invalid day");
        }
/*        switch (day){
            case 0:
                System.out.println(day+" Sunday");
                break;
            case 1:
                System.out.println(day+" Monday");
                break;
            case 2:
                System.out.println(day+" Tuesday");
                break;
            case 3:
                System.out.println(day+" Wednesday");
                break;
            case 4:
                System.out.println(day+" Thrusday");
                break;
            case 5:
                System.out.println(day+" Friday");
                break;
            case 6:
                System.out.println(day+" Saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }*/
    }
}