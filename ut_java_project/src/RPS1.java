//Name: Mnengyao Zhang
//UT EID: mz22984
/*
I have followed the University Code of Conduct and Student Honor Code. This work was completed entirely by me. I have not used any unauthorized internet help, nor am I aware of any other person violating this code.
 */

/*
This is a Rock-Paper-Scissors game.
You will be asked for a throw and enters a number. A 0 corresponds to Rock, 1 corresponds to Paper, and 2 corresponds to Scissors.
The computer will tell you who won: the player or the computer or a Tie.
 */

import java.util.Random;
import java.util.Scanner;

public class RPS1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Ask for player's name
        System.out.print("Choose a name for yourself: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + ".\n" + "Let's play Rock-Paper-Scissors!");

        // Ask for player's throw
        System.out.print("Enter your throw (0=Rock, 1=Paper, 2=Scissors): ");
        int playerChoice = scanner.nextInt();

        if (playerChoice < 0 || playerChoice > 2) {
            System.out.println("Invalid choice. Please enter 0, 1, or 2.");
            return;
        }

        String[] choices = {"ROCK", "PAPER", "SCISSORS"};
        System.out.println("Player throws " + choices[playerChoice]);

        // Computer's throw
        int computerChoice = random.nextInt(3);
        System.out.println("Computer throws " + choices[computerChoice]);

        // Determine the winner
        if (playerChoice == computerChoice) {
            System.out.println("It's a Tie!");
        } else if ((playerChoice == 0 && computerChoice == 2) ||
                (playerChoice == 1 && computerChoice == 0) ||
                (playerChoice == 2 && computerChoice == 1)) {
            System.out.println("Player wins!");
        } else {
            System.out.println("Computer wins!");
        }

        scanner.close();
    }
}
