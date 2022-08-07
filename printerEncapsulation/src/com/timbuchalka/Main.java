package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // Create a class and demonstate proper encapsulation technique
        // the calss wil be called Printer
        // It will simulate a real Computer printer
        // It should have fields for the tonner level, number of pages printed, and
        // also whether its a duplex printer (capable of printing on both side of the paper)
        // Add method to fill up the tonner (up to maximum of 100%), another method to
        // simulate printing a page (which should increase the number of pages printed).
        // Decide on the scope, whether to use constructor, and anything else you think is needed
        Printer printer = new Printer(50, false);
        System.out.println(printer.addToner(50));
/*        System.out.println("intial page count = "+printer.getPagesPrinted());
        int pagesPrinted = printer.printpages(4);
        System.out.println("pages printed was "+pagesPrinted + " new total print count for printer ="+printer.getPagesPrinted());
        pagesPrinted = printer.printpages(2);
        System.out.println("pages printed was "+pagesPrinted + " new total print count for printer ="+printer.getPagesPrinted());*/
    }
}
