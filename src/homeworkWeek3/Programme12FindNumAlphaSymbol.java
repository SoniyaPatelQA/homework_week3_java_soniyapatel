package homeworkWeek3;

import java.util.Scanner;

/**
 * 12. Write a program that tells us input value is number or an alphabet or symbol.
 */

public class Programme12FindNumAlphaSymbol {

    public void findNumAlphaSymbol(char ch){
        if (ch >= '0' && ch <= '9') {
            System.out.println("This is a number");
        } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("This is an alphabet");
        } else {
            System.out.println("This is a special character");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number or alphabet or symbol: ");
        char ch = scn.next().charAt(0);
        scn.close();

        Programme12FindNumAlphaSymbol obj = new Programme12FindNumAlphaSymbol();
        obj.findNumAlphaSymbol(ch);


    }
}
