package homework1;

import java.util.Scanner;

public class Task10 {
    public static final int PASSWORD_LENGTH = 8;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter password");
        String password = input.nextLine();
        passwordCheck(password);
    }

    private static void passwordCheck(String password) {
        if (password.length() < PASSWORD_LENGTH) {
            System.out.println("Password is too short");
        } else if (Character.isUpperCase(password.charAt(0))) {
            System.out.println("OK");
        } else {
            System.out.println("Password must begin with a capital letter");
        }
    }
}
