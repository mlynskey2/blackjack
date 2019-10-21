package kiwi.mark;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Class to test the getWinner(Player player, Player computer) method in Game.java
 */
public class GetWinnerTest {

    Game game;

    @Before
    public void setUp() throws Exception {
        game = new Game();
    }

    /*---------------------------------------------------------------------------*/
    // getWinner(Player player, Player computer tests where
    // computer score is 21 or under
    /*---------------------------------------------------------------------------*/

    /**
     * Generic interior values test
     * Test with Player P1 of score 8 and Player P2 of score 15
     * Player P2 should be returned
     */
    @Test
    public void testGetWinner8v15() throws IllegalArgumentException {
        Player winner = game.getWinner(new Player("P1", 2), new Player("P2", 21));
        assertEquals("P2", winner.getName());
    }

    /**
     * Lower boundary case vs interior value
     * Test with Player P1 of score 2 and Player P2 of score 16
     * Player P2 should be returned
     */
    @Test
    public void testGetWinner2v16() throws IllegalArgumentException {
        Player winner = game.getWinner(new Player("P1", 2), new Player("P2", 16));
        assertEquals("P2", winner.getName());
    }

    /**
     * Interior value vs upper boundary case
     * Test with Player P1 of score 18 and Player P2 of score 21
     * Player P2 should be returned
     */
    @Test
    public void testGetWinner18vs21() throws IllegalArgumentException {
        Player winner = game.getWinner(new Player("P1", 18), new Player("P2", 21));
        assertEquals("P2", winner.getName());
    }

    /**
     * Lower boundary case vs upper boundary case
     * Test with Player P1 of score 2 and Player P2 of score 21
     * Player P2 should be returned
     */
    @Test
    public void testGetWinner2vs21() throws IllegalArgumentException {
        Player winner = game.getWinner(new Player("P1", 2), new Player("P2", 21));
        assertEquals("P2", winner.getName());
    }

    /*---------------------------------------------------------------------------*/
    // getWinner(Player player, Player computer) tests where
    // computer score is 22 or over
    /*---------------------------------------------------------------------------*/

    /**
     * Test of boundary cases
     * Test with Player P1 of score 20 and Player P2 of score 22
     * (20 being the highest score requiring simulation, and 22 the lowest "losing" score)
     * Player P1 should be returned
     */
    @Test
    public void testGetWinner2vs22() throws IllegalArgumentException {
        Player winner = game.getWinner(new Player("P1", 20), new Player("P2", 22));
        assertEquals("P1", winner.getName());
    }

    /**
     * Test of generic interior values
     * Test with Player P1 of score 18 and Player P2 of score 24
     * Player P1 should be returned
     */
    @Test
    public void testGetWinner18vs24() throws IllegalArgumentException {
        Player winner = game.getWinner(new Player("P1", 18), new Player("P2", 24));
        assertEquals("P1", winner.getName());
    }

    /**
     * Edge case test - these values should never make it to this method
     * Test with Player P1 of score 0 and Player P2 of score 999
     * Should throw IllegalArgumentException
     */
    @Test(expected = IllegalArgumentException.class)
    public void testGetWinner0vs999() {
        Player winner = game.getWinner(new Player("P1", 0), new Player("P2", 999));
    }

    /**
     * Corner case test - these values should never make it to this method
     * Test with Player P1 of score 0 and Player P2 of score 999
     * Should throw IllegalArgumentException
     */
    @Test(expected = IllegalArgumentException.class)
    public void testGetWinnerNegative999999vs999999() {
        Player winner = game.getWinner(new Player("P1", -999999), new Player("P2", 999999));
    }
}