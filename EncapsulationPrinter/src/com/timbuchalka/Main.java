package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Printer printer = new Printer(50, true);
        System.out.println(printer.addToner(50));
        System.out.println("Initial Page Count = "+printer.getPagesPrinted());
        int pageprinted = printer.printPages(4);
        System.out.println("Pages printed was "+pageprinted+"new total for printer ="+printer.getPagesPrinted());
        pageprinted = printer.printPages(2);
        System.out.println("Pages printed was "+pageprinted+"new total for printer ="+printer.getPagesPrinted());
    }
}
