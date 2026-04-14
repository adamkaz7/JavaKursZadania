package homework4;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int userNumber = input.nextInt();
        printInfo(userNumber);


        input.close();
    }

    private static void printInfo(int number) {
        if (isPrime(number)) {
            System.out.println("Number is a prime number");
        } else {
            System.out.println("Number isn't a prime number");
        }
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
