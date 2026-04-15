package homework5;

import java.math.BigDecimal;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter firs number: ");
        BigDecimal firstNumber = input.nextBigDecimal();

        System.out.println("Enter second number: ");
        BigDecimal secondNumber = input.nextBigDecimal();

        int compare = firstNumber.compareTo(secondNumber);
        
        if (compare == 0) {
            System.out.println("Number are equal");
        } else if (compare > 0) {
            System.out.println("First one is grater");
        } else {
            System.out.println("Second one is grater");
        }
    }
}
