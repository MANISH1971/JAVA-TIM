package com.timbuchalka;

public class EnhancedPlayer {
    private String name;
    private int hitPoints = 100;
    private String weapon;

    public EnhancedPlayer(String name, int hitPoints, String weapon) {
        this.name = name;
        if (hitPoints > 0 && hitPoints <= 100) {
            this.hitPoints = hitPoints;
        }
        this.weapon = weapon;
    }
    public void loosHealth(int damage) {
        this.hitPoints = this.hitPoints - damage;
        if (this.hitPoints <= 0) {
            System.out.println("Player knockout");
            // Reduce number of lives remaining for the player
        }
    }
    public int getHitPoints() {
        return hitPoints;
    }
}
