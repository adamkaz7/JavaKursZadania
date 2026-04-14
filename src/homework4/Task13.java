package homework4;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Array before change: ");
        printArray(array);

        int[] reversedArray = arrayAfterChange(array);
        System.out.println("Array before change: ");
        printArray(reversedArray);

        input.close();
    }

    private static void printArray(int[] array) {
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    private static int[] arrayAfterChange(int[] array) {
        int[] reverse = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            reverse[i] = array[array.length - 1 - i];
        }

        return reverse;
    }
}
