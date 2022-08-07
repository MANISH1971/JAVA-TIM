package com.timbuchalka;

public class Main {

        public static void main(String[] args) {
                // write your code here
                /*
                 * Dimensions dimensions = new Dimensions(20,20,5);
                 * Case theCase = new Case("220B","Dell","240",dimensions);
                 * 
                 * Monitor theMonitor = new Monitor("27inch Beast","Acer",27,new
                 * Resolution(2540,1440));
                 * 
                 * Motherboard theMotherboard = new Motherboard("BJ-200","Asus",4,6,"V2.44");
                 * 
                 * PC thePC = new PC(theCase,theMonitor,theMotherboard);
                 */

                /*
                 * thePC.getMonitor().drawPixelAt(1500,1200,"red");
                 * thePC.getMotherboard().loadProgram("Windows 1.0");
                 * thePC.getTheCase().pressPowerButtion();
                 */
                // thePC.powerUp();

                /*
                 * Create a single room of a house using composition.
                 * So think about the things that should be included in this room.
                 * Maybe some physical parts of the house.
                 * Maybe some physical parts of the room.
                 * But also furniture as well if you like.
                 * Anything you think should be included in the room.
                 * You can create as many objects as you want
                 * to compose this add until whatever level of detail you wanna get into.
                 * Make sure you add at least one method to access an object that is composed
                 * which is part of that main class to be accessing that via a getter and
                 * then access via a public method that object that was returned from the
                 * getter.
                 * And you saw me do that in the previous video.
                 * And also then add at least one method to hide the object completely.
                 * In other words, not using the getter.
                 * Basically access that object from another public class, and
                 * you saw me do that in this video.
                 */

                Wall wall1 = new Wall("West");
                Wall wall2 = new Wall("East");
                Wall wall3 = new Wall("South");
                Wall wall4 = new Wall("North");

                Celling celling = new Celling(12, 55);
                Bed bed = new Bed("Modern", 4, 3, 2, 1);
                Lamp lamp = new Lamp("Classic", false, 75);

                Bedroom bedroom = new Bedroom("Tims", wall1, wall2, wall3, wall4, celling,
                                bed, lamp);
                bedroom.makeBed();
                bedroom.getLamp().turnOn();
        }
}
