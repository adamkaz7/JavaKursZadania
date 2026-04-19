package homework7;

public class Task6 {
    public static void main(String[] args) {
        for (Month month : Month.values()) {
            System.out.println(month + " " + month.getDays() + " days");
        }
    }
}
