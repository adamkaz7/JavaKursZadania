package homework2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int userInput = input.nextInt();

        while (userInput > 0) {
            System.out.println(--userInput);
        }

        input.close();
    }
}
