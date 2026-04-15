package homework5;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String userInput = input.nextLine();

        boolean java = userInput.startsWith("Java");
        boolean endsWith = userInput.endsWith("2025");

        System.out.println("Sentence starts with \"Java\": " + java);
        System.out.println("Sentence ends with \"2025\": " + endsWith);

        input.close();
    }
}
