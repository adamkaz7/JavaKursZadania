package homework9;

class BankAccount {
    private int balance;

    public BankAccount(int initial) {
        this.balance = initial;
    }

    public void withdraw(int amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient amount of money. Balance: " + balance + ", amount: " + amount);
        }
        balance = balance - amount;
    }
}
