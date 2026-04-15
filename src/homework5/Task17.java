package homework5;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a product name");
        String productName = input.nextLine().toUpperCase();

        System.out.println("Enter a product price");
        BigDecimal productPrice = input.nextBigDecimal().setScale(2, RoundingMode.HALF_UP);

        System.out.println("Product name: " + productName +
                " Price: " + productPrice + "PLN");
    }
}
