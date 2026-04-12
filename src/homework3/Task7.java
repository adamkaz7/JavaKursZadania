package homework3;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a array length");
        int userInput = input.nextInt();
        int[] numbersTab = new int[userInput];

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < numbersTab.length; i++) {
            System.out.println("Enter a number");
            numbersTab[i] = input.nextInt();

            if (numbersTab[i] < min) {
                min = numbersTab[i];
            }
        }
        System.out.println("Biggest number in array: " + min);
    }
}
