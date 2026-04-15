package homework5;

import java.math.BigDecimal;

public class Task2 {
    public static void main(String[] args) {
        BigDecimal BigDecimalNumber1 = new BigDecimal("10.53");
        BigDecimal BigDecimalNumber2 = new BigDecimal(10.53);

        System.out.println("From String: " + BigDecimalNumber1);
        System.out.println("From double: " + BigDecimalNumber2);
    }
}
