package homework3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int userInput = input.nextInt();

        int[] numbers = new int[userInput];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        for (int number : numbers) {
            System.out.println(number + " ");
        }
    }
}
