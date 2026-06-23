package homework14.Task4;

import homework14.Task4.Bank.BankSync;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        BankSync bank = new BankSync();
        for (long i = 1; i <= 10; i++) bank.openAccount(i, 1000);

        ExecutorService pool = Executors.newFixedThreadPool(8);
        Random rng = new Random(42);

        CompletableFuture<?>[] futures = new CompletableFuture<?>[1000];
        for (int i = 0; i < 1000; i++) {
            long from = 1 + rng.nextInt(10);
            long to;
            do { to = 1 + rng.nextInt(10); } while (to == from);
            long amountGr = (100 + rng.nextInt(401)) * 100L;
            final long fromF = from, toF = to, amountF = amountGr;
            futures[i] = CompletableFuture.runAsync(() -> {
                try { bank.transfer(fromF, toF, amountF); }
                catch (InsufficientFundsException e) { /* OK – niewystarczające środki */ }
            }, pool);
        }

        CompletableFuture.allOf(futures).join();

        System.out.println("Stan wszystkich kont po zakończeniu operacji");
        for (long accountId = 1; accountId <= 10; accountId++) {
            long balance = bank.getAccounts().get(accountId).getBalanceGr();
            System.out.println("Account " + accountId + " balance: " + balance + " gr");
        }

        long total = bank.totalBalanceGr();
        System.out.println("Suma sald: " + total + " gr (powinno: " + (10 * 1000 * 100L) + ")");
        if (total != 10 * 1000 * 100L) {
            throw new AssertionError("NIEZMIENNIK ZŁAMANY – jest race condition!");
        }

        pool.shutdown();
    }
}
