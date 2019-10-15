package kiwi.mark;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DieTest {

    Die die;

    @Before
    public void beforeEachTest() {
        die = new Die();
    }

    @Test
    public void testRollWithinBounds() {
        die.roll();
        assertTrue("Die number is out of bounds", 1 <= die.getNumber() && die.getNumber() <= 6);
    }
}