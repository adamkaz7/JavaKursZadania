package homework1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        int userAge = input.nextInt();
        checkIfAdult(userAge);

        input.close();
    }

    private static void checkIfAdult(int userAge) {
        if (userAge >= 18) {
            System.out.println("You are adult");
        } else {
            System.out.println("You are not adult");
        }
    }
}
