package homeworkWeek3;

import java.util.Scanner;

/**
 * 3. Write a java program to input student Name, roll No, and three subjects Math, Science and English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+, %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * _______________________________
 * |                               |
 * |        Mark Sheet              |
 * |_______________________________|
 * |     Name       :       Jay      |
 * |     Roll No:   08              |
 * |_______________________________|
 * | Subjects       :         Marks |
 * |_______________________________|
 * | Math           :         98    |
 * | Science:       90              |
 * | English:       85              |
 * |_______________________________|
 * | Total          :         273   |
 * |_______________________________|
 * | Percentage     :         91.0  |
 * | Result         :         Pass  |
 * | Grade          :          A+   |
 * |_______________________________|
 */

public class Programme3PrintMarkSheet {

    public static void printMarksheet(String studentName, String rollNo, int mathMark, int sciMark, int engMark) {

        //calculate total
        int total = mathMark + sciMark + engMark;

        //calculate percentage
        double percentage = (double) total / 3;

        // Calculate result and grade
        String result;
        String grade;
        if (mathMark < 35 || sciMark < 35 || engMark < 35) {
            result = "Fail";
            grade = " ";
        } else if (percentage >= 35) {
            result = "Pass";
            if (percentage >= 80) {
                grade = "A+";
            } else if (percentage >= 60) {
                grade = "A";
            } else if (percentage >= 50) {
                grade = "B";
            } else {
                grade = "C";
            }
        } else {
            result = "Fail";
            grade = "No Grade";
        }

        //print marksheet
        System.out.println(" _______________________________");
        System.out.println("|                               |");
        System.out.println("|              Mark Sheet        |");
        System.out.println("|_______________________________|");
        System.out.println("|        Name        :     " + studentName + "   |");
        System.out.println("|        Roll No:    " + rollNo + "          |");
        System.out.println("|_______________________________|");
        System.out.println("|        Subjects    :     Marks |");
        System.out.println("|_______________________________|");
        System.out.println("|        Math        :     " + mathMark + "    |");
        System.out.println("|        Science:    " + sciMark + "          |");
        System.out.println("|        English:    " + engMark + "          |");
        System.out.println("|_______________________________|");
        System.out.println("|        Total       :     " + total + "   |");
        System.out.println("|_______________________________|");
        System.out.println("|        Percentage  :     " + String.format("%.1f", percentage) + "  |");
        System.out.println("|        Result      :     "+result+ "  |");
        System.out.println("|        Grade       :     "+grade+"    |");
        System.out.println("|_______________________________|");
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String studentName = scn.nextLine();
        System.out.print("Enter Roll No.: ");
        String rollNo = scn.nextLine();
        System.out.print("Enter Math marks (between 0 and 100): ");
        int mathMark = scn.nextInt();
        System.out.print("Enter Science mark (between 0 and 100): ");
        int sciMark = scn.nextInt();
        System.out.print("Enter English mark (between 0 and 100): ");
        int engMark = scn.nextInt();
        scn.close();

        if ((mathMark <= 0 || mathMark >= 100) || (sciMark <= 0 || sciMark >= 100) || (engMark <= 0 || engMark >= 100)) {
            System.out.println("Invalid Input, Marks should between 0 to 100");
        } else {
            printMarksheet(studentName, rollNo, mathMark, sciMark, engMark);
        }
    }
}
