package kiwi.mark;

import java.util.Random;

public class Game {

    public int userTotal;
    public int computerTotal;
    private Dice dice;
    private boolean roll;
    private Random rand;

    public Game() {
        userTotal = 0;
        computerTotal = 0;
        dice = new Dice();
        roll = true;
        rand = new Random();
    }

    public void simulate() {

        while (computerTotal < 20 && roll == true) {
            dice.roll();
            computerTotal += dice.die1 + dice.die2;
            roll = rand.nextBoolean();
        }

    }

}
