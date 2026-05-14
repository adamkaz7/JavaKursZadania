package homework9;

class Task3 {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(100);
        try {
            bankAccount.withdraw(150);
            System.out.println("Withdraw completed");
        } catch (InsufficientFundsException exception) {
            System.out.println("Transaction failed: " + exception.getMessage());
        } finally {
            System.out.println("End of transaction");
        }
    }
}
