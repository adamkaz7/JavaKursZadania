package homework4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userNumberX = getNumber(input, "Enter number X: ");
        int userNumberY = getNumber(input, "Enter number Y: ");
        int max = max(userNumberX, userNumberY);
        System.out.println("The larger number is: " + max);


        input.close();
    }

    private static int max(int a, int y) {
        return Math.max(a, y);
    }

    private static int getNumber(Scanner input, String message) {
        System.out.print(message);
        return input.nextInt();
    }
}
