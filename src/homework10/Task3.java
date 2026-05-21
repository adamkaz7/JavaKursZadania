package homework10;

import java.util.Scanner;
import java.util.function.Function;

public class Task3 {
    public static void main(String[] args) {
        Function<String, Integer> textLengthWithoutSpaces = s -> s.replaceAll(" ", "").length();
        Function<String, Integer> sumVowels =
                s -> s.length() - s.replaceAll("[aeiouyAEIOUY]", "").length();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a text: ");
        String userInput = input.nextLine();
        input.close();

        System.out.println("Text length without spaces: " + textLengthWithoutSpaces.apply(userInput));
        System.out.println("Sum of vowels: " + sumVowels.apply(userInput));
    }
}
