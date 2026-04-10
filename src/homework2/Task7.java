package homework2;

import java.util.Scanner;

public class Task7 {
    public static final String PASSWORD = "java123";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a password");
        passwordCheck(input);
        input.close();
    }

    private static void passwordCheck(Scanner input) {
        boolean checkPassword = true;
        while (checkPassword) {
            String password = input.nextLine();
            if (password.equals(PASSWORD)) {
                System.out.println("Correct password.");
                checkPassword = false;
            } else {
                System.out.println("Incorrect password. Try again");
            }
        }
    }
}
