package kiwi.mark;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import javax.management.BadStringOperationException;

public class InputCheckerTest {

    InputChecker checker;

    @Before
    public void setUp() throws Exception {
        checker = new InputChecker();
    }

    @Test
    public void testVerifyInputHold() throws BadStringOperationException {
        assertEquals("hold", checker.verifyInput("hold"));
    }

    @Test
    public void testVerifyInputH() throws BadStringOperationException {
        assertEquals("hold", checker.verifyInput("h"));
    }

    @Test
    public void testVerifyInputRoll() throws BadStringOperationException {
        assertEquals("roll", checker.verifyInput("roll"));
    }

    @Test
    public void testVerifyInputR() throws BadStringOperationException {
        assertEquals("roll", checker.verifyInput("r"));
    }

    @Test
    public void testVerifyInputExit() throws BadStringOperationException {
        assertEquals("exit", checker.verifyInput("exit"));
    }

    @Test
    public void testVerifyInputQuit() throws BadStringOperationException {
        assertEquals("exit", checker.verifyInput("quit"));
    }

    @Test(expected = BadStringOperationException.class)
    public void testVerifyInputInvalidInteger() throws BadStringOperationException {
        String command = checker.verifyInput("6");
    }

    @Test(expected = BadStringOperationException.class)
    public void testVerifyInputInvalidCharacter() throws BadStringOperationException {
        String command = checker.verifyInput("!");
    }
}