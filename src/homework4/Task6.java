package homework4;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        int userAge = input.nextInt();
        ageCategory(userAge);

        input.close();
    }

    private static void ageCategory(int age) {
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
