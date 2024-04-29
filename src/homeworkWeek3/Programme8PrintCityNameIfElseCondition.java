package homeworkWeek3;

import java.util.Scanner;

/**
 * 8. Input any alphabet from “A" to “F” and print their city name accordingly (use if else)
 * if any other alphabet should be invalid entry
 */

public class Programme8PrintCityNameIfElseCondition {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter any alphabet from 'A' to 'F': ");
        char ch = scn.next().toUpperCase().charAt(0);
        scn.close();

        String cityName = "";

        if (ch == 'A') {
            cityName = "Arlington";
        } else if (ch == 'B') {
            cityName = "Birmingham";
        } else if (ch == 'C') {
            cityName = "Coventry";
        } else if (ch == 'D') {
            cityName = "Durham";
        } else if (ch == 'E') {
            cityName = "Edinburgh";
        } else if (ch == 'F') {
            cityName = "Florida Ridge";
        } else {
            System.out.println("Invalid city name");
        }
        System.out.println("City Name: "+cityName);
    }
}
