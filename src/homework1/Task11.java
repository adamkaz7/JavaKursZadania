package homework1;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter year");
        int year = input.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("Year " + year + " the year is leap year");
        } else {
            System.out.println("Year " + year + " the year is not leap year");
        }
    }
}
