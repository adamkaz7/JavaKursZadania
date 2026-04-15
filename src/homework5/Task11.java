package homework5;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");
        String userText = input.nextLine();

        int userTextLength = userText.length();
        String userTextToUpperCase = userText.toUpperCase();
        String userTextToLowerCase = userText.toLowerCase();
        String reversed = new StringBuilder(userText).reverse().toString();

        System.out.println(userTextLength);
        System.out.println(userTextToUpperCase);
        System.out.println(userTextToLowerCase);
        System.out.println(reversed);

        input.close();
    }
}
