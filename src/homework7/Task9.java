package homework7;

public class Task9 {
    public static void main(String[] args) {

        for (Month month : Month.values()) {
            System.out.println(month + " holiday season: " + month.isHolidaySeason());
        }
    }
}
