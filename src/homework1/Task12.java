package homework1;

import java.time.YearMonth;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a day");
        int day = input.nextInt();
        System.out.println("Enter a month");
        int month = input.nextInt();
        System.out.println("Enter a year");
        int year = input.nextInt();

        printDateIsCorrectOrNot(day, month, year);
    }

    private static boolean checkDate(int day, int month, int year) {
        if (month >= 1 && month <= 12) {
            YearMonth ym = YearMonth.of(year, month);
            int monthDays = ym.lengthOfMonth();
            return day >= 1 && day <= monthDays;
        } else {
            return false;
        }
    }

    private static void printDateIsCorrectOrNot(int day, int month, int year) {
        if (checkDate(day, month, year)) {
            System.out.println("Date is correct");
        } else {
            System.out.println("Date is not correct");
        }
    }
}
