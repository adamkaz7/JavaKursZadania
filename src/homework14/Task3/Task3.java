package homework14.Task3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Task3 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(4);

        List<Integer> numbers = new ArrayList<>();
        for (int index = 1; index <= 20; index++) {
            numbers.add(index);
        }

        List<Future<BigInteger>> futures = new ArrayList<>();
        for (Integer number : numbers) {
            Factorial factorial = new Factorial(number);
            Future<BigInteger> future = executor.submit(factorial);
            futures.add(future);
        }

        for (int index = 0; index < futures.size(); index++) {
            try {
                BigInteger result = futures.get(index).get();
                System.out.println(numbers.get(index) + "! = " + result);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        executor.shutdown();
    }
}
