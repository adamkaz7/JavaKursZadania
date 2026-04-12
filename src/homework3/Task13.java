package homework3;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a caption");
        String userInput = input.nextLine();

        char[] marks = new char[userInput.length()];

        for (int i = 0; i < userInput.length(); i++) {
            marks[i] = userInput.charAt(i);
        }

        for (char mark : marks) {
            System.out.print(mark + " ");
        }
    }
}
