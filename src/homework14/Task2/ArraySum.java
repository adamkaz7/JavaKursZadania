package homework14.Task2;

public class ArraySum implements Runnable {
    private final int[] numbers;
    private final int start;
    private final int end;
    private final long[] partialSums;
    private final int result;

    public ArraySum(int[] numbers, int start, int end, long[] partialSums, int result) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
        this.partialSums = partialSums;
        this.result = result;
    }

    @Override
    public void run() {
        long sum = 0;
        for (int index = start; index < end; index++) {
            sum += numbers[index];
        }
        partialSums[result] = sum;
    }
}
