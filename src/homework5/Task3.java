package homework5;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Task3 {
    public static void main(String[] args) {
        BigDecimal number = new BigDecimal("10.56789");
        BigDecimal result = number.setScale(2, RoundingMode.HALF_UP);
        System.out.println("After setScale: " + result);
    }
}
