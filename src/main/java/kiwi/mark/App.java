package kiwi.mark;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final String version = "0.0.1";

    public static void main( String[] args ) {

        Scanner scanner = new Scanner(System.in);
        String command = "";
        Game game = new Game();
        Die die1 = new Die();
        Die die2 = new Die();

        System.out.println("-------------------------------------------------------------------------------------------------------------");
        System.out.println("Welcome to Blackjack!");
        System.out.println("v" + version);
        System.out.println("This is a simple game of Blackjack using two dice. After your first roll, choose to roll again or hold.");
        System.out.println("The goal is to get as close to 21 as you can without going over!");
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        System.out.print("Press ENTER to play!");

        scanner.nextLine();
        die1.roll();
        die2.roll();
        game.userTotal += die1.getNumber() + die2.getNumber();
        System.out.println("Roll: " + die1.getNumber() + ", " + die2.getNumber());
        System.out.println("Current total: " + game.userTotal);

        while (game.userTotal < 20 && !command.equals("hold")) {

            System.out.println("Would you like to hold or roll? [Type 'hold' or 'roll']");
            command = scanner.nextLine();

            if (command.equals("roll")) {
                die1.roll();
                die2.roll();
                game.userTotal += die1.getNumber() + die2.getNumber();
                System.out.println("Roll: " + die1.getNumber() + ", " + die2.getNumber());
                System.out.println("Current total: " + game.userTotal);
            } else if (command.equals("hold")) {
                break;
            }

        }

        game.assess();
        System.out.println(game.getResult());

    }
}
