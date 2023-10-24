package it.unibo.encapsulation.interfaces;

import javax.lang.model.util.SimpleElementVisitor14;

public class TestSimpleBankAccount {

    private TestSimpleBankAccount() {
        /*
         * Prevents object creation from the outside.
         */
    }

    public static void main(final String[] args) {
        // 1) Creare l' AccountHolder relativo a Andrea Rossi con id 1
        final AccountHolder andreaRossi = new AccountHolder("Andrea", "Rossi", 1);

        // 2) Creare l' AccountHolder relativo a Alex Bianchi con id 2
        final AccountHolder alexBianchi = new AccountHolder("Alex", "Bianchi", 2);

        // 3) Creare i due SimpleBankAccount corrispondenti
        SimpleBankAccount account1 = new SimpleBankAccount(1, 0);
        SimpleBankAccount account2 = new SimpleBankAccount(2, 0);

        // 4) Effettuare una serie di depositi e prelievi
        account1.deposit(1, 100);
        account2.deposit(2, 350);
        account1.withdrawFromATM(1, 50);
        account2.withdrawFromATM(2, 120);
        account1.depositFromATM(1, 210);
        account2.depositFromATM(2, 290);
        account1.withdraw(1, 30);
        account2.withdraw(2, 130);

        /*
         * 5) Stampare a video l'ammontare dei due conti e verificare la
         * correttezza del risultato
         */

        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());

        // 6) Provare a prelevare fornendo un id utente sbagliato

        // 7) Controllare nuovamente l'ammontare
    }
}
