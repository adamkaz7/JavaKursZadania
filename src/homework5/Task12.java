package homework5;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String userSentence = input.nextLine();

        System.out.println("Enter a word");
        String userText = input.nextLine();

        System.out.println(userSentence.contains(userText));
        System.out.println(userSentence.indexOf(userText));



        input.close();
    }
}
