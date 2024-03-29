package com.timbuchalka;

public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "brown rye");
    }
    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }
    public void addHealthyAddition2(String name,double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }
    public double itemizeHamburger(){
        double hamburgerPrice = super.itemizeHamburger();
        if (this.healthyExtra1Name!=null){
            hamburgerPrice += this.healthyExtra1Price;
            System.out.println("Added"+this.healthyExtra1Name+"For and Extra"+this.healthyExtra1Price);
        }
        if (this.healthyExtra2Name!=null){
            hamburgerPrice += this.healthyExtra2Price;
            System.out.println("Added"+this.healthyExtra2Name+"For an Extra "+this.healthyExtra2Price);
        }
            return hamburgerPrice;
         }
}
