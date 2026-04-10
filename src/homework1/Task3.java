package homework1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = input.nextInt();
        checkYourAge(age);

        input.close();
    }

    private static void checkYourAge(int age) {
        if (age < 12) {
            System.out.println("You are a kid");
        } else if (age <= 17) {
            System.out.println("You are a teenager");
        } else if (age <= 64) {
            System.out.println("You are a adult");
        } else {
            System.out.println("You are a senior");
        }
    }
}
