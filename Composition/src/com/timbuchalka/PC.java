package com.timbuchalka;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp() {
        // getTheCase().pressPowerButtion(); // getter are comment
        theCase.pressPowerButtion();
        drawLogo();
    }

    private void drawLogo() {
        // famcy theCase
        // getMonitor().drawPixelAt(1200,50,"yellow");
        monitor.drawPixelAt(1200, 50, "yellow");
    }
    /*
     * private Case getTheCase() {
     * return theCase;
     * }
     * 
     * private Monitor getMonitor() {
     * return monitor;
     * }
     * 
     * private Motherboard getMotherboard() {
     * return motherboard;
     * }
     */
}
