package kiwi.mark;

import java.util.Random;

/**
 * Class to simulate a single die
 */
public class Die {

    private Random rand;

    // Holds current number
    private int number;

    /**
     * Die constructor initialises variables and sets initial number to 1
     */
    public Die() {
        rand = new Random();
        number = 1;
    }

    /**
     * Randomly selects a number between 1 and 6 inclusive, and sets this as the current number
     */
    public void roll() {
        number = rand.nextInt(6) + 1;
    }

    /**
     * Gets the current number
     * @return number
     */
    public int getNumber() {
        return number;
    }
}
