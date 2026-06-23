package homework14.Task4.BankAccount;

import homework14.Task4.InsufficientFundsException;

public class BankAccount {
    private final Long id;
    private long balanceGr; // w groszach

    public BankAccount(Long id, long initialPln) {
        this.id = id;
        this.balanceGr = initialPln * 100;
    }

    public synchronized void deposit(long amountGr) {
        if (amountGr <= 0) throw new IllegalArgumentException();
        balanceGr += amountGr;
    }

    public synchronized void withdraw(long amountGr) {
        if (amountGr <= 0) throw new IllegalArgumentException();
        if (balanceGr < amountGr) throw new InsufficientFundsException(id, balanceGr, amountGr);
        balanceGr -= amountGr;
    }

    public synchronized long getBalanceGr() { return balanceGr; }
    public Long getId() {
        return id;
    }
}
