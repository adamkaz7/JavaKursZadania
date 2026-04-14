package homework4;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int userNumber = input.nextInt();

        int sum = sumDigits(userNumber);
        System.out.println(sum);

        input.close();
    }

    private static int sumDigits(int number) {
        if (number == 0) {
            return 0;
        }
        return number % 10 + sumDigits(number / 10);
    }
}
