package it.unibo.encapsulation.interfaces;

public class SimpleBankAccount implements BankAccount {
    private final static double ATM_TRANSACTION_FEE = 1; // commissione con ATM
    
    private double balance; // ammontare del conto
    private int transactions; // numero delle operazioni
    private final int id;

    public SimpleBankAccount(final int id, final double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getid() {
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }

    public int getTransactionsCount() {
        return this.transactions;
    }

    public void deposit(final int id, final double amount) {
        if(this.id == id) {
            this.transactions++;
            this.balance += amount;
        }
    }

    public void withdraw(final int id, final double amount) {
        if(this.id == id) {
            this.transactions++;
            this.balance -= amount;
        }
    }

    public void depositFromATM(final int id, final double amount) {
        if(this.id == id) {
            this.transactions++;
            this.balance = (this.balance + amount - ATM_TRANSACTION_FEE);
        }
    }

    public void withdrawFromATM(final int id, final double amount) {
        /*
         * Incrementa il numero di transazioni e rimuove amount + le spese
         * (costante ATM_TRANSACTION_FEE) relative all'uso dell'ATM (bancomat)
         * al totale del conto. Note: - Il conto puo' andare in rosso (ammontare
         * negativo) - Il prelievo va a buon fine solo se l'id utente
         * corrisponde
         */
    }

    public void chargeManagementFees(final int id) {
        /*
         * Riduce il bilancio del conto di un ammontare pari alle spese di gestione
         */
    }
}
