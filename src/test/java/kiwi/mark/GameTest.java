package kiwi.mark;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {

    Game game;
    Player computer;

    @Before
    public void setUp() throws Exception {
        game = new Game();
        computer = new Player("Computer");
    }

    // Tests for simulate()

    @Test
    public void testSimulate2() {
        game.simulate(computer, 2);
        assertTrue(3 <= computer.getTotal() && computer.getTotal() <= 12);
    }

    public void testSimulate20() {
        game.simulate(computer, 20);
        assertTrue(computer.getTotal() >= 21);
    }

    public void testSimulate9() {
        game.simulate(computer, 9);
        assertTrue(9 <= computer.getTotal() && computer.getTotal() <= 21);
    }

    // Tests for simulationRequired()

    @Test
    public void testSimulationRequired2() {
        assertTrue(game.simulationRequired(2));
    }

    @Test
    public void testSimulationRequired9() {
        assertTrue(game.simulationRequired(9));
    }

    @Test
    public void testSimulationRequired19() {
        assertTrue(game.simulationRequired(19));
    }

    @Test
    public void testSimulationRequired20() {
        assertTrue(game.simulationRequired(20));
    }

    @Test
    public void testSimulationRequired21() {
        assertFalse(game.simulationRequired(21));
    }

    @Test
    public void testSimulationRequired22() {
        assertFalse(game.simulationRequired(22));
    }

    @Test
    public void testSimulationRequired31() {
        assertFalse(game.simulationRequired(31));
    }

}