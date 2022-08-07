package com.timbuchalka;

public class Player {
    public String Fullname;
    public int health;
    public String weapon;

    public void loosHealth(int damage) {
        this.health = this.health - damage;
        if (this.health <= 0) {
            System.out.println("Player knockout");
            // Reduce number of lives remaining for the player
        }
    }
    public int healthRemaining() {
        return this.health;
    }
}
