package homework7;

public class Task11 {
    public static void main(String[] args) {
        Month[] months = new Month[]{
                Month.APRIL,
                Month.AUGUST,
                Month.FEBRUARY
        };

        int sumOfDays = 0;
        for (Month month : months) {
            sumOfDays += month.getDays();
            System.out.println(month);
        }
        System.out.println("All these months have " + sumOfDays + " days");
    }
}
