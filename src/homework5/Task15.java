package homework5;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String sentence = input.nextLine();

        String[] split = sentence.split(" ");

        for (String word : split) {
            System.out.println(word);
        }


        input.close();
    }
}
