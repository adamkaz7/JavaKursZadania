package homework4;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int userInput = input.nextInt();
        System.out.println("Enter second number");
        int userInput1 = input.nextInt();
        System.out.println("Enter third number");
        int userInput2 = input.nextInt();

        double averageOfNumbers = average(userInput, userInput1, userInput2);
        double rounded = Math.round(averageOfNumbers * 100) / 100.0;
        System.out.println("Average of numbers: " + rounded);

        input.close();
    }

    private static double average(double a, double b, double c) {
        double sum = a + b + c;
        return sum / 3;
    }
}
