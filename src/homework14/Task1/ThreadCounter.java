package homework14.Task1;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadCounter implements Runnable {
    private static final AtomicInteger startedThreads = new AtomicInteger(0);
    private final int threadNumber;

    public ThreadCounter(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        startedThreads.incrementAndGet();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " from thread " + threadNumber);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread " + threadNumber + " interrupted");
            }
        }
    }
}
