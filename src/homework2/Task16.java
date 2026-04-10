package homework2;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int userInput = input.nextInt();

        int count = 0;
        while (userInput != 0) {
            userInput /= 10;
            count++;
        }

        System.out.println("Digits in number: " + count);
    }
}
