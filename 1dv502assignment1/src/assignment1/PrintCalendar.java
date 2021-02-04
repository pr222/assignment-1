package assignment1;

import java.util.Scanner;

public class PrintCalendar {
    public static String monthToString(int month) {
        String monthAsString = "";

        if (month == 1) {
            monthAsString = "January";
        } else if (month == 2) {
            monthAsString = "February";
        } else if (month == 3) {
            monthAsString = "Mars";
        } else if (month == 4) {
            monthAsString = "April";
        } else if (month == 5) {
            monthAsString = "May";
        } else if (month == 6) {
            monthAsString = "June";
        } else if (month == 7) {
            monthAsString = "July";
        } else if (month == 8) {
            monthAsString = "August";
        } else if (month == 9) {
            monthAsString = "September";
        } else if (month == 10) {
            monthAsString = "October";
        } else if (month == 11) {
            monthAsString = "November";
        } else if (month == 12) {
            monthAsString = "December";
        }

        return monthAsString;
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            // Check for century.
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
           return false; 
        } 
    }

    public static int nrOfDaysInMonth(int year, int month) {
        int nrOfDays = 0;

        if (month == 2) {
            if (isLeapYear(year)) {
                nrOfDays = 29;
            } else {
                nrOfDays = 28;
            }
        } else if (month % 2 == 0) {
            nrOfDays = 30;
        } else {
            nrOfDays = 31;
        }

        return nrOfDays;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a year after 1800: ");
        int year = scan.nextInt();
        
        System.out.print("Enter a month (1-12): ");
        int month = scan.nextInt();

        String monthStr = monthToString(month);

        int firstWeekday = DayOfWeek.findWeekday(year, month, 1);
        String weekday = DayOfWeek.weekdayToString(firstWeekday);
        System.out.println(weekday); // OUT

        // How many days in a month
        int days = nrOfDaysInMonth(year, month);

        System.out.println("Days of month: " + days); // OUT

        // Format days

        System.out.println(monthStr + " " + year);
        System.out.println("---------------------------");
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        scan.close();
    }
}
