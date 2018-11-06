/***********************************************************************************************************************





 **********************************************************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        textOutputs txt = new textOutputs();

        while(true) {
            txt.textMain();
            String playerInput = scan.next();
            if (playerInput.equals("1")) {

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

                System.out.println("It is " + currentPlayer.getName() + "'s turn\n" +
                                   "--------------------------------------------");

                die1.roll();
                die2.roll();
                System.out.println("Press 1 to roll\n");
                scan.next("1");
                sum = die1.getValue() + die2.getValue();
                System.out.println("You have rolled: " + die1.getValue() + " and " + die2.getValue() + " which equals " + sum + " \n");

                switch (sum) {
                    case 2:
                        txt.txt2();
                        currentPlayer.getAccount().deposit(250);
                        break;
                    case 3:
                        txt.txt3();
                        currentPlayer.getAccount().withdraw(100);
                        break;
                    case 4:
                        txt.txt4();
                        currentPlayer.getAccount().deposit(100);
                        break;
                    case 5:
                        txt.txt5();
                        currentPlayer.getAccount().withdraw(20);
                        break;
                    case 6:
                        txt.txt6();
                        currentPlayer.getAccount().deposit(180);
                        break;
                    case 7:
                        txt.txt7();
                        break;
                    case 8:
                        txt.txt8();
                        currentPlayer.getAccount().withdraw(70);
                        break;
                    case 9:
                        txt.txt9();
                        currentPlayer.getAccount().deposit(60);
                        break;
                    case 10:
                        txt.txt10();
                        currentPlayer.getAccount().withdraw(80);
                        break;
                    case 11:
                        txt.txt11();
                        currentPlayer.getAccount().withdraw(50);
                        break;
                    case 12:
                        txt.txt12();
                        currentPlayer.getAccount().deposit(650);
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
                System.out.println("press 1 to go back to the main menu");
                scan.next("1");
            } else {
                System.out.println("Congratulations " + player2.getName() + " Wins!!");
                System.out.println("press 1 to go back to the main menu");
                scan.next("1");
            }
        } else if (playerInput.equals("2")) {
                txt.txtRules();
                System.out.println("press 1 to go back to the main menu");
                scan.next("1");
        } else if (playerInput.equals("3")) {
            break;
        }
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
