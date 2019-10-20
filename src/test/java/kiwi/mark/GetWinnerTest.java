package kiwi.mark;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;

public class GetWinnerTest {

    Game game;
    ArrayList<Player> players;

    @Before
    public void setUp() throws Exception {
        game = new Game();
    }

    @Test
    public void testGetWinner2Versus21() {
        Player winner;
        winner = game.getWinner(new Player("P1", 2), new Player("P2", 21));
        assertEquals("P2", winner.getName());
    }

    @Test
    public void testGetWinner18Versus6() {
        Player winner;
        winner = game.getWinner(new Player("P1", 18), new Player("P2", 6));
        assertEquals("P1", winner.getName());
    }

    @Test
    public void testGetWinner20vs20() {
        Player winner;
        winner = game.getWinner(new Player("P1", 20), new Player("P2", 20));
        assertEquals("Draw", winner.getName());
    }
}