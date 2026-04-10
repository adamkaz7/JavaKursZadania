package homework2;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = addPositiveNumber(input);
        System.out.println("Result: " + sum);
    }

    private static int addPositiveNumber(Scanner input) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter a number");
            int userInput = input.nextInt();

            if (userInput > 0) {
                sum += userInput;
            } else if (userInput == 0) {
                System.out.println("End of program!");
                break;
            } else {
                System.out.println("Bad number. Try again");
            }
        }
        return sum;
    }
}
