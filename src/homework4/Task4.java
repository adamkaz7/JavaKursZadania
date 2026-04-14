package homework4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int userInput = scanner.nextInt();

        boolean numberEven = isNumberEven(userInput);
        System.out.println("Is the number even?: " + numberEven);

        scanner.close();
    }

    private static boolean isNumberEven(int number) {
            return number % 2 == 0;

    }
}
