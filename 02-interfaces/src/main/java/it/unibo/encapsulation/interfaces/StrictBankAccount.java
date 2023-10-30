package it.unibo.encapsulation.interfaces;

public class StrictBankAccount implements BankAccount {
    private final static double ATM_TRANSACTION_FEE = 5; // commissione con ATM
    
    private double balance; // ammontare del conto
    private int transactions; // numero delle operazioni
    private final int id;

    public StrictBankAccount(final int id, final double balance) {
        this.id = id;
        this.balance = balance;
    }

    private void makeTransaction(final int id, final double amount) {
        if(this.id == id && !(amount > this.balance)) {
            this.transactions++;
            this.balance += amount;
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public int getTransactionsCount() {
        return this.transactions;
    }

    public void deposit(final int id, final double amount) {
        makeTransaction(id, amount);
    }

    public void withdraw(final int id, final double amount) {
        makeTransaction(id, - (amount));
    }

    public void depositFromATM(final int id, final double amount) {
        makeTransaction(id, (amount - ATM_TRANSACTION_FEE));
    }

    public void withdrawFromATM(final int id, final double amount) {
        makeTransaction(id, - (amount + ATM_TRANSACTION_FEE));
    }

    public void chargeManagementFees(final int id) {
    }
}
