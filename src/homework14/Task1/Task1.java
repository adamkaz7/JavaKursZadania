package homework14.Task1;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[5];
        for (int i = 0; i < threads.length; i++) {
            ThreadCounter task = new ThreadCounter(i + 1);
            threads[i] = new Thread(task);
            threads[i].start();
        }
        for (Thread thread : threads) {
            thread.join();
        }
        System.out.println("All threads have finished");
    }
}
