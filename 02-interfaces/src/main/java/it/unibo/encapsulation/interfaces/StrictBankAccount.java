package it.unibo.encapsulation.interfaces;

public class StrictBankAccount implements BankAccount {
    private final static double TRANSACTION_FEE = 0.1; // commissione per ogni transazione
    private final static double ACCOUNT_MANAGEMENT_FEE = 5;
    
    private double balance; // ammontare del conto
    private int transactions; // numero delle operazioni
    private final int id;

    public StrictBankAccount(final int id, final double balance) {
        this.id = id;
        this.balance = balance;
    }

    private void makeTransaction(final int id, final double amount) {
        if(this.id == id) {
            this.transactions++;
            this.balance += amount;
        }
    }

    private boolean withdrawCheck(double amount) {
        if(amount > this.balance) {
            return false;
        }
        return true;
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
        if(withdrawCheck(amount)) {
            makeTransaction(id, - (amount));
        }
    }

    public void depositFromATM(final int id, final double amount) {
        makeTransaction(id, (amount - TRANSACTION_FEE));
    }

    public void withdrawFromATM(final int id, final double amount) {
        if(withdrawCheck(amount)) {
            makeTransaction(id, - (amount + TRANSACTION_FEE));
        }
    }

    public void chargeManagementFees(final int id) {
        if(this.id == id) {
            this.balance -= ACCOUNT_MANAGEMENT_FEE;
        }
    }
}
