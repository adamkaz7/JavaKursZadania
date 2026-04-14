package homework4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number x");
        int userNumberX = input.nextInt();

        System.out.println("Enter number y");
        int userNumberY = input.nextInt();

        int result = multiplyTwoNumber(userNumberX, userNumberY);
        System.out.println("Result: " + result);


        input.close();
    }

    private static int multiplyTwoNumber(int a, int b) {
        return a * b;
    }
}
