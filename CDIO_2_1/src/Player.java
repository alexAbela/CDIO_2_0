// A player class which constructs a player with a name which is user input and a default bankaccount with 1000

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