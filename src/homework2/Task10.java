package homework2;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int userInput = input.nextInt();

        for (int i = userInput + 1; i < userInput + 7; i++) {
            if (i % 7 == 0) {
                System.out.println("First number divided by 7 is: " + i);
                break;
            }
        }
    }
}
