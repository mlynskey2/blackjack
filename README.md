# Blackjack

*Repository for Software Testing Assignment 2*

## Assessment Files

- [User Acceptance Test Cases (Todo List)](https://docs.google.com/spreadsheets/d/1JuBcuvoCXrGzrnGIWvaKlOih9b9_VFO2pb7Mvq5OySM/edit?usp=sharing)
- [Test Plan BLK-UAT-001](https://docs.google.com/document/d/1TBj4WrZ-F-Q4nEX6eM7zGiL0Y-2EviyKg_zpExGq81w/edit?usp=sharing)
- [Test Plan BLK-UAT-002](https://docs.google.com/document/d/1ifTg2zMbQlsg45gdj9nbBFI8am71AlYw-6njIYh6r4Y/edit?usp=sharing)
- [Test Run Sheet for BLK-UAT-001](https://docs.google.com/document/d/16OdluXPDBovIcrhbtKSm2M417Yb7r6vHPR6ieUsMYyw/edit?usp=sharing)
- [Test Run Sheet for BLK-UAT-002](https://docs.google.com/document/d/1FWdz4Wfx4tiD70wsWMrRLBaPC8WO9m5aQuCP8SoJtXk/edit?usp=sharing)

## Requirements Specification

**Functional Requirements (v2)**

- REQ-1: When the program is run, the program must output its title and version, and welcome the user. The program must then briefly explain the rules, in a sentence or two, and tell the user to press `ENTER` to play.
- REQ-2: 2 When the user presses `ENTER`, the program must randomly generate two numbers between 1 and 6 inclusive (simulating two dice). These two numbers are displayed to the user. Store the sum as a running total, and show this total.
- REQ-3: While the running total is less than 20, the program must then ask the user if they want to "hold" or "roll".
- REQ-4: If the user types `roll`, again generate two random numbers and display them to the user. Also, add the sum of these two numbers to the running total, and display the running total.
- REQ-5: If the running total is 22 or higher after a roll, the user loses, and the text "You lose! You went over 21" is shown.
- REQ-6: If the user types `hold`, then the user's game is finished, and the computer simulates a game trying to beat the user's score while not going over 21.
- REQ-7: If the user's total is higher than the computer's total, or the computer's total is 21 or over, the user wins and the text "You win!" and shows the users total and the computer's total.
- REQ-8: Otherwise, the user loses and the text "You lose!" is displayed along with the user's total and the computer's total.
- REQ-9: If the user types `exit`, the program should terminate cleanly.
- REQ-10: If the user enters invalid input, such as an unexpected string, empty string, or a number, the program must say that the command was invalid, and ask them to re-enter their command.

## Traceability Matrix

The following traceability matrix maps the above requirements to the UAT test case IDs:

| Requirement | UAT Test Case |
| ----------- | ------------- |
| REQ-1       | 1             |
| REQ-2       | 2             |
| REQ-3       | 9             |
| REQ-4       | 5, 6, 8       |
| REQ-5       | 6             |
| REQ-6       | 4, 7, 8       |
| REQ-7       | 8             |
| REQ-8       | 7             |
| REQ-9       | 3             |
| REQ-10      | 9, 10, 11, 12 |