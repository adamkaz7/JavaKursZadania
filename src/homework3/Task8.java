package homework3;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a array length");
        int userInput = input.nextInt();

        int[] numbersTab = new int[userInput];

        System.out.println("Enter x");
        int numberYouLookingFor = input.nextInt();

        int count = 0;
        for (int i = 0; i < numbersTab.length; i++) {
            System.out.println("Enter a number");
            int userNumber = input.nextInt();
            numbersTab[i] = userNumber;

            if (numbersTab[i] == numberYouLookingFor) {
                count++;
            }
        }

        System.out.println("Number x appeared: " + count + " times");
    }
}
