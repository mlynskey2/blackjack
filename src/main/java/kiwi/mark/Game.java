package kiwi.mark;

import java.util.Random;

public class Game {

    public int userTotal;
    public int computerTotal;
    private Dice dice;
    private boolean roll;
    private Random rand;
    private String outputString;

    public Game() {
        userTotal = 0;
        computerTotal = 0;
        dice = new Dice();
        roll = true;
        rand = new Random();
        outputString = "";
    }

    public void simulate() {

        while (computerTotal < 20 && roll == true) {
            dice.roll();
            computerTotal += dice.die1 + dice.die2;
            roll = rand.nextBoolean();
        }

    }

    public void assess() {
        if (userTotal > 21) {
            outputString = "You lose! You went over 21.";
        } else {
            simulate();
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

    public String getResult() {
        return outputString;
    }

}
