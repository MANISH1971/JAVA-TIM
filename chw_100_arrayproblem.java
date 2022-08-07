import java.util.Scanner;

public class chw_100_arrayproblem {
    private static Scanner scanner = new Scanner(System.in);
    static int myIntegers[];

    public static void main(String[] args) {
        getIntegers(5);
        printArray();
        System.out.println("\n\n");
        sortArrayDesc();
    }

    public static void getIntegers(int capacity) {
        myIntegers = new int[capacity];
        for (int i = 0; i < capacity; i++) {
            myIntegers[i] = scanner.nextInt();
        }
    }

    /*
     * sorts the myIntegers array in ascending order;
     * futher functionality can be added to make array sorting ascending or
     * descending
     */
    public static void sortArray() {
        // int[] tempArray = myIntegers.clone();
        for (int i = 0; i < myIntegers.length; i++) {
            for (int j = i + 1; j < myIntegers.length; j++) {
                if (myIntegers[i] > myIntegers[j]) {
                    int temp = myIntegers[i];
                    myIntegers[i] = myIntegers[j];
                    myIntegers[j] = temp;

                }
            }
        }
        printArray();
    }

    public static void sortArrayDesc() {
        // int[] tempArray = myIntegers.clone();
        for (int i = 0; i < myIntegers.length; i++) {
            for (int j = i + 1; j < myIntegers.length; j++) {
                if (myIntegers[i] < myIntegers[j]) {
                    int temp = myIntegers[i];
                    myIntegers[i] = myIntegers[j];
                    myIntegers[j] = temp;

                }
            }
        }
        printArray();
    }

    public static void printArray() {
        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println(myIntegers[i]);
        }
    }
}
