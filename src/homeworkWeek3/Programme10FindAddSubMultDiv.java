package homeworkWeek3;

import java.util.Scanner;

/**
 * 10. Write a java program to input any two number and ask user to enter their symbol
 * (+, -, /, *) find addition, Subtraction, multiplication and division according
 * to their symbol (using if else)
 */

public class Programme10FindAddSubMultDiv {

    public static void cal(int num1, int num2, char symbol) {
        if (symbol == '+') {
            System.out.println(num1+" + "+num2+" = " + (num1 + num2));
        } else if (symbol == '-') {
            System.out.println(num1+" - "+num2+" = " + (num1 - num2));
        } else if (symbol == '*') {
            System.out.println(num1+" * "+num2+" = " + (num1 * num2));
        } else if (symbol == '/') {
            System.out.println(num1+" / "+num2+" = " + (num1 / num2));
        } else {
            System.out.println("Invalid entry");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print(" Enter number1: ");
        int num1 = scn.nextInt();
        System.out.print(" Enter number2: ");
        int num2 = scn.nextInt();
        System.out.print("Enter symbol (+, -, /, *): ");
        char symbol = scn.next().charAt(0);
        scn.close();

        cal(num1, num2, symbol);

    }
}
