package homework1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        checkEvenNumber(number);

        input.close();
    }

    private static void checkEvenNumber(int number) {
        if (number % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is not even");
        }
    }
}
