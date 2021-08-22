public class DecimalComparator {
    public static void main(String[] args) {
        boolean rslt;
            rslt = areEqualByThreeDecimalPlaces(3.175,3.176);
//        double bb = (float) Math.round(d2 * 1000);
    }
    public static boolean areEqualByThreeDecimalPlaces(double one,double two){
        if ((int)(one*1000) == (int)(two*1000))
            return true;
        else
            return false;
    }
    }

