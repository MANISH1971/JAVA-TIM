import java.util.Scanner;

public class chw_100_arrayproblem_2 {
    public static int[] getIntegers(int capacity) {
        Scanner scanner = new Scanner(System.in);
        int[] myIntegers = new int[capacity];
        for (int i = 0; i < capacity; i++) {
            myIntegers[i] = scanner.nextInt();
        }
        scanner.close();
        return myIntegers;
    }

    public static void printArray(int[] arrayToPrint) {
        // print array
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.println("Element " + i + " contents " + arrayToPrint[i]);
        }
    }

    public static int[] sortIntegers(int[] unsortedArray) {
        int[] arrayToSort = unsortedArray.clone();
        // sort in descending order - big to small
        for (int i = 0; i < arrayToSort.length; i++) {
            for (int j = i + 1; j < arrayToSort.length; j++) {
                if (arrayToSort[i] < arrayToSort[j]) {
                    int temp = arrayToSort[i];
                    arrayToSort[i] = arrayToSort[j];
                    arrayToSort[j] = temp;

                }
            }
        }
        return arrayToSort;

    }
}
