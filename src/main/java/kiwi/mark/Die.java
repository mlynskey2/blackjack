package kiwi.mark;

import java.util.Random;

public class Die {

    private Random rand;
    private int number;

    public Die() {
        rand = new Random();
        number = 1;
    }

    public void roll() {
        number = rand.nextInt(6) + 1;
    }

    public int getNumber() {
        return number;
    }
}
