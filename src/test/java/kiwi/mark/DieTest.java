package kiwi.mark;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DieTest {

    Die die;

    @Before
    public void setUp() {
        die = new Die();
    }

    /**
     * Test that a die roll results in a number between 1 and 6 inclusive.
     */
    @Test
    public void testRollWithinBounds() {
        die.roll();
        assertTrue("Die number is out of bounds", 1 <= die.getNumber() && die.getNumber() <= 6);
    }
}