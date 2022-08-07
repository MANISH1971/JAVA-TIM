package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
	// write your code here
    /*    System.out.println(isLeapYear(1900));
        System.out.println(getDaysInMonth(2,1900));*/
        System.out.println("isLeapYear(-2018) \t " + isLeapYear(-2018));
        System.out.println("isLeapYear(1600) \t " + isLeapYear(1600));
        System.out.println("isLeapYear(1900) \t " + isLeapYear(1900));
        System.out.println("isLeapYear(2018) \t " + isLeapYear(2018));
        System.out.println("isLeapYear(2000) \t " + isLeapYear(2000));
        System.out.println("isLeapYear(99990) \t " + isLeapYear(99990));

        System.out.println("getDaysInMonth(1,-2020) \t " + getDaysInMonth(1,-2020));
        System.out.println("getDaysInMonth(1, 2020) \t " + getDaysInMonth(1, 2020));
        System.out.println("getDaysInMonth(2, 2020) \t " + getDaysInMonth(2, 2020));
        System.out.println("getDaysInMonth(2, 2018) \t " + getDaysInMonth(2, 2018));
        System.out.println("getDaysInMonth(-1, 2020) \t " + getDaysInMonth(-1, 2020));
        System.out.println("getDaysInMonth(2, -2020) \t " + getDaysInMonth(2, -2020));
        System.out.println("getDaysInMonth(0, 2020) \t " + getDaysInMonth(0, 2020));
        System.out.println("getDaysInMonth(0, 99990) \t " + getDaysInMonth(0, 99990));

    }
    public static boolean isLeapYear(int year){
      if (year < 1 || year > 9999){
                return false;
            }
            if ( ((year % 4 ==0) && (year % 100 !=0)) || (year % 400 ==0)) {
                return true;
            }
        return false;
    }
    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }
            switch (month) {
                case 1:case 3: case 5: case 7:  case 8: case 10: case 12:
                    return 31;
                case 2:
                    if (isLeapYear(year) == true) {
                        System.out.println(isLeapYear(year) + " GetDaysInMonth leap Year");
                        return 29;
                    }
                      return 28;
                case 4: case 6: case 9: case 11:
                    return 30;
                default:
                    return -1;
            }
        }
    }