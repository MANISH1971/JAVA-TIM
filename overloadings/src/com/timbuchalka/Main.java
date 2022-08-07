package com.timbuchalka;

public class Main {
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {
        // write your code here
        //getDurationString(0, 59);
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3944L));
        System.out.println(getDurationString(-41L));
        System.out.println(getDurationString(65,9));
    }

    private static String getDurationString(long minutes, long seconds){
        if ((minutes <0) || (seconds <0) ||(seconds>59)){
            return INVALID_VALUE_MESSAGE;
        }
        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;
//      Bonus Part challange

        String hoursString = hours + "h";
        if (hours <10){
            hoursString = "0" + hoursString;
        }

        String minutesString = remainingMinutes + "m";
        if (remainingMinutes <10){
            minutesString = "0" + minutesString;
        }

        String secondsString = seconds + "s";
        if (seconds <10){
            secondsString = "0" + secondsString;
        }
        return hoursString + "  " + minutesString + "  " + secondsString + "  ";
    }

    private static String getDurationString(Long seconds){
        if (seconds <0){
            return INVALID_VALUE_MESSAGE;
        }
        long minutes = seconds / 60;
        Long remainingSeconds = seconds % 60;
        return getDurationString(minutes,remainingSeconds);
    }
/*    public static int getDurationString(int minutes, int seconds) {
        if ((minutes >=0 && seconds >=0) && (seconds <=59)){
            int hours = minutes / 60;
            System.out.print(minutes+"m " + seconds+"s ");
            return -1;
        }
        else {
            System.out.println("Invalid Value");
            return -1;
        }
    }
    public static int getDurationString(int seconds) {
        if (seconds >=0){
            return seconds;
        }
        else {
            System.out.println("Invalid Value");
            return -1;
        }
    }*/
}

