package homework2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int userInput = input.nextInt();

        for (int i = 0; i <= userInput; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        input.close();
    }
}
