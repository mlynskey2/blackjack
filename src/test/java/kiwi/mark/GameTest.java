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

    /*---------------------------------------------------------------------------*/
    // simulate(Player computer, int target) tests
    /*---------------------------------------------------------------------------*/

    /**
     * Lower boundary test case
     * 2 is the lowest allowable target
     * Simulated score should be between 3 and 12 inclusive
     */
    @Test
    public void testSimulateWithTarget2() throws IllegalArgumentException {
        game.simulate(computer, 2);
        assertTrue(3 <= computer.getTotal() && computer.getTotal() <= 12);
    }

    /**
     * Interior value test case
     * 9 is inbetween 2 and 20
     * Simulated score should be between 10 and 21
     */
    @Test
    public void testSimulateWithTarget9() throws IllegalArgumentException {
        game.simulate(computer, 9);
        assertTrue(10 <= computer.getTotal() && computer.getTotal() <= 21);
    }

    /**
     * Upper boundary test case
     * 20 is the maximum allowable target
     * Simulated score should be at least 21
     */
    @Test
    public void testSimulateWithTarget20() throws IllegalArgumentException {
        game.simulate(computer, 20);
        assertTrue(computer.getTotal() >= 21);
    }

    /**
     * Edge case value
     * Target should never be over 20. Here we test with target of 99
     * Should throw IllegalArgumentException
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSimulateWithTarget99() throws IllegalArgumentException {
        game.simulate(computer, 99);
    }

    /**
     * Edge case value
     * Target should never be 1 or under. Here we test with target of 0
     * Should throw IllegalArgumentException
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSimulateWithTarget0() throws IllegalArgumentException {
        game.simulate(computer, 0);
    }

    /**
     * Corner case value
     * No negative numbers should be accepted as a target
     * This outrageous input should result in an IllegalArgumentException
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSimulateWithTargetNegative999999() throws IllegalArgumentException {
        game.simulate(computer, -999999);
    }

    /*---------------------------------------------------------------------------*/
    // simulationRequired() tests
    /*---------------------------------------------------------------------------*/

    /**
     * Lower boundary case value
     * 2 is the lowest total that requires a simulation
     * Should return true
     */
    @Test
    public void testSimulationRequiredWithTotal2() {
        assertTrue(game.simulationRequired(2));
    }

    /**
     * Interior case value
     * 9 is within the bounds of 2 and 20 inclusive
     * Should return true
     */
    @Test
    public void testSimulationRequiredWithTotal9() {
        assertTrue(game.simulationRequired(9));
    }

    /**
     * Upper boundary case value
     * 20 is the maximum total that requires a simulation
     * Should return true
     */
    @Test
    public void testSimulationRequiredWithTotal20() {
        assertTrue(game.simulationRequired(20));
    }

    /**
     * Boundary case value for 21 and over equivalence class
     * If user total is 21, user has won, so no simulation is required
     * Should return false
     */
    @Test
    public void testSimulationRequiredWithTotal21() {
        assertFalse(game.simulationRequired(21));
    }

    /**
     * Edge case value
     * The total should never be 1 or under
     * Should return false
     */
    @Test
    public void testSimulationRequiredWithTotal1() {
        assertFalse(game.simulationRequired(1));
    }

    /**
     * Edge case value
     * The total cannot possibly be 32 or higher
     * Should return false
     */
    @Test
    public void testSimulationRequiredWithTotal32() {
        assertFalse(game.simulationRequired(32));
    }

    /**
     * Corner case value
     * The total cannot possibly be 32 or higher
     * This insanely high number should return false
     */
    @Test
    public void testSimulationRequiredWithTotal999999() {
        assertFalse(game.simulationRequired(999999));
    }

}