package assignment1;

import java.util.Scanner;

public class DangerousWork {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("How much would you like to earn? ");
        int goal = scan.nextInt();

        int days = 0;
        double salary = 0.01;

        while (salary < goal) {
            salary *= 2;
            days += 1;
        }

        System.out.println("You will have your money in " + days + " days.");

        scan.close();
    }
}
