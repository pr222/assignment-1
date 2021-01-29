package assignment1;

import java.util.Scanner;

/**
 * Create diamond shape sized according to the number of the user input.
 */
public class Diamonds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int input = 1;

        while (input > 0) {
            System.out.print("Give a positive number: ");
            input = scan.nextInt();

            if (input > 0) {
                // Upper part of diamond.
                int spaces = input - 1;
                
                for (int i = 0; i <= input; i++) {
                    for (int j = 0; j <= spaces; j++) {
                        System.out.print(" ");
                    }
                    
                    for (int j = 0; j < i*2 - 1; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                    spaces --;
                }

                // Lower part of diamond.
                spaces = 0;

                for (int i = input - 1; i > 0; i--) {
                    for (int j = 0; j <= spaces; j++) {
                        System.out.print(" ");
                    }

                    for (int j = 0; j < i*2 -1; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                    spaces++;
                }
            } else if (input < 0) {
                System.out.println("That was not a positive number, try again...");
                input = 1;
            }
        }

        scan.close();
    }
}
