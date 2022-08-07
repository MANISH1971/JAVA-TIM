package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        Player player = new Player();
//        player.Fullname = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.health = 200;
//        player.loosHealth(damage);
//        System.out.println("Remaining health = "+ player.healthRemaining());
//
//        damage = 11;
//        player.loosHealth(damage);
//        System.out.println("Remaining health = "+ player.healthRemaining());
        EnhancedPlayer player = new EnhancedPlayer("Tim",200,"Sword");
        System.out.println("Initial health is "+player.getHitPoints());

    }
}
