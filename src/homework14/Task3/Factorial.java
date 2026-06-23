package homework14.Task3;

import java.math.BigInteger;
import java.util.concurrent.Callable;

public class Factorial implements Callable<BigInteger> {
    private final int number;

    public Factorial(int number) {
        this.number = number;
    }

    @Override
    public BigInteger call() throws Exception {
        Thread.sleep(500);
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= number; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
