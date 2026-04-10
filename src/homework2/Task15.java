package homework2;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int userInput = input.nextInt();

        int result = 1;
        for (int i = 1; i <= userInput; i++) {
            result *= i;
        }
        System.out.println("Factorial of enter number: " + result);
    }
}
