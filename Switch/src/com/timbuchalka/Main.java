package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
	// write your code here
/*
        int value = 3;
        if (value ==1){
            System.out.println("Value was 1");
        }else if (value == 2){
            System.out.println("Value was 2");
        }else {
            System.out.println("Was not 1 or 2");
        }
*/
 /*       int switchValue = 4;
        switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("was a 3, or a 4, or a 5 ");
                System.out.println("Actually it was a "+switchValue);
                break;
            default:
                System.out.println("was not 1 or 2");
                break;
        }*/
        // More code here
  /*      char switchChar = 'G';
        switch (switchChar){
            case 'A':
                System.out.println(switchChar+" Was found ");
                break;
            case 'B':
                System.out.println(switchChar+" Was found ");
                break;
            case 'C':
                System.out.println(switchChar+" Was found ");
                break;
            case 'D': case 'E' : case 'F':
                System.out.println(switchChar+" Was found ");
                break;
            default:
                System.out.println("Could not found A,B,C,D OR E ");
                break;
        }*/
       String month = "january";
//        switch (month)
        switch (month.toLowerCase())
        {
            case "january":
                System.out.println("Jan");
                break;
            case "jun":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
                break;
        }
    }
}
