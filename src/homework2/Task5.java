package homework2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a text");
        String userInput = input.nextLine();
        int sign = checkThereIsAnA(userInput);
        printInfo(sign);

        input.close();
    }

    private static void printInfo(int sign) {
        if (sign == -1) {
            System.out.println("There is not an \"a\" in the text");
        } else {
            System.out.println("There is an \"a\" in the text");
        }
    }

    private static int checkThereIsAnA(String userInput) {
        int sign = -1;
        for (int i = 0; i < userInput.length(); i++) {
            if (userInput.charAt(i) == 'a') {
                sign = i;
                break;
            }
        }
        return sign;
    }
}
