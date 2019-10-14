package kiwi.mark;

import java.util.Random;

public class Game {

    public int userTotal;
    public int computerTotal;
    private Die die1;
    private Die die2;
    private boolean roll;
    private Random rand;
    private String outputString;

    public Game() {
        userTotal = 0;
        computerTotal = 0;
        die1 = new Die();
        die2 = new Die();
        roll = true;
        rand = new Random();
        outputString = "";
    }

    public void simulate() {

        while (computerTotal < 20 && roll == true) {
            die1.roll();
            die2.roll();
            computerTotal += die1.getNumber() + die2.getNumber();
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
