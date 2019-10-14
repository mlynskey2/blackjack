package kiwi.mark;

import java.util.Random;

public class Dice {

    Random rand;
    public int die1;
    public int die2;

    public Dice() {
        rand = new Random();
        die1 = 1;
        die2 = 2;
    }

    public void roll() {
        die1 = rand.nextInt(6) + 1;
        die2 = rand.nextInt(6) + 1;
    }



}
