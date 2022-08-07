package com.timbuchalka;

import javax.swing.text.StyledEditorKit;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
//      ALL VARIBALE SHOULD IN BETWEEN UPPER & DOWN LINE
        int counter=0;
        int sum=0;
//        while (true) {
        while (counter<10){
            int order = counter+1;
            System.out.println("Enter number #"+order+":");
            boolean isanInt = scanner.hasNextInt();
            if (isanInt) {
               int number = scanner.nextInt();
               counter++;
               sum += number;
/*             if (counter == 10) {
                    break;*//*
                }*/
            } else {
                System.out.println("Invalid number");
            }
            scanner.nextLine(); // handle end of line (enter key)
        }
        System.out.println("sum = "+sum);
        scanner.close();
    }
}
