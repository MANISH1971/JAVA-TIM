package com.timbuchalka;
// The following is BASIC STRUCTURE OF IF THEN ELSE STATEMENT
//  if (condition) {
//      if statement (block)
//    }
//  else {
//      else statement (block)
//  {

public class Main {
    public static void main(String[] args) {
	// write your code here
/*        boolean gameOver = true;
        int score = 800;
        int leveCompleted = 5;
        int bonus = 100;*/
/*        if (score <= 5000 && score > 1000) {
            System.out.println("Your Score was less than 5000 but greater than 1000");
        }else if (score <1000){
            System.out.println("Your score was less than 1000");
        }
        else {
            System.out.println("Got here");
        }*/
/*
        if (gameOver){
            int finalScore = score + (leveCompleted * bonus);
            System.out.println("Your final score was "+finalScore);
        }
*/
//        int highScore = calculateScore(true,800,5,100);
//        System.out.println("Your final score was "+highScore);
        // print out the second score on the screen with the following
        // score set to 10000
        // levelCompleted to 8
        // bonus set to 200
        // but make sure the first printout above still displays as well

/*        boolean newGameOver = true;
        int newScore = 10000;
        int newleveCompleted = 8;
        int newBonus = 200;
        if (newGameOver){
            int finalScore = newScore + (newleveCompleted * newBonus);
            System.out.println("Your final score was "+finalScore);
        }*/
//        displayHighScorePosition("player",1500);
        int highScorePosition = calculateScorePosition(1500);
        displayHighScorePosition("Tim",highScorePosition);

        highScorePosition = calculateScorePosition(900);
        displayHighScorePosition("Bob",highScorePosition);

        highScorePosition = calculateScorePosition(400);
        displayHighScorePosition("Percy",highScorePosition);

        highScorePosition = calculateScorePosition(50);
        displayHighScorePosition("Gilbert",highScorePosition);

//        highScore = calculateScore(true,10000,8,200);
//        System.out.println("Your final score was "+highScore);
/*        score = 10000;
        leveCompleted = 8;
        bonus = 200;

        if (gameOver){
            int finalScore = score + (leveCompleted * bonus);
            System.out.println("Your final score was "+finalScore);
        }*/

    } // main {} ends here
    // function or sub-routine after main } ends
/*    public static void calculateScore() {
        boolean gameOver = true;
        int score = 800;
        int leveCompleted = 5;
        int bonus = 100;

        if (gameOver){
            int finalScore = score + (leveCompleted * bonus);
            finalScore+=1000;
            System.out.println("Your final score was "+finalScore);
        }
    }*/
    // below is the void (nothing return
/*    public static void calculateScore(boolean gameOver,int score, int levelCompleted,int bonus) {
*//*        boolean gameOver = true;
        int score = 800;
        int leveCompleted = 5;
        int bonus = 100;*//*

        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore+=2000;
            System.out.println("Your final score was "+finalScore);
        }
    }*/

    // 1. Create method called displayHighScorePosition
    // 2. it should a player name as parameter, and a 2nd parameter as a position in the hight score table
    //    you should display the players name along with a message like " managed to get into position "
    //    and the position they got and a further message " on the higher score table".
    //
    //    Create a second method called  calculateHigherScorePosition
    //    It should be sent one argument only, the player score.
    //    it should return an int
    //    the return data should be
    //    1. If the score is > 1000.
    //    2. If the score is >500 and <1000
    //    3. If the score is > 100 and < 500.
    //    4. in all other cases
    //    call both method and display the results of the following
    //    a score of 1500, 900, 400, and 50.
    //

   /* public static int calculateScore(boolean gameOver,int score, int levelCompleted,int bonus) {
*//*        boolean gameOver = true;
        int score = 800;
        int leveCompleted = 5;
        int bonus = 100;*//*

        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore+=2000;
//            System.out.println("Your final score was "+finalScore);
            return finalScore;
        }
        return -1;
    }*/
// ANSWER PROIVDE BY TIM SIR
    public static void displayHighScorePosition(String playerName,int higherScorePosition){
        System.out.println(playerName+" managed to get into position "+higherScorePosition+" on the higher score table ");
    }
    public static int calculateScorePosition(int playerScore){
  /*      if (playerScore >=1000){
            return 1;
        }else if(playerScore >=500 && playerScore<=1000){
            return 2;
        }else if (playerScore>=100 && playerScore<=5000){
            return 3;
        }else{
            return 4;
        }*/
        int position = 4;
        if (playerScore>=1000){
            position=1;
        }else if (playerScore>=500){
            position=2;
        }else if (position>=100){
            position=3;
        }
        return position;
    }
/*    public static void displayHighScorePosition(String player2,int score){
        String parameters;
        String parameters2;
        int scroe1 = calculateHigherScorePosition(score);
        System.out.println(player2+" managed to get into position " + scroe1 + " on the higher score table");
//        System.out.println(player2+" on the higher score table "+scroe1);
//        System.out.println(scroe1);
    }*/
/*    public static int calculateHigherScorePosition(int score){
//        int player = 0;
//        int player2 = 0;
        if (score > 1000){
            return 1;
        }
        if (score>500 && score<1000){
            return 2;
        }
        if (score>100 && score<500){
            return 3;
        }else {
            return 4;
        }
    }*/
}
