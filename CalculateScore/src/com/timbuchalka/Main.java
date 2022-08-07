package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        // write your code from the site here
        int NewScore = calculateScore("Tim", 500);
        System.out.println("New Score is " + NewScore);
        calculateScore(75);
        calculateScore();
        double centimeters = calcFeetAndInchesToCentimeters(6,0);
        if (centimeters <0.0) {
            System.out.println("Invalid parameters");
        }
        calcFeetAndInchesToCentimeters(157);
    }
    public static int calculateScore(String PlayerName, int score) {
        System.out.println("Player " + PlayerName + " score " + score + " Points");
        return score * 1000;
    }
    public static int calculateScore(int score) {
        System.out.println("Unnamed Player Score " + " score " + score + " Points");
        return score * 1000;
    }
    public static int calculateScore() {
        System.out.println("No Player Name, no player score.");
        return 0;
    }
    public static double calcFeetAndInchesToCentimeters(double feet,double inches){
        if ((feet<0) || (inches<0) || (inches>12)) {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet+ "feet, "+inches+" Inches = "+centimeters + " cm");
        return centimeters;
    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches <0){
            return -1;
        }
        double feet = (int) inches/ 12;
        double remainingInches = inches % 12;
        System.out.println(inches + " inches are equal to "+feet + " feet and "+ remainingInches);
        return calcFeetAndInchesToCentimeters(feet,remainingInches);
    }
}
