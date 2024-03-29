package com.timbuchalka;

/*Write a method named printSquareStar with one parameter of type int named number.

        If number is < 5, the method should print "Invalid Value".
        The method should print diagonals to generate a rectangular pattern composed of stars (*). This should be accomplished by using loops (see examples below).
        EXAMPLE INPUT/OUTPUT:

        EXAMPLE 1
        printSquareStar(5); should print the following:
        → NOTE: For text in Code Blocks below, use code icon {...}  on Udemy
        *****
        ** **
        * * *
        ** **
        *****
        Explanation:
        *****   5 stars
        ** **   2 stars space 2 stars
        * * *   1 star space 1 star space 1 star
        ** **   2 stars space 2 stars
        *****   5 stars
        EXAMPLE 2
        printSquareStar(8); should print the following:
        ********
        **    **
        * *  * *
        *  **  *
        *  **  *
        * *  * *
        **    **
        ********
        The patterns above consist of a number of rows and columns (where number is the number of rows to print). For each row or column, stars are printed based on four conditions (Read them carefully):

        * In the first or last row
        * In the first or last column
        * When the row number equals the column number
        * When the column number equals rowCount - currentRow + 1 (where currentRow is current row number)
        HINT: Use a nested loop (a loop inside of a loop).
        HINT: To print on the same line, use the print method instead of println, e.g. System.out.print(" "); prints a space and does not "move" to another line.
        HINT: To "move" to another line, you can use an empty println call, e.g. System.out.println(); .
        NOTE: The method printSquareStar should be defined as public static like we have been doing so far in the course.
        NOTE: Do not add a main method to the solution code.*/

public class Main {

    public static void main(String[] args) {
	// write your code here
        printSquareStar(5);
    }
    public static void printSquareStar(int number){
        if(number < 5) System.out.println("Invalid Value");
        else{
            for (int row = 0; row <number; row++){
                for (int column=0; column<number; column++){
                    if(row==0 || row==number-1 || column==0 || column==number-1 || column==row || column==number-1-row) System.out.print("*");
                    else System.out.print(" ");
                }
                System.out.println("");
            }
        }
    }
}

 /* Here is the refactored code explaining how the * is displayed but I used numbers (1-5)
  for clearer representation of the output.

    public static void printSquareStar(int number){
        if(number < 5) System.out.println("Invalid Value");
        else{
            for (int row = 0; row <number; row++){
                for (int column=0; column<number; column++){
                    if(row==0 || row==number-1) System.out.print("1"); // top and bottom rows
                    else if(column==0) System.out.print("2"); // left column
                    else if(column==number-1) System.out.print("3"); // right column
                    else if(column==row) System.out.print("4"); // diagonal down to right
                    else if(column==number-1-row) System.out.print("5"); // diagonal down to left
                        // alternative to lines 7-11 // if(row==0 || row==number-1 || column==0 || column==number-1 || column==row || column==number-1-row) System.out.print("*");
                    else System.out.print(" ");  // empty space between numbers
                }
                System.out.println(""); // puts a return to the row
            }
        }
    }*/