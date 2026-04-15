package homework5;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter how many products do you want");
        int userInput = input.nextInt();
        BigDecimal prices = new BigDecimal(userInput);

        BigDecimal average = getAverage(userInput, input, prices);
        System.out.println(average);



        input.close();
    }

    private static BigDecimal getAverage(int userInput, Scanner input, BigDecimal prices) {
        BigDecimal sum = BigDecimal.ZERO;
        for (int i = 0; i < userInput; i++) {
            System.out.println("Enter a price");
            BigDecimal productPrices = input.nextBigDecimal();
            sum = sum.add(productPrices);
        }
        return sum.divide(prices, 2, RoundingMode.HALF_UP);
    }
}
