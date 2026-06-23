package homework14.Task2;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] numbers = new int[1_000_000];
        Arrays.fill(numbers, 1); //wypełnienie tablicy Arrays.fill polecone przez Intelij wcześniej dodałem po prostu pętle for.
        int threadCount = 4;
        long[] partialSums = new long[threadCount];
        Thread[] threads = new Thread[threadCount];
        int chunkSize = numbers.length / threadCount;
        long parallelStartTime = System.nanoTime();

        for (int index = 0; index < threadCount; index++) {
            int start = index * chunkSize;
            int end = start + chunkSize;
            ArraySum task = new ArraySum(numbers, start, end, partialSums, index);
            threads[index] = new Thread(task);
            threads[index].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        long parallelSum = 0;
        for (long partialSum : partialSums) {
            parallelSum += partialSum;
        }
        long parallelEndTime = System.nanoTime();
        long parallelTime = parallelEndTime - parallelStartTime;

        long singleThreadSum = 0;
        long singleThreadStartTime = System.nanoTime();
        for (long number : numbers) {
            singleThreadSum += number;
        }
        long singleThreadEndTime = System.nanoTime();
        long singleThreadTime = singleThreadEndTime - singleThreadStartTime;

        System.out.println("Parallel Sum: " + parallelSum);
        System.out.println("Single Thread Sum: " + singleThreadSum);
        System.out.println("Parallel Time: " + parallelTime + " ns");
        System.out.println("Single Thread Time: " + singleThreadTime + " ns");

        if (parallelSum == singleThreadSum) {
            System.out.println("Results are equal");
        } else  {
            System.out.println("Results are not equal");
        }
    }
}
