package homework5;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String userSentence = input.nextLine();

        String replace = userSentence.replace(" ", "_").replace(",", "");

        System.out.println(replace);
    }
}
