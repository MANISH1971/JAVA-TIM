package academic.learningprograming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value "+myMinFloatValue);
        System.out.println("Float Maximum Value "+myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Value "+myMinDoubleValue);
        System.out.println("Double Maximum Value "+myMaxDoubleValue);

        int myIntValue = 5/3;
        float myFloatValue = 5f/3f;
        double myDoubleValue = 5d/3d;
        System.out.println("myIntValue: "+myIntValue);
        System.out.println("myFloatValue: "+myFloatValue);
        System.out.println("myDoubleValue: "+myDoubleValue);
        double numOfPounds = 200;
        double convertedKilograms = numOfPounds * 0.453592237d ;
        System.out.println("Converted Kilograms :"+convertedKilograms);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d; //million shows
        System.out.println(pi);
        System.out.println(anotherNumber);
    }
}
