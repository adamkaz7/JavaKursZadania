package homework2;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Get firs number");
        int start = input.nextInt();
        
        System.out.println("Get last number");
        int end = input.nextInt();

        printIfDividedByThreeAndByFive(start, end);
    }

    private static void printIfDividedByThreeAndByFive(int start, int end) {
        for (int i = start; i < end; i++) {
            if (i % 3 == 0) {
                System.out.println("Divided by 3: " + i);
            } else if (i % 5 == 0) {
                System.out.println("Divided by 5: " + i);
            }
        }
    }
}
