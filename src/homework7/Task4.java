package homework7;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a day of the week: ");
        String userDayInput = input.nextLine().toUpperCase();

        DayOfWeek day = DayOfWeek.valueOf(userDayInput);

        switch (day) {
            case MONDAY, TUESDAY  -> System.out.println("Start of the week");
            case WEDNESDAY, THURSDAY, FRIDAY -> System.out.println("Middle of the week");
            case SATURDAY, SUNDAY -> System.out.println("Weekend");
        }

        input.close();
    }
}
