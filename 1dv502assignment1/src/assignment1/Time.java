package assignment1;

import java.util.Scanner;

/**
 * Display time in hours, minutes and seconds of user input.
 */
public class Time {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number of seconds: ");

        int totalSeconds = scan.nextInt();

        int hours = totalSeconds / 3600;

        int minutes = (totalSeconds / 60) % 60;

        int seconds = totalSeconds % 60;

        System.out.println("That corresponds to: " + hours + " hours, " + minutes + " minutes and " + seconds + " seconds.");

        scan.close();
    }
}
