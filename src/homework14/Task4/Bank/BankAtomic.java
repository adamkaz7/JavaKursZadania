package homework14.Task4.Bank;

import homework14.Task4.BankAccount.BankAccountAtomic;

import java.util.concurrent.ConcurrentHashMap;

public class BankAtomic {
    private final ConcurrentHashMap<Long, BankAccountAtomic> accounts = new ConcurrentHashMap<>();

    public void openAccount(long id, long initialPln) {
        accounts.putIfAbsent(id, new BankAccountAtomic(id, initialPln));
    }

    public boolean transfer(long fromId, long toId, long amountGr) {
        if (fromId == toId) {
            return true;
        }

        BankAccountAtomic from = accounts.get(fromId);
        BankAccountAtomic to = accounts.get(toId);

        if (from == null || to == null) {
            throw new IllegalArgumentException("Accounts do not exist");
        }

        boolean withdrawn = from.tryWithdraw(amountGr);
        if (!withdrawn) {
            return false;
        }

        to.deposit(amountGr);
        return true;
    }

    public long totalBalanceGr() {
        return accounts.values().stream()
                .mapToLong(BankAccountAtomic::balanceGr)
                .sum();
    }

    public ConcurrentHashMap<Long, BankAccountAtomic> getAccounts() {
        return accounts;
    }
}
