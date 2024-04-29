package homeworkWeek3;

import java.util.Scanner;

/**
 * 16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO”
 */

public class Programme16CheckNumberPositiveNegativeZero {

    public void checkNumber(int num) {
        if (num > 0) {
            System.out.println(num + " is a positive number");
        } else if (num < 0) {
            System.out.println(num + " is a negative number");
        } else {
            System.out.println("It is a zero number");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scn.nextInt();
        scn.close();

        Programme16CheckNumberPositiveNegativeZero obj = new Programme16CheckNumberPositiveNegativeZero();
        obj.checkNumber(num);


    }
}
