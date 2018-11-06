public class BankAccount {

    private int balance;
    private int balanceMinvalue = 0;

    // Constructor, en simple klasse i denne omgang

    public BankAccount(int balance) {

            this.balance = balance;
        }


    // Metode til når der skal penge ind på kontoen.
    public int deposit(int amount) {

        balance += amount;
        System.out.println("The new balance is " + balance);
        return balance;

    }

    //Metode til når penge skal ud af kontoen, den forsikrer også at kontoen ikke kan gå i minus.

    public int withdraw(int amount) {

        this.balance -= amount;

        if (balance < 0) {
            this.balance = 0;
            System.out.println("The balance can't go below 0, your new balance is 0 ");
            return this.balance;
        } else if (balance > 0){
            System.out.println("The funds have been withdrawn from your account, your new balance is " + getBalance());
            return this.balance;
        }
        return this.balance;
    }

    // standard get metode der returnerer balancen.
    public int getBalance() {
            return this.balance;

    }

}

