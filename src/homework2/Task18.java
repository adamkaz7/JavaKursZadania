package homework2;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        while (true) {
            System.out.println("Enter a number");
            int userInput = input.nextInt();

            if (userInput == 0) {
                System.out.println("End of program!");
                break;
            }

            if (userInput > max) {
                max = userInput;
            }
        }

        System.out.println("The biggest number: " + max);
    }
}
