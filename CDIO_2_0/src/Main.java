/***********************************************************************************************************************





 **********************************************************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        Dice die1 = new Dice();
        Dice die2 = new Dice();

        System.out.println("Indtast navn for spiller 1 ");       //Creates two players with their input as their name
        Player player1 = new Player(scan.next());

        System.out.println("Indtast navn for spiller 2 ");
        Player player2 = new Player(scan.next());

        Player currentPlayer = player1;       // Creating a currentPlayer to represent whose turn it is
        int sum = 0;                          //Sum of die values
        // The game is in a while loop which stops when either player reaches the winning score
        while (player1.getAccount().getBalance() < 3000 && player2.getAccount().getBalance() < 3000) {

            System.out.println("It is " + currentPlayer.getName() + "'s turn");

            die1.roll();
            die2.roll();
            System.out.println("Press 1 to roll");
            //scan.next("1");
            sum = die1.getValue() + die2.getValue();
            System.out.println("You have rolled: " + die1.getValue() + " and " + die2.getValue() + " which equals " + sum);

            switch (sum) {
                case 2:
                    currentPlayer.getAccount().deposit(250);
                    System.out.println("Der er kolde kontanter i tårenet, du tjener 250! ");
                    break;
                case 3:
                    currentPlayer.getAccount().withdraw(100);
                    System.out.println("Du er faldet i krateret og det koster hele 100 at komme op ");
                    break;
                case 4:
                    currentPlayer.getAccount().deposit(100);
                    System.out.println("Du er nået frem til paladsets porte, du får 100kr af guds engle ");
                    break;
                case 5:
                    currentPlayer.getAccount().withdraw(20);
                    System.out.println(" Du fryser så meget i den kolde ørken at du brænder 20 for at holde varmen");
                    break;
                case 6:
                    currentPlayer.getAccount().deposit(180);
                    System.out.println(" Du er ankommet til den afkransede by, du får 180 ");
                    break;
                case 7:
                    System.out.println("Du besøger klostrede, det har ingen effekt på din balance");
                    break;
                case 8:
                    currentPlayer.getAccount().withdraw(70);
                    System.out.println("Du besøger desværre den sorte grotte og det betyder desværre du lider et tab på 70 ");
                    break;
                case 9:
                    currentPlayer.getAccount().deposit(60);
                    System.out.println("Du finder nogle hyggelige hytter i bjergene og din balance stiger med 60");
                    break;
                case 10:
                    currentPlayer.getAccount().withdraw(80);
                    System.out.println("Du løber ind i nogle varerulve og løber for dit liv. Du taber desværre 80 på vejen. ");
                    System.out.println("Du får en tur til");
                    break;
                case 11:
                    currentPlayer.getAccount().withdraw(50);
                    System.out.println("Du falder desværre i kløften og skal betale hele 50 for at komme op igen. ");
                    break;
                case 12:
                    currentPlayer.getAccount().deposit(650);
                    System.out.println("Du har fundet guld i bjergene og sælger det for 650, du er rig!. ");
                    break;
                default:
                    break;

            }
            // Skifter spiller så man ikke behøver duplikere loop

            if (sum == 10) {
                continue;
            } else if (currentPlayer == player1) {
                currentPlayer = player2;
            } else {
                currentPlayer = player1;
            }
        }
        if (player1.getAccount().getBalance() > 3000) {
            System.out.println("Congratulations " + player1.getName() + " Wins!!");
        } else {
            System.out.println("Congratulations " + player2.getName() + " Wins!!");
        }
    }
}


    /*(Man kan ikke slå 1 med to terninger)
    Tower 		+250
    Crater 		-100
    Palace gates		+100
    Cold Desert	 	-20
    Walled city 		+180
    Monastery 		0
    Black cave 		-70
    Huts in the mountain 		+60
    The Werewall (werewolf-wall)		-80,	men spilleren får en ekstra tur.
    The pit 		-50
    Goldmine 		+650


}
}
}*/
