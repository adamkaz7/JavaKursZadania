package homework14.Task4.Bank;

import homework14.Task4.BankAccount.BankAccountLock;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

public class BankLock {
    private final ConcurrentHashMap<Long, BankAccountLock> accounts = new ConcurrentHashMap<>();

    public void openAccount(long id, long initialPln) {
        accounts.putIfAbsent(id, new BankAccountLock(id, initialPln));
    }

    public boolean transfer(long fromId, long toId, long amountGr) throws InterruptedException {
        BankAccountLock from = accounts.get(fromId);
        BankAccountLock to = accounts.get(toId);

        long deadline = System.currentTimeMillis() + 1000;
        while (System.currentTimeMillis() < deadline) {
            if (from.lock.tryLock(50, TimeUnit.MILLISECONDS)) {
                try {
                    if (to.lock.tryLock(50, TimeUnit.MILLISECONDS)) {
                        try {
                            from.withdraw(amountGr);
                            to.deposit(amountGr);
                            return true;
                        } finally {
                            to.lock.unlock();
                        }
                    }
                } finally {
                    from.lock.unlock();
                }
            }
            Thread.sleep(1); // backoff
        }
        return false; // deadlock unikamy – po prostu rezygnujemy
    }

    public long totalBalanceGr() {
        return accounts.values().stream()
                .mapToLong(BankAccountLock::getBalanceGr)
                .sum();
    }
}
