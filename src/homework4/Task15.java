package homework4;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int userNumber = input.nextInt();

        int sum = sumDigits(userNumber);
        System.out.println(sum);

        input.close();
    }

    private static int sumDigits(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number = number / 10;
        }
        return sum;
    }
}
