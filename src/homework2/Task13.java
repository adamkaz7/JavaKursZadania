package homework2;

import java.util.Scanner;

public class Task13 {
    public static final String LOGIN = "123java";
    public static final String PASSWORD = "java123";
    public static final int MAX_ATTEMPT = 3;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        loginIn(input);
    }

    private static void loginIn(Scanner input) {
        for (int i = 0; i < MAX_ATTEMPT; i++) {
            System.out.println("Enter your login");
            String login = input.nextLine();
            System.out.println("Enter your password");
            String password = input.nextLine();

            if (login.equals(LOGIN) && password.equals(PASSWORD)) {
                System.out.println("Correct login");
                break;
            } else if (i == MAX_ATTEMPT - 1) {
                System.out.println("Account Locked");
            } else {
                System.out.println("Incorrect password or login. Try again");
            }
        }
    }
}
