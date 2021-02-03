package assignment1;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter year: ");
        int yearInput = scan.nextInt();

        System.out.print("Enter month (1-12): ");
        int monthInput = scan.nextInt();
        
        System.out.print("Enter day of the month (1-31): ");
        int dayInput = scan.nextInt();

        int year;
        int month;

        if (monthInput == 1) {
            month = 13;
            year = yearInput - 1;
        } else if (monthInput == 2) {
            month = 14;
            year = yearInput - 1;
        } else {
            month = monthInput;
            year = yearInput;
        }

        int weekday;
        int k = year % 100;
        int j = year / 100;

        weekday = (dayInput + (26 * (month + 1)) / 10 + k + (k / 4) + (j / 4) + 5 * j) % 7;

        String weekdayString = "";

        if (weekday == 0) {
            weekdayString = "Saturday";
        } else if (weekday == 1) {
            weekdayString = "Sunday";
        } else if (weekday == 2) {
            weekdayString = "Monday";
        } else if (weekday == 3) {
            weekdayString = "Tuesday";
        }  else if (weekday == 4) {
            weekdayString = "Wednesday";
        } else if (weekday == 5) {
            weekdayString = "Thursday";
        } else if (weekday == 6) {
            weekdayString = "Friday";
        }

        System.out.println("Day of week is " + weekdayString);

        scan.close();
    }
}
