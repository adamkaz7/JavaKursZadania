package homework2;

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the caption");
        String userInput = input.nextLine();

        for (int i = userInput.length() - 1; i >= 0; i--) {
            System.out.print(userInput.charAt(i));
        }
    }
}
