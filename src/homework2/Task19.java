package homework2;

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter how many grades do you have: ");
        double userInput = input.nextDouble();

        double sum = 0;
        for (int i = 0; i < userInput; i++) {
            System.out.println("Your grades: ");
            double userGrades = input.nextDouble();
            sum = sum + userGrades;
        }
        sum = sum / userInput;
        System.out.println("Your average: " + sum);
    }
}
