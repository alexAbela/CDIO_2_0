import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {

    // Tester at kontoen i spillekontoen rent faktisk kan retuneres

    @Test
    void getAccount() {
        BankAccount acc = new BankAccount(1000);
        assertEquals(1000, acc.getBalance());
    }
}
