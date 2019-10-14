package kiwi.mark;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final String version = "0.0.1";

    public static void main( String[] args ) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("-------------------------------------------------------------------------------------------------------------");
        System.out.println("Welcome to Blackjack!");
        System.out.println("v" + version);
        System.out.println("This is a simple game of Blackjack using two dice. After your first roll, choose to roll again or hold.");
        System.out.println("The goal is to get as close to 21 as you can without going over!");
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        System.out.print("Press ENTER to play!");

        scanner.nextLine();
        System.out.println("woo!");

    }
}
