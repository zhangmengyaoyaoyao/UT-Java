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

public class RPS2 {
    static String[] choices = {"ROCK", "PAPER", "SCISSORS"};
    static Scanner scanner = new Scanner(System.in); // only one Scanner instance

    public static String getName(){
        System.out.print("Choose a name for yourself: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + ".\n" + "Let's play Rock-Paper-Scissors!");
        return name;
    }

    public static int getPlayerThrow(){
        System.out.print("Enter your throw (0=Rock, 1=Paper, 2=Scissors): ");
        int playerChoice = -1;
        while(true) {
            playerChoice = scanner.nextInt();
            if (playerChoice < 0 || playerChoice > 2) {
                System.out.println("Invalid choice. Please enter 0, 1, or 2.");
                continue;
            }
            break;
        }
        return playerChoice;
    }

    public static void printThrow(String name, int throwNumber){
        System.out.println(name + " throws " + choices[throwNumber]);
    }

    public static String decideWinner(int playerThrow, int computerThrow){
        if (playerThrow == computerThrow) {
            return "It's a Tie!";
        } else if ((playerThrow == 0 && computerThrow == 2) ||
                (playerThrow == 1 && computerThrow == 0) ||
                (playerThrow == 2 && computerThrow == 1)) {
            return "Player wins!";
        } else {
            return "Computer wins!";
        }
    }

    public static void main(String[] args) {
        Random random = new Random();

        // Ask for player's name
        String name = getName();

        // Ask for player's throw and print
        int playerChoice = getPlayerThrow();
        printThrow("Player", playerChoice);

        // Computer's throw and print
        int computerChoice = random.nextInt(3);
        printThrow("Computer", computerChoice);

        // Determine the winner and print the winner
        System.out.println(decideWinner(playerChoice, computerChoice));

        scanner.close();
    }
}
