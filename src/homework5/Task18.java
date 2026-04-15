package homework5;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Task18 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter how many products do you want");
        int quantity = input.nextInt();

        BigDecimal[] prices = new BigDecimal[quantity];

        for (int i = 0; i < prices.length; i++) {
            System.out.println("Enter price: ");
            prices[i] = input.nextBigDecimal();
        }

        for (BigDecimal price : prices) {
            System.out.println(price.setScale(2, RoundingMode.HALF_UP) + " zł");
        }
    }
}
