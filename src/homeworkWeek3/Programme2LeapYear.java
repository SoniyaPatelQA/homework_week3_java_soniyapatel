package homeworkWeek3;

import java.util.Scanner;

/**
 * 2. Write a java program to input any year like (ex.2007)
 * and find out if it is leap year or not?
 */

public class Programme2LeapYear {

    public void checkLeapYear(int year) {

       /* String isleapyear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ? "Leap Year" : "NoLeap Year";
        System.out.println(year + " is a " + isleapyear);*/

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is a  not a leap year");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scn.nextInt();
        scn.close();
        Programme2LeapYear obj = new Programme2LeapYear();
        obj.checkLeapYear(year);
    }
}
