package homework5;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BigDecimal ceiling = input.nextBigDecimal().setScale(2, RoundingMode.CEILING);
        System.out.println(ceiling);

        input.close();
    }
}
