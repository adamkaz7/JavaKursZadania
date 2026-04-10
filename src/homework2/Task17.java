package homework2;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a x");
        int x = input.nextInt();
        System.out.println("Enter a y");
        int y = input.nextInt();

        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }

        System.out.println("Result (x^y): " + result);
    }
}
