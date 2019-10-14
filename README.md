# Blackjack

*Repository for Software Testing Assignment 2*

## Requirements Specification

**Functional Requirements**

1. When the program is run, the program must output its title and version, and welcome the user. The program must then briefly explain the rules, in a sentence or two, and tell the user to press `ENTER` to play.
2. When the user presses `ENTER`, the program must randomly generate two numbers between 1 and 6 inclusive (simulating two dice). These two numbers are displayed to the user. Store the sum as a running total, and show this total.
3. While the running total is less than 20, the program must then ask the user if they want to "hold" or "roll again".
4. If the user types `roll`, again generate two random numbers and display them to the user. Also, add the sum of these two numbers to the running total, and display the running total.

5. If the user types `hold`, then the user's game is finished, and the computer simulates a game following the above rules, with a 50/50 chance of rolling or holding after the initial roll.
6. If the user's total is higher than the computer's total, or the computer's total is 21 or over, the user wins and the text "You win!" and shows the users total and the computer's total.
7. Otherwise, the user loses and the text "You lose!" is displayed along with the user's total and the computer's total.
8. The program then outputs the text "Would you like to play again?". If the user types `yes`, and presses `ENTER` the program begins again at Requirement 3. Otherwise if the user types `no` and presses `ENTER` the program exits.

**Non-functional Requirements**

1. The system must be console-based.
2. The system must tell the user exactly what to do at each step.