package homework7;

public class Task5 {
    public static void main(String[] args) {
        DayOfWeek monday = DayOfWeek.MONDAY;
        DayOfWeek friday = DayOfWeek.FRIDAY;
        DayOfWeek sunday = DayOfWeek.SUNDAY;

        System.out.println(monday.isWeekend());
        System.out.println(friday.isWeekend());
        System.out.println(sunday.isWeekend());
    }
}
