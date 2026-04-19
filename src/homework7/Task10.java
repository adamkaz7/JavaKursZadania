package homework7;

public class Task10 {
    public static void main(String[] args) {
        Person person1 = new Person("Mariusz", DayOfWeek.FRIDAY);
        Person person2 = new Person("Andrzej", DayOfWeek.WEDNESDAY);

        person1.showDayOff();
        person2.showDayOff();
    }
}
