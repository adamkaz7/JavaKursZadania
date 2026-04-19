package homework7;

public class Task3 {
    public static void main(String[] args) {
        DayOfWeek monday = DayOfWeek.MONDAY;
        DayOfWeek monday1 = DayOfWeek.MONDAY;
        DayOfWeek friday = DayOfWeek.FRIDAY;

        boolean isSame = monday == monday1;
        System.out.println(isSame);
        boolean isSame1 = monday == friday;
        System.out.println(isSame1);
    }
}

