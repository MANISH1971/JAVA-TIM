package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Hamburger hamburger = new Hamburger("Basic","Sausage",3.56,"White");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("tomato",0.27);
        hamburger.addHamburgerAddition2("Lettuce",0.75);
        hamburger.addHamburgerAddition3("cheese",1.13);
        System.out.println("Total Burger price is " +hamburger.itemizeHamburger());

        HealtyBurger healtyBurger = new HealtyBurger("Bacon",5.67);
        healtyBurger.addHamburgerAddition1("Egg",5.43);
        healtyBurger.addHealthAddition1("Lentils",3.41);
        System.out.println("Total Healthy Burger priceis "+ healtyBurger.itemizeHamburger());

        DeluxBurger db = new DeluxBurger();
        db.addHamburgerAddition3("Should not do this",50.53);
        db.itemizeHamburger();
    }
}
