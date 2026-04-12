package homework3;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = createArray(input);
        int numberYouLookingFor = getNumberToFind(input);
        boolean found = numberCheck(array, numberYouLookingFor);
        printIfNumberExistOrNot(found);
    }

    private static int[] createArray(Scanner input) {
        System.out.println("Enter a array length: ");
        int arrayLengthByUser = input.nextInt();

        int[] array = new int[arrayLengthByUser];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number: ");
            array[i] = input.nextInt();
        }

        return array;
    }

    private static int getNumberToFind(Scanner input) {
        System.out.println("Check if this number exists: ");
        return input.nextInt();
    }

    private static boolean numberCheck(int[] array, int numberYouLookingFor) {
        for (int arrayNumbers : array) {
            if (arrayNumbers == numberYouLookingFor) {
                return true;
            }
        }
        return false;
    }

    private static void printIfNumberExistOrNot(boolean found) {
        if (found) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }
    }
}
