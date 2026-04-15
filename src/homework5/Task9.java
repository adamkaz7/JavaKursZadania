package homework5;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a price in PLN");
        BigDecimal priceInPLN = input.nextBigDecimal();

        System.out.println("Enter the euro exchange rate");
        BigDecimal eurExchangeRate = input.nextBigDecimal();

        if (eurExchangeRate.compareTo(BigDecimal.ZERO) > 0) {
            BigDecimal priceInEur = priceInPLN.divide(eurExchangeRate, 2, RoundingMode.HALF_UP);
            System.out.println(priceInEur);
        } else {
            System.out.println("Exchange rate mus be grater than 0");
        }
    }
}
