package it.unibo.encapsulation.interfaces;

public class TestBankAccount {

    private TestBankAccount() {
    }

    public static void main(final String[] args) {
        /*
         * 1) Creare l' AccountHolder relativo a Andrea Rossi con id 1
         */

        AccountHolder andreaRossi = new AccountHolder("Andrea", "Rossi", 1);
        /*
         * 2) Creare l' AccountHolder relativo a Alex Bianchi con id 2
         */

        AccountHolder alexBianchi = new AccountHolder("Alex", "Binachi", 2);
        /*
         * 3) Dichiarare due variabili di tipo BankAccount ed inizializzarle,
         * rispettivamente, con oggetti di tipo SimpleBankAccount per il conto di
         * Rossi (ammontare iniziale = 0), e di tipo StrictBankAccount per il conto di
         * Bianchi (ammontare iniziale = 0)
         */

        BankAccount first = new SimpleBankAccount(1, 0);
        BankAccount second = new StrictBankAccount(2, 0);

        /*
         * 4) Prima riflessione: perché è stato possibile fare la new di due classi
         * diverse in variabili dello stesso tipo?
         */
        /*
         * 5) Depositare €10000 in entrambi i conti
         */

        first.deposit(1, 1000);
        second.deposit(2, 1000);

        /*
         * 6) Prelevare €15000$ da entrambi i conti
         */

        first.withdrawFromATM(1, 15000);
        second.withdraw(2, 15000);

        /*
         * 7) Stampare in stdout l'ammontare corrente
         */

        System.out.println(first.getBalance());
        System.out.println(second.getBalance());

        /*
         * 8) Qual è il risultato e perché?
         */

        
        /*
         * 9) Depositare nuovamente €10000 in entrambi i conti
         */

        first.depositFromATM(1, 10000);
        second.deposit(2, 10000);

        /*
         * 10) Invocare il metodo computeManagementFees su entrambi i conti
         */

        first.chargeManagementFees(1);
        second.chargeManagementFees(2);

        /*
         * 11) Stampare a video l'ammontare corrente
         */

        System.out.println(first.getBalance());
        System.out.println(second.getBalance());
        
        /*
         * 12) Qual è il risultato e perché?
         */
    }
}
