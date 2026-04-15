package homework5;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a price");
        BigDecimal price = input.nextBigDecimal();

        System.out.println("Enter a discount in %: ");
        BigDecimal percentage = input.nextBigDecimal();

        BigDecimal discount = price.multiply(percentage).
                divide(new BigDecimal("100"), 2, RoundingMode.HALF_UP);

        BigDecimal finalPrice = price.subtract(discount);

        System.out.println("Price with discount: " + finalPrice);

        input.close();
    }
}
