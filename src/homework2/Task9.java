package homework2;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int userInput = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(userInput * i);
        }

        input.close();
    }
}
