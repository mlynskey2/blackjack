package kiwi.mark;

import java.util.Random;

/**
 * Game class to provide general game functionality
 */
public class Game {

    // Initialise variables
    private Die die1;
    private Die die2;

    /**
     * Game constructor initialises variables to default values
     */
    public Game() {
        die1 = new Die();
        die2 = new Die();
    }

    /**
     * Simulates a game of blackjack as the dealer/computer. This is the opponent's game
     * @param computer - the player to simulate
     * @param target - the score to beat
     */
    public void simulate(Player computer, int target) {

        while (computer.getTotal() < 20 && computer.getTotal() < target) {
            die1.roll();
            die2.roll();
            computer.add(die1.getNumber(), die2.getNumber());
        }

    }

    /**
     * Assesses who won based on the results of the player, and if required, the dealer/computer
     */
    public Player getWinner(Player player, Player computer) {

        // If no simulation was necessary
        if (computer.getTotal() == 0) {
            if (player.getTotal() > 21) {
                // User loses, score over 21
                return computer;
            } else if (player.getTotal() == 21) {
                // User wins, score is 21
                return player;
            } else {
                // Error: Player score 20 or less but computer didn't play
                return new Player("Error");
            }

        } else {
            // Otherwise compare with computer total
            if (computer.getTotal() > 21) {
                // Computer went over 21
                return player;
            } else {
                if (player.getTotal() > computer.getTotal()) {
                    // Player closer to 21 than computer
                    return player;
                } else {
                    if (player.getTotal() < computer.getTotal()) {
                        // Computer closer to 21 than player
                        return computer;
                    } else {
                        // Draw
                        return new Player("Draw");
                    }
                }
            }
        }

    }

    /**
     * Checks to see if the computer needs to play
     * @param total
     * @return
     */
    public boolean simulationRequired(int total) {
        // If the player's score is 21 or over, computer does not need to play
        // E.g. If total is 21, user wins instantly. If total is 22 or over, user loses instantly.
        if (total > 20) {
            return false;
        } else {
            // Total is 20 or under, computer needs to play
            return true;
        }
    }

}
