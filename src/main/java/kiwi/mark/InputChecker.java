package kiwi.mark;

import javax.management.BadStringOperationException;

public class InputChecker {

    public InputChecker() {}

    public String verifyInput(String input) throws BadStringOperationException {

        String command;

        input = input.toLowerCase().trim();  // Cleanse input
        switch (input) {
            case "roll":
            case "r":
                command = "roll";
                break;
            case "hold":
            case "h":
                command = "hold";
                break;
            case "exit":
            case "quit":
                command = "exit";
                break;
            default:
                throw new BadStringOperationException(input);
        }

        return command;

    }

}
