package homework5;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a bill: ");
        BigDecimal bill = input.nextBigDecimal();

        System.out.println("Enter a number of people");
        int numberOfPeople = input.nextInt();
        BigDecimal number = BigDecimal.valueOf(numberOfPeople);

        BigDecimal divide = bill.divide(number, 2, RoundingMode.HALF_UP);
        System.out.println(divide);

        input.close();
    }
}
