# Blackjack

*Repository for Software Testing Assignment 2*

## Requirements Specification

**Functional Requirements (v2)**

1. When the program is run, the program must output its title and version, and welcome the user. The program must then briefly explain the rules, in a sentence or two, and tell the user to press `ENTER` to play.
2. When the user presses `ENTER`, the program must randomly generate two numbers between 1 and 6 inclusive (simulating two dice). These two numbers are displayed to the user. Store the sum as a running total, and show this total.
3. While the running total is less than 20, the program must then ask the user if they want to "hold" or "roll".
4. If the user types `roll`, again generate two random numbers and display them to the user. Also, add the sum of these two numbers to the running total, and display the running total.
5. If the running total is 22 or higher after a roll, the user loses, and the text "You lose! You went over 21" is shown.
6. If the user types `hold`, then the user's game is finished, and the computer simulates a game following the above rules, with a 50/50 chance of rolling or holding after the initial roll.
7. If the user's total is higher than the computer's total, or the computer's total is 21 or over, the user wins and the text "You win!" and shows the users total and the computer's total.
8. Otherwise, the user loses and the text "You lose!" is displayed along with the user's total and the computer's total.
9. If the user types `exit`, the program should terminate cleanly.
10. If the user enters invalid input, such as an unexpected string, empty string, or a number, the program must say that the command was invalid, and ask them to re-enter their command.

**Non-functional Requirements**

1. The system must be console-based.
2. The system must tell the user exactly what to do at each step.