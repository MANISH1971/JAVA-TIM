public class hasEqualSum {
    public static void main(String[] args) {
        boolean rslt;
        rslt = hasEqualSum( 1, -1, 0);
    }

    public static boolean hasEqualSum(int one, int two, int three) {
        if ((one + two) == three) {
            System.out.println("true");
            return true;
        }
        else
            return false;
    }
}