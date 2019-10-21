package kiwi.mark;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import javax.management.BadStringOperationException;

/**
 * Class to test the InputChecker methods
 */
public class InputCheckerTest {

    InputChecker checker;

    @Before
    public void setUp() throws Exception {
        checker = new InputChecker();
    }

    /*---------------------------------------------------------------------------*/
    // verifyInput(String input) - expected input value tests
    /*---------------------------------------------------------------------------*/

    /**
     * Test expected input "hold", should return "hold"
     * @throws BadStringOperationException
     */
    @Test
    public void testVerifyInputHold() throws BadStringOperationException {
        assertEquals("hold", checker.verifyInput("hold"));
    }

    /**
     * Test expected input "h", should return "hold"
     * @throws BadStringOperationException
     */
    @Test
    public void testVerifyInputH() throws BadStringOperationException {
        assertEquals("hold", checker.verifyInput("h"));
    }

    /**
     * Test expected input "roll", should return "roll"
     * @throws BadStringOperationException
     */
    @Test
    public void testVerifyInputRoll() throws BadStringOperationException {
        assertEquals("roll", checker.verifyInput("roll"));
    }

    /**
     * Test expected input "r", should return "roll"
     * @throws BadStringOperationException
     */
    @Test
    public void testVerifyInputR() throws BadStringOperationException {
        assertEquals("roll", checker.verifyInput("r"));
    }

    /**
     * Test expected input "exit", should return "exit"
     * @throws BadStringOperationException
     */
    @Test
    public void testVerifyInputExit() throws BadStringOperationException {
        assertEquals("exit", checker.verifyInput("exit"));
    }

    /**
     * Test expected input "quit", should return "exit"
     * @throws BadStringOperationException
     */
    @Test
    public void testVerifyInputQuit() throws BadStringOperationException {
        assertEquals("exit", checker.verifyInput("quit"));
    }

    /*---------------------------------------------------------------------------*/
    // verifyInput(String input) - unexpected input tests
    /*---------------------------------------------------------------------------*/

    /**
     * Test an unexpected number as a string: "6"
     * Should throw BadStringOperationException
     * @throws BadStringOperationException
     */
    @Test(expected = BadStringOperationException.class)
    public void testVerifyInputInvalidInteger() throws BadStringOperationException {
        String command = checker.verifyInput("6");
    }

    /**
     * Test unexpected character "!"
     * Should throw BadStringOperationException
     * @throws BadStringOperationException
     */
    @Test(expected = BadStringOperationException.class)
    public void testVerifyInputInvalidCharacter() throws BadStringOperationException {
        String command = checker.verifyInput("!");
    }
}