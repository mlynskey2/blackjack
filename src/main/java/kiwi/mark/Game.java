package kiwi.mark;

import java.util.Random;

/**
 * Game class to provide general game functionality
 */
public class Game {

    // Initialise varibles
    private int userTotal;
    public int computerTotal;
    private Die die1;
    private Die die2;
    private boolean roll;
    private Random rand;
    private String outputString;

    /**
     * Game constructor initialises variables to default values
     */
    public Game() {
        userTotal = 0;
        computerTotal = 0;
        die1 = new Die();
        die2 = new Die();
        roll = true;
        rand = new Random();
        outputString = "";
    }

    /**
     * Simulates a game of blackjack as the dealer/computer. This is the opponent's game
     */
    public void simulate() {

        while (computerTotal < 20 && roll == true) {
            die1.roll();
            die2.roll();
            computerTotal += die1.getNumber() + die2.getNumber();
            roll = rand.nextBoolean();
        }

    }

    /**
     * Assesses who won based on the results of the player, and if required, the dealer/computer
     */
    public void assess() {

        if (userTotal > 21) {
            // User loses, no need to simulate dealar/computer's game
            outputString = "You lose! You went over 21.";
        } else {

            // Simulate the dealer/computer's game
            simulate();

            // Determine if win/lose/draw
            if (computerTotal > 21) {
                outputString =  "Computer total: " + computerTotal + "\nYou win! The computer went over 21.";
            } else {
                if (userTotal > computerTotal) {
                    outputString = "Computer total: " + computerTotal + "\nYou win! You were closer to 21 than the computer.";
                } else {
                    if (userTotal < computerTotal) {
                        outputString = "Computer total: " + computerTotal + "\nYou lose! The computer was closer to 21 than you.";
                    } else {
                        outputString = "Computer total: " + computerTotal + "\nIt's a draw!";
                    }
                }
            }
        }

    }

    /**
     * Adds two numbers to the userTotal. Used to add dice rolls
     * @param a
     * @param b
     */
    public void addToUserTotal(int a, int b) {
        userTotal += a + b;
    }

    /**
     * Returns the current userTotal
     * @return userTotal
     */
    public int getUserTotal() {
        return userTotal;
    }

    /**
     * Gets the string holding the results of the game
     * @return outputString
     */
    public String getResult() {
        return outputString;
    }

}
