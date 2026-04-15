package homework5;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a first word");
        String firsWord = input.nextLine();
        System.out.println("Enter a second word");
        String secondWord = input.nextLine();

        boolean equals = firsWord.equals(secondWord);
        boolean equalsIgnoreCase = firsWord.equalsIgnoreCase(secondWord);

        System.out.println("Only equals: " + equals);
        System.out.println("equalsIgnoreCase: " + equalsIgnoreCase);

        input.close();
    }
}
