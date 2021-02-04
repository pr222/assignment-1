package assignment1;

import java.util.Scanner;

public class DayOfWeek {
    public static int findWeekday(int year, int month, int day) {
        int theYear;
        int theMonth;

        if (month == 1) {
            theMonth = 13;
            theYear = year - 1;
        } else if (month == 2) {
            theMonth = 14;
            theYear = year - 1;
        } else {
            theMonth = month;
            theYear = year;
        }

        int weekday;
        int k = theYear % 100;
        int j = theYear / 100;

        weekday = (day + (26 * (theMonth + 1)) / 10 + k + (k / 4) + (j / 4) + 5 * j) % 7;

        return weekday;
    }

    public static String weekdayToString(int weekday) {
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

        return weekdayString;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter year: ");
        int yearInput = scan.nextInt();

        System.out.print("Enter month (1-12): ");
        int monthInput = scan.nextInt();
        
        System.out.print("Enter day of the month (1-31): ");
        int dayInput = scan.nextInt();

        int weekday = findWeekday(yearInput, monthInput, dayInput);

        String weekdayString = weekdayToString(weekday);

        System.out.println("Day of week is " + weekdayString);

        scan.close();
    }
}
