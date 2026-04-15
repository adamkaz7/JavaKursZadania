package homework5;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Task1 {
    public static void main(String[] args) {
        BigDecimal BigDecimalNumber1 = new BigDecimal("10.50");
        BigDecimal BigDecimalNumber2 = new BigDecimal("2.25");

        System.out.println("First number: " + BigDecimalNumber1);
        System.out.println("Second number " + BigDecimalNumber2);

        BigDecimal sum = BigDecimalNumber1.add(BigDecimalNumber2);
        BigDecimal difference = BigDecimalNumber1.subtract(BigDecimalNumber2);
        BigDecimal product = BigDecimalNumber1.multiply(BigDecimalNumber2);
        BigDecimal quotient = BigDecimalNumber1.divide(BigDecimalNumber2, 2, RoundingMode.HALF_UP);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}
