package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double test;
        double test2;
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.getFirstNumber();
        calculator.setSecondNumber(4);
        calculator.getSecondNumber();
        System.out.println("setFirstNumber value = " + calculator.getFirstNumber());
        System.out.println("setSecondNumber value = " + calculator.getSecondNumber());
        System.out.println("Add = "+calculator.getAdditionResult());
        System.out.println("Subtract = "+calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("setFirstNumber value = " + calculator.getFirstNumber());
        System.out.println("setSecondNumber value = " + calculator.getSecondNumber());
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
    }
}
