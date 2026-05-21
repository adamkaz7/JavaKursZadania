package homework10;

import java.util.Scanner;
import java.util.function.BiPredicate;

public class Task7 {
    public static void main(String[] args) {
        BiPredicate<String, String> sameIgnoreCase = (s1, s2) -> s1.compareToIgnoreCase(s2) == 0;
        BiPredicate<String, String> isSuffix = (s1, s2) -> s1.endsWith(s2);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string A: ");
        String userInput = input.nextLine();

        System.out.println("Enter a string B: ");
        String userInput2 = input.nextLine();

        System.out.println("sameIgnoreCase: " + sameIgnoreCase.test(userInput, userInput2));
        System.out.println("isSuffix: " + isSuffix.test(userInput, userInput2));
    }
}
