public class TeenNumberChecker {
    public static void main(String[] args) {
        boolean rslt;
        rslt = hasTeen(7, 23, 34);
    }
 //        if ((a <= 13 || a <= 19) || (b <= 13 || b <= 19) || (c <= 13 || c <= 19))
    public static boolean hasTeen(int a, int b, int c) {
            if (isTeen(a) || (isTeen(b)) || (isTeen(c)))
        {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }
    public static boolean isTeen(int x) {
        if ((13 <= x && x <= 19)) {
            return true;
        } else {
            return false;
        }
    }
}