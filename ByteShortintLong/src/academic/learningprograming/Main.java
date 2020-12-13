package academic.learningprograming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int Myvalue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minumum Value =" + myMinIntValue);
        System.out.println("Integer Maximum Value =" + myMaxIntValue);
        System.out.println("Busted Max value = "+ (myMaxIntValue+1));
        System.out.println("Busted Min value = "+(myMinIntValue-1));
        int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Mininum Value :"+myMinByteValue);
        System.out.println("Byte Maximum Value :"+myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Mininum Value :"+myMinShortValue);
        System.out.println("Short Maximum Value :"+myMaxShortValue);

        long MyLongValue = 100L;
        Long myMinLongValue = Long.MIN_VALUE;
        Long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Mininum Value :"+myMinLongValue);
        System.out.println("Long Maximum Value :"+myMaxLongValue);

        int myTotal = (myMinIntValue / 2);
        byte myNewByteValue =(byte) (myMinByteValue/2);
        short myNewShortValue = (short) (myMinShortValue / 2);
    }
}
