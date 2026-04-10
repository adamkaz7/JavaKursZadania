package homework2;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        positiveNumber(input);
        input.close();
    }


    private static void positiveNumber(Scanner input) {
        int userInput;
        do {
            System.out.println("Enter a positive number");
            userInput = input.nextInt();
            if (userInput > 0) {
                System.out.println("Correct Number");
            } else {
                System.out.println("Incorrect Number");
            }

        } while (userInput <= 0);
    }
}
