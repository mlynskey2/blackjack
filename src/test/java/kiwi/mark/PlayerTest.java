package kiwi.mark;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {

    Player player;

    @Before
    public void setUp() {
        player = new Player("Player");
    }

    @Test
    public void testAddMethod() {
        player.add(4, 5);
        assertEquals("Total not correct", player.getTotal(), 9);
    }
}