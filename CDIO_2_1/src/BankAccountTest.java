import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class BankAccountTest{

    //Indsætter penge på kontoen
    @Test
    void deposit() {
        BankAccount acc = new BankAccount(0);
        assertEquals(50, acc.deposit(50));
    }

    // Withdraw metoden tjekker om det er muligt for balancen at gå i minus
    @Test
    void withdraw() {
        BankAccount acc = new BankAccount(50);
        assertEquals(0, acc.withdraw(100));

    }
    // Tjekker at balancen bliver retuneret korrekt.
    @Test
    void getBalance() {
        BankAccount acc = new BankAccount(1);
        assertEquals(1, acc.getBalance());
    }

}
