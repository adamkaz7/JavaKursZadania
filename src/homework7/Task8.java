package homework7;

public class Task8 {
    public static void main(String[] args) {

        for (Month month : Month.values()) {
            System.out.println(month + " " + month.ordinal());
        }

        Month july = Month.JULY;
        Month june = Month.JUNE;

        Month april = Month.APRIL;
        Month february = Month.FEBRUARY;

        System.out.println();
        System.out.println("July compareTo June: " + july.compareTo(june));
        System.out.println("April compareTo February: " + april.compareTo(february));
        System.out.println("June compareTo April: " + june.compareTo(april));
    }
}
