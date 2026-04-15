package homework5;

import java.math.BigDecimal;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a price");
        BigDecimal netPrice = input.nextBigDecimal();

        BigDecimal vatRate = new BigDecimal("0.23");
        BigDecimal priceWithVat = netPrice.add(netPrice.multiply(vatRate));

        System.out.println(priceWithVat);
    }
}
