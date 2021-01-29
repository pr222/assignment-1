package assignment1;

import java.util.Random;
import java.util.Scanner;

/**
 * Play scissor, rock & paper against the computer.
 */
public class GameSRP {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int input = 1;
        int userScore = 0;
        int computerScore = 0;
        int draws = 0;

        while (input > 0) {
            System.out.print("Scissor (1), rock (2), paper (3) or 0 to quit: ");

            input = scan.nextInt();
            int userChoise = input;
            String userState = "";

            Random rnd = new Random();
            int computersChoise = rnd.nextInt(3) + 1;

            if (userChoise == computersChoise) {
                System.out.println("It's a draw!");
                draws ++;
            } else {
                // When user chose scissors.
                if (userChoise == 1) {
                    if (computersChoise == 3) {
                        userState = "won";
                        userScore ++;
                    } else {
                        userState = "lost";
                        computerScore ++;
                    }
                // When user chose rock.
                } else if (userChoise == 2) {
                    if (computersChoise == 1) {
                        userState = "won";
                        userScore ++;
                    } else {
                        userState = "lost";
                        computerScore ++;
                    }
                // When user chose paper.
                } else if (userChoise == 3) {
                    if (computersChoise == 2) {
                        userState = "won";
                        userScore ++;
                    } else {
                        userState = "lost";
                        computerScore ++;
                    }
                }

                String choise = choiseToString(computersChoise);

                System.out.println("You " + userState + ", computer had " + choise + "!");
            }
        }

        if (input == 0) {
            System.out.println("Score: " + userScore + " (you) " + computerScore + " (computer) " + draws + " (draw).");
        }

        scan.close();
    }

    public static String choiseToString(int choise) {
        String chosen = "";

        if (choise == 1)
            chosen = "scissors";
        else if (choise == 2)
            chosen = "rock";
        else if (choise == 3)
            chosen = "paper";

        return chosen;
    }
}
