package homework14.Task4;

public class InsufficientFundsException extends RuntimeException {
    public InsufficientFundsException(Long accountId, long balanceGr, long amountGr) {
        super("Account " + accountId + " has insufficient funds. Balance: "
                + balanceGr + " gr, required: " + amountGr + " gr");
    }
}
