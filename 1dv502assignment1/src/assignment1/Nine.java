package assignment1;

import java.util.Random;
import java.util.Scanner;

/**
 * Rolling up to two dice trying to get as close to 
 * but under nine and playing against the computer.
 */
public class Nine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int roll1;
        int roll2;
        int totalUserRoll;

        System.out.println("Playing a game\n=================\n");

        System.out.print("Ready to play? (Y/N) ");
        String answer = scan.next().toUpperCase();

        if (answer.equals("Y")) {
            roll1 = rollD6();
            totalUserRoll = roll1;
            System.out.println("You rolled " + roll1);

            // Offer the player another roll.
            System.out.print("Would you like to roll again? (Y/N) ");
            String answer2 = scan.next().toUpperCase();       

            if (answer2.equals("Y")) {
                roll2 = rollD6();

                totalUserRoll += roll2;
                System.out.println("You rolled " + roll2 + " and in total you have " + totalUserRoll);
            }

            // Let the computer play now.
            int computerRoll1 = rollD6();
            System.out.println("The computer rolled " + computerRoll1);

            int totalComputerRoll = computerRoll1;
            int computerRoll2;
            
            if (computerRoll1 <= 4) {
                computerRoll2 = rollD6();
                totalComputerRoll += computerRoll2;

                System.out.println("The computer rolls again and gets " + computerRoll2 + " and in total it has " + totalComputerRoll);
            }

            // Now settle the outcome.
            if (totalUserRoll <= 9) {
                if (totalComputerRoll <= 9) {
                    if (totalUserRoll == totalComputerRoll) {
                        System.out.println("It's a draw!");
                    } else if (totalUserRoll > totalComputerRoll) {
                        System.out.println("You won!");
                    } else {
                        System.out.println("Computer won!");  
                    }
                }                
            } else {
                if (totalComputerRoll <= 9) {
                    System.out.println("Computer won!");
                } else {
                    System.out.println("It's a draw!");
                }
            }
        } 

        scan.close();
    }

    public static int rollD6() {
        Random rnd = new Random();

        return rnd.nextInt(6) + 1;
    }
}
