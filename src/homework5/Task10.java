package homework5;

import java.math.BigDecimal;

public class Task10 {
    public static void main(String[] args) {
        double sum = 0.1 + 0.2;
        System.out.println("0.1 + 0.2 in double = " + sum);

        BigDecimal number1 = new BigDecimal("0.1");
        BigDecimal number2 = new BigDecimal("0.2");
        BigDecimal result = number1.add(number2);
        System.out.println("0.1 + 0.2 in BigDecimal = " + result);
    }
}
