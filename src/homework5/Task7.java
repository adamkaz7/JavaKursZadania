package homework5;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Task7 {
    public static void main(String[] args) {
        BigDecimal[] prices = {
                new BigDecimal("10.50"),
                new BigDecimal("7.30"),
                new BigDecimal("2.25")
        };

        BigDecimal sum = BigDecimal.ZERO;
        for (BigDecimal price : prices) {
            sum = sum.add(price);
        }
        sum = sum.setScale(2, RoundingMode.HALF_UP);


        System.out.println("Sum of prices in array: " + sum);
    }
}
