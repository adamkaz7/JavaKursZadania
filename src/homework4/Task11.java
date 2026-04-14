package homework4;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arrayNumbers = createArray(input);
        int maxNumberInArray = printMaxArrayNumber(arrayNumbers);
        System.out.println("Biggest number in array: " + maxNumberInArray);

        input.close();
    }

    private static int printMaxArrayNumber(int[] arrayNumbers) {
        int max = Integer.MIN_VALUE;
        for (int arrayNumber : arrayNumbers) {
            if (arrayNumber > max) {
                max = arrayNumber;
            }
        }
        return max;
    }

    private static int[] createArray(Scanner input) {
        System.out.println("Enter array length");
        int tabLength = input.nextInt();

        int[] arrayNumbers = new int[tabLength];
        addNumbersToArray(input, arrayNumbers);

        return arrayNumbers;
    }

    private static void addNumbersToArray(Scanner input, int[] arrayNumbers) {
        for (int i = 0; i < arrayNumbers.length; i++) {
            System.out.println("Enter a number");
            int userInput = input.nextInt();
            arrayNumbers[i] += userInput;
        }
    }
}
