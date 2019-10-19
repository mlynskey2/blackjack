package kiwi.mark;

import java.util.Scanner;
import javax.management.BadStringOperationException;

/**
 * Blackjack
 *
 */
public class App 
{
    /**
     * Version variable
     */
    private static final String version = "0.0.1";

    /**
     * Main method
     * @param args
     */
    public static void main( String[] args ) {

        // Initialise variables
        Scanner scanner = new Scanner(System.in);
        String command = "";
        InputChecker checker = new InputChecker();
        Game game = new Game();
        Player player = new Player("Player");
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

        // Initial roll
        die1.roll();
        die2.roll();
        player.add(die1.getNumber(), die2.getNumber());
        System.out.println("Roll: " + die1.getNumber() + ", " + die2.getNumber());
        System.out.println("Current total: " + player.getTotal());

        // Game continues until total is 20 or more, or user holds
        while (player.getTotal() < 20 && !command.equals("hold")) {

            System.out.println("Would you like to hold or roll? [Type 'hold' or 'roll']");
            boolean validInput = false;
            while (!validInput) {
                try {
                    command = checker.verifyInput(scanner.nextLine());
                    validInput = true;
                } catch (BadStringOperationException e){
                    System.out.println("Invalid input. Type 'roll' or 'hold'.");
                }
            }

            if (command.equals("roll")) {
                die1.roll();
                die2.roll();
                player.add(die1.getNumber(), die2.getNumber());
                System.out.println("Roll: " + die1.getNumber() + ", " + die2.getNumber());
                System.out.println("Current total: " + player.getTotal());
            } else if (command.equals("hold")) {
                break;
            }

        }

        // Assess the game and show the result

        Player computer = new Player("Computer");

        // If simulation is required, compute total for computer. Otherwise its total will stay 0
        if (game.simulationRequired(player.getTotal())) {
            game.simulate(computer, player.getTotal());
        }


        Player winner = game.assess(player, computer);

        // TODO create method for this so can test it
        if (winner.getName().equals("Player")) {
            System.out.println("You won!");
        } else if (winner.getName().equals("Draw")) {
            System.out.println("It's a draw!");
        } else {
            System.out.println("You lost!");
        }

        System.out.println("Your total: " + player.getTotal());
        if (computer.getTotal() > 0) {
            System.out.println("Computer total: " + computer.getTotal());
        }


    }
}
