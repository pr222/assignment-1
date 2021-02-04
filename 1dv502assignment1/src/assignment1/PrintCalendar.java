package assignment1;

import java.util.Scanner;

public class PrintCalendar {
    /**
     * Convert a number of a month to corresponding string representation.
     * @param month
     * @return
     */
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

    /**
     * Determine wether a year is a leap year or not.
     */
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

    /**
     * Determine the number of days in any month.
     * @param year
     * @param month
     * @return
     */
    public static int nrOfDaysInMonth(int year, int month) {
        int nrOfDays = 0;

        if (month == 2) {
            if (isLeapYear(year)) {
                nrOfDays = 29;
            } else {
                nrOfDays = 28;
            }
        } else if (month <= 6 && month % 2 == 0 || month >= 9 && month % 2 != 0 ) {
            nrOfDays = 30;
        } else {
            nrOfDays = 31;
        }

        return nrOfDays;
    }

    /**
     * Adjusts weekdays to start from Monday instead of Saturday with values of 0-6.
     * @param weekday
     * @return
     */
    public static int adjustWeekday(int weekday) {
        int adjusted;

        if (weekday == 0) {
            adjusted = 6;
        } else if (weekday == 1) {
            adjusted = 7;
        } else {
            adjusted = weekday - 1;
        }

        return adjusted;
    }

    /**
     * Format days with their numbers in a grid.
     */
    public static void printFormattedDays(int days, int firstMonthDay) {
        int counter = days + 1;
        int day = 1;

        int i = 0;

        while (counter > 1) {
            if (i == 0) {
                for (int j = 0; j < 7; j++) {
                    if (j < firstMonthDay - 1) {
                        System.out.print("    ");
                    } else {
                        if (counter > 1) {
                            if (day < 10) {
                                System.out.print(day + "   ");
                            } else {
                                System.out.print(day + "  ");
                            }
                            day ++;
                            counter --;
                        }
                    }
                }
            }
            System.out.println();
            for (int j = 0; j < 7; j++) {
                if (counter > 1) {
                    if (day < 10) {
                        System.out.print(day + "   ");
                    } else {
                        System.out.print(day + "  ");
                    }
                    day ++;
                    counter --;
                }
            } 
            i ++;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a year after 1800: ");
        int year = scan.nextInt();
        
        System.out.print("Enter a month (1-12): ");
        int month = scan.nextInt();

        String monthStr = monthToString(month);

        int firstMonthDay = DayOfWeek.findWeekday(year, month, 1);
        firstMonthDay = adjustWeekday(firstMonthDay);

        int days = nrOfDaysInMonth(year, month);

        System.out.println(monthStr + " " + year);
        System.out.println("---------------------------");
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");

        printFormattedDays(days, firstMonthDay);
        System.out.println();

        scan.close();
    }
}
