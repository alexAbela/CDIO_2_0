// Har indtil videre ikke andet end name, den burde da kunne have noget mere?

public class Player {

    private String name;
    private BankAccount account;


    public Player(String name) {

        this.name = name;
        this.account = new BankAccount(1000);

    }

    public String getName() {
        return this.name;
    }


    public BankAccount getAccount() {
        return account;
    }
}