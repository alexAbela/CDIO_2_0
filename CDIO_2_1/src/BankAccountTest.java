import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class BankAccountTest{
    //Tests the deposit method
    @Test
    void deposit() {
        BankAccount acc = new BankAccount(0);
        assertEquals(50, acc.deposit(50));
    }

    // Withdraw method to make sure balance can't go below 0
    @Test
    void withdraw() {
        BankAccount acc = new BankAccount(50);
        assertEquals(0, acc.withdraw(100));

    }
    // Makes sure the get balance method returns the balance correctly.
    @Test
    void getBalance() {
        BankAccount acc = new BankAccount(1);
        assertEquals(1, acc.getBalance());
    }
}

// Project structure needs to have J unit 4.0 and 5.2 to run the tests. It is also nessecary to go into source -> language level = 8