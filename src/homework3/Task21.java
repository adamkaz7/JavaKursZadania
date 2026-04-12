package homework3;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a sentence");
        String userText = input.nextLine();

        userText = userText.toLowerCase().replace(" ", "");

        String reverse = "";
        for (int i = userText.length() - 1; i >= 0; i--) {
             reverse += userText.charAt(i);
        }

        if (userText.equals(reverse)) {
            System.out.println("The sentence is a palindrome");
        } else {
            System.out.println("The sentence is not a palindrome");
        }
    }
}
